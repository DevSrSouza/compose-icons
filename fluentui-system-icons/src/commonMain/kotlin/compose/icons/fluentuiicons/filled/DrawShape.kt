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

public val FilledGroup.DrawShape: ImageVector
    get() {
        if (_drawShape != null) {
            return _drawShape!!
        }
        _drawShape = Builder(name = "DrawShape", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0004f, 6.25f)
                curveTo(3.0004f, 4.4551f, 4.4555f, 3.0f, 6.2504f, 3.0f)
                horizontalLineTo(17.7504f)
                curveTo(19.5453f, 3.0f, 21.0004f, 4.4551f, 21.0004f, 6.25f)
                verticalLineTo(11.0125f)
                curveTo(20.0667f, 10.9311f, 19.1048f, 11.2477f, 18.3902f, 11.9624f)
                lineTo(12.4877f, 17.8648f)
                curveTo(12.0501f, 18.3024f, 11.7304f, 18.8425f, 11.5569f, 19.4349f)
                curveTo(11.2123f, 18.8989f, 10.6868f, 18.5203f, 10.1446f, 18.3021f)
                curveTo(9.4539f, 18.0242f, 8.7595f, 18.1422f, 8.2092f, 18.3374f)
                curveTo(7.9607f, 18.4255f, 7.716f, 18.5384f, 7.4803f, 18.6635f)
                curveTo(7.4539f, 18.6893f, 7.4242f, 18.7125f, 7.3914f, 18.7326f)
                lineTo(5.694f, 19.7701f)
                curveTo(5.2269f, 20.0453f, 4.7874f, 20.1351f, 4.396f, 20.105f)
                curveTo(4.0102f, 20.0754f, 3.7056f, 19.9321f, 3.4957f, 19.794f)
                curveTo(3.1088f, 19.5395f, 3.0004f, 19.1114f, 3.0004f, 18.7886f)
                verticalLineTo(17.7503f)
                curveTo(3.0004f, 17.7502f, 3.0004f, 17.7504f, 3.0004f, 17.7503f)
                lineTo(3.0004f, 6.25f)
                close()
                moveTo(19.1003f, 12.6695f)
                lineTo(13.1978f, 18.5719f)
                curveTo(12.8537f, 18.916f, 12.6096f, 19.3472f, 12.4915f, 19.8194f)
                lineTo(12.0635f, 21.5313f)
                curveTo(11.7086f, 21.7018f, 11.3539f, 21.7325f, 10.9306f, 21.6355f)
                curveTo(10.8046f, 21.6065f, 10.7515f, 21.4612f, 10.8042f, 21.3432f)
                curveTo(11.2337f, 20.3809f, 10.6134f, 19.5674f, 9.7744f, 19.2298f)
                curveTo(8.819f, 18.8454f, 7.5476f, 19.7448f, 6.4824f, 20.4983f)
                curveTo(5.8899f, 20.9174f, 5.3612f, 21.2914f, 4.9861f, 21.3744f)
                curveTo(4.4607f, 21.4906f, 3.8236f, 21.2505f, 3.355f, 20.9948f)
                curveTo(3.1465f, 20.8809f, 2.868f, 21.0662f, 2.9669f, 21.2822f)
                curveTo(3.2089f, 21.8108f, 3.6981f, 22.4149f, 4.677f, 22.5366f)
                curveTo(5.6569f, 22.6583f, 6.4425f, 22.1896f, 7.2265f, 21.7219f)
                curveTo(7.8098f, 21.3738f, 8.3922f, 21.0264f, 9.0529f, 20.9232f)
                curveTo(9.1385f, 20.9098f, 9.1972f, 21.0113f, 9.1584f, 21.0887f)
                curveTo(8.9158f, 21.5728f, 8.8015f, 22.4588f, 9.376f, 22.9072f)
                curveTo(10.224f, 23.569f, 12.6127f, 23.1991f, 13.2037f, 22.9951f)
                curveTo(13.2527f, 22.9896f, 13.3023f, 22.9808f, 13.3521f, 22.9683f)
                lineTo(15.1828f, 22.5106f)
                curveTo(15.655f, 22.3926f, 16.0861f, 22.1485f, 16.4303f, 21.8043f)
                lineTo(22.3327f, 15.9019f)
                curveTo(23.2253f, 15.0093f, 23.2253f, 13.5621f, 22.3327f, 12.6695f)
                curveTo(21.4401f, 11.7768f, 19.9929f, 11.7768f, 19.1003f, 12.6695f)
                close()
            }
        }
        .build()
        return _drawShape!!
    }

private var _drawShape: ImageVector? = null
