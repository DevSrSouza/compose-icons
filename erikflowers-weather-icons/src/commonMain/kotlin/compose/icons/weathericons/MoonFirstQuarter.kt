package compose.icons.weathericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.WeatherIcons

public val WeatherIcons.MoonFirstQuarter: ImageVector
    get() {
        if (_moonFirstQuarter != null) {
            return _moonFirstQuarter!!
        }
        _moonFirstQuarter = Builder(name = "MoonFirstQuarter", defaultWidth = 30.0.dp, defaultHeight
                = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.01f, 25.71f)
                curveToRelative(2.04f, 0.0f, 3.92f, -0.5f, 5.65f, -1.51f)
                reflectiveCurveToRelative(3.09f, -2.37f, 4.09f, -4.1f)
                reflectiveCurveToRelative(1.51f, -3.61f, 1.51f, -5.65f)
                reflectiveCurveToRelative(-0.5f, -3.92f, -1.51f, -5.65f)
                reflectiveCurveToRelative(-2.37f, -3.09f, -4.09f, -4.09f)
                reflectiveCurveToRelative(-3.61f, -1.51f, -5.65f, -1.51f)
                verticalLineTo(25.71f)
                close()
            }
        }
        .build()
        return _moonFirstQuarter!!
    }

private var _moonFirstQuarter: ImageVector? = null
