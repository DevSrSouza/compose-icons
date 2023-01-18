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

public val FilledGroup.TextItalic: ImageVector
    get() {
        if (_textItalic != null) {
            return _textItalic!!
        }
        _textItalic = Builder(name = "TextItalic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.431f, 5.3659f)
                curveTo(12.633f, 4.8519f, 12.38f, 4.2715f, 11.8659f, 4.0695f)
                curveTo(11.3519f, 3.8676f, 10.7715f, 4.1206f, 10.5695f, 4.6346f)
                lineTo(5.0695f, 18.6346f)
                curveTo(4.8676f, 19.1487f, 5.1206f, 19.7291f, 5.6346f, 19.931f)
                curveTo(6.1487f, 20.133f, 6.7291f, 19.88f, 6.931f, 19.3659f)
                lineTo(9.4369f, 12.9872f)
                lineTo(15.2462f, 19.6571f)
                curveTo(15.6089f, 20.0735f, 16.2406f, 20.1171f, 16.6571f, 19.7544f)
                curveTo(17.0735f, 19.3916f, 17.1171f, 18.76f, 16.7544f, 18.3435f)
                lineTo(10.7652f, 11.467f)
                lineTo(19.5399f, 5.8422f)
                curveTo(20.0049f, 5.5441f, 20.1402f, 4.9256f, 19.8422f, 4.4606f)
                curveTo(19.5441f, 3.9957f, 18.9256f, 3.8603f, 18.4606f, 4.1584f)
                lineTo(11.0355f, 8.9181f)
                lineTo(12.431f, 5.3659f)
                close()
            }
        }
        .build()
        return _textItalic!!
    }

private var _textItalic: ImageVector? = null
