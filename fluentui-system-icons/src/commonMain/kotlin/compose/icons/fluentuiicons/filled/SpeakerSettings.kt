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

public val FilledGroup.SpeakerSettings: ImageVector
    get() {
        if (_speakerSettings != null) {
            return _speakerSettings!!
        }
        _speakerSettings = Builder(name = "SpeakerSettings", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.7041f, 3.4425f)
                curveTo(14.8952f, 3.6682f, 15.0f, 3.9543f, 15.0f, 4.25f)
                verticalLineTo(11.4996f)
                curveTo(12.651f, 12.4792f, 11.0f, 14.7975f, 11.0f, 17.5015f)
                curveTo(11.0f, 18.1132f, 11.0845f, 18.7052f, 11.2425f, 19.2664f)
                lineTo(7.9751f, 16.4999f)
                horizontalLineTo(4.25f)
                curveTo(3.0074f, 16.4999f, 2.0f, 15.4925f, 2.0f, 14.2499f)
                verticalLineTo(9.7499f)
                curveTo(2.0f, 8.5072f, 3.0074f, 7.4998f, 4.25f, 7.4998f)
                horizontalLineTo(7.9752f)
                lineTo(12.9425f, 3.2959f)
                curveTo(13.4694f, 2.8499f, 14.2582f, 2.9155f, 14.7041f, 3.4425f)
                close()
                moveTo(14.2782f, 13.9768f)
                curveTo(14.593f, 15.0671f, 13.9386f, 16.2005f, 12.837f, 16.4731f)
                lineTo(12.2528f, 16.6176f)
                curveTo(12.2079f, 16.9053f, 12.1846f, 17.2005f, 12.1846f, 17.5013f)
                curveTo(12.1846f, 17.816f, 12.2101f, 18.1245f, 12.2592f, 18.4247f)
                lineTo(12.7986f, 18.5546f)
                curveTo(13.9111f, 18.8225f, 14.5725f, 19.9675f, 14.2486f, 21.0651f)
                lineTo(14.0623f, 21.6963f)
                curveTo(14.5014f, 22.082f, 15.0019f, 22.3951f, 15.5464f, 22.6179f)
                lineTo(16.0397f, 22.0992f)
                curveTo(16.8283f, 21.2699f, 18.1506f, 21.2702f, 18.9388f, 22.0997f)
                lineTo(19.4375f, 22.6245f)
                curveTo(19.9811f, 22.4042f, 20.4811f, 22.094f, 20.9204f, 21.7115f)
                lineTo(20.7223f, 21.0256f)
                curveTo(20.4076f, 19.9354f, 21.062f, 18.802f, 22.1635f, 18.5294f)
                lineTo(22.7472f, 18.385f)
                curveTo(22.7922f, 18.0973f, 22.8155f, 17.8021f, 22.8155f, 17.5013f)
                curveTo(22.8155f, 17.1865f, 22.7899f, 16.878f, 22.7409f, 16.5777f)
                lineTo(22.2019f, 16.4479f)
                curveTo(21.0894f, 16.18f, 20.4281f, 15.0349f, 20.7519f, 13.9374f)
                lineTo(20.9381f, 13.3065f)
                curveTo(20.499f, 12.9208f, 19.9985f, 12.6076f, 19.4539f, 12.3847f)
                lineTo(18.9608f, 12.9033f)
                curveTo(18.1722f, 13.7325f, 16.85f, 13.7323f, 16.0617f, 12.9028f)
                lineTo(15.5629f, 12.3779f)
                curveTo(15.0193f, 12.5981f, 14.5194f, 12.9083f, 14.0801f, 13.2907f)
                lineTo(14.2782f, 13.9768f)
                close()
                moveTo(17.5f, 19.0013f)
                curveTo(16.6994f, 19.0013f, 16.0504f, 18.3297f, 16.0504f, 17.5013f)
                curveTo(16.0504f, 16.6728f, 16.6994f, 16.0013f, 17.5f, 16.0013f)
                curveTo(18.3007f, 16.0013f, 18.9497f, 16.6728f, 18.9497f, 17.5013f)
                curveTo(18.9497f, 18.3297f, 18.3007f, 19.0013f, 17.5f, 19.0013f)
                close()
            }
        }
        .build()
        return _speakerSettings!!
    }

private var _speakerSettings: ImageVector? = null
