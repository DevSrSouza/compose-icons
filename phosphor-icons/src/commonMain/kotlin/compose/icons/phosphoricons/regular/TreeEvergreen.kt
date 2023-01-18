package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.TreeEvergreen: ImageVector
    get() {
        if (_treeEvergreen != null) {
            return _treeEvergreen!!
        }
        _treeEvergreen = Builder(name = "TreeEvergreen", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.3f, 187.1f)
                lineTo(184.4f, 128.0f)
                horizontalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.3f, -12.9f)
                lineToRelative(-80.0f, -104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.6f, 0.0f)
                lineToRelative(-80.0f, 104.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 48.0f, 128.0f)
                horizontalLineTo(71.6f)
                lineTo(25.7f, 187.1f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 32.0f, 200.0f)
                horizontalLineToRelative(88.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(200.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.3f, -12.9f)
                close()
                moveTo(48.4f, 184.0f)
                lineToRelative(45.9f, -59.1f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 112.0f)
                horizontalLineTo(64.2f)
                lineTo(128.0f, 29.1f)
                lineTo(191.8f, 112.0f)
                horizontalLineTo(168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.3f, 12.9f)
                lineTo(207.6f, 184.0f)
                close()
            }
        }
        .build()
        return _treeEvergreen!!
    }

private var _treeEvergreen: ImageVector? = null
