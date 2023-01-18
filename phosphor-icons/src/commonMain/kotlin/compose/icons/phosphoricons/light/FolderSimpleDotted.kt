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

public val LightGroup.FolderSimpleDotted: ImageVector
    get() {
        if (_folderSimpleDotted != null) {
            return _folderSimpleDotted!!
        }
        _folderSimpleDotted = Builder(name = "FolderSimpleDotted", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.4f, 84.8f)
                lineTo(94.5f, 62.4f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, -1.2f, -0.4f)
                lineTo(40.0f, 62.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(38.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(26.0f, 64.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 40.0f, 50.0f)
                lineTo(93.3f, 50.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, 8.4f, 2.8f)
                lineToRelative(29.9f, 22.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -7.2f, 9.6f)
                close()
                moveTo(88.0f, 202.0f)
                lineTo(39.4f, 202.0f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, -1.4f, -1.4f)
                lineTo(38.0f, 192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(8.6f)
                arcTo(13.4f, 13.4f, 0.0f, false, false, 39.4f, 214.0f)
                lineTo(88.0f, 214.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(160.0f, 202.0f)
                lineTo(128.0f, 202.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(224.0f, 146.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(48.9f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, true, -1.1f, 1.1f)
                lineTo(200.0f, 202.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(16.9f)
                arcTo(13.1f, 13.1f, 0.0f, false, false, 230.0f, 200.9f)
                lineTo(230.0f, 152.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 146.0f)
                close()
                moveTo(216.0f, 74.0f)
                lineTo(168.0f, 74.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(230.0f, 88.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 74.0f)
                close()
                moveTo(32.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(38.0f, 120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 32.0f, 158.0f)
                close()
            }
        }
        .build()
        return _folderSimpleDotted!!
    }

private var _folderSimpleDotted: ImageVector? = null
