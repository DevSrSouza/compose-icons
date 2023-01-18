package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ChatbubbleEllipsesOutline: ImageVector
    get() {
        if (_chatbubbleEllipsesOutline != null) {
            return _chatbubbleEllipsesOutline!!
        }
        _chatbubbleEllipsesOutline = Builder(name = "ChatbubbleEllipsesOutline", defaultWidth =
                512.0.dp, defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight =
                512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(87.48f, 380.0f)
                curveToRelative(1.2f, -4.38f, -1.43f, -10.47f, -3.94f, -14.86f)
                arcTo(42.63f, 42.63f, 0.0f, false, false, 81.0f, 361.34f)
                arcToRelative(199.81f, 199.81f, 0.0f, false, true, -33.0f, -110.0f)
                curveTo(47.64f, 139.09f, 140.72f, 48.0f, 255.82f, 48.0f)
                curveTo(356.2f, 48.0f, 440.0f, 117.54f, 459.57f, 209.85f)
                arcTo(199.0f, 199.0f, 0.0f, false, true, 464.0f, 251.49f)
                curveToRelative(0.0f, 112.41f, -89.49f, 204.93f, -204.59f, 204.93f)
                curveToRelative(-18.31f, 0.0f, -43.0f, -4.6f, -56.47f, -8.37f)
                reflectiveCurveToRelative(-26.92f, -8.77f, -30.39f, -10.11f)
                arcToRelative(31.14f, 31.14f, 0.0f, false, false, -11.13f, -2.07f)
                arcToRelative(30.7f, 30.7f, 0.0f, false, false, -12.08f, 2.43f)
                lineTo(81.5f, 462.78f)
                arcTo(15.92f, 15.92f, 0.0f, false, true, 76.84f, 464.0f)
                arcToRelative(9.61f, 9.61f, 0.0f, false, true, -9.58f, -9.74f)
                arcToRelative(15.85f, 15.85f, 0.0f, false, true, 0.6f, -3.29f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 256.0f)
                moveToRelative(-32.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-32.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 256.0f)
                moveToRelative(-32.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
            }
        }
        .build()
        return _chatbubbleEllipsesOutline!!
    }

private var _chatbubbleEllipsesOutline: ImageVector? = null
