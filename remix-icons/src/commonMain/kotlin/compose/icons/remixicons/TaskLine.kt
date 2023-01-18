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

public val RemixIcons.TaskLine: ImageVector
    get() {
        if (_taskLine != null) {
            return _taskLine!!
        }
        _taskLine = Builder(name = "TaskLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(19.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 4.0f)
                close()
                moveTo(11.293f, 13.121f)
                lineToRelative(4.243f, -4.242f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-5.657f, 5.657f)
                lineToRelative(-3.89f, -3.89f)
                lineToRelative(1.415f, -1.414f)
                lineToRelative(2.475f, 2.475f)
                close()
            }
        }
        .build()
        return _taskLine!!
    }

private var _taskLine: ImageVector? = null
