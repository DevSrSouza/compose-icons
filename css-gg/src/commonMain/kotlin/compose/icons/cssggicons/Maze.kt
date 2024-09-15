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

public val CssGgIcons.Maze: ImageVector
    get() {
        if (_maze != null) {
            return _maze!!
        }
        _maze = Builder(name = "Maze", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.371f, 9.593f)
                lineTo(8.778f, 7.0f)
                lineTo(1.0f, 14.778f)
                lineTo(3.593f, 17.371f)
                lineTo(11.371f, 9.593f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.222f, 7.0f)
                lineTo(23.0f, 14.778f)
                lineTo(20.424f, 17.354f)
                lineTo(15.222f, 12.152f)
                lineTo(10.02f, 17.354f)
                lineTo(7.444f, 14.778f)
                lineTo(15.222f, 7.0f)
                close()
            }
        }
        .build()
        return _maze!!
    }

private var _maze: ImageVector? = null
