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

public val RegularGroup.FileAudio: ImageVector
    get() {
        if (_fileAudio != null) {
            return _fileAudio!!
        }
        _fileAudio = Builder(name = "FileAudio", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 88.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -2.4f, -5.7f)
                lineToRelative(-55.9f, -56.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 152.0f, 24.0f)
                horizontalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(40.0f)
                horizontalLineToRelative(88.0f)
                verticalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(48.0f)
                verticalLineTo(216.0f)
                horizontalLineTo(168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(88.0f)
                close()
                moveTo(160.0f, 51.3f)
                lineTo(188.7f, 80.0f)
                horizontalLineTo(160.0f)
                close()
                moveTo(99.4f, 144.8f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -8.5f, 1.1f)
                lineTo(69.1f, 164.0f)
                horizontalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineTo(69.1f)
                lineToRelative(21.8f, 18.1f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 96.0f, 232.0f)
                arcToRelative(6.8f, 6.8f, 0.0f, false, false, 3.4f, -0.8f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 104.0f, 224.0f)
                verticalLineTo(152.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 99.4f, 144.8f)
                close()
                moveTo(88.0f, 206.9f)
                lineToRelative(-10.9f, -9.0f)
                arcTo(7.8f, 7.8f, 0.0f, false, false, 72.0f, 196.0f)
                horizontalLineTo(56.0f)
                verticalLineTo(180.0f)
                horizontalLineTo(72.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 5.1f, -1.9f)
                lineToRelative(10.9f, -9.0f)
                close()
                moveTo(148.0f, 188.0f)
                arcToRelative(39.8f, 39.8f, 0.0f, false, true, -15.0f, 31.2f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -5.0f, 1.8f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -6.2f, -3.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 1.2f, -11.3f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, false, 0.0f, -37.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.0f, -12.5f)
                arcTo(39.8f, 39.8f, 0.0f, false, true, 148.0f, 188.0f)
                close()
            }
        }
        .build()
        return _fileAudio!!
    }

private var _fileAudio: ImageVector? = null
