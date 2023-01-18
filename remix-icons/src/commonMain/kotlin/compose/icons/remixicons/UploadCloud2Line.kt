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

public val RemixIcons.UploadCloud2Line: ImageVector
    get() {
        if (_uploadCloud2Line != null) {
            return _uploadCloud2Line!!
        }
        _uploadCloud2Line = Builder(name = "UploadCloud2Line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.586f)
                lineToRelative(4.243f, 4.242f)
                lineToRelative(-1.415f, 1.415f)
                lineTo(13.0f, 16.415f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.587f)
                lineToRelative(-1.828f, 1.83f)
                lineToRelative(-1.415f, -1.415f)
                lineTo(12.0f, 12.586f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(7.001f, 7.001f, 0.0f, false, true, 6.954f, 6.194f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -0.953f, 10.784f)
                verticalLineToRelative(-2.014f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -1.112f, -6.91f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, -9.777f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.292f, 6.88f)
                lineToRelative(0.18f, 0.03f)
                verticalLineToRelative(2.014f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -0.954f, -10.784f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _uploadCloud2Line!!
    }

private var _uploadCloud2Line: ImageVector? = null
