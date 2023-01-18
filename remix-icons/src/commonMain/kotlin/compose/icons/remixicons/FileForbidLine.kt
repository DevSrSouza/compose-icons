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

public val RemixIcons.FileForbidLine: ImageVector
    get() {
        if (_fileForbidLine != null) {
            return _fileForbidLine!!
        }
        _fileForbidLine = Builder(name = "FileForbidLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.29f, 20.0f)
                curveToRelative(0.215f, 0.722f, 0.543f, 1.396f, 0.965f, 2.0f)
                lineTo(3.993f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 21.008f)
                lineTo(3.0f, 2.992f)
                curveTo(3.0f, 2.444f, 3.447f, 2.0f, 3.999f, 2.0f)
                lineTo(16.0f, 2.0f)
                lineToRelative(5.0f, 5.0f)
                verticalLineToRelative(4.674f)
                arcToRelative(6.95f, 6.95f, 0.0f, false, false, -2.0f, -0.603f)
                lineTo(19.0f, 8.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(15.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(6.29f)
                close()
                moveTo(18.0f, 23.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, -10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, 10.0f)
                close()
                moveTo(16.707f, 20.708f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.001f, -4.001f)
                lineToRelative(-4.001f, 4.0f)
                close()
                moveTo(15.292f, 19.293f)
                lineToRelative(4.001f, -4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -4.001f, 4.001f)
                close()
            }
        }
        .build()
        return _fileForbidLine!!
    }

private var _fileForbidLine: ImageVector? = null
