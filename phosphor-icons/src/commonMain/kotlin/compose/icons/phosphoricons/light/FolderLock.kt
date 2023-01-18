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

public val LightGroup.FolderLock: ImageVector
    get() {
        if (_folderLock != null) {
            return _folderLock!!
        }
        _folderLock = Builder(name = "FolderLock", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 158.0f)
                lineTo(214.0f, 158.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -52.0f, 0.0f)
                verticalLineToRelative(6.0f)
                lineTo(152.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(230.0f, 164.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 158.0f)
                close()
                moveTo(174.0f, 152.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                verticalLineToRelative(6.0f)
                lineTo(174.0f, 158.0f)
                close()
                moveTo(218.0f, 202.0f)
                lineTo(158.0f, 202.0f)
                lineTo(158.0f, 170.0f)
                horizontalLineToRelative(60.0f)
                close()
                moveTo(216.0f, 74.0f)
                lineTo(130.5f, 74.0f)
                lineTo(102.6f, 46.1f)
                arcTo(14.3f, 14.3f, 0.0f, false, false, 92.7f, 42.0f)
                lineTo(40.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 56.0f)
                lineTo(26.0f, 200.6f)
                arcTo(13.4f, 13.4f, 0.0f, false, false, 39.4f, 214.0f)
                horizontalLineToRelative(73.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, -12.0f)
                lineTo(39.4f, 202.0f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, -1.4f, -1.4f)
                lineTo(38.0f, 86.0f)
                lineTo(216.0f, 86.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(230.0f, 88.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 74.0f)
                close()
                moveTo(40.0f, 54.0f)
                lineTo(92.7f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.4f, 0.6f)
                lineTo(113.5f, 74.0f)
                lineTo(38.0f, 74.0f)
                lineTo(38.0f, 56.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 40.0f, 54.0f)
                close()
            }
        }
        .build()
        return _folderLock!!
    }

private var _folderLock: ImageVector? = null
