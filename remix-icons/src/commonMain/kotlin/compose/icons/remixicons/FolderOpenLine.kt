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

public val RemixIcons.FolderOpenLine: ImageVector
    get() {
        if (_folderOpenLine != null) {
            return _folderOpenLine!!
        }
        _folderOpenLine = Builder(name = "FolderOpenLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(7.414f)
                lineToRelative(2.0f, 2.0f)
                lineTo(20.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(19.0f, 7.0f)
                horizontalLineToRelative(-7.414f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(11.998f)
                lineTo(5.5f, 11.0f)
                horizontalLineToRelative(17.0f)
                lineToRelative(-2.31f, 9.243f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.97f, 0.757f)
                lineTo(3.0f, 21.0f)
                close()
                moveTo(19.938f, 13.0f)
                lineTo(7.062f, 13.0f)
                lineToRelative(-1.5f, 6.0f)
                horizontalLineToRelative(12.876f)
                lineToRelative(1.5f, -6.0f)
                close()
            }
        }
        .build()
        return _folderOpenLine!!
    }

private var _folderOpenLine: ImageVector? = null
