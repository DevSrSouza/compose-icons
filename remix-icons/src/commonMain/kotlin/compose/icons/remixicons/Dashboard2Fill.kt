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

public val RemixIcons.Dashboard2Fill: ImageVector
    get() {
        if (_dashboard2Fill != null) {
            return _dashboard2Fill!!
        }
        _dashboard2Fill = Builder(name = "Dashboard2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(-3.866f, 0.0f, -7.0f, 3.134f, -7.0f, 7.0f)
                curveToRelative(0.0f, 1.852f, 0.72f, 3.537f, 1.894f, 4.789f)
                lineToRelative(0.156f, 0.16f)
                lineToRelative(1.414f, -1.413f)
                curveTo(7.56f, 14.63f, 7.0f, 13.38f, 7.0f, 12.0f)
                curveToRelative(0.0f, -2.761f, 2.239f, -5.0f, 5.0f, -5.0f)
                curveToRelative(0.448f, 0.0f, 0.882f, 0.059f, 1.295f, 0.17f)
                lineToRelative(1.563f, -1.562f)
                curveTo(13.985f, 5.218f, 13.018f, 5.0f, 12.0f, 5.0f)
                close()
                moveTo(18.392f, 9.143f)
                lineToRelative(-1.561f, 1.562f)
                curveToRelative(0.11f, 0.413f, 0.169f, 0.847f, 0.169f, 1.295f)
                curveToRelative(0.0f, 1.38f, -0.56f, 2.63f, -1.464f, 3.536f)
                lineToRelative(1.414f, 1.414f)
                curveTo(18.216f, 15.683f, 19.0f, 13.933f, 19.0f, 12.0f)
                curveToRelative(0.0f, -1.018f, -0.217f, -1.985f, -0.608f, -2.857f)
                close()
                moveTo(16.242f, 6.343f)
                lineToRelative(-3.725f, 3.724f)
                curveTo(12.352f, 10.023f, 12.179f, 10.0f, 12.0f, 10.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                curveToRelative(0.0f, -0.179f, -0.023f, -0.352f, -0.067f, -0.517f)
                lineToRelative(3.724f, -3.726f)
                lineToRelative(-1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _dashboard2Fill!!
    }

private var _dashboard2Fill: ImageVector? = null
