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

public val RegularGroup.FileHtml: ImageVector
    get() {
        if (_fileHtml != null) {
            return _fileHtml!!
        }
        _fileHtml = Builder(name = "FileHtml", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(96.0f, 184.0f)
                lineTo(88.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 176.0f)
                close()
                moveTo(64.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(12.0f)
                lineTo(44.0f, 188.0f)
                lineTo(44.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(44.0f, 204.0f)
                lineTo(56.0f, 204.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(72.0f, 176.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 64.0f, 168.0f)
                close()
                moveTo(236.0f, 208.0f)
                lineTo(220.0f, 208.0f)
                lineTo(220.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(186.4f, 168.4f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -8.9f, 3.0f)
                lineTo(164.0f, 190.2f)
                lineToRelative(-13.5f, -18.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 136.0f, 176.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(152.0f, 201.0f)
                lineToRelative(5.5f, 7.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 13.0f, 0.0f)
                lineTo(176.0f, 201.0f)
                verticalLineToRelative(15.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(192.0f, 176.0f)
                arcTo(7.8f, 7.8f, 0.0f, false, false, 186.4f, 168.4f)
                close()
                moveTo(208.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(200.0f, 96.0f)
                lineTo(152.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(144.0f, 40.0f)
                lineTo(56.0f, 40.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 24.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 5.7f, 2.3f)
                lineToRelative(55.9f, 56.0f)
                arcTo(7.8f, 7.8f, 0.0f, false, true, 216.0f, 88.0f)
                verticalLineToRelative(48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 144.0f)
                close()
                moveTo(160.0f, 80.0f)
                horizontalLineToRelative(28.7f)
                lineTo(160.0f, 51.3f)
                close()
            }
        }
        .build()
        return _fileHtml!!
    }

private var _fileHtml: ImageVector? = null
