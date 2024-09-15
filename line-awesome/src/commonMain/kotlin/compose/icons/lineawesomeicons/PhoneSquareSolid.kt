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

public val LineAwesomeIcons.PhoneSquareSolid: ImageVector
    get() {
        if (_phoneSquareSolid != null) {
            return _phoneSquareSolid!!
        }
        _phoneSquareSolid = Builder(name = "PhoneSquareSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                moveTo(11.871f, 9.002f)
                curveTo(11.381f, 9.002f, 10.89f, 9.188f, 10.516f, 9.561f)
                lineTo(9.561f, 10.516f)
                curveTo(9.035f, 11.044f, 8.86f, 11.806f, 9.107f, 12.502f)
                lineTo(9.15f, 12.633f)
                curveTo(9.315f, 13.136f, 9.702f, 14.313f, 10.963f, 16.18f)
                curveTo(11.575f, 17.088f, 12.284f, 17.937f, 13.061f, 18.695f)
                lineTo(13.295f, 18.93f)
                curveTo(14.061f, 19.714f, 14.908f, 20.421f, 15.816f, 21.035f)
                curveTo(17.685f, 22.296f, 18.864f, 22.682f, 19.367f, 22.848f)
                lineTo(19.498f, 22.893f)
                curveTo(19.707f, 22.966f, 19.924f, 23.002f, 20.137f, 23.002f)
                curveTo(20.633f, 23.002f, 21.115f, 22.806f, 21.484f, 22.438f)
                lineTo(22.439f, 21.484f)
                curveTo(22.801f, 21.121f, 23.0f, 20.642f, 23.0f, 20.131f)
                curveTo(23.0f, 19.619f, 22.801f, 19.136f, 22.439f, 18.775f)
                lineTo(21.289f, 17.627f)
                curveTo(20.566f, 16.904f, 19.304f, 16.904f, 18.58f, 17.627f)
                lineTo(16.873f, 19.334f)
                curveTo(16.102f, 18.807f, 15.379f, 18.199f, 14.719f, 17.523f)
                lineTo(14.469f, 17.273f)
                curveTo(13.799f, 16.619f, 13.194f, 15.897f, 12.668f, 15.127f)
                lineTo(14.375f, 13.42f)
                curveTo(14.737f, 13.059f, 14.936f, 12.575f, 14.936f, 12.064f)
                curveTo(14.936f, 11.553f, 14.737f, 11.074f, 14.375f, 10.711f)
                lineTo(13.223f, 9.561f)
                curveTo(12.85f, 9.189f, 12.361f, 9.002f, 11.871f, 9.002f)
                close()
            }
        }
        .build()
        return _phoneSquareSolid!!
    }

private var _phoneSquareSolid: ImageVector? = null
