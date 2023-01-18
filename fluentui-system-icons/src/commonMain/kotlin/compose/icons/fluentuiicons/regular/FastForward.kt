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

public val RegularGroup.FastForward: ImageVector
    get() {
        if (_fastForward != null) {
            return _fastForward!!
        }
        _fastForward = Builder(name = "FastForward", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 5.5029f)
                curveTo(11.5f, 4.2238f, 12.9981f, 3.5316f, 13.9722f, 4.3606f)
                lineTo(21.3819f, 10.6668f)
                curveTo(22.203f, 11.3656f, 22.203f, 12.6334f, 21.3819f, 13.3322f)
                lineTo(13.9721f, 19.6381f)
                curveTo(12.9981f, 20.4671f, 11.5f, 19.7748f, 11.5f, 18.4958f)
                verticalLineTo(14.5091f)
                lineTo(5.4721f, 19.639f)
                curveTo(4.4981f, 20.4679f, 3.0f, 19.7757f, 3.0f, 18.4966f)
                verticalLineTo(5.5037f)
                curveTo(3.0f, 4.2247f, 4.4981f, 3.5324f, 5.4722f, 4.3614f)
                lineTo(11.5f, 9.4915f)
                verticalLineTo(5.5029f)
                close()
                moveTo(11.5f, 11.4612f)
                lineTo(4.5f, 5.5037f)
                verticalLineTo(18.4966f)
                lineTo(11.5f, 12.5395f)
                verticalLineTo(11.4612f)
                close()
                moveTo(20.4098f, 11.8091f)
                lineTo(13.0f, 5.5029f)
                verticalLineTo(18.4958f)
                lineTo(20.4098f, 12.1899f)
                curveTo(20.5271f, 12.0901f, 20.5271f, 11.9089f, 20.4098f, 11.8091f)
                close()
            }
        }
        .build()
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
