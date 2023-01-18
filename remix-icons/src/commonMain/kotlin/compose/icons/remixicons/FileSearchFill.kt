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

public val RemixIcons.FileSearchFill: ImageVector
    get() {
        if (_fileSearchFill != null) {
            return _fileSearchFill!!
        }
        _fileSearchFill = Builder(name = "FileSearchFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                lineToRelative(5.0f, 5.0f)
                verticalLineToRelative(14.008f)
                arcToRelative(0.993f, 0.993f, 0.0f, false, true, -0.993f, 0.992f)
                lineTo(3.993f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 21.008f)
                lineTo(3.0f, 2.992f)
                curveTo(3.0f, 2.444f, 3.445f, 2.0f, 3.993f, 2.0f)
                lineTo(16.0f, 2.0f)
                close()
                moveTo(13.529f, 14.446f)
                lineToRelative(2.21f, 2.21f)
                lineToRelative(1.415f, -1.413f)
                lineToRelative(-2.21f, -2.21f)
                arcToRelative(4.002f, 4.002f, 0.0f, false, false, -6.276f, -4.861f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.861f, 6.274f)
                close()
                moveTo(12.911f, 12.414f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.828f, -2.828f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.828f, 2.828f)
                close()
            }
        }
        .build()
        return _fileSearchFill!!
    }

private var _fileSearchFill: ImageVector? = null
