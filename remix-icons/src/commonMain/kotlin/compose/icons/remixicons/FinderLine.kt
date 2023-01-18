package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.FinderLine: ImageVector
    get() {
        if (_finderLine != null) {
            return _finderLine!!
        }
        _finderLine = Builder(name = "FinderLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(3.0f, 21.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(10.48f, 4.999f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(8.746f)
                curveToRelative(-0.062f, -0.344f, -0.116f, -0.684f, -0.163f, -1.02f)
                curveToRelative(-0.297f, 0.013f, -0.491f, 0.02f, -0.583f, 0.02f)
                curveToRelative(-2.208f, 0.0f, -4.398f, -0.73f, -6.555f, -2.168f)
                lineToRelative(1.11f, -1.664f)
                curveTo(8.398f, 15.397f, 10.208f, 16.0f, 12.0f, 16.0f)
                curveToRelative(0.133f, 0.0f, 0.265f, -0.003f, 0.398f, -0.01f)
                curveToRelative(-0.024f, -0.497f, -0.024f, -1.41f, 0.007f, -1.99f)
                lineTo(9.5f, 14.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -3.275f, 0.32f, -5.94f, 0.98f, -8.001f)
                close()
                moveTo(12.6f, 4.999f)
                curveTo(11.935f, 6.582f, 11.556f, 9.41f, 11.51f, 12.0f)
                horizontalLineToRelative(3.123f)
                lineToRelative(-0.14f, 1.124f)
                curveToRelative(-0.101f, 0.805f, -0.137f, 1.645f, -0.108f, 2.52f)
                curveToRelative(1.013f, -0.3f, 2.031f, -0.79f, 3.06f, -1.476f)
                lineToRelative(1.11f, 1.664f)
                curveToRelative(-1.32f, 0.88f, -2.652f, 1.495f, -3.993f, 1.84f)
                curveToRelative(0.057f, 0.433f, 0.13f, 0.876f, 0.219f, 1.327f)
                lineTo(20.0f, 19.0f)
                lineTo(20.0f, 5.0f)
                lineToRelative(-7.4f, -0.001f)
                close()
                moveTo(7.0f, 7.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(6.0f, 8.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(17.0f, 7.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(16.0f, 8.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _finderLine!!
    }

private var _finderLine: ImageVector? = null
