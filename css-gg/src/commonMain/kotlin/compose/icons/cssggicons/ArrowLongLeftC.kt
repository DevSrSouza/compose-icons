package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.ArrowLongLeftC: ImageVector
    get() {
        if (_arrowLongLeftC != null) {
            return _arrowLongLeftC!!
        }
        _arrowLongLeftC = Builder(name = "ArrowLongLeftC", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.27f, 7.757f)
                lineTo(1.02f, 11.993f)
                lineTo(5.256f, 16.243f)
                lineTo(6.672f, 14.831f)
                lineTo(4.858f, 13.01f)
                lineTo(17.146f, 13.052f)
                curveTo(17.553f, 14.219f, 18.66f, 15.058f, 19.966f, 15.064f)
                curveTo(21.623f, 15.072f, 22.972f, 13.735f, 22.98f, 12.078f)
                curveTo(22.987f, 10.421f, 21.65f, 9.072f, 19.993f, 9.064f)
                curveTo(18.687f, 9.058f, 17.572f, 9.889f, 17.155f, 11.052f)
                lineTo(4.839f, 11.01f)
                lineTo(6.682f, 9.174f)
                lineTo(5.27f, 7.757f)
                close()
                moveTo(18.98f, 12.06f)
                curveTo(18.982f, 11.507f, 19.432f, 11.062f, 19.984f, 11.064f)
                curveTo(20.537f, 11.067f, 20.982f, 11.517f, 20.98f, 12.069f)
                curveTo(20.977f, 12.621f, 20.528f, 13.067f, 19.975f, 13.064f)
                curveTo(19.423f, 13.062f, 18.977f, 12.612f, 18.98f, 12.06f)
                close()
            }
        }
        .build()
        return _arrowLongLeftC!!
    }

private var _arrowLongLeftC: ImageVector? = null
