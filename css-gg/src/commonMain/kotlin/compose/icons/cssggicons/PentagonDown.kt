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

public val CssGgIcons.PentagonDown: ImageVector
    get() {
        if (_pentagonDown != null) {
            return _pentagonDown!!
        }
        _pentagonDown = Builder(name = "PentagonDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 8.0f)
                lineTo(7.0f, 6.0f)
                verticalLineTo(16.0f)
                lineTo(12.0f, 18.5f)
                lineTo(17.0f, 16.0f)
                verticalLineTo(6.0f)
                lineTo(12.0f, 8.0f)
                close()
                moveTo(15.0f, 8.9541f)
                lineTo(12.0f, 10.1541f)
                lineTo(9.0f, 8.9541f)
                verticalLineTo(14.7639f)
                lineTo(12.0f, 16.2639f)
                lineTo(15.0f, 14.7639f)
                verticalLineTo(8.9541f)
                close()
            }
        }
        .build()
        return _pentagonDown!!
    }

private var _pentagonDown: ImageVector? = null
