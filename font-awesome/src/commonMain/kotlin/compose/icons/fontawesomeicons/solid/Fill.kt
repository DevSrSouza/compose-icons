package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Fill: ImageVector
    get() {
        if (_fill != null) {
            return _fill!!
        }
        _fill = Builder(name = "Fill", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(502.63f, 217.06f)
                lineTo(294.94f, 9.37f)
                curveTo(288.69f, 3.12f, 280.5f, 0.0f, 272.31f, 0.0f)
                reflectiveCurveToRelative(-16.38f, 3.12f, -22.62f, 9.37f)
                lineToRelative(-81.58f, 81.58f)
                lineTo(81.93f, 4.77f)
                curveToRelative(-6.24f, -6.25f, -16.38f, -6.25f, -22.62f, 0.0f)
                lineTo(36.69f, 27.38f)
                curveToRelative(-6.24f, 6.25f, -6.24f, 16.38f, 0.0f, 22.63f)
                lineToRelative(86.19f, 86.18f)
                lineToRelative(-94.76f, 94.76f)
                curveToRelative(-37.49f, 37.49f, -37.49f, 98.26f, 0.0f, 135.75f)
                lineToRelative(117.19f, 117.19f)
                curveToRelative(18.75f, 18.74f, 43.31f, 28.12f, 67.87f, 28.12f)
                curveToRelative(24.57f, 0.0f, 49.13f, -9.37f, 67.88f, -28.12f)
                lineToRelative(221.57f, -221.57f)
                curveToRelative(12.49f, -12.5f, 12.49f, -32.76f, 0.0f, -45.26f)
                close()
                moveTo(386.41f, 288.03f)
                lineTo(65.93f, 288.03f)
                curveToRelative(1.36f, -3.84f, 3.57f, -7.98f, 7.43f, -11.83f)
                lineToRelative(13.15f, -13.15f)
                lineToRelative(81.61f, -81.61f)
                lineToRelative(58.61f, 58.6f)
                curveToRelative(12.49f, 12.49f, 32.75f, 12.49f, 45.24f, 0.0f)
                curveToRelative(12.49f, -12.49f, 12.49f, -32.75f, 0.0f, -45.24f)
                lineToRelative(-58.61f, -58.6f)
                lineToRelative(58.95f, -58.95f)
                lineToRelative(162.45f, 162.44f)
                lineToRelative(-48.35f, 48.34f)
                close()
            }
        }
        .build()
        return _fill!!
    }

private var _fill: ImageVector? = null
