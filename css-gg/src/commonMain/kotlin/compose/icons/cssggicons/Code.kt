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

public val CssGgIcons.Code: ImageVector
    get() {
        if (_code != null) {
            return _code!!
        }
        _code = Builder(name = "Code", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.953f, 16.912f)
                lineTo(8.593f, 18.361f)
                lineTo(2.031f, 12.202f)
                lineTo(8.19f, 5.639f)
                lineTo(9.648f, 7.008f)
                lineTo(4.858f, 12.112f)
                lineTo(9.952f, 16.893f)
                lineTo(9.953f, 16.912f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.047f, 16.912f)
                lineTo(15.407f, 18.361f)
                lineTo(21.969f, 12.202f)
                lineTo(15.81f, 5.639f)
                lineTo(14.352f, 7.008f)
                lineTo(19.142f, 12.112f)
                lineTo(14.048f, 16.893f)
                lineTo(14.047f, 16.912f)
                close()
            }
        }
        .build()
        return _code!!
    }

private var _code: ImageVector? = null
