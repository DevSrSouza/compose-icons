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

public val LightGroup.FolderSimpleUser: ImageVector
    get() {
        if (_folderSimpleUser != null) {
            return _folderSimpleUser!!
        }
        _folderSimpleUser = Builder(name = "FolderSimpleUser", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(207.1f, 195.1f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -38.2f, 0.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -17.7f, 23.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.3f, 7.3f)
                lineToRelative(1.5f, 0.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.8f, -4.5f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 50.4f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 11.6f, -3.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 207.1f, 195.1f)
                close()
                moveTo(170.0f, 172.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, 18.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 170.0f, 172.0f)
                close()
                moveTo(230.0f, 88.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(218.0f, 88.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(130.7f, 86.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, -8.4f, -2.8f)
                lineTo(94.5f, 62.4f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, -1.2f, -0.4f)
                lineTo(40.0f, 62.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(38.0f, 200.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
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
            }
        }
        .build()
        return _folderSimpleUser!!
    }

private var _folderSimpleUser: ImageVector? = null
