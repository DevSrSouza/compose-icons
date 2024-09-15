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
                moveTo(12.306f, 16.593f)
                lineTo(12.271f, 18.593f)
                lineTo(5.272f, 18.471f)
                lineTo(5.395f, 11.472f)
                lineTo(7.394f, 11.507f)
                lineTo(7.332f, 15.092f)
                lineTo(15.226f, 7.468f)
                lineTo(11.694f, 7.407f)
                lineTo(11.729f, 5.407f)
                lineTo(18.728f, 5.529f)
                lineTo(18.605f, 12.528f)
                lineTo(16.606f, 12.493f)
                lineTo(16.669f, 8.855f)
                lineTo(8.721f, 16.531f)
                lineTo(12.306f, 16.593f)
                close()
            }
        }
        .build()
        return _expand!!
    }

private var _expand: ImageVector? = null
