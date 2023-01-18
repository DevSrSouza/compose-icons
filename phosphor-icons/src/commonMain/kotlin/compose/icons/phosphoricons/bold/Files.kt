package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Files: ImageVector
    get() {
        if (_files != null) {
            return _files!!
        }
        _files = Builder(name = "Files", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.5f, 59.5f)
                lineToRelative(-40.0f, -40.0f)
                arcTo(12.3f, 12.3f, 0.0f, false, false, 172.0f, 16.0f)
                lineTo(92.0f, 16.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 72.0f, 36.0f)
                lineTo(72.0f, 56.0f)
                lineTo(56.0f, 56.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 36.0f, 76.0f)
                lineTo(36.0f, 216.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(164.0f, 236.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(184.0f, 196.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(224.0f, 68.0f)
                arcTo(12.3f, 12.3f, 0.0f, false, false, 220.5f, 59.5f)
                close()
                moveTo(160.0f, 212.0f)
                lineTo(60.0f, 212.0f)
                lineTo(60.0f, 80.0f)
                horizontalLineToRelative(67.0f)
                lineToRelative(33.0f, 33.0f)
                close()
                moveTo(200.0f, 172.0f)
                lineTo(184.0f, 172.0f)
                lineTo(184.0f, 108.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, -3.5f, -8.5f)
                lineToRelative(-40.0f, -40.0f)
                arcTo(12.3f, 12.3f, 0.0f, false, false, 132.0f, 56.0f)
                lineTo(96.0f, 56.0f)
                lineTo(96.0f, 40.0f)
                horizontalLineToRelative(71.0f)
                lineToRelative(33.0f, 33.0f)
                close()
                moveTo(144.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(88.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 144.0f, 144.0f)
                close()
                moveTo(144.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(88.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 144.0f, 184.0f)
                close()
            }
        }
        .build()
        return _files!!
    }

private var _files: ImageVector? = null
