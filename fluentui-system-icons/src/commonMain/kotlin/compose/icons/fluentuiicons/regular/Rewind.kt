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

public val RegularGroup.Rewind: ImageVector
    get() {
        if (_rewind != null) {
            return _rewind!!
        }
        _rewind = Builder(name = "Rewind", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5007f, 5.5029f)
                curveTo(12.5007f, 4.2238f, 11.0026f, 3.5316f, 10.0285f, 4.3606f)
                lineTo(2.6187f, 10.6668f)
                curveTo(1.7976f, 11.3656f, 1.7977f, 12.6334f, 2.6188f, 13.3322f)
                lineTo(10.0285f, 19.6381f)
                curveTo(11.0026f, 20.4671f, 12.5007f, 19.7748f, 12.5007f, 18.4958f)
                verticalLineTo(14.5081f)
                lineTo(18.5295f, 19.6387f)
                curveTo(19.5035f, 20.4677f, 21.0016f, 19.7754f, 21.0016f, 18.4964f)
                verticalLineTo(5.5035f)
                curveTo(21.0016f, 4.2245f, 19.5035f, 3.5322f, 18.5295f, 4.3612f)
                lineTo(12.5007f, 9.4921f)
                verticalLineTo(5.5029f)
                close()
                moveTo(12.5007f, 12.5384f)
                verticalLineTo(11.4618f)
                lineTo(19.5016f, 5.5035f)
                verticalLineTo(18.4964f)
                lineTo(12.5007f, 12.5384f)
                close()
                moveTo(3.5909f, 11.8091f)
                lineTo(11.0007f, 5.5029f)
                verticalLineTo(18.4958f)
                lineTo(3.5909f, 12.1899f)
                curveTo(3.4736f, 12.0901f, 3.4736f, 11.9089f, 3.5909f, 11.8091f)
                close()
            }
        }
        .build()
        return _rewind!!
    }

private var _rewind: ImageVector? = null
