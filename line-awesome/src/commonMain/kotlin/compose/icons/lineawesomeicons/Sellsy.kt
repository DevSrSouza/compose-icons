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

public val LineAwesomeIcons.Sellsy: ImageVector
    get() {
        if (_sellsy != null) {
            return _sellsy!!
        }
        _sellsy = Builder(name = "Sellsy", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 4.0f)
                curveTo(14.336f, 4.0f, 11.273f, 6.25f, 9.875f, 9.406f)
                curveTo(9.293f, 9.164f, 8.672f, 9.0f, 8.0f, 9.0f)
                curveTo(5.25f, 9.0f, 3.0f, 11.25f, 3.0f, 14.0f)
                curveTo(3.0f, 14.145f, 3.02f, 14.27f, 3.031f, 14.406f)
                curveTo(1.258f, 15.676f, 0.0f, 17.66f, 0.0f, 20.0f)
                curveTo(0.0f, 23.855f, 3.145f, 27.0f, 7.0f, 27.0f)
                lineTo(25.0f, 27.0f)
                curveTo(28.855f, 27.0f, 32.0f, 23.855f, 32.0f, 20.0f)
                curveTo(32.0f, 16.848f, 29.848f, 14.273f, 26.969f, 13.406f)
                curveTo(26.977f, 13.27f, 27.0f, 13.141f, 27.0f, 13.0f)
                curveTo(27.0f, 8.043f, 22.957f, 4.0f, 18.0f, 4.0f)
                close()
                moveTo(18.0f, 6.0f)
                curveTo(21.879f, 6.0f, 25.0f, 9.121f, 25.0f, 13.0f)
                curveTo(25.0f, 13.305f, 24.98f, 13.613f, 24.938f, 13.938f)
                lineTo(24.781f, 14.906f)
                lineTo(25.781f, 15.063f)
                curveTo(28.18f, 15.434f, 30.0f, 17.488f, 30.0f, 20.0f)
                curveTo(30.0f, 22.773f, 27.773f, 25.0f, 25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                curveTo(4.227f, 25.0f, 2.0f, 22.773f, 2.0f, 20.0f)
                curveTo(2.0f, 18.117f, 3.031f, 16.48f, 4.563f, 15.625f)
                lineTo(5.188f, 15.281f)
                lineTo(5.063f, 14.563f)
                curveTo(5.023f, 14.367f, 5.0f, 14.188f, 5.0f, 14.0f)
                curveTo(5.0f, 12.332f, 6.332f, 11.0f, 8.0f, 11.0f)
                curveTo(8.652f, 11.0f, 9.25f, 11.203f, 9.75f, 11.563f)
                lineTo(10.875f, 12.406f)
                lineTo(11.281f, 11.031f)
                curveTo(12.129f, 8.125f, 14.809f, 6.0f, 18.0f, 6.0f)
                close()
                moveTo(20.0f, 13.0f)
                lineTo(20.0f, 22.0f)
                lineTo(22.0f, 22.0f)
                lineTo(22.0f, 13.0f)
                close()
                moveTo(16.0f, 15.0f)
                lineTo(16.0f, 22.0f)
                lineTo(18.0f, 22.0f)
                lineTo(18.0f, 15.0f)
                close()
                moveTo(12.0f, 16.0f)
                lineTo(12.0f, 22.0f)
                lineTo(14.0f, 22.0f)
                lineTo(14.0f, 16.0f)
                close()
                moveTo(8.0f, 17.0f)
                lineTo(8.0f, 22.0f)
                lineTo(10.0f, 22.0f)
                lineTo(10.0f, 17.0f)
                close()
            }
        }
        .build()
        return _sellsy!!
    }

private var _sellsy: ImageVector? = null
