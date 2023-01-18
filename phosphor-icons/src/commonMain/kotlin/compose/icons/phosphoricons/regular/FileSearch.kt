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

public val RegularGroup.FileSearch: ImageVector
    get() {
        if (_fileSearch != null) {
            return _fileSearch!!
        }
        _fileSearch = Builder(name = "FileSearch", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 88.0f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, -2.4f, -5.7f)
                lineToRelative(-55.9f, -56.0f)
                lineToRelative(-0.6f, -0.5f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-0.5f, -0.3f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.5f, -0.4f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.6f, -0.3f)
                lineTo(155.0f, 24.8f)
                lineToRelative(-0.7f, -0.3f)
                lineTo(56.0f, 24.5f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(200.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 88.0f)
                close()
                moveTo(160.0f, 51.3f)
                lineTo(188.7f, 80.0f)
                lineTo(160.0f, 80.0f)
                close()
                moveTo(200.0f, 216.0f)
                lineTo(56.0f, 216.0f)
                lineTo(56.0f, 40.0f)
                horizontalLineToRelative(88.0f)
                lineTo(144.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(48.0f)
                lineTo(200.0f, 216.0f)
                close()
                moveTo(154.5f, 167.2f)
                arcTo(35.8f, 35.8f, 0.0f, false, false, 160.0f, 148.0f)
                arcToRelative(36.3f, 36.3f, 0.0f, false, false, -10.5f, -25.5f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -6.3f, 56.0f)
                lineToRelative(10.9f, 11.0f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 5.7f, 2.3f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 5.7f, -2.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -11.4f)
                close()
                moveTo(109.9f, 162.1f)
                horizontalLineToRelative(0.0f)
                arcTo(19.8f, 19.8f, 0.0f, true, true, 124.0f, 168.0f)
                arcTo(19.7f, 19.7f, 0.0f, false, true, 109.9f, 162.1f)
                close()
            }
        }
        .build()
        return _fileSearch!!
    }

private var _fileSearch: ImageVector? = null
