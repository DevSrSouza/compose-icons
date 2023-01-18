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

public val ThinGroup.FileSearch: ImageVector
    get() {
        if (_fileSearch != null) {
            return _fileSearch!!
        }
        _fileSearch = Builder(name = "FileSearch", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.8f, 85.1f)
                lineToRelative(-56.0f, -55.9f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.6f, -0.4f)
                lineTo(154.0f, 28.8f)
                lineToRelative(-0.5f, -0.3f)
                lineTo(56.0f, 28.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 40.0f)
                lineTo(44.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(200.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(212.0f, 88.1f)
                horizontalLineToRelative(0.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 210.8f, 85.1f)
                close()
                moveTo(156.0f, 41.7f)
                lineTo(198.3f, 84.0f)
                lineTo(156.0f, 84.0f)
                close()
                moveTo(204.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(56.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(52.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(92.0f)
                lineTo(148.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(52.0f)
                close()
                moveTo(146.6f, 125.4f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 124.0f, 180.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 19.6f, -6.7f)
                lineTo(157.0f, 186.6f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 2.8f, 1.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.8f, -1.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, -5.6f)
                lineToRelative(-13.3f, -13.4f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 156.0f, 148.0f)
                arcTo(31.5f, 31.5f, 0.0f, false, false, 146.6f, 125.4f)
                close()
                moveTo(141.0f, 165.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, true, true, 7.0f, -17.0f)
                arcTo(24.2f, 24.2f, 0.0f, false, true, 141.0f, 165.0f)
                close()
            }
        }
        .build()
        return _fileSearch!!
    }

private var _fileSearch: ImageVector? = null
