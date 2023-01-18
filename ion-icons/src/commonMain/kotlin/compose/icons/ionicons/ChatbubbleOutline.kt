package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ChatbubbleOutline: ImageVector
    get() {
        if (_chatbubbleOutline != null) {
            return _chatbubbleOutline!!
        }
        _chatbubbleOutline = Builder(name = "ChatbubbleOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(87.49f, 380.0f)
                curveToRelative(1.19f, -4.38f, -1.44f, -10.47f, -3.95f, -14.86f)
                arcTo(44.86f, 44.86f, 0.0f, false, false, 81.0f, 361.34f)
                arcToRelative(199.81f, 199.81f, 0.0f, false, true, -33.0f, -110.0f)
                curveTo(47.65f, 139.09f, 140.73f, 48.0f, 255.83f, 48.0f)
                curveTo(356.21f, 48.0f, 440.0f, 117.54f, 459.58f, 209.85f)
                arcTo(199.0f, 199.0f, 0.0f, false, true, 464.0f, 251.49f)
                curveToRelative(0.0f, 112.41f, -89.49f, 204.93f, -204.59f, 204.93f)
                curveToRelative(-18.3f, 0.0f, -43.0f, -4.6f, -56.47f, -8.37f)
                reflectiveCurveToRelative(-26.92f, -8.77f, -30.39f, -10.11f)
                arcToRelative(31.09f, 31.09f, 0.0f, false, false, -11.12f, -2.07f)
                arcToRelative(30.71f, 30.71f, 0.0f, false, false, -12.09f, 2.43f)
                lineTo(81.51f, 462.78f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 76.84f, 464.0f)
                arcToRelative(9.6f, 9.6f, 0.0f, false, true, -9.57f, -9.74f)
                arcToRelative(15.85f, 15.85f, 0.0f, false, true, 0.6f, -3.29f)
                close()
            }
        }
        .build()
        return _chatbubbleOutline!!
    }

private var _chatbubbleOutline: ImageVector? = null
