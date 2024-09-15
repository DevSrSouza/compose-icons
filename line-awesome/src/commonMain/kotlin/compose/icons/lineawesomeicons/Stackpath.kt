package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Stackpath: ImageVector
    get() {
        if (_stackpath != null) {
            return _stackpath!!
        }
        _stackpath = Builder(name = "Stackpath", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(10.779f, 13.0f)
                curveTo(9.789f, 13.0f, 8.539f, 13.461f, 8.539f, 14.641f)
                curveTo(8.539f, 15.471f, 8.931f, 15.979f, 10.711f, 16.539f)
                curveTo(11.451f, 16.799f, 11.641f, 16.979f, 11.641f, 17.369f)
                curveTo(11.641f, 18.019f, 10.831f, 17.98f, 10.811f, 17.98f)
                curveTo(9.941f, 17.98f, 9.711f, 17.589f, 9.711f, 17.039f)
                lineTo(8.4f, 17.039f)
                lineTo(8.391f, 17.07f)
                curveTo(8.361f, 18.41f, 9.601f, 19.0f, 10.811f, 19.0f)
                curveTo(12.091f, 19.0f, 13.0f, 18.419f, 13.0f, 17.359f)
                curveTo(13.0f, 16.449f, 12.48f, 15.879f, 11.0f, 15.439f)
                curveTo(10.12f, 15.129f, 9.891f, 14.98f, 9.891f, 14.65f)
                curveTo(9.891f, 14.32f, 10.19f, 14.02f, 10.76f, 14.02f)
                curveTo(11.36f, 14.02f, 11.65f, 14.381f, 11.65f, 14.811f)
                lineTo(12.961f, 14.811f)
                lineTo(12.971f, 14.779f)
                curveTo(12.991f, 13.939f, 12.329f, 13.0f, 10.779f, 13.0f)
                close()
                moveTo(14.0f, 13.045f)
                lineTo(14.0f, 18.955f)
                lineTo(15.381f, 18.955f)
                lineTo(15.381f, 16.926f)
                lineTo(16.221f, 16.926f)
                curveTo(17.511f, 16.926f, 18.5f, 16.244f, 18.5f, 14.984f)
                curveTo(18.5f, 13.904f, 17.711f, 13.045f, 16.221f, 13.045f)
                lineTo(14.0f, 13.045f)
                close()
                moveTo(20.211f, 13.045f)
                lineTo(18.16f, 18.955f)
                lineTo(19.439f, 18.955f)
                lineTo(21.539f, 13.045f)
                lineTo(20.211f, 13.045f)
                close()
                moveTo(22.67f, 13.045f)
                lineTo(20.619f, 18.955f)
                lineTo(21.9f, 18.955f)
                lineTo(24.0f, 13.045f)
                lineTo(22.67f, 13.045f)
                close()
                moveTo(15.381f, 14.096f)
                lineTo(16.221f, 14.096f)
                curveTo(16.951f, 14.096f, 17.131f, 14.624f, 17.131f, 14.994f)
                curveTo(17.131f, 15.354f, 16.951f, 15.875f, 16.221f, 15.875f)
                lineTo(15.381f, 15.875f)
                lineTo(15.381f, 14.096f)
                close()
            }
        }
        .build()
        return _stackpath!!
    }

private var _stackpath: ImageVector? = null
