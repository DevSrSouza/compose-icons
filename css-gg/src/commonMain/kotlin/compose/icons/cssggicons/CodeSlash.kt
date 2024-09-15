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
                moveTo(13.325f, 3.05f)
                lineTo(8.667f, 20.432f)
                lineTo(10.599f, 20.95f)
                lineTo(15.257f, 3.568f)
                lineTo(13.325f, 3.05f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.612f, 18.361f)
                lineTo(8.971f, 16.912f)
                lineTo(8.971f, 16.893f)
                lineTo(3.877f, 12.112f)
                lineTo(8.667f, 7.008f)
                lineTo(7.209f, 5.639f)
                lineTo(1.05f, 12.202f)
                lineTo(7.612f, 18.361f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.388f, 18.361f)
                lineTo(15.029f, 16.912f)
                lineTo(15.029f, 16.893f)
                lineTo(20.123f, 12.112f)
                lineTo(15.333f, 7.008f)
                lineTo(16.791f, 5.639f)
                lineTo(22.95f, 12.202f)
                lineTo(16.388f, 18.361f)
                close()
            }
        }
        .build()
        return _codeSlash!!
    }

private var _codeSlash: ImageVector? = null
