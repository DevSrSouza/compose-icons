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

public val RegularGroup.IosArrowRtl: ImageVector
    get() {
        if (_iosArrowRtl != null) {
            return _iosArrowRtl!!
        }
        _iosArrowRtl = Builder(name = "IosArrowRtl", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.7036f, 12.0f)
                lineTo(11.2125f, 3.273f)
                curveTo(10.9236f, 2.9761f, 10.9301f, 2.5013f, 11.227f, 2.2125f)
                curveTo(11.5239f, 1.9236f, 11.9987f, 1.9301f, 12.2875f, 2.227f)
                lineTo(21.2875f, 11.477f)
                curveTo(21.5708f, 11.7681f, 21.5708f, 12.2319f, 21.2875f, 12.523f)
                lineTo(12.2875f, 21.773f)
                curveTo(11.9987f, 22.0699f, 11.5239f, 22.0764f, 11.227f, 21.7875f)
                curveTo(10.9301f, 21.4987f, 10.9236f, 21.0239f, 11.2125f, 20.727f)
                lineTo(19.7036f, 12.0f)
                close()
            }
        }
        .build()
        return _iosArrowRtl!!
    }

private var _iosArrowRtl: ImageVector? = null
