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

public val RemixIcons.FolderForbidLine: ImageVector
    get() {
        if (_folderForbidLine != null) {
            return _folderForbidLine!!
        }
        _folderForbidLine = Builder(name = "FolderForbidLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 11.255f)
                arcToRelative(6.972f, 6.972f, 0.0f, false, false, -2.0f, -0.965f)
                lineTo(20.0f, 7.0f)
                horizontalLineToRelative(-8.414f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(7.29f)
                curveToRelative(0.215f, 0.722f, 0.543f, 1.396f, 0.965f, 2.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(7.414f)
                lineToRelative(2.0f, 2.0f)
                lineTo(21.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(5.255f)
                close()
                moveTo(18.0f, 22.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, -10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, 10.0f)
                close()
                moveTo(16.707f, 19.708f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.001f, -4.001f)
                lineToRelative(-4.001f, 4.0f)
                close()
                moveTo(15.292f, 18.293f)
                lineToRelative(4.001f, -4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -4.001f, 4.001f)
                close()
            }
        }
        .build()
        return _folderForbidLine!!
    }

private var _folderForbidLine: ImageVector? = null
