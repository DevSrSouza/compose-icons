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

public val LineAwesomeIcons.PenSquareSolid: ImageVector
    get() {
        if (_penSquareSolid != null) {
            return _penSquareSolid!!
        }
        _penSquareSolid = Builder(name = "PenSquareSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                moveTo(20.127f, 8.877f)
                curveTo(19.357f, 8.877f, 18.584f, 9.17f, 18.002f, 9.752f)
                lineTo(9.736f, 18.018f)
                lineTo(9.705f, 18.33f)
                lineTo(9.236f, 21.645f)
                lineTo(9.018f, 22.988f)
                lineTo(10.361f, 22.77f)
                lineTo(13.674f, 22.301f)
                lineTo(13.986f, 22.27f)
                lineTo(22.254f, 14.004f)
                curveTo(23.414f, 12.844f, 23.414f, 10.914f, 22.254f, 9.754f)
                curveTo(21.671f, 9.171f, 20.897f, 8.877f, 20.127f, 8.877f)
                close()
                moveTo(20.127f, 10.877f)
                curveTo(20.381f, 10.877f, 20.647f, 10.959f, 20.846f, 11.158f)
                curveTo(21.233f, 11.545f, 21.244f, 12.135f, 20.877f, 12.533f)
                lineTo(20.846f, 12.564f)
                lineTo(13.049f, 20.393f)
                lineTo(11.393f, 20.611f)
                lineTo(11.611f, 18.955f)
                lineTo(19.439f, 11.158f)
                curveTo(19.638f, 10.959f, 19.874f, 10.877f, 20.127f, 10.877f)
                close()
            }
        }
        .build()
        return _penSquareSolid!!
    }

private var _penSquareSolid: ImageVector? = null
