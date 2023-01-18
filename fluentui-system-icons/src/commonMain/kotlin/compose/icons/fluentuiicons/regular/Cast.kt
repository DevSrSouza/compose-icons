package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Cast: ImageVector
    get() {
        if (_cast != null) {
            return _cast!!
        }
        _cast = Builder(name = "Cast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.25f)
                curveTo(2.0f, 5.0074f, 3.0074f, 4.0f, 4.25f, 4.0f)
                horizontalLineTo(19.75f)
                curveTo(20.9926f, 4.0f, 22.0f, 5.0074f, 22.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(22.0f, 18.9926f, 20.9926f, 20.0f, 19.75f, 20.0f)
                horizontalLineTo(4.25f)
                curveTo(3.0074f, 20.0f, 2.0f, 18.9926f, 2.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(4.25f, 5.5f)
                curveTo(3.8358f, 5.5f, 3.5f, 5.8358f, 3.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.5f, 18.1642f, 3.8358f, 18.5f, 4.25f, 18.5f)
                horizontalLineTo(19.75f)
                curveTo(20.1642f, 18.5f, 20.5f, 18.1642f, 20.5f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(20.5f, 5.8358f, 20.1642f, 5.5f, 19.75f, 5.5f)
                horizontalLineTo(4.25f)
                close()
                moveTo(6.9959f, 15.9955f)
                curveTo(6.9959f, 16.5466f, 6.5491f, 16.9934f, 5.998f, 16.9934f)
                curveTo(5.4468f, 16.9934f, 5.0f, 16.5466f, 5.0f, 15.9955f)
                curveTo(5.0f, 15.4443f, 5.4468f, 14.9975f, 5.998f, 14.9975f)
                curveTo(6.5491f, 14.9975f, 6.9959f, 15.4443f, 6.9959f, 15.9955f)
                close()
                moveTo(4.9958f, 12.7506f)
                curveTo(4.9958f, 12.3363f, 5.3316f, 12.0006f, 5.7458f, 12.0006f)
                curveTo(8.0914f, 12.0006f, 9.9928f, 13.902f, 9.9928f, 16.2476f)
                curveTo(9.9928f, 16.6618f, 9.6571f, 16.9976f, 9.2428f, 16.9976f)
                curveTo(8.8286f, 16.9976f, 8.4928f, 16.6618f, 8.4928f, 16.2476f)
                curveTo(8.4928f, 14.7304f, 7.2629f, 13.5006f, 5.7458f, 13.5006f)
                curveTo(5.3316f, 13.5006f, 4.9958f, 13.1648f, 4.9958f, 12.7506f)
                close()
                moveTo(4.9958f, 9.7438f)
                curveTo(4.9958f, 9.3296f, 5.3316f, 8.9938f, 5.7458f, 8.9938f)
                curveTo(9.752f, 8.9938f, 12.9996f, 12.2414f, 12.9996f, 16.2476f)
                curveTo(12.9996f, 16.6618f, 12.6638f, 16.9976f, 12.2496f, 16.9976f)
                curveTo(11.8354f, 16.9976f, 11.4996f, 16.6618f, 11.4996f, 16.2476f)
                curveTo(11.4996f, 13.0699f, 8.9235f, 10.4938f, 5.7458f, 10.4938f)
                curveTo(5.3316f, 10.4938f, 4.9958f, 10.158f, 4.9958f, 9.7438f)
                close()
            }
        }
        .build()
        return _cast!!
    }

private var _cast: ImageVector? = null
