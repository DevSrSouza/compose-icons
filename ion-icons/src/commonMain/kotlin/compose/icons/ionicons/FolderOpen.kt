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

public val IonIcons.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) {
            return _folderOpen!!
        }
        _folderOpen = Builder(name = "FolderOpen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(408.0f, 96.0f)
                horizontalLineTo(252.11f)
                arcToRelative(23.89f, 23.89f, 0.0f, false, true, -13.31f, -4.0f)
                lineTo(211.0f, 73.41f)
                arcTo(55.77f, 55.77f, 0.0f, false, false, 179.89f, 64.0f)
                horizontalLineTo(104.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, -56.0f, 56.0f)
                verticalLineToRelative(24.0f)
                horizontalLineTo(464.0f)
                curveTo(464.0f, 113.12f, 438.88f, 96.0f, 408.0f, 96.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(423.75f, 448.0f)
                horizontalLineTo(88.25f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -55.93f, -55.15f)
                lineTo(16.18f, 228.11f)
                lineToRelative(0.0f, -0.28f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 64.0f, 176.0f)
                horizontalLineToRelative(384.1f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 47.8f, 51.83f)
                lineToRelative(0.0f, 0.28f)
                lineTo(479.68f, 392.85f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 423.75f, 448.0f)
                close()
                moveTo(479.9f, 226.55f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
