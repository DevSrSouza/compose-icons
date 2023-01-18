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

public val RemixIcons.FileCodeLine: ImageVector
    get() {
        if (_fileCodeLine != null) {
            return _fileCodeLine!!
        }
        _fileCodeLine = Builder(name = "FileCodeLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(4.0f)
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
                moveTo(17.657f, 12.0f)
                lineToRelative(-3.536f, 3.536f)
                lineToRelative(-1.414f, -1.415f)
                lineTo(14.828f, 12.0f)
                lineToRelative(-2.12f, -2.121f)
                lineToRelative(1.413f, -1.415f)
                lineTo(17.657f, 12.0f)
                close()
                moveTo(6.343f, 12.0f)
                lineTo(9.88f, 8.464f)
                lineToRelative(1.414f, 1.415f)
                lineTo(9.172f, 12.0f)
                lineToRelative(2.12f, 2.121f)
                lineToRelative(-1.413f, 1.415f)
                lineTo(6.343f, 12.0f)
                close()
            }
        }
        .build()
        return _fileCodeLine!!
    }

private var _fileCodeLine: ImageVector? = null