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

public val LightGroup.FolderSimpleMinus: ImageVector
    get() {
        if (_folderSimpleMinus != null) {
            return _folderSimpleMinus!!
        }
        _folderSimpleMinus = Builder(name = "FolderSimpleMinus", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(158.0f, 144.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(104.0f, 150.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(48.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 158.0f, 144.0f)
                close()
                moveTo(230.0f, 88.0f)
                lineTo(230.0f, 200.9f)
                arcTo(13.1f, 13.1f, 0.0f, false, true, 216.9f, 214.0f)
                lineTo(40.0f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(26.0f, 64.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 40.0f, 50.0f)
                lineTo(93.3f, 50.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, 8.4f, 2.8f)
                lineToRelative(27.8f, 20.8f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, 1.2f, 0.4f)
                lineTo(216.0f, 74.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 230.0f, 88.0f)
                close()
                moveTo(218.0f, 88.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(130.7f, 86.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, -8.4f, -2.8f)
                lineTo(94.5f, 62.4f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, -1.2f, -0.4f)
                lineTo(40.0f, 62.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(38.0f, 200.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(216.9f, 202.0f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, 1.1f, -1.1f)
                close()
            }
        }
        .build()
        return _folderSimpleMinus!!
    }

private var _folderSimpleMinus: ImageVector? = null
