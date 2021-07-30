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

public val LineAwesomeIcons.StickyNoteSolid: ImageVector
    get() {
        if (_stickyNoteSolid != null) {
            return _stickyNoteSolid!!
        }
        _stickyNoteSolid = Builder(name = "StickyNoteSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(20.4063f, 27.0f)
                lineTo(20.7188f, 26.7188f)
                lineTo(26.7188f, 20.7188f)
                lineTo(27.0f, 20.4063f)
                lineTo(27.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 19.0f)
                lineTo(19.0f, 19.0f)
                lineTo(19.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(23.5625f, 21.0f)
                lineTo(21.0f, 23.5625f)
                close()
            }
        }
        .build()
        return _stickyNoteSolid!!
    }

private var _stickyNoteSolid: ImageVector? = null
