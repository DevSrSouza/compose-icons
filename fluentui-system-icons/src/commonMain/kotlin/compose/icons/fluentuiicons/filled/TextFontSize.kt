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

public val FilledGroup.TextFontSize: ImageVector
    get() {
        if (_textFontSize != null) {
            return _textFontSize!!
        }
        _textFontSize = Builder(name = "TextFontSize", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.97f, 16.168f)
                lineTo(14.5601f, 3.6566f)
                curveTo(14.8662f, 2.8222f, 16.0065f, 2.7843f, 16.3885f, 3.5428f)
                lineTo(16.4377f, 3.6566f)
                lineTo(21.9392f, 18.6533f)
                curveTo(22.1295f, 19.1718f, 21.8633f, 19.7463f, 21.3448f, 19.9365f)
                curveTo(20.8634f, 20.1131f, 20.3336f, 19.8963f, 20.1081f, 19.4493f)
                lineTo(20.0616f, 19.3421f)
                lineTo(18.651f, 15.499f)
                horizontalLineTo(12.346f)
                lineTo(10.9044f, 19.4188f)
                lineTo(10.8634f, 19.4977f)
                lineTo(10.7913f, 19.6059f)
                lineTo(10.7138f, 19.6957f)
                lineTo(10.6289f, 19.7734f)
                lineTo(10.5464f, 19.8337f)
                lineTo(10.496f, 19.8645f)
                lineTo(10.4119f, 19.9077f)
                lineTo(10.3079f, 19.9483f)
                lineTo(10.2032f, 19.9764f)
                lineTo(10.0699f, 19.9953f)
                lineTo(9.9626f, 19.9974f)
                lineTo(9.892f, 19.9923f)
                lineTo(9.7895f, 19.976f)
                lineTo(9.6395f, 19.9315f)
                lineTo(9.5702f, 19.9019f)
                lineTo(9.4701f, 19.8475f)
                lineTo(9.3586f, 19.7674f)
                lineTo(9.2669f, 19.681f)
                lineTo(9.203f, 19.6053f)
                lineTo(9.1417f, 19.5154f)
                lineTo(9.0876f, 19.4129f)
                lineTo(8.342f, 17.5f)
                horizontalLineTo(4.655f)
                lineTo(3.9323f, 19.3601f)
                curveTo(3.7464f, 19.8381f, 3.2334f, 20.0921f, 2.749f, 19.9657f)
                lineTo(2.6378f, 19.9297f)
                curveTo(2.1599f, 19.7438f, 1.9058f, 19.2308f, 2.0323f, 18.7464f)
                lineTo(2.0683f, 18.6352f)
                lineTo(5.5668f, 9.639f)
                curveTo(5.8816f, 8.8295f, 6.9876f, 8.7909f, 7.3778f, 9.5234f)
                lineTo(7.4308f, 9.639f)
                lineTo(9.97f, 16.168f)
                lineTo(14.5601f, 3.6566f)
                lineTo(9.97f, 16.168f)
                close()
                moveTo(6.4988f, 12.7605f)
                lineTo(5.433f, 15.5f)
                horizontalLineTo(7.564f)
                lineTo(6.4988f, 12.7605f)
                close()
                moveTo(15.4989f, 6.9045f)
                lineTo(13.079f, 13.499f)
                horizontalLineTo(17.917f)
                lineTo(15.4989f, 6.9045f)
                close()
            }
        }
        .build()
        return _textFontSize!!
    }

private var _textFontSize: ImageVector? = null
