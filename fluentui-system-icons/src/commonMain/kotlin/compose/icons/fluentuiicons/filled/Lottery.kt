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

public val FilledGroup.Lottery: ImageVector
    get() {
        if (_lottery != null) {
            return _lottery!!
        }
        _lottery = Builder(name = "Lottery", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5598f, 4.174f)
                curveTo(14.0817f, 4.5381f, 12.8192f, 5.4501f, 12.0f, 6.6822f)
                curveTo(11.1808f, 5.4501f, 9.9183f, 4.5381f, 8.4402f, 4.174f)
                curveTo(9.1037f, 2.8831f, 10.4487f, 2.0f, 12.0f, 2.0f)
                curveTo(13.5513f, 2.0f, 14.8963f, 2.8831f, 15.5598f, 4.174f)
                close()
                moveTo(4.0567f, 14.0424f)
                curveTo(4.4925f, 10.3896f, 7.3896f, 7.4925f, 11.0424f, 7.0567f)
                curveTo(10.1331f, 5.8101f, 8.6611f, 5.0f, 7.0f, 5.0f)
                curveTo(4.2386f, 5.0f, 2.0f, 7.2386f, 2.0f, 10.0f)
                curveTo(2.0f, 11.6611f, 2.8101f, 13.1331f, 4.0567f, 14.0424f)
                close()
                moveTo(19.9433f, 14.0424f)
                curveTo(21.1899f, 13.1331f, 22.0f, 11.6611f, 22.0f, 10.0f)
                curveTo(22.0f, 7.2386f, 19.7614f, 5.0f, 17.0f, 5.0f)
                curveTo(15.3389f, 5.0f, 13.8669f, 5.8101f, 12.9576f, 7.0567f)
                curveTo(16.6104f, 7.4925f, 19.5075f, 10.3896f, 19.9433f, 14.0424f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(15.866f, 22.0f, 19.0f, 18.866f, 19.0f, 15.0f)
                curveTo(19.0f, 11.134f, 15.866f, 8.0f, 12.0f, 8.0f)
                curveTo(8.134f, 8.0f, 5.0f, 11.134f, 5.0f, 15.0f)
                curveTo(5.0f, 18.866f, 8.134f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(9.5f, 13.25f)
                curveTo(9.5f, 12.8358f, 9.8358f, 12.5f, 10.25f, 12.5f)
                horizontalLineTo(14.5f)
                curveTo(14.8125f, 12.5f, 15.0922f, 12.6937f, 15.2021f, 12.9862f)
                curveTo(15.3118f, 13.2782f, 15.2293f, 13.6076f, 14.995f, 13.8134f)
                lineTo(14.9942f, 13.8142f)
                lineTo(14.982f, 13.8252f)
                curveTo(14.9708f, 13.8353f, 14.9527f, 13.852f, 14.9285f, 13.8749f)
                curveTo(14.8801f, 13.9208f, 14.8073f, 13.9918f, 14.7162f, 14.0864f)
                curveTo(14.5338f, 14.276f, 14.28f, 14.5586f, 14.0034f, 14.9226f)
                curveTo(13.4473f, 15.6542f, 12.8157f, 16.693f, 12.4736f, 17.9473f)
                curveTo(12.3646f, 18.347f, 11.9523f, 18.5826f, 11.5527f, 18.4736f)
                curveTo(11.153f, 18.3646f, 10.9174f, 17.9523f, 11.0264f, 17.5527f)
                curveTo(11.4343f, 16.057f, 12.1777f, 14.8458f, 12.8091f, 14.0149f)
                lineTo(12.8205f, 14.0f)
                horizontalLineTo(10.25f)
                curveTo(9.8358f, 14.0f, 9.5f, 13.6642f, 9.5f, 13.25f)
                close()
            }
        }
        .build()
        return _lottery!!
    }

private var _lottery: ImageVector? = null
