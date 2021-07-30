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

public val CssGgIcons.PentagonUp: ImageVector
    get() {
        if (_pentagonUp != null) {
            return _pentagonUp!!
        }
        _pentagonUp = Builder(name = "PentagonUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 16.0f)
                lineTo(17.0f, 18.0f)
                verticalLineTo(8.0f)
                lineTo(12.0f, 6.0f)
                lineTo(7.0f, 8.0f)
                verticalLineTo(18.0f)
                lineTo(12.0f, 16.0f)
                close()
                moveTo(9.0f, 15.0459f)
                lineTo(12.0f, 13.8459f)
                lineTo(15.0f, 15.0459f)
                verticalLineTo(9.3541f)
                lineTo(12.0f, 8.1541f)
                lineTo(9.0f, 9.3541f)
                verticalLineTo(15.0459f)
                close()
            }
        }
        .build()
        return _pentagonUp!!
    }

private var _pentagonUp: ImageVector? = null
