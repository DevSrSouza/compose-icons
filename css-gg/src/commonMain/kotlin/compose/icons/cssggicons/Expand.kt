package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Expand: ImageVector
    get() {
        if (_expand != null) {
            return _expand!!
        }
        _expand = Builder(name = "Expand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.3062f, 16.5933f)
                lineTo(12.2713f, 18.593f)
                lineTo(5.2724f, 18.4708f)
                lineTo(5.3946f, 11.4719f)
                lineTo(7.3943f, 11.5068f)
                lineTo(7.3317f, 15.092f)
                lineTo(15.2262f, 7.4683f)
                lineTo(11.6938f, 7.4067f)
                lineTo(11.7287f, 5.407f)
                lineTo(18.7277f, 5.5292f)
                lineTo(18.6055f, 12.5281f)
                lineTo(16.6058f, 12.4932f)
                lineTo(16.6693f, 8.8551f)
                lineTo(8.721f, 16.5307f)
                lineTo(12.3062f, 16.5933f)
                close()
            }
        }
        .build()
        return _expand!!
    }

private var _expand: ImageVector? = null
