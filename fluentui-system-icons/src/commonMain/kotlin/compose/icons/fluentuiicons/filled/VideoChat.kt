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

public val FilledGroup.VideoChat: ImageVector
    get() {
        if (_videoChat != null) {
            return _videoChat!!
        }
        _videoChat = Builder(name = "VideoChat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 16.25f)
                curveTo(16.0f, 18.0449f, 14.5449f, 19.5f, 12.75f, 19.5f)
                horizontalLineTo(12.2715f)
                curveTo(12.7388f, 18.6028f, 13.0029f, 17.5828f, 13.0029f, 16.5012f)
                curveTo(13.0029f, 14.481f, 12.3085f, 12.8623f, 10.6371f, 11.4844f)
                curveTo(9.4716f, 10.5236f, 8.4108f, 10.1378f, 7.0557f, 10.0233f)
                curveTo(6.8728f, 10.0078f, 6.6881f, 10.0f, 6.5018f, 10.0f)
                curveTo(4.7545f, 10.0f, 3.1682f, 10.6893f, 2.0f, 11.8109f)
                verticalLineTo(7.75f)
                curveTo(2.0f, 5.9551f, 3.4551f, 4.5f, 5.25f, 4.5f)
                horizontalLineTo(12.75f)
                curveTo(14.5449f, 4.5f, 16.0f, 5.9551f, 16.0f, 7.75f)
                verticalLineTo(16.25f)
                close()
                moveTo(21.762f, 5.8933f)
                curveTo(21.9156f, 6.0741f, 22.0f, 6.3037f, 22.0f, 6.541f)
                verticalLineTo(17.4588f)
                curveTo(22.0f, 18.0111f, 21.5523f, 18.4588f, 21.0f, 18.4588f)
                curveTo(20.7627f, 18.4588f, 20.5332f, 18.3744f, 20.3524f, 18.2208f)
                lineTo(17.0f, 15.3709f)
                verticalLineTo(8.6279f)
                lineTo(20.3524f, 5.779f)
                curveTo(20.7732f, 5.4213f, 21.4043f, 5.4725f, 21.762f, 5.8933f)
                close()
                moveTo(10.0f, 12.2558f)
                curveTo(9.1623f, 11.5646f, 8.1166f, 11.1166f, 6.9708f, 11.0198f)
                curveTo(6.816f, 11.0067f, 6.6593f, 11.0f, 6.5011f, 11.0f)
                curveTo(3.4629f, 11.0f, 1.0f, 13.463f, 1.0f, 16.5012f)
                curveTo(1.0f, 17.4692f, 1.25f, 18.3787f, 1.6889f, 19.1688f)
                lineTo(1.0231f, 21.3553f)
                curveTo(0.9066f, 21.7381f, 1.2644f, 22.0959f, 1.6471f, 21.9795f)
                lineTo(3.8343f, 21.3139f)
                curveTo(4.6242f, 21.7526f, 5.5335f, 22.0024f, 6.5011f, 22.0024f)
                curveTo(9.5393f, 22.0024f, 12.0023f, 19.5395f, 12.0023f, 16.5012f)
                curveTo(12.0023f, 14.792f, 11.2228f, 13.2648f, 10.0f, 12.2558f)
                close()
                moveTo(4.5009f, 16.0011f)
                curveTo(4.2247f, 16.0011f, 4.0008f, 15.7772f, 4.0008f, 15.501f)
                curveTo(4.0008f, 15.2248f, 4.2247f, 15.0009f, 4.5009f, 15.0009f)
                horizontalLineTo(8.5015f)
                curveTo(8.7777f, 15.0009f, 9.0016f, 15.2248f, 9.0016f, 15.501f)
                curveTo(9.0016f, 15.7772f, 8.7777f, 16.0011f, 8.5015f, 16.0011f)
                horizontalLineTo(4.5009f)
                close()
                moveTo(6.5011f, 18.0015f)
                horizontalLineTo(4.5009f)
                curveTo(4.2247f, 18.0015f, 4.0008f, 17.7776f, 4.0008f, 17.5014f)
                curveTo(4.0008f, 17.2252f, 4.2247f, 17.0013f, 4.5009f, 17.0013f)
                horizontalLineTo(6.5011f)
                curveTo(6.7773f, 17.0013f, 7.0012f, 17.2252f, 7.0012f, 17.5014f)
                curveTo(7.0012f, 17.7776f, 6.7773f, 18.0015f, 6.5011f, 18.0015f)
                close()
            }
        }
        .build()
        return _videoChat!!
    }

private var _videoChat: ImageVector? = null
