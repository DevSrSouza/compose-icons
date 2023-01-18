package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.FileAudio: ImageVector
    get() {
        if (_fileAudio != null) {
            return _fileAudio!!
        }
        _fileAudio = Builder(name = "FileAudio", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.8f, -4.3f)
                lineToRelative(-56.0f, -55.9f)
                arcTo(5.6f, 5.6f, 0.0f, false, false, 152.0f, 26.0f)
                horizontalLineTo(56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 42.0f, 40.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(90.0f)
                verticalLineTo(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(50.0f)
                verticalLineTo(216.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineTo(88.0f)
                close()
                moveTo(158.0f, 46.5f)
                lineTo(193.5f, 82.0f)
                horizontalLineTo(158.0f)
                close()
                moveTo(98.5f, 146.6f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -6.3f, 0.8f)
                lineTo(69.8f, 166.0f)
                horizontalLineTo(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineTo(69.8f)
                lineToRelative(22.4f, 18.6f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 96.0f, 230.0f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, false, 2.5f, -0.6f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 102.0f, 224.0f)
                verticalLineTo(152.0f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 98.5f, 146.6f)
                close()
                moveTo(90.0f, 211.2f)
                lineTo(75.8f, 199.4f)
                arcTo(5.7f, 5.7f, 0.0f, false, false, 72.0f, 198.0f)
                horizontalLineTo(54.0f)
                verticalLineTo(178.0f)
                horizontalLineTo(72.0f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 3.8f, -1.4f)
                lineTo(90.0f, 164.8f)
                close()
                moveTo(146.0f, 188.0f)
                arcToRelative(38.1f, 38.1f, 0.0f, false, true, -14.2f, 29.7f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 128.0f, 219.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.8f, -10.7f)
                arcToRelative(25.9f, 25.9f, 0.0f, false, false, 0.0f, -40.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.9f, -8.4f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 8.5f, -1.0f)
                arcTo(38.1f, 38.1f, 0.0f, false, true, 146.0f, 188.0f)
                close()
            }
        }
        .build()
        return _fileAudio!!
    }

private var _fileAudio: ImageVector? = null
