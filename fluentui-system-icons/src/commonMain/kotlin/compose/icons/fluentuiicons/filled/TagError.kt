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

public val FilledGroup.TagError: ImageVector
    get() {
        if (_tagError != null) {
            return _tagError!!
        }
        _tagError = Builder(name = "TagError", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.7498f, 2.0f)
                curveTo(20.9925f, 2.0f, 21.9998f, 3.0074f, 21.9998f, 4.25f)
                verticalLineTo(9.712f)
                curveTo(21.9998f, 10.5738f, 21.6575f, 11.4003f, 21.0482f, 12.0098f)
                lineTo(21.0219f, 12.036f)
                curveTo(20.0071f, 11.3805f, 18.7979f, 11.0f, 17.4998f, 11.0f)
                curveTo(13.91f, 11.0f, 10.9998f, 13.9101f, 10.9998f, 17.5f)
                curveTo(10.9998f, 18.7703f, 11.3642f, 19.9554f, 11.9941f, 20.9566f)
                curveTo(10.7371f, 21.7569f, 9.0504f, 21.6098f, 7.9508f, 20.5143f)
                lineTo(3.4891f, 16.0592f)
                curveTo(2.2186f, 14.7913f, 2.217f, 12.7334f, 3.4853f, 11.4632f)
                lineTo(11.985f, 2.9533f)
                curveTo(12.5946f, 2.343f, 13.4218f, 2.0f, 14.2845f, 2.0f)
                horizontalLineTo(19.7498f)
                close()
                moveTo(16.9998f, 5.5022f)
                curveTo(16.1714f, 5.5022f, 15.4998f, 6.1737f, 15.4998f, 7.0022f)
                curveTo(15.4998f, 7.8306f, 16.1714f, 8.5021f, 16.9998f, 8.5021f)
                curveTo(17.8282f, 8.5021f, 18.4998f, 7.8306f, 18.4998f, 7.0022f)
                curveTo(18.4998f, 6.1737f, 17.8282f, 5.5022f, 16.9998f, 5.5022f)
                close()
                moveTo(22.9998f, 17.5f)
                curveTo(22.9998f, 20.5376f, 20.5374f, 23.0f, 17.4998f, 23.0f)
                curveTo(14.4623f, 23.0f, 11.9998f, 20.5376f, 11.9998f, 17.5f)
                curveTo(11.9998f, 14.4624f, 14.4623f, 12.0f, 17.4998f, 12.0f)
                curveTo(20.5374f, 12.0f, 22.9998f, 14.4624f, 22.9998f, 17.5f)
                close()
                moveTo(17.4998f, 14.0f)
                curveTo(17.2237f, 14.0f, 16.9998f, 14.2239f, 16.9998f, 14.5f)
                verticalLineTo(18.5f)
                curveTo(16.9998f, 18.7761f, 17.2237f, 19.0f, 17.4998f, 19.0f)
                curveTo(17.776f, 19.0f, 17.9998f, 18.7761f, 17.9998f, 18.5f)
                verticalLineTo(14.5f)
                curveTo(17.9998f, 14.2239f, 17.776f, 14.0f, 17.4998f, 14.0f)
                close()
                moveTo(17.4998f, 21.125f)
                curveTo(17.845f, 21.125f, 18.1248f, 20.8452f, 18.1248f, 20.5f)
                curveTo(18.1248f, 20.1548f, 17.845f, 19.875f, 17.4998f, 19.875f)
                curveTo(17.1546f, 19.875f, 16.8748f, 20.1548f, 16.8748f, 20.5f)
                curveTo(16.8748f, 20.8452f, 17.1546f, 21.125f, 17.4998f, 21.125f)
                close()
            }
        }
        .build()
        return _tagError!!
    }

private var _tagError: ImageVector? = null
