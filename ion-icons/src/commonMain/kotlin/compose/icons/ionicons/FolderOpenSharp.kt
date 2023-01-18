package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.FolderOpenSharp: ImageVector
    get() {
        if (_folderOpenSharp != null) {
            return _folderOpenSharp!!
        }
        _folderOpenSharp = Builder(name = "FolderOpenSharp", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.08f, 189.4f)
                lineTo(44.66f, 423.27f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 72.52f, 448.0f)
                horizontalLineToRelative(367.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 27.86f, -24.73f)
                lineTo(495.92f, 189.4f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 484.0f, 176.0f)
                horizontalLineTo(28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 16.08f, 189.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 124.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -28.0f, -28.0f)
                horizontalLineTo(244.84f)
                lineToRelative(-48.0f, -32.0f)
                horizontalLineTo(76.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 48.0f, 92.0f)
                verticalLineToRelative(52.0f)
                horizontalLineTo(464.0f)
                close()
            }
        }
        .build()
        return _folderOpenSharp!!
    }

private var _folderOpenSharp: ImageVector? = null
