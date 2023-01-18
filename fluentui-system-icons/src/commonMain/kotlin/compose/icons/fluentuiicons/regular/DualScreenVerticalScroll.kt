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

public val RegularGroup.DualScreenVerticalScroll: ImageVector
    get() {
        if (_dualScreenVerticalScroll != null) {
            return _dualScreenVerticalScroll!!
        }
        _dualScreenVerticalScroll = Builder(name = "DualScreenVerticalScroll", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.7476f, 4.0019f)
                lineTo(12.747f, 4.004f)
                lineTo(20.2451f, 4.0044f)
                curveTo(21.2116f, 4.0044f, 21.9951f, 4.7879f, 21.9951f, 5.7544f)
                verticalLineTo(18.2495f)
                curveTo(21.9951f, 19.216f, 21.2116f, 19.9995f, 20.2451f, 19.9995f)
                horizontalLineTo(11.2476f)
                lineTo(11.247f, 19.997f)
                lineTo(3.75f, 19.9971f)
                curveTo(2.7835f, 19.9971f, 2.0f, 19.2136f, 2.0f, 18.2471f)
                verticalLineTo(5.7519f)
                curveTo(2.0f, 4.7854f, 2.7835f, 4.0019f, 3.75f, 4.0019f)
                horizontalLineTo(12.7476f)
                close()
                moveTo(20.2451f, 5.5044f)
                horizontalLineTo(12.7476f)
                verticalLineTo(18.4995f)
                horizontalLineTo(20.2451f)
                curveTo(20.3832f, 18.4995f, 20.4951f, 18.3876f, 20.4951f, 18.2495f)
                verticalLineTo(5.7544f)
                curveTo(20.4951f, 5.6163f, 20.3832f, 5.5044f, 20.2451f, 5.5044f)
                close()
                moveTo(11.2476f, 5.5019f)
                horizontalLineTo(3.75f)
                curveTo(3.6119f, 5.5019f, 3.5f, 5.6139f, 3.5f, 5.7519f)
                verticalLineTo(18.2471f)
                curveTo(3.5f, 18.3851f, 3.6119f, 18.4971f, 3.75f, 18.4971f)
                horizontalLineTo(11.2476f)
                verticalLineTo(5.5019f)
                close()
                moveTo(14.7019f, 13.402f)
                lineTo(14.7853f, 13.4754f)
                lineTo(16.5026f, 15.2254f)
                lineTo(18.2173f, 13.4758f)
                curveTo(18.5072f, 13.1799f, 18.9821f, 13.1752f, 19.2779f, 13.4651f)
                curveTo(19.5468f, 13.7287f, 19.5752f, 14.1451f, 19.3604f, 14.4408f)
                lineTo(19.2886f, 14.5257f)
                lineTo(17.0386f, 16.8215f)
                curveTo(16.7714f, 17.0941f, 16.348f, 17.1191f, 16.0523f, 16.8961f)
                lineTo(15.9676f, 16.8218f)
                lineTo(13.7147f, 14.526f)
                curveTo(13.4246f, 14.2304f, 13.429f, 13.7556f, 13.7247f, 13.4654f)
                curveTo(13.9935f, 13.2017f, 14.4103f, 13.1814f, 14.7019f, 13.402f)
                close()
                moveTo(17.0386f, 7.2258f)
                lineTo(19.2886f, 9.5216f)
                curveTo(19.5785f, 9.8174f, 19.5737f, 10.2922f, 19.2779f, 10.5822f)
                curveTo(18.9821f, 10.8721f, 18.5072f, 10.8673f, 18.2173f, 10.5715f)
                lineTo(16.5026f, 8.8219f)
                lineTo(14.7853f, 10.5718f)
                curveTo(14.4952f, 10.8675f, 14.0203f, 10.8719f, 13.7247f, 10.5818f)
                curveTo(13.429f, 10.2917f, 13.4246f, 9.8168f, 13.7147f, 9.5212f)
                lineTo(15.9676f, 7.2254f)
                curveTo(16.2618f, 6.9257f, 16.7447f, 6.9259f, 17.0386f, 7.2258f)
                close()
            }
        }
        .build()
        return _dualScreenVerticalScroll!!
    }

private var _dualScreenVerticalScroll: ImageVector? = null
