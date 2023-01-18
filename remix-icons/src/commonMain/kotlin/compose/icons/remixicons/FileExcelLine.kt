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

public val RemixIcons.FileExcelLine: ImageVector
    get() {
        if (_fileExcelLine != null) {
            return _fileExcelLine!!
        }
        _fileExcelLine = Builder(name = "FileExcelLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.2f, 12.0f)
                lineToRelative(2.8f, 4.0f)
                horizontalLineToRelative(-2.4f)
                lineTo(12.0f, 13.714f)
                lineTo(10.4f, 16.0f)
                horizontalLineTo(8.0f)
                lineToRelative(2.8f, -4.0f)
                lineTo(8.0f, 8.0f)
                horizontalLineToRelative(2.4f)
                lineToRelative(1.6f, 2.286f)
                lineTo(13.6f, 8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(-2.8f, 4.0f)
                close()
                moveTo(3.0f, 2.992f)
                curveTo(3.0f, 2.444f, 3.447f, 2.0f, 3.999f, 2.0f)
                horizontalLineTo(16.0f)
                lineToRelative(5.0f, 5.0f)
                verticalLineToRelative(13.993f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.007f, 22.0f)
                horizontalLineTo(3.993f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 21.008f)
                verticalLineTo(2.992f)
                close()
            }
        }
        .build()
        return _fileExcelLine!!
    }

private var _fileExcelLine: ImageVector? = null
