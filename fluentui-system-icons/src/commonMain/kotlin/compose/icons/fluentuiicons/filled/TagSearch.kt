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

public val FilledGroup.TagSearch: ImageVector
    get() {
        if (_tagSearch != null) {
            return _tagSearch!!
        }
        _tagSearch = Builder(name = "TagSearch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9998f, 4.25f)
                curveTo(21.9998f, 3.0074f, 20.9925f, 2.0f, 19.7498f, 2.0f)
                horizontalLineTo(14.2845f)
                curveTo(13.4218f, 2.0f, 12.5946f, 2.343f, 11.985f, 2.9533f)
                lineTo(3.4853f, 11.4632f)
                curveTo(2.217f, 12.7334f, 2.2186f, 14.7913f, 3.4891f, 16.0592f)
                lineTo(7.9508f, 20.5143f)
                curveTo(9.2219f, 21.7807f, 11.2777f, 21.7798f, 12.5472f, 20.5129f)
                lineTo(12.641f, 20.419f)
                curveTo(11.628f, 19.4214f, 11.0f, 18.034f, 11.0f, 16.5f)
                curveTo(11.0f, 13.4624f, 13.4624f, 11.0f, 16.5f, 11.0f)
                curveTo(18.0336f, 11.0f, 19.4205f, 11.6276f, 20.418f, 12.6401f)
                lineTo(21.0482f, 12.0098f)
                curveTo(21.6575f, 11.4003f, 21.9998f, 10.5738f, 21.9998f, 9.712f)
                verticalLineTo(4.25f)
                close()
                moveTo(15.4998f, 7.0022f)
                curveTo(15.4998f, 6.1737f, 16.1714f, 5.5022f, 16.9998f, 5.5022f)
                curveTo(17.8282f, 5.5022f, 18.4998f, 6.1737f, 18.4998f, 7.0022f)
                curveTo(18.4998f, 7.8306f, 17.8282f, 8.5021f, 16.9998f, 8.5021f)
                curveTo(16.1714f, 8.5021f, 15.4998f, 7.8306f, 15.4998f, 7.0022f)
                close()
                moveTo(20.1681f, 19.1074f)
                curveTo(20.6919f, 18.3718f, 21.0f, 17.4719f, 21.0f, 16.5f)
                curveTo(21.0f, 14.0147f, 18.9853f, 12.0f, 16.5f, 12.0f)
                curveTo(14.0147f, 12.0f, 12.0f, 14.0147f, 12.0f, 16.5f)
                curveTo(12.0f, 18.9853f, 14.0147f, 21.0f, 16.5f, 21.0f)
                curveTo(17.4719f, 21.0f, 18.3718f, 20.6919f, 19.1074f, 20.1681f)
                lineTo(21.7197f, 22.7803f)
                curveTo(22.0126f, 23.0732f, 22.4874f, 23.0732f, 22.7803f, 22.7803f)
                curveTo(23.0732f, 22.4874f, 23.0732f, 22.0126f, 22.7803f, 21.7197f)
                lineTo(20.1681f, 19.1074f)
                close()
                moveTo(19.5f, 16.5f)
                curveTo(19.5f, 18.1569f, 18.1569f, 19.5f, 16.5f, 19.5f)
                curveTo(14.8431f, 19.5f, 13.5f, 18.1569f, 13.5f, 16.5f)
                curveTo(13.5f, 14.8431f, 14.8431f, 13.5f, 16.5f, 13.5f)
                curveTo(18.1569f, 13.5f, 19.5f, 14.8431f, 19.5f, 16.5f)
                close()
            }
        }
        .build()
        return _tagSearch!!
    }

private var _tagSearch: ImageVector? = null
