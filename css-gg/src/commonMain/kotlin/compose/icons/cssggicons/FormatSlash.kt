package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.FormatSlash: ImageVector
    get() {
        if (_formatSlash != null) {
            return _formatSlash!!
        }
        _formatSlash = Builder(name = "FormatSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.526f, 6.1058f)
                curveTo(15.0265f, 6.3392f, 15.2667f, 6.8834f, 15.0625f, 7.3214f)
                lineTo(9.8854f, 18.4237f)
                curveTo(9.6812f, 18.8616f, 9.1098f, 19.0275f, 8.6093f, 18.7941f)
                curveTo(8.1088f, 18.5607f, 7.8686f, 18.0164f, 8.0728f, 17.5784f)
                lineTo(13.2499f, 6.4762f)
                curveTo(13.4541f, 6.0382f, 14.0254f, 5.8724f, 14.526f, 6.1058f)
                close()
            }
        }
        .build()
        return _formatSlash!!
    }

private var _formatSlash: ImageVector? = null
