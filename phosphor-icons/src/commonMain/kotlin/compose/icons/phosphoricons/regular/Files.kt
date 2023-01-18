package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Files: ImageVector
    get() {
        if (_files != null) {
            return _files!!
        }
        _files = Builder(name = "Files", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.7f, 66.3f)
                lineToRelative(-40.0f, -40.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 168.0f, 24.0f)
                lineTo(88.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 72.0f, 40.0f)
                lineTo(72.0f, 56.0f)
                lineTo(56.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 72.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(168.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(184.0f, 200.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 72.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 213.7f, 66.3f)
                close()
                moveTo(168.0f, 216.0f)
                lineTo(56.0f, 216.0f)
                lineTo(56.0f, 72.0f)
                horizontalLineToRelative(76.7f)
                lineTo(168.0f, 107.3f)
                lineTo(168.0f, 216.0f)
                close()
                moveTo(200.0f, 184.0f)
                lineTo(184.0f, 184.0f)
                lineTo(184.0f, 104.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -2.3f, -5.7f)
                lineToRelative(-40.0f, -40.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 136.0f, 56.0f)
                lineTo(88.0f, 56.0f)
                lineTo(88.0f, 40.0f)
                horizontalLineToRelative(76.7f)
                lineTo(200.0f, 75.3f)
                close()
                moveTo(144.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(88.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 144.0f, 152.0f)
                close()
                moveTo(144.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(88.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 144.0f, 184.0f)
                close()
            }
        }
        .build()
        return _files!!
    }

private var _files: ImageVector? = null
