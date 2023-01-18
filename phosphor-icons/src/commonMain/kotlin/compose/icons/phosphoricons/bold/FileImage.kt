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

public val BoldGroup.FileImage: ImageVector
    get() {
        if (_fileImage != null) {
            return _fileImage!!
        }
        _fileImage = Builder(name = "FileImage", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(117.3f, 150.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -26.6f, 0.0f)
                lineTo(76.5f, 171.5f)
                lineToRelative(-3.0f, -4.8f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -27.0f, 0.0f)
                lineTo(13.9f, 217.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 24.0f, 236.0f)
                horizontalLineTo(152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.6f, -6.3f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -0.6f, -12.4f)
                close()
                moveTo(46.0f, 212.0f)
                lineToRelative(14.0f, -21.8f)
                lineToRelative(3.0f, 4.6f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.3f, 7.4f)
                horizontalLineToRelative(0.1f)
                arcTo(15.8f, 15.8f, 0.0f, false, false, 89.7f, 195.0f)
                lineTo(104.0f, 173.6f)
                lineTo(129.6f, 212.0f)
                close()
                moveTo(216.5f, 79.5f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(12.3f, 12.3f, 0.0f, false, false, 152.0f, 20.0f)
                horizontalLineTo(56.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 36.0f, 40.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(44.0f)
                horizontalLineToRelative(76.0f)
                verticalLineTo(92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(48.0f)
                verticalLineTo(212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(88.0f)
                arcTo(12.3f, 12.3f, 0.0f, false, false, 216.5f, 79.5f)
                close()
                moveTo(160.0f, 57.0f)
                lineToRelative(23.0f, 23.0f)
                horizontalLineTo(160.0f)
                close()
            }
        }
        .build()
        return _fileImage!!
    }

private var _fileImage: ImageVector? = null
