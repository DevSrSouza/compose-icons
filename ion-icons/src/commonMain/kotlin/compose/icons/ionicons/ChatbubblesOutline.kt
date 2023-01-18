package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ChatbubblesOutline: ImageVector
    get() {
        if (_chatbubblesOutline != null) {
            return _chatbubblesOutline!!
        }
        _chatbubblesOutline = Builder(name = "ChatbubblesOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(431.0f, 320.6f)
                curveToRelative(-1.0f, -3.6f, 1.2f, -8.6f, 3.3f, -12.2f)
                arcToRelative(33.68f, 33.68f, 0.0f, false, true, 2.1f, -3.1f)
                arcTo(162.0f, 162.0f, 0.0f, false, false, 464.0f, 215.0f)
                curveToRelative(0.3f, -92.2f, -77.5f, -167.0f, -173.7f, -167.0f)
                curveTo(206.4f, 48.0f, 136.4f, 105.1f, 120.0f, 180.9f)
                arcToRelative(160.7f, 160.7f, 0.0f, false, false, -3.7f, 34.2f)
                curveToRelative(0.0f, 92.3f, 74.8f, 169.1f, 171.0f, 169.1f)
                curveToRelative(15.3f, 0.0f, 35.9f, -4.6f, 47.2f, -7.7f)
                reflectiveCurveToRelative(22.5f, -7.2f, 25.4f, -8.3f)
                arcToRelative(26.44f, 26.44f, 0.0f, false, true, 9.3f, -1.7f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 10.1f, 2.0f)
                lineTo(436.0f, 388.6f)
                arcToRelative(13.52f, 13.52f, 0.0f, false, false, 3.9f, 1.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                arcToRelative(12.85f, 12.85f, 0.0f, false, false, -0.5f, -2.7f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(66.46f, 232.0f)
                arcToRelative(146.23f, 146.23f, 0.0f, false, false, 6.39f, 152.67f)
                curveToRelative(2.31f, 3.49f, 3.61f, 6.19f, 3.21f, 8.0f)
                reflectiveCurveToRelative(-11.93f, 61.87f, -11.93f, 61.87f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.71f, 7.68f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 72.0f, 464.0f)
                arcToRelative(7.26f, 7.26f, 0.0f, false, false, 2.91f, -0.6f)
                lineToRelative(56.21f, -22.0f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, true, 12.0f, 0.2f)
                curveToRelative(18.94f, 7.38f, 39.88f, 12.0f, 60.83f, 12.0f)
                arcTo(159.21f, 159.21f, 0.0f, false, false, 284.0f, 432.11f)
            }
        }
        .build()
        return _chatbubblesOutline!!
    }

private var _chatbubblesOutline: ImageVector? = null
