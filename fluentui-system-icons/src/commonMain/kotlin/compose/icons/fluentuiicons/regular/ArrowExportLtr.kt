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

public val RegularGroup.ArrowExportLtr: ImageVector
    get() {
        if (_arrowExportLtr != null) {
            return _arrowExportLtr!!
        }
        _arrowExportLtr = Builder(name = "ArrowExportLtr", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.7525f, 4.5f)
                curveTo(3.1322f, 4.5f, 3.4459f, 4.7823f, 3.4955f, 5.1484f)
                lineTo(3.5024f, 5.2501f)
                lineTo(3.5f, 18.2542f)
                curveTo(3.4999f, 18.6684f, 3.1641f, 19.0041f, 2.7499f, 19.0041f)
                curveTo(2.3702f, 19.0041f, 2.0564f, 18.7218f, 2.0068f, 18.3557f)
                lineTo(2.0f, 18.2539f)
                lineTo(2.0024f, 5.2499f)
                curveTo(2.0024f, 4.8356f, 2.3383f, 4.5f, 2.7525f, 4.5f)
                close()
                moveTo(15.6471f, 6.3037f)
                lineTo(15.7197f, 6.2196f)
                curveTo(15.986f, 5.9534f, 16.4027f, 5.9292f, 16.6963f, 6.1471f)
                lineTo(16.7804f, 6.2197f)
                lineTo(21.777f, 11.2174f)
                curveTo(22.0431f, 11.4835f, 22.0674f, 11.8999f, 21.8498f, 12.1935f)
                lineTo(21.7773f, 12.2776f)
                lineTo(16.7807f, 17.2811f)
                curveTo(16.488f, 17.5742f, 16.0131f, 17.5745f, 15.72f, 17.2818f)
                curveTo(15.4536f, 17.0157f, 15.4291f, 16.5991f, 15.6467f, 16.3053f)
                lineTo(15.7193f, 16.2211f)
                lineTo(19.43f, 12.504f)
                lineTo(5.753f, 12.5049f)
                curveTo(5.3733f, 12.5049f, 5.0595f, 12.2228f, 5.0098f, 11.8567f)
                lineTo(5.003f, 11.7549f)
                curveTo(5.003f, 11.3753f, 5.2851f, 11.0615f, 5.6512f, 11.0118f)
                lineTo(5.753f, 11.0049f)
                lineTo(19.443f, 11.004f)
                lineTo(15.7196f, 7.2803f)
                curveTo(15.4534f, 7.014f, 15.4292f, 6.5973f, 15.6471f, 6.3037f)
                lineTo(15.7197f, 6.2196f)
                lineTo(15.6471f, 6.3037f)
                close()
            }
        }
        .build()
        return _arrowExportLtr!!
    }

private var _arrowExportLtr: ImageVector? = null
