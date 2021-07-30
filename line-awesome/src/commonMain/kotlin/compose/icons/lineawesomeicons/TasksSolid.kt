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

public val LineAwesomeIcons.TasksSolid: ImageVector
    get() {
        if (_tasksSolid != null) {
            return _tasksSolid!!
        }
        _tasksSolid = Builder(name = "TasksSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.293f, 5.293f)
                lineTo(7.0f, 8.5859f)
                lineTo(5.707f, 7.293f)
                lineTo(4.293f, 8.707f)
                lineTo(7.0f, 11.4141f)
                lineTo(11.707f, 6.707f)
                close()
                moveTo(14.0f, 7.0f)
                lineTo(14.0f, 9.0f)
                lineTo(28.0f, 9.0f)
                lineTo(28.0f, 7.0f)
                close()
                moveTo(14.0f, 15.0f)
                lineTo(14.0f, 17.0f)
                lineTo(28.0f, 17.0f)
                lineTo(28.0f, 15.0f)
                close()
                moveTo(14.0f, 23.0f)
                lineTo(14.0f, 25.0f)
                lineTo(28.0f, 25.0f)
                lineTo(28.0f, 23.0f)
                close()
            }
        }
        .build()
        return _tasksSolid!!
    }

private var _tasksSolid: ImageVector? = null
