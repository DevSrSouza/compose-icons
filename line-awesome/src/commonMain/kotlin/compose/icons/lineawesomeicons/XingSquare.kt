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

public val LineAwesomeIcons.XingSquare: ImageVector
    get() {
        if (_xingSquare != null) {
            return _xingSquare!!
        }
        _xingSquare = Builder(name = "XingSquare", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
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
                moveTo(19.639f, 9.0f)
                curveTo(19.419f, 9.0f, 19.238f, 9.131f, 19.088f, 9.381f)
                curveTo(16.18f, 14.517f, 14.67f, 17.174f, 14.57f, 17.354f)
                lineTo(17.459f, 22.619f)
                curveTo(17.6f, 22.869f, 17.78f, 23.0f, 18.02f, 23.0f)
                lineTo(20.059f, 23.0f)
                curveTo(20.329f, 23.0f, 20.448f, 22.781f, 20.318f, 22.561f)
                lineTo(17.461f, 17.354f)
                lineTo(17.461f, 17.344f)
                lineTo(21.957f, 9.439f)
                curveTo(22.077f, 9.209f, 21.937f, 9.0f, 21.697f, 9.0f)
                lineTo(19.639f, 9.0f)
                close()
                moveTo(11.074f, 12.0f)
                curveTo(10.826f, 12.0f, 10.687f, 12.198f, 10.816f, 12.436f)
                lineTo(12.186f, 14.785f)
                lineTo(10.043f, 18.555f)
                curveTo(9.924f, 18.773f, 10.063f, 19.0f, 10.301f, 19.0f)
                lineTo(12.324f, 19.0f)
                curveTo(12.532f, 19.0f, 12.719f, 18.872f, 12.869f, 18.604f)
                curveTo(14.267f, 16.155f, 14.992f, 14.874f, 15.051f, 14.775f)
                lineTo(13.662f, 12.377f)
                curveTo(13.513f, 12.129f, 13.326f, 12.0f, 13.098f, 12.0f)
                lineTo(11.074f, 12.0f)
                close()
            }
        }
        .build()
        return _xingSquare!!
    }

private var _xingSquare: ImageVector? = null
