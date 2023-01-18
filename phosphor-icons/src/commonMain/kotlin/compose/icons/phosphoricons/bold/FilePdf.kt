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

public val BoldGroup.FilePdf: ImageVector
    get() {
        if (_filePdf != null) {
            return _filePdf!!
        }
        _filePdf = Builder(name = "FilePdf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 176.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(208.0f, 208.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(184.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                close()
                moveTo(32.0f, 124.0f)
                lineTo(32.0f, 44.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 52.0f, 24.0f)
                lineTo(156.0f, 24.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, true, 8.5f, 3.5f)
                lineToRelative(56.0f, 56.0f)
                arcTo(12.3f, 12.3f, 0.0f, false, true, 224.0f, 92.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(200.0f, 112.0f)
                lineTo(148.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(136.0f, 48.0f)
                lineTo(56.0f, 48.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(160.0f, 57.0f)
                lineTo(160.0f, 88.0f)
                horizontalLineToRelative(31.0f)
                close()
                moveTo(168.0f, 192.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, 40.0f)
                lineTo(112.0f, 232.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(100.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(16.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 168.0f, 192.0f)
                close()
                moveTo(144.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(4.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 144.0f, 192.0f)
                close()
                moveTo(84.0f, 184.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, -32.0f, 32.0f)
                lineTo(48.0f, 216.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(24.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                lineTo(52.0f, 152.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 84.0f, 184.0f)
                close()
                moveTo(60.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(48.0f, 176.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 60.0f, 184.0f)
                close()
            }
        }
        .build()
        return _filePdf!!
    }

private var _filePdf: ImageVector? = null
