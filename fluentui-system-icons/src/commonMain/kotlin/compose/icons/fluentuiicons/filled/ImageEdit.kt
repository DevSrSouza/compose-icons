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

public val FilledGroup.ImageEdit: ImageVector
    get() {
        if (_imageEdit != null) {
            return _imageEdit!!
        }
        _imageEdit = Builder(name = "ImageEdit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5575f, 13.646f)
                lineTo(11.4738f, 13.717f)
                lineTo(4.5468f, 20.517f)
                curveTo(5.042f, 20.8223f, 5.6253f, 20.9984f, 6.2497f, 20.9984f)
                horizontalLineTo(11.1644f)
                lineTo(11.5202f, 19.5754f)
                curveTo(11.6821f, 18.9274f, 12.0172f, 18.3357f, 12.4894f, 17.8635f)
                lineTo(14.5993f, 15.7536f)
                lineTo(12.5246f, 13.717f)
                lineTo(12.4312f, 13.639f)
                curveTo(12.1697f, 13.4543f, 11.8167f, 13.4567f, 11.5575f, 13.646f)
                close()
                moveTo(16.503f, 8.2516f)
                curveTo(16.503f, 7.8363f, 16.1663f, 7.4996f, 15.751f, 7.4996f)
                curveTo(15.3356f, 7.4996f, 14.9989f, 7.8363f, 14.9989f, 8.2516f)
                curveTo(14.9989f, 8.667f, 15.3356f, 9.0037f, 15.751f, 9.0037f)
                curveTo(16.1663f, 9.0037f, 16.503f, 8.667f, 16.503f, 8.2516f)
                close()
                moveTo(15.6598f, 14.6931f)
                lineTo(13.5753f, 12.6467f)
                lineTo(13.4468f, 12.5298f)
                curveTo(12.6141f, 11.8285f, 11.3934f, 11.8265f, 10.5586f, 12.524f)
                lineTo(10.4231f, 12.6467f)
                lineTo(3.4852f, 19.4577f)
                curveTo(3.1776f, 18.9612f, 3.0f, 18.3757f, 3.0f, 17.7487f)
                verticalLineTo(6.2497f)
                curveTo(3.0f, 4.4549f, 4.4549f, 3.0f, 6.2497f, 3.0f)
                horizontalLineTo(17.7487f)
                curveTo(19.5435f, 3.0f, 20.9984f, 4.4549f, 20.9984f, 6.2497f)
                verticalLineTo(11.0115f)
                curveTo(20.0657f, 10.9311f, 19.1051f, 11.2478f, 18.3913f, 11.9616f)
                lineTo(15.6598f, 14.6931f)
                close()
                moveTo(13.4991f, 8.2516f)
                curveTo(13.4991f, 9.4953f, 14.5073f, 10.5036f, 15.751f, 10.5036f)
                curveTo(16.9947f, 10.5036f, 18.0029f, 9.4953f, 18.0029f, 8.2516f)
                curveTo(18.0029f, 7.0079f, 16.9947f, 5.9997f, 15.751f, 5.9997f)
                curveTo(14.5073f, 5.9997f, 13.4991f, 7.0079f, 13.4991f, 8.2516f)
                close()
                moveTo(19.0984f, 12.6686f)
                lineTo(13.1965f, 18.5705f)
                curveTo(12.8524f, 18.9146f, 12.6083f, 19.3458f, 12.4903f, 19.8179f)
                lineTo(12.0327f, 21.6484f)
                curveTo(11.8336f, 22.4445f, 12.5547f, 23.1656f, 13.3508f, 22.9666f)
                lineTo(15.1813f, 22.5089f)
                curveTo(15.6534f, 22.3909f, 16.0846f, 22.1468f, 16.4287f, 21.8027f)
                lineTo(22.3306f, 15.9008f)
                curveTo(23.2231f, 15.0082f, 23.2231f, 13.5611f, 22.3306f, 12.6686f)
                curveTo(21.4381f, 11.7761f, 19.991f, 11.7761f, 19.0984f, 12.6686f)
                close()
            }
        }
        .build()
        return _imageEdit!!
    }

private var _imageEdit: ImageVector? = null
