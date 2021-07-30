package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Xbox: ImageVector
    get() {
        if (_xbox != null) {
            return _xbox!!
        }
        _xbox = Builder(name = "Xbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.102f, 21.033f)
                curveTo(6.211f, 22.881f, 8.977f, 24.0f, 12.0f, 24.0f)
                curveToRelative(3.026f, 0.0f, 5.789f, -1.119f, 7.902f, -2.967f)
                curveToRelative(1.877f, -1.912f, -4.316f, -8.709f, -7.902f, -11.417f)
                curveToRelative(-3.582f, 2.708f, -9.779f, 9.505f, -7.898f, 11.417f)
                close()
                moveTo(15.262f, 6.627f)
                curveToRelative(2.5f, 2.961f, 7.484f, 10.313f, 6.076f, 12.912f)
                curveTo(23.002f, 17.48f, 24.0f, 14.861f, 24.0f, 12.004f)
                curveToRelative(0.0f, -3.34f, -1.365f, -6.362f, -3.57f, -8.536f)
                curveToRelative(0.0f, 0.0f, -0.027f, -0.022f, -0.082f, -0.042f)
                curveToRelative(-0.063f, -0.022f, -0.152f, -0.045f, -0.281f, -0.045f)
                curveToRelative(-0.592f, 0.0f, -1.985f, 0.434f, -4.805f, 3.246f)
                close()
                moveTo(3.654f, 3.426f)
                curveToRelative(-0.057f, 0.02f, -0.082f, 0.041f, -0.086f, 0.042f)
                curveTo(1.365f, 5.642f, 0.0f, 8.664f, 0.0f, 12.004f)
                curveToRelative(0.0f, 2.854f, 0.998f, 5.473f, 2.661f, 7.533f)
                curveToRelative(-1.401f, -2.605f, 3.579f, -9.951f, 6.08f, -12.91f)
                curveToRelative(-2.82f, -2.813f, -4.216f, -3.245f, -4.806f, -3.245f)
                curveToRelative(-0.131f, 0.0f, -0.223f, 0.021f, -0.281f, 0.046f)
                verticalLineToRelative(-0.002f)
                close()
                moveTo(12.0f, 3.551f)
                reflectiveCurveTo(9.055f, 1.828f, 6.755f, 1.746f)
                curveToRelative(-0.903f, -0.033f, -1.454f, 0.295f, -1.521f, 0.339f)
                curveTo(7.379f, 0.646f, 9.659f, 0.0f, 11.984f, 0.0f)
                lineTo(12.0f, 0.0f)
                curveToRelative(2.334f, 0.0f, 4.605f, 0.646f, 6.766f, 2.085f)
                curveToRelative(-0.068f, -0.046f, -0.615f, -0.372f, -1.52f, -0.339f)
                curveTo(14.946f, 1.828f, 12.0f, 3.545f, 12.0f, 3.545f)
                verticalLineToRelative(0.006f)
                close()
            }
        }
        .build()
        return _xbox!!
    }

private var _xbox: ImageVector? = null
