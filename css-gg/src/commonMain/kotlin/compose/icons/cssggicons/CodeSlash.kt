package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.CodeSlash: ImageVector
    get() {
        if (_codeSlash != null) {
            return _codeSlash!!
        }
        _codeSlash = Builder(name = "CodeSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.325f, 3.0501f)
                lineTo(8.6674f, 20.4323f)
                lineTo(10.5993f, 20.9499f)
                lineTo(15.2568f, 3.5677f)
                lineTo(13.325f, 3.0501f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.612f, 18.3608f)
                lineTo(8.9714f, 16.9124f)
                lineTo(8.9709f, 16.8933f)
                lineTo(3.8766f, 12.1121f)
                lineTo(8.667f, 7.008f)
                lineTo(7.2087f, 5.6393f)
                lineTo(1.0496f, 12.2017f)
                lineTo(7.612f, 18.3608f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.388f, 18.3608f)
                lineTo(15.0286f, 16.9124f)
                lineTo(15.0291f, 16.8933f)
                lineTo(20.1234f, 12.1121f)
                lineTo(15.333f, 7.008f)
                lineTo(16.7913f, 5.6393f)
                lineTo(22.9504f, 12.2017f)
                lineTo(16.388f, 18.3608f)
                close()
            }
        }
        .build()
        return _codeSlash!!
    }

private var _codeSlash: ImageVector? = null
