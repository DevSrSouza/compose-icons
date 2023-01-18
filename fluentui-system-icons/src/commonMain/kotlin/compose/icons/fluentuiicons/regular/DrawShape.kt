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

public val RegularGroup.DrawShape: ImageVector
    get() {
        if (_drawShape != null) {
            return _drawShape!!
        }
        _drawShape = Builder(name = "DrawShape", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.2504f, 3.0f)
                curveTo(4.4555f, 3.0f, 3.0004f, 4.4551f, 3.0004f, 6.25f)
                lineTo(3.0004f, 19.254f)
                curveTo(3.0004f, 19.6682f, 3.3362f, 20.004f, 3.7504f, 20.004f)
                curveTo(4.1646f, 20.004f, 4.5004f, 19.6682f, 4.5004f, 19.254f)
                lineTo(4.5004f, 6.25f)
                curveTo(4.5004f, 5.2835f, 5.2839f, 4.5f, 6.2504f, 4.5f)
                horizontalLineTo(17.7504f)
                curveTo(18.7169f, 4.5f, 19.5004f, 5.2835f, 19.5004f, 6.25f)
                verticalLineTo(11.2324f)
                curveTo(19.9793f, 11.0419f, 20.494f, 10.9685f, 21.0004f, 11.0122f)
                verticalLineTo(6.25f)
                curveTo(21.0004f, 4.4551f, 19.5453f, 3.0f, 17.7504f, 3.0f)
                horizontalLineTo(6.2504f)
                close()
                moveTo(13.1978f, 18.5719f)
                lineTo(19.1003f, 12.6695f)
                curveTo(19.9929f, 11.7768f, 21.4401f, 11.7768f, 22.3327f, 12.6695f)
                curveTo(23.2253f, 13.5621f, 23.2253f, 15.0093f, 22.3327f, 15.9019f)
                lineTo(16.4303f, 21.8043f)
                curveTo(16.0861f, 22.1485f, 15.655f, 22.3926f, 15.1828f, 22.5106f)
                lineTo(13.3521f, 22.9683f)
                curveTo(13.3023f, 22.9808f, 13.2527f, 22.9896f, 13.2037f, 22.9951f)
                curveTo(12.6127f, 23.1991f, 10.224f, 23.569f, 9.376f, 22.9072f)
                curveTo(8.8015f, 22.4588f, 8.9158f, 21.5728f, 9.1584f, 21.0887f)
                curveTo(9.1972f, 21.0113f, 9.1385f, 20.9098f, 9.0529f, 20.9232f)
                curveTo(8.3922f, 21.0264f, 7.8098f, 21.3738f, 7.2265f, 21.7219f)
                curveTo(6.4425f, 22.1896f, 5.6569f, 22.6583f, 4.677f, 22.5366f)
                curveTo(3.6981f, 22.4149f, 3.2089f, 21.8108f, 2.9669f, 21.2822f)
                curveTo(2.868f, 21.0662f, 3.1465f, 20.8809f, 3.355f, 20.9948f)
                curveTo(3.8236f, 21.2505f, 4.4607f, 21.4906f, 4.9861f, 21.3744f)
                curveTo(5.3612f, 21.2914f, 5.8899f, 20.9174f, 6.4824f, 20.4983f)
                curveTo(7.5476f, 19.7448f, 8.819f, 18.8454f, 9.7744f, 19.2298f)
                curveTo(10.6134f, 19.5674f, 11.2337f, 20.3809f, 10.8042f, 21.3432f)
                curveTo(10.7515f, 21.4612f, 10.8046f, 21.6065f, 10.9306f, 21.6355f)
                curveTo(11.3539f, 21.7325f, 11.7086f, 21.7018f, 12.0635f, 21.5313f)
                lineTo(12.4915f, 19.8194f)
                curveTo(12.6096f, 19.3472f, 12.8537f, 18.916f, 13.1978f, 18.5719f)
                close()
            }
        }
        .build()
        return _drawShape!!
    }

private var _drawShape: ImageVector? = null
