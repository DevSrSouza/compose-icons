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

public val BoldGroup.TreeEvergreen: ImageVector
    get() {
        if (_treeEvergreen != null) {
            return _treeEvergreen!!
        }
        _treeEvergreen = Builder(name = "TreeEvergreen", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.5f, 184.6f)
                lineToRelative(-41.0f, -52.6f)
                horizontalLineTo(208.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 10.8f, -6.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.3f, -12.6f)
                lineToRelative(-80.0f, -104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -19.0f, 0.0f)
                lineToRelative(-80.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.3f, 12.6f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 48.0f, 132.0f)
                horizontalLineTo(63.5f)
                lineToRelative(-41.0f, 52.6f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -1.3f, 12.7f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 32.0f, 204.0f)
                horizontalLineToRelative(84.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(204.0f)
                horizontalLineToRelative(84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.8f, -6.7f)
                arcTo(12.2f, 12.2f, 0.0f, false, false, 233.5f, 184.6f)
                close()
                moveTo(56.5f, 180.0f)
                lineToRelative(41.0f, -52.6f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 1.3f, -12.7f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 88.0f, 108.0f)
                horizontalLineTo(72.4f)
                lineTo(128.0f, 35.7f)
                lineTo(183.6f, 108.0f)
                horizontalLineTo(168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.8f, 6.7f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 1.3f, 12.7f)
                lineToRelative(41.0f, 52.6f)
                close()
            }
        }
        .build()
        return _treeEvergreen!!
    }

private var _treeEvergreen: ImageVector? = null
