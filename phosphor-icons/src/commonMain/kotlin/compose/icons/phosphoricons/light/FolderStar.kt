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

public val LightGroup.FolderStar: ImageVector
    get() {
        if (_folderStar != null) {
            return _folderStar!!
        }
        _folderStar = Builder(name = "FolderStar", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.7f, 159.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.2f, -4.2f)
                lineToRelative(-31.1f, -2.4f)
                lineToRelative(-11.9f, -27.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.0f, 0.0f)
                lineToRelative(-11.9f, 27.6f)
                lineToRelative(-31.1f, 2.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.2f, 4.2f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 1.9f, 6.4f)
                lineToRelative(23.5f, 19.4f)
                lineToRelative(-7.2f, 29.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 2.2f, 6.2f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 6.7f, 0.4f)
                lineTo(188.0f, 205.5f)
                lineToRelative(26.6f, 15.7f)
                arcToRelative(6.8f, 6.8f, 0.0f, false, false, 3.1f, 0.8f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 3.6f, -1.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 2.2f, -6.2f)
                lineToRelative(-7.2f, -29.0f)
                lineToRelative(23.5f, -19.4f)
                arcTo(5.8f, 5.8f, 0.0f, false, false, 241.7f, 159.8f)
                close()
                moveTo(205.8f, 178.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -2.0f, 6.1f)
                lineToRelative(4.6f, 18.7f)
                lineTo(191.0f, 193.4f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -6.0f, 0.0f)
                lineToRelative(-17.4f, 10.2f)
                lineToRelative(4.6f, -18.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -2.0f, -6.1f)
                lineToRelative(-14.9f, -12.3f)
                lineToRelative(19.8f, -1.6f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 5.1f, -3.6f)
                lineToRelative(7.8f, -18.2f)
                lineToRelative(7.8f, 18.2f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 5.1f, 3.6f)
                lineToRelative(19.8f, 1.6f)
                close()
                moveTo(120.6f, 202.0f)
                lineTo(39.4f, 202.0f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, -1.4f, -1.4f)
                lineTo(38.0f, 86.0f)
                lineTo(216.0f, 86.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(230.0f, 88.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(130.5f, 74.0f)
                lineTo(102.6f, 46.1f)
                arcTo(14.3f, 14.3f, 0.0f, false, false, 92.7f, 42.0f)
                lineTo(40.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 56.0f)
                lineTo(26.0f, 200.6f)
                arcTo(13.4f, 13.4f, 0.0f, false, false, 39.4f, 214.0f)
                horizontalLineToRelative(81.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, -12.0f)
                close()
                moveTo(38.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(92.7f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.4f, 0.6f)
                lineTo(113.5f, 74.0f)
                lineTo(38.0f, 74.0f)
                close()
            }
        }
        .build()
        return _folderStar!!
    }

private var _folderStar: ImageVector? = null
