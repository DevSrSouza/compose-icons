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
                moveTo(11.3709f, 9.5927f)
                lineTo(8.7782f, 7.0f)
                lineTo(1.0f, 14.7782f)
                lineTo(3.5927f, 17.3709f)
                lineTo(11.3709f, 9.5927f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.2218f, 7.0f)
                lineTo(23.0f, 14.7782f)
                lineTo(20.424f, 17.3542f)
                lineTo(15.2218f, 12.152f)
                lineTo(10.0197f, 17.3542f)
                lineTo(7.4437f, 14.7782f)
                lineTo(15.2218f, 7.0f)
                close()
            }
        }
        .build()
        return _maze!!
    }

private var _maze: ImageVector? = null
