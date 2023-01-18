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

public val RegularGroup.ArrowExportRtl: ImageVector
    get() {
        if (_arrowExportRtl != null) {
            return _arrowExportRtl!!
        }
        _arrowExportRtl = Builder(name = "ArrowExportRtl", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.2446f, 4.5f)
                curveTo(20.8649f, 4.5f, 20.5511f, 4.7823f, 20.5015f, 5.1484f)
                lineTo(20.4947f, 5.2501f)
                lineTo(20.4971f, 18.2542f)
                curveTo(20.4971f, 18.6684f, 20.833f, 19.0041f, 21.2472f, 19.0041f)
                curveTo(21.6269f, 19.0041f, 21.9406f, 18.7218f, 21.9902f, 18.3557f)
                lineTo(21.9971f, 18.2539f)
                lineTo(21.9947f, 5.2499f)
                curveTo(21.9946f, 4.8356f, 21.6588f, 4.5f, 21.2446f, 4.5f)
                close()
                moveTo(8.35f, 6.3037f)
                lineTo(8.2774f, 6.2196f)
                curveTo(8.0111f, 5.9534f, 7.5944f, 5.9292f, 7.3008f, 6.1471f)
                lineTo(7.2167f, 6.2197f)
                lineTo(2.2201f, 11.2174f)
                curveTo(1.954f, 11.4835f, 1.9297f, 11.8999f, 2.1472f, 12.1935f)
                lineTo(2.2198f, 12.2776f)
                lineTo(7.2164f, 17.2811f)
                curveTo(7.5091f, 17.5742f, 7.9839f, 17.5745f, 8.277f, 17.2818f)
                curveTo(8.5435f, 17.0157f, 8.568f, 16.5991f, 8.3503f, 16.3053f)
                lineTo(8.2778f, 16.2211f)
                lineTo(4.5671f, 12.504f)
                lineTo(18.2441f, 12.5049f)
                curveTo(18.6238f, 12.5049f, 18.9376f, 12.2228f, 18.9873f, 11.8567f)
                lineTo(18.9941f, 11.7549f)
                curveTo(18.9941f, 11.3753f, 18.712f, 11.0615f, 18.3459f, 11.0118f)
                lineTo(18.2441f, 11.0049f)
                lineTo(4.5541f, 11.004f)
                lineTo(8.2775f, 7.2803f)
                curveTo(8.5437f, 7.014f, 8.5679f, 6.5973f, 8.35f, 6.3037f)
                lineTo(8.2774f, 6.2196f)
                lineTo(8.35f, 6.3037f)
                close()
            }
        }
        .build()
        return _arrowExportRtl!!
    }

private var _arrowExportRtl: ImageVector? = null
