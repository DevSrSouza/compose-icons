package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.QuoteLeftSolid: ImageVector
    get() {
        if (_quoteLeftSolid != null) {
            return _quoteLeftSolid!!
        }
        _quoteLeftSolid = Builder(name = "QuoteLeftSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 8.0f)
                curveTo(6.6992f, 8.0f, 4.0f, 10.6992f, 4.0f, 14.0f)
                lineTo(4.0f, 24.0f)
                lineTo(14.0f, 24.0f)
                lineTo(14.0f, 14.0f)
                lineTo(6.0f, 14.0f)
                curveTo(6.0f, 11.7813f, 7.7813f, 10.0f, 10.0f, 10.0f)
                close()
                moveTo(24.0f, 8.0f)
                curveTo(20.6992f, 8.0f, 18.0f, 10.6992f, 18.0f, 14.0f)
                lineTo(18.0f, 24.0f)
                lineTo(28.0f, 24.0f)
                lineTo(28.0f, 14.0f)
                lineTo(20.0f, 14.0f)
                curveTo(20.0f, 11.7813f, 21.7813f, 10.0f, 24.0f, 10.0f)
                close()
                moveTo(6.0f, 16.0f)
                lineTo(12.0f, 16.0f)
                lineTo(12.0f, 22.0f)
                lineTo(6.0f, 22.0f)
                close()
                moveTo(20.0f, 16.0f)
                lineTo(26.0f, 16.0f)
                lineTo(26.0f, 22.0f)
                lineTo(20.0f, 22.0f)
                close()
            }
        }
        .build()
        return _quoteLeftSolid!!
    }

private var _quoteLeftSolid: ImageVector? = null
