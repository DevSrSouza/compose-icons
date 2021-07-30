package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val CssGgIcons.Components: ImageVector
    get() {
        if (_components != null) {
            return _components!!
        }
        _components = Builder(name = "Components", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.7572f, 6.3431f)
                lineTo(11.9998f, 2.1005f)
                lineTo(16.2425f, 6.3431f)
                lineTo(11.9998f, 10.5857f)
                lineTo(7.7572f, 6.3431f)
                close()
                moveTo(10.5856f, 6.3431f)
                lineTo(11.9998f, 4.9289f)
                lineTo(13.4141f, 6.3431f)
                lineTo(11.9998f, 7.7573f)
                lineTo(10.5856f, 6.3431f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.1005f, 11.9999f)
                lineTo(6.3431f, 7.7573f)
                lineTo(10.5857f, 11.9999f)
                lineTo(6.3431f, 16.2425f)
                lineTo(2.1005f, 11.9999f)
                close()
                moveTo(4.9289f, 11.9999f)
                lineTo(6.3431f, 10.5857f)
                lineTo(7.7573f, 11.9999f)
                lineTo(6.3431f, 13.4141f)
                lineTo(4.9289f, 11.9999f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.4142f, 11.9999f)
                lineTo(17.6568f, 16.2425f)
                lineTo(21.8995f, 11.9999f)
                lineTo(17.6568f, 7.7573f)
                lineTo(13.4142f, 11.9999f)
                close()
                moveTo(17.6568f, 10.5857f)
                lineTo(16.2426f, 11.9999f)
                lineTo(17.6568f, 13.4141f)
                lineTo(19.071f, 11.9999f)
                lineTo(17.6568f, 10.5857f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.7572f, 17.6569f)
                lineTo(11.9998f, 13.4142f)
                lineTo(16.2425f, 17.6569f)
                lineTo(11.9998f, 21.8995f)
                lineTo(7.7572f, 17.6569f)
                close()
                moveTo(10.5856f, 17.6569f)
                lineTo(11.9998f, 16.2427f)
                lineTo(13.4141f, 17.6569f)
                lineTo(11.9998f, 19.0711f)
                lineTo(10.5856f, 17.6569f)
                close()
            }
        }
        .build()
        return _components!!
    }

private var _components: ImageVector? = null
