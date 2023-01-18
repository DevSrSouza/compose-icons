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

public val RegularGroup.IosArrowLtr: ImageVector
    get() {
        if (_iosArrowLtr != null) {
            return _iosArrowLtr!!
        }
        _iosArrowLtr = Builder(name = "IosArrowLtr", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.2964f, 12.0f)
                lineTo(12.7875f, 3.273f)
                curveTo(13.0764f, 2.9761f, 13.0699f, 2.5013f, 12.773f, 2.2125f)
                curveTo(12.4761f, 1.9236f, 12.0013f, 1.9301f, 11.7125f, 2.227f)
                lineTo(2.7125f, 11.477f)
                curveTo(2.4292f, 11.7681f, 2.4292f, 12.2319f, 2.7125f, 12.523f)
                lineTo(11.7125f, 21.773f)
                curveTo(12.0013f, 22.0699f, 12.4761f, 22.0764f, 12.773f, 21.7875f)
                curveTo(13.0699f, 21.4987f, 13.0764f, 21.0239f, 12.7875f, 20.727f)
                lineTo(4.2964f, 12.0f)
                close()
            }
        }
        .build()
        return _iosArrowLtr!!
    }

private var _iosArrowLtr: ImageVector? = null
