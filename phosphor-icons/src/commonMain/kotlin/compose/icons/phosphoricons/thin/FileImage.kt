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

public val ThinGroup.FileImage: ImageVector
    get() {
        if (_fileImage != null) {
            return _fileImage!!
        }
        _fileImage = Builder(name = "FileImage", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(110.7f, 154.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.4f, 0.0f)
                lineTo(76.4f, 186.2f)
                lineToRelative(-9.7f, -15.1f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -13.4f, 0.0f)
                lineTo(20.6f, 221.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.1f, 4.1f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 24.0f, 228.0f)
                horizontalLineTo(152.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 3.5f, -2.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.2f, -4.1f)
                close()
                moveTo(31.3f, 220.0f)
                lineTo(60.0f, 175.4f)
                lineToRelative(9.7f, 15.1f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 6.7f, 3.7f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 6.7f, -3.6f)
                lineTo(104.0f, 159.2f)
                lineTo(144.5f, 220.0f)
                close()
                moveTo(212.0f, 88.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -1.2f, -2.9f)
                lineToRelative(-56.0f, -55.9f)
                arcTo(3.6f, 3.6f, 0.0f, false, false, 152.0f, 28.0f)
                horizontalLineTo(56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 40.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(92.0f)
                verticalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(52.0f)
                verticalLineTo(216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(88.1f)
                close()
                moveTo(156.0f, 41.7f)
                lineTo(198.3f, 84.0f)
                horizontalLineTo(156.0f)
                close()
            }
        }
        .build()
        return _fileImage!!
    }

private var _fileImage: ImageVector? = null
