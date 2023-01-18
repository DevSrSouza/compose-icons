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

public val RegularGroup.Info: ImageVector
    get() {
        if (_info != null) {
            return _info!!
        }
        _info = Builder(name = "Info", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0001f, 1.999f)
                curveTo(17.5238f, 1.999f, 22.0016f, 6.4769f, 22.0016f, 12.0006f)
                curveTo(22.0016f, 17.5243f, 17.5238f, 22.0021f, 12.0001f, 22.0021f)
                curveTo(6.4764f, 22.0021f, 1.9985f, 17.5243f, 1.9985f, 12.0006f)
                curveTo(1.9985f, 6.4769f, 6.4764f, 1.999f, 12.0001f, 1.999f)
                close()
                moveTo(12.0001f, 3.499f)
                curveTo(7.3048f, 3.499f, 3.4985f, 7.3053f, 3.4985f, 12.0006f)
                curveTo(3.4985f, 16.6959f, 7.3048f, 20.5021f, 12.0001f, 20.5021f)
                curveTo(16.6954f, 20.5021f, 20.5016f, 16.6959f, 20.5016f, 12.0006f)
                curveTo(20.5016f, 7.3053f, 16.6954f, 3.499f, 12.0001f, 3.499f)
                close()
                moveTo(11.9964f, 10.4996f)
                curveTo(12.3761f, 10.4994f, 12.6901f, 10.7813f, 12.74f, 11.1473f)
                lineTo(12.7469f, 11.2491f)
                lineTo(12.7505f, 16.7507f)
                curveTo(12.7508f, 17.1649f, 12.4152f, 17.5009f, 12.001f, 17.5012f)
                curveTo(11.6213f, 17.5014f, 11.3073f, 17.2195f, 11.2574f, 16.8535f)
                lineTo(11.2505f, 16.7517f)
                lineTo(11.2469f, 11.2501f)
                curveTo(11.2467f, 10.8359f, 11.5822f, 10.4999f, 11.9964f, 10.4996f)
                close()
                moveTo(12.0005f, 7.0018f)
                curveTo(12.5521f, 7.0018f, 12.9992f, 7.449f, 12.9992f, 8.0005f)
                curveTo(12.9992f, 8.552f, 12.5521f, 8.9992f, 12.0005f, 8.9992f)
                curveTo(11.449f, 8.9992f, 11.0019f, 8.552f, 11.0019f, 8.0005f)
                curveTo(11.0019f, 7.449f, 11.449f, 7.0018f, 12.0005f, 7.0018f)
                close()
            }
        }
        .build()
        return _info!!
    }

private var _info: ImageVector? = null
