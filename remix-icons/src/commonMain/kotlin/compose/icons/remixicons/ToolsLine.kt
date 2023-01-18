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

public val RemixIcons.ToolsLine: ImageVector
    get() {
        if (_toolsLine != null) {
            return _toolsLine!!
        }
        _toolsLine = Builder(name = "ToolsLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.33f, 3.271f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 4.254f, 4.963f)
                lineToRelative(10.709f, 10.71f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-10.71f, -10.71f)
                arcToRelative(3.502f, 3.502f, 0.0f, false, true, -4.962f, -4.255f)
                lineTo(5.444f, 7.63f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.121f, -2.121f)
                lineTo(5.329f, 3.27f)
                close()
                moveTo(15.697f, 5.155f)
                lineToRelative(3.182f, -1.768f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.768f, 3.182f)
                lineToRelative(-1.768f, 0.354f)
                lineToRelative(-2.12f, 2.121f)
                lineToRelative(-1.415f, -1.414f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(0.354f, -1.768f)
                close()
                moveTo(8.979f, 13.287f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-5.303f, 5.303f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.492f, -1.327f)
                lineToRelative(0.078f, -0.087f)
                lineToRelative(5.303f, -5.303f)
                close()
            }
        }
        .build()
        return _toolsLine!!
    }

private var _toolsLine: ImageVector? = null
