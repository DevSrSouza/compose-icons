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

public val BoldGroup.FolderStar: ImageVector
    get() {
        if (_folderStar != null) {
            return _folderStar!!
        }
        _folderStar = Builder(name = "FolderStar", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.6f, 196.0f)
                horizontalLineTo(44.0f)
                verticalLineTo(92.0f)
                horizontalLineTo(212.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(88.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                horizontalLineTo(133.4f)
                lineToRelative(-26.0f, -29.3f)
                horizontalLineToRelative(0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -15.0f, -6.7f)
                horizontalLineTo(40.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 20.0f, 52.0f)
                verticalLineTo(200.6f)
                arcTo(19.4f, 19.4f, 0.0f, false, false, 39.4f, 220.0f)
                horizontalLineToRelative(73.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 0.0f, -24.0f)
                close()
                moveTo(44.0f, 56.0f)
                horizontalLineTo(90.6f)
                lineToRelative(10.7f, 12.0f)
                horizontalLineTo(44.0f)
                close()
                moveTo(247.4f, 158.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -10.5f, -8.4f)
                lineToRelative(-27.4f, -2.1f)
                lineTo(199.0f, 123.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -22.0f, 0.0f)
                lineToRelative(-10.5f, 24.3f)
                lineToRelative(-27.4f, 2.1f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -6.7f, 21.3f)
                lineToRelative(20.5f, 17.0f)
                lineToRelative(-6.2f, 25.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.7f, 13.2f)
                lineTo(188.0f, 212.5f)
                lineToRelative(23.6f, 13.8f)
                arcToRelative(11.3f, 11.3f, 0.0f, false, false, 6.1f, 1.7f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 7.1f, -2.4f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 4.5f, -12.5f)
                lineToRelative(-6.2f, -25.2f)
                lineToRelative(20.5f, -17.0f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 247.4f, 158.0f)
                close()
                moveTo(202.0f, 174.2f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, -4.0f, 12.1f)
                lineToRelative(1.2f, 4.9f)
                lineToRelative(-5.1f, -3.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -12.2f, 0.0f)
                lineToRelative(-5.1f, 3.0f)
                lineToRelative(1.2f, -4.9f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, -4.0f, -12.1f)
                lineToRelative(-3.4f, -2.9f)
                lineToRelative(5.0f, -0.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.1f, -7.2f)
                lineToRelative(2.3f, -5.4f)
                lineToRelative(2.3f, 5.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.1f, 7.2f)
                lineToRelative(5.0f, 0.4f)
                close()
            }
        }
        .build()
        return _folderStar!!
    }

private var _folderStar: ImageVector? = null
