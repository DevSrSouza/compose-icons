package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Lemon: ImageVector
    get() {
        if (_lemon != null) {
            return _lemon!!
        }
        _lemon = Builder(name = "Lemon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(489.038f, 22.963f)
                curveTo(465.944f, -0.13f, 434.648f, -5.93f, 413.947f, 6.129f)
                curveToRelative(-58.906f, 34.312f, -181.25f, -53.077f, -321.073f, 86.746f)
                reflectiveCurveTo(40.441f, 355.041f, 6.129f, 413.945f)
                curveToRelative(-12.059f, 20.702f, -6.26f, 51.999f, 16.833f, 75.093f)
                curveToRelative(23.095f, 23.095f, 54.392f, 28.891f, 75.095f, 16.832f)
                curveToRelative(58.901f, -34.31f, 181.246f, 53.079f, 321.068f, -86.743f)
                reflectiveCurveTo(471.56f, 156.96f, 505.871f, 98.056f)
                curveToRelative(12.059f, -20.702f, 6.261f, -51.999f, -16.833f, -75.093f)
                close()
                moveTo(243.881f, 95.522f)
                curveToRelative(-58.189f, 14.547f, -133.808f, 90.155f, -148.358f, 148.358f)
                curveToRelative(-1.817f, 7.27f, -8.342f, 12.124f, -15.511f, 12.124f)
                curveToRelative(-1.284f, 0.0f, -2.59f, -0.156f, -3.893f, -0.481f)
                curveToRelative(-8.572f, -2.144f, -13.784f, -10.83f, -11.642f, -19.403f)
                curveTo(81.901f, 166.427f, 166.316f, 81.93f, 236.119f, 64.478f)
                curveToRelative(8.575f, -2.143f, 17.261f, 3.069f, 19.403f, 11.642f)
                reflectiveCurveToRelative(-3.069f, 17.259f, -11.641f, 19.402f)
                close()
            }
        }
        .build()
        return _lemon!!
    }

private var _lemon: ImageVector? = null
