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

public val RegularGroup.DrawText: ImageVector
    get() {
        if (_drawText != null) {
            return _drawText!!
        }
        _drawText = Builder(name = "DrawText", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.9989f, 5.7146f)
                lineTo(7.234f, 13.5f)
                horizontalLineTo(12.7637f)
                lineTo(9.9989f, 5.7146f)
                close()
                moveTo(13.5739f, 15.7815f)
                lineTo(13.2964f, 15.0f)
                horizontalLineTo(6.7014f)
                lineTo(5.4569f, 18.5043f)
                curveTo(5.3183f, 18.8946f, 4.8895f, 19.0987f, 4.4991f, 18.9601f)
                curveTo(4.1088f, 18.8214f, 3.9048f, 18.3927f, 4.0434f, 18.0023f)
                lineTo(9.161f, 3.5916f)
                curveTo(9.4411f, 2.8028f, 10.5566f, 2.8028f, 10.8367f, 3.5916f)
                lineTo(14.7486f, 14.6069f)
                lineTo(13.5739f, 15.7815f)
                close()
                moveTo(4.9861f, 20.3744f)
                curveTo(4.4607f, 20.4906f, 3.8236f, 20.2505f, 3.355f, 19.9948f)
                curveTo(3.1465f, 19.8809f, 2.868f, 20.0662f, 2.9669f, 20.2822f)
                curveTo(3.2089f, 20.8108f, 3.6981f, 21.4149f, 4.677f, 21.5366f)
                curveTo(5.6569f, 21.6583f, 6.4425f, 21.1896f, 7.2265f, 20.7219f)
                curveTo(7.8098f, 20.3738f, 8.3922f, 20.0264f, 9.0529f, 19.9232f)
                curveTo(9.1385f, 19.9098f, 9.1972f, 20.0113f, 9.1584f, 20.0887f)
                curveTo(8.9158f, 20.5728f, 8.8015f, 21.4588f, 9.376f, 21.9072f)
                curveTo(10.224f, 22.569f, 12.6127f, 22.1991f, 13.2037f, 21.9951f)
                curveTo(13.2527f, 21.9896f, 13.3023f, 21.9808f, 13.3521f, 21.9683f)
                lineTo(15.1828f, 21.5106f)
                curveTo(15.655f, 21.3926f, 16.0861f, 21.1485f, 16.4303f, 20.8043f)
                lineTo(22.3327f, 14.9019f)
                curveTo(23.2253f, 14.0093f, 23.2253f, 12.5621f, 22.3327f, 11.6695f)
                curveTo(21.4401f, 10.7768f, 19.9929f, 10.7768f, 19.1003f, 11.6695f)
                lineTo(13.1978f, 17.5719f)
                curveTo(12.8537f, 17.916f, 12.6096f, 18.3472f, 12.4915f, 18.8194f)
                lineTo(12.0635f, 20.5313f)
                curveTo(11.7086f, 20.7018f, 11.3539f, 20.7325f, 10.9306f, 20.6355f)
                curveTo(10.8046f, 20.6065f, 10.7515f, 20.4612f, 10.8042f, 20.3432f)
                curveTo(11.2337f, 19.3809f, 10.6134f, 18.5674f, 9.7744f, 18.2298f)
                curveTo(8.819f, 17.8454f, 7.5476f, 18.7448f, 6.4824f, 19.4983f)
                curveTo(5.8899f, 19.9174f, 5.3612f, 20.2914f, 4.9861f, 20.3744f)
                close()
            }
        }
        .build()
        return _drawText!!
    }

private var _drawText: ImageVector? = null
