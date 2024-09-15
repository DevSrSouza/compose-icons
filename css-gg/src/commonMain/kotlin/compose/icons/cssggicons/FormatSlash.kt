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
                moveTo(14.526f, 6.106f)
                curveTo(15.026f, 6.339f, 15.267f, 6.883f, 15.063f, 7.321f)
                lineTo(9.885f, 18.424f)
                curveTo(9.681f, 18.862f, 9.11f, 19.028f, 8.609f, 18.794f)
                curveTo(8.109f, 18.561f, 7.869f, 18.016f, 8.073f, 17.578f)
                lineTo(13.25f, 6.476f)
                curveTo(13.454f, 6.038f, 14.025f, 5.872f, 14.526f, 6.106f)
                close()
            }
        }
        .build()
        return _formatSlash!!
    }

private var _formatSlash: ImageVector? = null
