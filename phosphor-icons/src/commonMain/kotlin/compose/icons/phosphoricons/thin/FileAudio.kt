package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.FileAudio: ImageVector
    get() {
        if (_fileAudio != null) {
            return _fileAudio!!
        }
        _fileAudio = Builder(name = "FileAudio", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 88.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -1.2f, -2.9f)
                lineToRelative(-56.0f, -55.9f)
                arcTo(3.6f, 3.6f, 0.0f, false, false, 152.0f, 28.0f)
                horizontalLineTo(56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 40.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(92.0f)
                verticalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(52.0f)
                verticalLineTo(216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(88.1f)
                close()
                moveTo(156.0f, 41.7f)
                lineTo(198.3f, 84.0f)
                horizontalLineTo(156.0f)
                close()
                moveTo(97.7f, 148.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.3f, 0.5f)
                lineTo(70.6f, 168.0f)
                horizontalLineTo(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineTo(70.6f)
                lineToRelative(22.8f, 19.1f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 2.6f, 0.9f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, false, 1.7f, -0.4f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 100.0f, 224.0f)
                verticalLineTo(152.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 97.7f, 148.4f)
                close()
                moveTo(92.0f, 215.5f)
                lineTo(74.6f, 200.9f)
                arcTo(4.3f, 4.3f, 0.0f, false, false, 72.0f, 200.0f)
                horizontalLineTo(52.0f)
                verticalLineTo(176.0f)
                horizontalLineTo(72.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 2.6f, -0.9f)
                lineTo(92.0f, 160.5f)
                close()
                moveTo(144.0f, 188.0f)
                arcToRelative(35.8f, 35.8f, 0.0f, false, true, -13.5f, 28.1f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.5f, 0.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -3.1f, -1.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.6f, -5.6f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 0.0f, -43.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.0f, -6.2f)
                arcTo(35.8f, 35.8f, 0.0f, false, true, 144.0f, 188.0f)
                close()
            }
        }
        .build()
        return _fileAudio!!
    }

private var _fileAudio: ImageVector? = null
