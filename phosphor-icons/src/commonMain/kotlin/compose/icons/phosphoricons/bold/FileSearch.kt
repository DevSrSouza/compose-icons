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

public val BoldGroup.FileSearch: ImageVector
    get() {
        if (_fileSearch != null) {
            return _fileSearch!!
        }
        _fileSearch = Builder(name = "FileSearch", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 92.0f)
                lineTo(220.0f, 88.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, -3.5f, -8.5f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(12.3f, 12.3f, 0.0f, false, false, 152.0f, 20.0f)
                lineTo(56.0f, 20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 36.0f, 40.0f)
                lineTo(36.0f, 216.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(200.0f, 236.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(220.0f, 92.0f)
                close()
                moveTo(183.0f, 80.0f)
                lineTo(160.0f, 80.0f)
                lineTo(160.0f, 57.0f)
                close()
                moveTo(60.0f, 212.0f)
                lineTo(60.0f, 44.0f)
                horizontalLineToRelative(76.0f)
                lineTo(136.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(48.0f)
                lineTo(196.0f, 212.0f)
                close()
                moveTo(156.5f, 163.5f)
                arcTo(35.6f, 35.6f, 0.0f, false, false, 160.0f, 148.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -61.5f, -25.5f)
                arcToRelative(36.2f, 36.2f, 0.0f, false, false, 0.0f, 51.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(36.2f, 36.2f, 0.0f, false, false, 41.0f, 7.0f)
                lineToRelative(11.8f, 11.8f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                close()
                moveTo(115.5f, 156.5f)
                horizontalLineToRelative(0.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 0.0f, -17.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 0.0f, 17.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 115.5f, 156.5f)
                close()
            }
        }
        .build()
        return _fileSearch!!
    }

private var _fileSearch: ImageVector? = null
