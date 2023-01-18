package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.FolderSimpleStar: ImageVector
    get() {
        if (_folderSimpleStar != null) {
            return _folderSimpleStar!!
        }
        _folderSimpleStar = Builder(name = "FolderSimpleStar", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(40.0f, 64.0f)
                lineTo(40.0f, 200.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 48.0f)
                lineTo(93.3f, 48.0f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, true, 9.6f, 3.2f)
                lineTo(130.7f, 72.0f)
                lineTo(216.0f, 72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(216.0f, 88.0f)
                lineTo(130.7f, 88.0f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, true, -9.6f, -3.2f)
                lineTo(93.3f, 64.0f)
                close()
                moveTo(243.6f, 159.2f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -7.0f, -5.6f)
                lineToRelative(-29.8f, -2.3f)
                lineToRelative(-11.5f, -26.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.6f, 0.0f)
                lineToRelative(-11.5f, 26.5f)
                lineToRelative(-29.8f, 2.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -4.5f, 14.2f)
                lineToRelative(22.5f, 18.6f)
                lineToRelative(-6.8f, 27.7f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 3.0f, 8.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.8f, 0.5f)
                lineTo(188.0f, 207.8f)
                lineToRelative(25.6f, 15.1f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, false, 4.1f, 1.1f)
                arcToRelative(7.4f, 7.4f, 0.0f, false, false, 4.7f, -1.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 3.0f, -8.3f)
                lineToRelative(-6.8f, -27.7f)
                lineToRelative(22.5f, -18.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 243.6f, 159.2f)
                close()
            }
        }
        .build()
        return _folderSimpleStar!!
    }

private var _folderSimpleStar: ImageVector? = null
