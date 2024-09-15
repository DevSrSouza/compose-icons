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

public val LineAwesomeIcons.QuoteRightSolid: ImageVector
    get() {
        if (_quoteRightSolid != null) {
            return _quoteRightSolid!!
        }
        _quoteRightSolid = Builder(name = "QuoteRightSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 8.0f)
                lineTo(4.0f, 18.0f)
                lineTo(12.0f, 18.0f)
                curveTo(12.0f, 20.219f, 10.219f, 22.0f, 8.0f, 22.0f)
                lineTo(8.0f, 24.0f)
                curveTo(11.301f, 24.0f, 14.0f, 21.301f, 14.0f, 18.0f)
                lineTo(14.0f, 8.0f)
                close()
                moveTo(18.0f, 8.0f)
                lineTo(18.0f, 18.0f)
                lineTo(26.0f, 18.0f)
                curveTo(26.0f, 20.219f, 24.219f, 22.0f, 22.0f, 22.0f)
                lineTo(22.0f, 24.0f)
                curveTo(25.301f, 24.0f, 28.0f, 21.301f, 28.0f, 18.0f)
                lineTo(28.0f, 8.0f)
                close()
                moveTo(6.0f, 10.0f)
                lineTo(12.0f, 10.0f)
                lineTo(12.0f, 16.0f)
                lineTo(6.0f, 16.0f)
                close()
                moveTo(20.0f, 10.0f)
                lineTo(26.0f, 10.0f)
                lineTo(26.0f, 16.0f)
                lineTo(20.0f, 16.0f)
                close()
            }
        }
        .build()
        return _quoteRightSolid!!
    }

private var _quoteRightSolid: ImageVector? = null
