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

public val FilledGroup.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = Builder(name = "Tag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.7498f, 2.0f)
                curveTo(20.9925f, 2.0f, 21.9998f, 3.0074f, 21.9998f, 4.25f)
                verticalLineTo(9.712f)
                curveTo(21.9998f, 10.5738f, 21.6575f, 11.4003f, 21.0482f, 12.0098f)
                lineTo(12.5472f, 20.5129f)
                curveTo(11.2777f, 21.7798f, 9.2219f, 21.7807f, 7.9508f, 20.5143f)
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
            }
        }
        .build()
        return _tag!!
    }

private var _tag: ImageVector? = null
