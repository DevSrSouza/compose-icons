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

public val LineAwesomeIcons.PizzaSliceSolid: ImageVector
    get() {
        if (_pizzaSliceSolid != null) {
            return _pizzaSliceSolid!!
        }
        _pizzaSliceSolid = Builder(name = "PizzaSliceSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.375f, 3.813f)
                lineTo(12.063f, 4.656f)
                lineTo(4.063f, 26.563f)
                lineTo(3.844f, 27.156f)
                lineTo(4.844f, 28.156f)
                lineTo(5.438f, 27.938f)
                lineTo(27.344f, 19.938f)
                lineTo(28.188f, 19.625f)
                lineTo(27.969f, 18.75f)
                curveTo(27.969f, 18.75f, 26.559f, 13.121f, 22.719f, 9.281f)
                curveTo(18.879f, 5.441f, 13.25f, 4.031f, 13.25f, 4.031f)
                close()
                moveTo(13.594f, 6.281f)
                curveTo(14.73f, 6.633f, 18.43f, 7.867f, 21.281f, 10.719f)
                curveTo(24.133f, 13.57f, 25.367f, 17.27f, 25.719f, 18.406f)
                lineTo(24.188f, 18.969f)
                curveTo(24.086f, 18.566f, 23.965f, 18.098f, 23.75f, 17.563f)
                curveTo(23.141f, 16.051f, 22.004f, 14.066f, 19.969f, 12.031f)
                curveTo(17.934f, 9.996f, 15.949f, 8.891f, 14.438f, 8.281f)
                curveTo(13.898f, 8.066f, 13.438f, 7.922f, 13.031f, 7.813f)
                close()
                moveTo(12.375f, 9.688f)
                curveTo(12.711f, 9.777f, 13.141f, 9.906f, 13.688f, 10.125f)
                curveTo(14.977f, 10.645f, 16.734f, 11.609f, 18.563f, 13.438f)
                curveTo(19.098f, 13.973f, 19.539f, 14.488f, 19.938f, 15.0f)
                curveTo(18.863f, 15.035f, 18.0f, 15.918f, 18.0f, 17.0f)
                curveTo(18.0f, 18.105f, 18.895f, 19.0f, 20.0f, 19.0f)
                curveTo(20.738f, 19.0f, 21.371f, 18.598f, 21.719f, 18.0f)
                curveTo(21.762f, 18.102f, 21.836f, 18.215f, 21.875f, 18.313f)
                curveTo(22.102f, 18.875f, 22.223f, 19.32f, 22.313f, 19.656f)
                lineTo(12.313f, 23.281f)
                curveTo(12.059f, 22.813f, 11.57f, 22.5f, 11.0f, 22.5f)
                curveTo(10.172f, 22.5f, 9.5f, 23.172f, 9.5f, 24.0f)
                curveTo(9.5f, 24.105f, 9.512f, 24.215f, 9.531f, 24.313f)
                lineTo(6.625f, 25.375f)
                lineTo(10.125f, 15.781f)
                curveTo(10.391f, 15.91f, 10.684f, 16.0f, 11.0f, 16.0f)
                curveTo(12.105f, 16.0f, 13.0f, 15.105f, 13.0f, 14.0f)
                curveTo(13.0f, 13.066f, 12.363f, 12.285f, 11.5f, 12.063f)
                close()
                moveTo(14.0f, 17.5f)
                curveTo(13.172f, 17.5f, 12.5f, 18.172f, 12.5f, 19.0f)
                curveTo(12.5f, 19.828f, 13.172f, 20.5f, 14.0f, 20.5f)
                curveTo(14.828f, 20.5f, 15.5f, 19.828f, 15.5f, 19.0f)
                curveTo(15.5f, 18.172f, 14.828f, 17.5f, 14.0f, 17.5f)
                close()
            }
        }
        .build()
        return _pizzaSliceSolid!!
    }

private var _pizzaSliceSolid: ImageVector? = null
