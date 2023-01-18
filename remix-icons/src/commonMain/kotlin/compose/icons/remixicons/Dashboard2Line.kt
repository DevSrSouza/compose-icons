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

public val RemixIcons.Dashboard2Line: ImageVector
    get() {
        if (_dashboard2Line != null) {
            return _dashboard2Line!!
        }
        _dashboard2Line = Builder(name = "Dashboard2Line", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(12.0f, 4.0f)
                curveToRelative(-4.418f, 0.0f, -8.0f, 3.582f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.582f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.582f, 8.0f, -8.0f)
                reflectiveCurveToRelative(-3.582f, -8.0f, -8.0f, -8.0f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(1.018f, 0.0f, 1.985f, 0.217f, 2.858f, 0.608f)
                lineTo(13.295f, 7.17f)
                curveTo(12.882f, 7.06f, 12.448f, 7.0f, 12.0f, 7.0f)
                curveToRelative(-2.761f, 0.0f, -5.0f, 2.239f, -5.0f, 5.0f)
                curveToRelative(0.0f, 1.38f, 0.56f, 2.63f, 1.464f, 3.536f)
                lineTo(7.05f, 16.95f)
                lineToRelative(-0.156f, -0.161f)
                curveTo(5.72f, 15.537f, 5.0f, 13.852f, 5.0f, 12.0f)
                curveToRelative(0.0f, -3.866f, 3.134f, -7.0f, 7.0f, -7.0f)
                close()
                moveTo(18.392f, 9.143f)
                curveToRelative(0.39f, 0.872f, 0.608f, 1.84f, 0.608f, 2.857f)
                curveToRelative(0.0f, 1.933f, -0.784f, 3.683f, -2.05f, 4.95f)
                lineToRelative(-1.414f, -1.414f)
                curveTo(16.44f, 14.63f, 17.0f, 13.38f, 17.0f, 12.0f)
                curveToRelative(0.0f, -0.448f, -0.059f, -0.882f, -0.17f, -1.295f)
                lineToRelative(1.562f, -1.562f)
                close()
                moveTo(16.242f, 6.343f)
                lineToRelative(1.415f, 1.414f)
                lineToRelative(-3.724f, 3.726f)
                curveToRelative(0.044f, 0.165f, 0.067f, 0.338f, 0.067f, 0.517f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                curveToRelative(0.179f, 0.0f, 0.352f, 0.023f, 0.517f, 0.067f)
                lineToRelative(3.726f, -3.724f)
                close()
            }
        }
        .build()
        return _dashboard2Line!!
    }

private var _dashboard2Line: ImageVector? = null
