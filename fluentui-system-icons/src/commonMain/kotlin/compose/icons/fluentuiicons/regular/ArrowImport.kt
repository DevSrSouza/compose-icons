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

public val RegularGroup.ArrowImport: ImageVector
    get() {
        if (_arrowImport != null) {
            return _arrowImport!!
        }
        _arrowImport = Builder(name = "ArrowImport", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.2498f, 4.5f)
                curveTo(21.6295f, 4.5f, 21.9433f, 4.7821f, 21.993f, 5.1482f)
                lineTo(21.9998f, 5.25f)
                verticalLineTo(18.2541f)
                curveTo(21.9998f, 18.6683f, 21.664f, 19.0041f, 21.2498f, 19.0041f)
                curveTo(20.8701f, 19.0041f, 20.5563f, 18.7219f, 20.5066f, 18.3558f)
                lineTo(20.4998f, 18.2541f)
                verticalLineTo(5.25f)
                curveTo(20.4998f, 4.8358f, 20.8356f, 4.5f, 21.2498f, 4.5f)
                close()
                moveTo(12.6469f, 6.3037f)
                lineTo(12.7195f, 6.2196f)
                curveTo(12.9858f, 5.9534f, 13.4025f, 5.9292f, 13.6961f, 6.1471f)
                lineTo(13.7802f, 6.2197f)
                lineTo(18.7768f, 11.2174f)
                curveTo(19.0429f, 11.4835f, 19.0672f, 11.8999f, 18.8496f, 12.1935f)
                lineTo(18.7771f, 12.2776f)
                lineTo(13.7805f, 17.2811f)
                curveTo(13.4878f, 17.5742f, 13.0129f, 17.5745f, 12.7198f, 17.2818f)
                curveTo(12.4534f, 17.0157f, 12.4289f, 16.5991f, 12.6465f, 16.3053f)
                lineTo(12.7191f, 16.2211f)
                lineTo(16.43f, 12.504f)
                lineTo(2.75f, 12.5049f)
                curveTo(2.3703f, 12.5049f, 2.0565f, 12.2228f, 2.0069f, 11.8567f)
                lineTo(2.0f, 11.7549f)
                curveTo(2.0f, 11.3753f, 2.2822f, 11.0615f, 2.6482f, 11.0118f)
                lineTo(2.75f, 11.0049f)
                lineTo(16.443f, 11.004f)
                lineTo(12.7194f, 7.2803f)
                curveTo(12.4532f, 7.014f, 12.429f, 6.5973f, 12.6469f, 6.3037f)
                lineTo(12.7195f, 6.2196f)
                lineTo(12.6469f, 6.3037f)
                close()
            }
        }
        .build()
        return _arrowImport!!
    }

private var _arrowImport: ImageVector? = null
