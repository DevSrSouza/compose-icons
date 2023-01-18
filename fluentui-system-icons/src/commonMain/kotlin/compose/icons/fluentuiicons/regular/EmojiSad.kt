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

public val RegularGroup.EmojiSad: ImageVector
    get() {
        if (_emojiSad != null) {
            return _emojiSad!!
        }
        _emojiSad = Builder(name = "EmojiSad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.998f)
                curveTo(17.5237f, 1.998f, 22.0015f, 6.4759f, 22.0015f, 11.9996f)
                curveTo(22.0015f, 17.5233f, 17.5237f, 22.0011f, 12.0f, 22.0011f)
                curveTo(6.4763f, 22.0011f, 1.9984f, 17.5233f, 1.9984f, 11.9996f)
                curveTo(1.9984f, 6.4759f, 6.4763f, 1.998f, 12.0f, 1.998f)
                close()
                moveTo(12.0f, 3.498f)
                curveTo(7.3047f, 3.498f, 3.4984f, 7.3043f, 3.4984f, 11.9996f)
                curveTo(3.4984f, 16.6949f, 7.3047f, 20.5011f, 12.0f, 20.5011f)
                curveTo(16.6952f, 20.5011f, 20.5015f, 16.6949f, 20.5015f, 11.9996f)
                curveTo(20.5015f, 7.3043f, 16.6952f, 3.498f, 12.0f, 3.498f)
                close()
                moveTo(12.0f, 13.4971f)
                curveTo(13.6312f, 13.4971f, 15.1603f, 14.152f, 16.281f, 15.2925f)
                curveTo(16.5713f, 15.588f, 16.5672f, 16.0628f, 16.2717f, 16.3531f)
                curveTo(15.9762f, 16.6434f, 15.5014f, 16.6393f, 15.2111f, 16.3438f)
                curveTo(14.3696f, 15.4874f, 13.2247f, 14.9971f, 12.0f, 14.9971f)
                curveTo(10.7726f, 14.9971f, 9.6253f, 15.4896f, 8.7834f, 16.3493f)
                curveTo(8.4936f, 16.6453f, 8.0188f, 16.6503f, 7.7228f, 16.3605f)
                curveTo(7.4269f, 16.0707f, 7.4219f, 15.5958f, 7.7117f, 15.2999f)
                curveTo(8.8329f, 14.1549f, 10.3651f, 13.4971f, 12.0f, 13.4971f)
                close()
                moveTo(9.0004f, 8.7502f)
                curveTo(9.6904f, 8.7502f, 10.2497f, 9.3096f, 10.2497f, 9.9995f)
                curveTo(10.2497f, 10.6895f, 9.6904f, 11.2488f, 9.0004f, 11.2488f)
                curveTo(8.3104f, 11.2488f, 7.7511f, 10.6895f, 7.7511f, 9.9995f)
                curveTo(7.7511f, 9.3096f, 8.3104f, 8.7502f, 9.0004f, 8.7502f)
                close()
                moveTo(15.0004f, 8.7502f)
                curveTo(15.6904f, 8.7502f, 16.2497f, 9.3096f, 16.2497f, 9.9995f)
                curveTo(16.2497f, 10.6895f, 15.6904f, 11.2488f, 15.0004f, 11.2488f)
                curveTo(14.3104f, 11.2488f, 13.7511f, 10.6895f, 13.7511f, 9.9995f)
                curveTo(13.7511f, 9.3096f, 14.3104f, 8.7502f, 15.0004f, 8.7502f)
                close()
            }
        }
        .build()
        return _emojiSad!!
    }

private var _emojiSad: ImageVector? = null
