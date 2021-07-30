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

public val CssGgIcons.Loadbar: ImageVector
    get() {
        if (_loadbar != null) {
            return _loadbar!!
        }
        _loadbar = Builder(name = "Loadbar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 10.0f)
                lineTo(19.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 12.0f)
                lineTo(21.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 14.0f)
                lineTo(5.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 12.0f)
                lineTo(3.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 10.0f)
                close()
            }
        }
        .build()
        return _loadbar!!
    }

private var _loadbar: ImageVector? = null
