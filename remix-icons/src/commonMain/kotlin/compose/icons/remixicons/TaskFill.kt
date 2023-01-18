package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.TaskFill: ImageVector
    get() {
        if (_taskFill != null) {
            return _taskFill!!
        }
        _taskFill = Builder(name = "TaskFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.992f)
                verticalLineToRelative(18.016f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.993f, 0.992f)
                lineTo(3.993f, 22.0f)
                arcTo(0.993f, 0.993f, 0.0f, false, true, 3.0f, 21.008f)
                lineTo(3.0f, 2.992f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.993f, 2.0f)
                horizontalLineToRelative(16.014f)
                curveToRelative(0.548f, 0.0f, 0.993f, 0.444f, 0.993f, 0.992f)
                close()
                moveTo(11.293f, 13.122f)
                lineToRelative(-2.475f, -2.476f)
                lineToRelative(-1.414f, 1.415f)
                lineToRelative(3.889f, 3.889f)
                lineToRelative(5.657f, -5.657f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-4.243f, 4.242f)
                close()
            }
        }
        .build()
        return _taskFill!!
    }

private var _taskFill: ImageVector? = null
