package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.DrawText: ImageVector
    get() {
        if (_drawText != null) {
            return _drawText!!
        }
        _drawText = Builder(name = "DrawText", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.2437f, 13.1486f)
                horizontalLineTo(7.759f)
                lineTo(10.0014f, 6.7443f)
                lineTo(12.2437f, 13.1486f)
                close()
                moveTo(12.944f, 15.1486f)
                lineTo(13.2715f, 16.0839f)
                lineTo(14.841f, 14.5144f)
                lineTo(11.0765f, 3.7627f)
                curveTo(10.7204f, 2.7458f, 9.2823f, 2.7458f, 8.9263f, 3.7627f)
                lineTo(4.0569f, 17.6701f)
                curveTo(3.8744f, 18.1914f, 4.149f, 18.7619f, 4.6702f, 18.9444f)
                curveTo(5.1915f, 19.1269f, 5.762f, 18.8523f, 5.9445f, 18.331f)
                lineTo(7.0588f, 15.1486f)
                horizontalLineTo(12.944f)
                close()
                moveTo(13.1978f, 17.5719f)
                lineTo(19.1003f, 11.6695f)
                curveTo(19.9929f, 10.7768f, 21.4401f, 10.7768f, 22.3327f, 11.6695f)
                curveTo(23.2253f, 12.5621f, 23.2253f, 14.0093f, 22.3327f, 14.9019f)
                lineTo(16.4303f, 20.8043f)
                curveTo(16.0861f, 21.1485f, 15.655f, 21.3926f, 15.1828f, 21.5106f)
                lineTo(13.3521f, 21.9683f)
                curveTo(13.3023f, 21.9808f, 13.2527f, 21.9896f, 13.2037f, 21.9951f)
                curveTo(12.6127f, 22.1991f, 10.224f, 22.569f, 9.376f, 21.9072f)
                curveTo(8.8015f, 21.4588f, 8.9158f, 20.5728f, 9.1584f, 20.0887f)
                curveTo(9.1972f, 20.0113f, 9.1385f, 19.9098f, 9.0529f, 19.9232f)
                curveTo(8.3922f, 20.0264f, 7.8098f, 20.3738f, 7.2265f, 20.7219f)
                curveTo(6.4425f, 21.1896f, 5.6569f, 21.6583f, 4.677f, 21.5366f)
                curveTo(3.6981f, 21.4149f, 3.2089f, 20.8108f, 2.9669f, 20.2822f)
                curveTo(2.868f, 20.0662f, 3.1465f, 19.8809f, 3.355f, 19.9948f)
                curveTo(3.8236f, 20.2505f, 4.4607f, 20.4906f, 4.9861f, 20.3744f)
                curveTo(5.3612f, 20.2914f, 5.8899f, 19.9174f, 6.4824f, 19.4983f)
                curveTo(7.5476f, 18.7448f, 8.819f, 17.8454f, 9.7744f, 18.2298f)
                curveTo(10.6134f, 18.5674f, 11.2337f, 19.3809f, 10.8042f, 20.3432f)
                curveTo(10.7515f, 20.4612f, 10.8046f, 20.6065f, 10.9306f, 20.6355f)
                curveTo(11.3539f, 20.7325f, 11.7086f, 20.7018f, 12.0635f, 20.5313f)
                lineTo(12.4915f, 18.8194f)
                curveTo(12.6096f, 18.3472f, 12.8537f, 17.916f, 13.1978f, 17.5719f)
                close()
            }
        }
        .build()
        return _drawText!!
    }

private var _drawText: ImageVector? = null
