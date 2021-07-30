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

public val LineAwesomeIcons.FilmSolid: ImageVector
    get() {
        if (_filmSolid != null) {
            return _filmSolid!!
        }
        _filmSolid = Builder(name = "FilmSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                lineTo(4.0f, 28.0f)
                lineTo(28.0f, 28.0f)
                lineTo(28.0f, 4.0f)
                close()
                moveTo(6.0f, 6.0f)
                lineTo(8.0f, 6.0f)
                lineTo(8.0f, 7.0f)
                lineTo(10.0f, 7.0f)
                lineTo(10.0f, 6.0f)
                lineTo(22.0f, 6.0f)
                lineTo(22.0f, 7.0f)
                lineTo(24.0f, 7.0f)
                lineTo(24.0f, 6.0f)
                lineTo(26.0f, 6.0f)
                lineTo(26.0f, 26.0f)
                lineTo(24.0f, 26.0f)
                lineTo(24.0f, 25.0f)
                lineTo(22.0f, 25.0f)
                lineTo(22.0f, 26.0f)
                lineTo(10.0f, 26.0f)
                lineTo(10.0f, 25.0f)
                lineTo(8.0f, 25.0f)
                lineTo(8.0f, 26.0f)
                lineTo(6.0f, 26.0f)
                close()
                moveTo(8.0f, 9.0f)
                lineTo(8.0f, 11.0f)
                lineTo(10.0f, 11.0f)
                lineTo(10.0f, 9.0f)
                close()
                moveTo(22.0f, 9.0f)
                lineTo(22.0f, 11.0f)
                lineTo(24.0f, 11.0f)
                lineTo(24.0f, 9.0f)
                close()
                moveTo(8.0f, 13.0f)
                lineTo(8.0f, 15.0f)
                lineTo(10.0f, 15.0f)
                lineTo(10.0f, 13.0f)
                close()
                moveTo(22.0f, 13.0f)
                lineTo(22.0f, 15.0f)
                lineTo(24.0f, 15.0f)
                lineTo(24.0f, 13.0f)
                close()
                moveTo(8.0f, 17.0f)
                lineTo(8.0f, 19.0f)
                lineTo(10.0f, 19.0f)
                lineTo(10.0f, 17.0f)
                close()
                moveTo(22.0f, 17.0f)
                lineTo(22.0f, 19.0f)
                lineTo(24.0f, 19.0f)
                lineTo(24.0f, 17.0f)
                close()
                moveTo(8.0f, 21.0f)
                lineTo(8.0f, 23.0f)
                lineTo(10.0f, 23.0f)
                lineTo(10.0f, 21.0f)
                close()
                moveTo(22.0f, 21.0f)
                lineTo(22.0f, 23.0f)
                lineTo(24.0f, 23.0f)
                lineTo(24.0f, 21.0f)
                close()
            }
        }
        .build()
        return _filmSolid!!
    }

private var _filmSolid: ImageVector? = null
