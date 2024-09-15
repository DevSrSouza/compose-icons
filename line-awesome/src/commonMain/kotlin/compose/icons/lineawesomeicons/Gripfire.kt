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

public val LineAwesomeIcons.Gripfire: ImageVector
    get() {
        if (_gripfire != null) {
            return _gripfire!!
        }
        _gripfire = Builder(name = "Gripfire", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.686f, 1.0f)
                curveTo(15.707f, 1.2f, 15.717f, 1.4f, 15.717f, 1.6f)
                curveTo(15.717f, 7.178f, 7.0f, 10.921f, 7.0f, 17.855f)
                curveTo(7.0f, 20.866f, 9.486f, 22.881f, 11.514f, 24.648f)
                curveTo(15.376f, 27.47f, 16.143f, 28.734f, 16.143f, 29.656f)
                curveTo(16.143f, 30.267f, 16.0f, 30.678f, 16.0f, 31.0f)
                curveTo(16.768f, 29.989f, 16.857f, 29.074f, 16.867f, 28.197f)
                curveTo(16.867f, 26.408f, 15.609f, 24.788f, 14.275f, 22.955f)
                curveTo(13.326f, 21.61f, 11.77f, 20.378f, 11.77f, 18.756f)
                curveTo(11.77f, 14.289f, 18.0f, 11.345f, 18.0f, 6.467f)
                curveTo(18.0f, 3.622f, 15.984f, 1.144f, 15.686f, 1.0f)
                close()
                moveTo(19.375f, 9.0f)
                lineTo(19.615f, 9.434f)
                curveTo(19.756f, 9.745f, 19.82f, 10.088f, 19.82f, 10.465f)
                curveTo(19.82f, 13.158f, 16.338f, 17.17f, 16.186f, 17.502f)
                curveTo(16.055f, 17.812f, 16.0f, 18.145f, 16.0f, 18.455f)
                curveTo(16.0f, 19.674f, 16.911f, 21.004f, 17.074f, 21.004f)
                curveTo(17.216f, 21.004f, 20.484f, 17.656f, 20.582f, 15.705f)
                curveTo(20.962f, 16.414f, 21.125f, 17.069f, 21.125f, 17.723f)
                curveTo(21.125f, 20.206f, 18.605f, 23.574f, 18.605f, 23.574f)
                curveTo(18.605f, 24.272f, 20.527f, 26.777f, 20.744f, 26.777f)
                curveTo(20.809f, 26.777f, 20.885f, 26.701f, 20.939f, 26.635f)
                curveTo(23.229f, 24.263f, 25.0f, 21.503f, 25.0f, 18.377f)
                curveTo(25.0f, 17.9f, 24.956f, 17.401f, 24.869f, 16.891f)
                curveTo(24.141f, 12.868f, 20.374f, 9.388f, 19.375f, 9.0f)
                close()
            }
        }
        .build()
        return _gripfire!!
    }

private var _gripfire: ImageVector? = null
