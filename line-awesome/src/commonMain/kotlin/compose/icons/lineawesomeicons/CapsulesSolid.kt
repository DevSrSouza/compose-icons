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

public val LineAwesomeIcons.CapsulesSolid: ImageVector
    get() {
        if (_capsulesSolid != null) {
            return _capsulesSolid!!
        }
        _capsulesSolid = Builder(name = "CapsulesSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 5.0f)
                curveTo(5.467f, 5.0f, 3.0f, 7.468f, 3.0f, 10.5f)
                lineTo(3.0f, 21.5f)
                curveTo(3.0f, 24.532f, 5.467f, 27.0f, 8.5f, 27.0f)
                curveTo(11.533f, 27.0f, 14.0f, 24.532f, 14.0f, 21.5f)
                lineTo(14.0f, 16.404f)
                lineTo(20.055f, 24.736f)
                curveTo(21.13f, 26.216f, 22.809f, 27.004f, 24.512f, 27.004f)
                curveTo(25.633f, 27.004f, 26.763f, 26.662f, 27.738f, 25.955f)
                lineTo(27.738f, 25.953f)
                curveTo(30.191f, 24.17f, 30.735f, 20.724f, 28.953f, 18.271f)
                lineTo(22.488f, 9.371f)
                curveTo(20.703f, 6.917f, 17.261f, 6.372f, 14.807f, 8.156f)
                curveTo(14.427f, 8.432f, 14.099f, 8.752f, 13.813f, 9.098f)
                curveTo(13.19f, 6.744f, 11.048f, 5.0f, 8.5f, 5.0f)
                close()
                moveTo(8.5f, 7.0f)
                curveTo(10.43f, 7.0f, 12.0f, 8.57f, 12.0f, 10.5f)
                lineTo(12.0f, 15.0f)
                lineTo(5.0f, 15.0f)
                lineTo(5.0f, 10.5f)
                curveTo(5.0f, 8.57f, 6.57f, 7.0f, 8.5f, 7.0f)
                close()
                moveTo(18.035f, 9.105f)
                curveTo(19.118f, 9.105f, 20.186f, 9.606f, 20.871f, 10.547f)
                lineTo(23.516f, 14.186f)
                lineTo(17.854f, 18.303f)
                lineTo(15.207f, 14.662f)
                curveTo(14.072f, 13.1f, 14.421f, 10.908f, 15.982f, 9.773f)
                curveTo(16.602f, 9.323f, 17.322f, 9.105f, 18.035f, 9.105f)
                close()
                moveTo(24.691f, 15.803f)
                lineTo(27.338f, 19.445f)
                curveTo(28.472f, 21.007f, 28.124f, 23.201f, 26.563f, 24.336f)
                curveTo(25.001f, 25.471f, 22.808f, 25.123f, 21.674f, 23.561f)
                lineTo(19.029f, 19.92f)
                lineTo(24.691f, 15.803f)
                close()
                moveTo(5.0f, 17.0f)
                lineTo(12.0f, 17.0f)
                lineTo(12.0f, 21.5f)
                curveTo(12.0f, 23.43f, 10.43f, 25.0f, 8.5f, 25.0f)
                curveTo(6.57f, 25.0f, 5.0f, 23.43f, 5.0f, 21.5f)
                lineTo(5.0f, 17.0f)
                close()
            }
        }
        .build()
        return _capsulesSolid!!
    }

private var _capsulesSolid: ImageVector? = null
