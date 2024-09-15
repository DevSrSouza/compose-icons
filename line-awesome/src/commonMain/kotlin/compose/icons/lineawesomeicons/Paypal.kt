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

public val LineAwesomeIcons.Paypal: ImageVector
    get() {
        if (_paypal != null) {
            return _paypal!!
        }
        _paypal = Builder(name = "Paypal", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.906f, 5.0f)
                lineTo(8.719f, 5.781f)
                lineTo(5.031f, 22.781f)
                lineTo(4.75f, 24.0f)
                lineTo(9.625f, 24.0f)
                lineTo(9.031f, 26.781f)
                lineTo(8.75f, 28.0f)
                lineTo(15.719f, 28.0f)
                lineTo(15.875f, 27.188f)
                lineTo(16.906f, 22.375f)
                lineTo(19.594f, 22.375f)
                curveTo(23.355f, 22.375f, 26.66f, 19.93f, 27.5f, 16.0f)
                curveTo(27.941f, 13.934f, 27.473f, 12.184f, 26.5f, 11.0f)
                curveTo(25.711f, 10.039f, 24.641f, 9.461f, 23.531f, 9.188f)
                curveTo(23.316f, 8.199f, 22.863f, 7.359f, 22.25f, 6.719f)
                curveTo(21.113f, 5.535f, 19.535f, 5.0f, 18.063f, 5.0f)
                close()
                moveTo(10.531f, 7.0f)
                lineTo(18.063f, 7.0f)
                curveTo(19.043f, 7.0f, 20.125f, 7.379f, 20.813f, 8.094f)
                curveTo(21.5f, 8.809f, 21.902f, 9.828f, 21.531f, 11.563f)
                curveTo(20.871f, 14.656f, 18.535f, 16.375f, 15.594f, 16.375f)
                lineTo(11.281f, 16.375f)
                lineTo(11.125f, 17.156f)
                lineTo(10.094f, 22.0f)
                lineTo(7.25f, 22.0f)
                close()
                moveTo(13.063f, 8.469f)
                lineTo(12.875f, 9.25f)
                lineTo(11.844f, 13.875f)
                lineTo(11.563f, 15.094f)
                lineTo(15.094f, 15.094f)
                curveTo(16.871f, 15.094f, 18.406f, 13.801f, 18.844f, 12.063f)
                lineTo(18.875f, 12.063f)
                curveTo(18.879f, 12.043f, 18.871f, 12.02f, 18.875f, 12.0f)
                curveTo(19.094f, 11.125f, 18.953f, 10.227f, 18.469f, 9.563f)
                curveTo(17.973f, 8.883f, 17.137f, 8.469f, 16.25f, 8.469f)
                close()
                moveTo(14.656f, 10.469f)
                lineTo(16.25f, 10.469f)
                curveTo(16.563f, 10.469f, 16.727f, 10.559f, 16.844f, 10.719f)
                curveTo(16.961f, 10.879f, 17.043f, 11.137f, 16.938f, 11.531f)
                lineTo(16.938f, 11.563f)
                curveTo(16.75f, 12.371f, 15.793f, 13.094f, 15.094f, 13.094f)
                lineTo(14.063f, 13.094f)
                close()
                moveTo(23.594f, 11.344f)
                curveTo(24.121f, 11.559f, 24.617f, 11.852f, 24.969f, 12.281f)
                curveTo(25.551f, 12.988f, 25.871f, 13.965f, 25.531f, 15.563f)
                curveTo(24.871f, 18.656f, 22.535f, 20.375f, 19.594f, 20.375f)
                lineTo(15.281f, 20.375f)
                lineTo(15.125f, 21.156f)
                lineTo(14.094f, 26.0f)
                lineTo(11.25f, 26.0f)
                lineTo(11.688f, 24.0f)
                lineTo(11.719f, 24.0f)
                lineTo(11.875f, 23.188f)
                lineTo(12.906f, 18.375f)
                lineTo(15.594f, 18.375f)
                curveTo(19.355f, 18.375f, 22.66f, 15.93f, 23.5f, 12.0f)
                curveTo(23.547f, 11.773f, 23.566f, 11.563f, 23.594f, 11.344f)
                close()
            }
        }
        .build()
        return _paypal!!
    }

private var _paypal: ImageVector? = null
