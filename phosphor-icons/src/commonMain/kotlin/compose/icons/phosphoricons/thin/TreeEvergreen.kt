package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.TreeEvergreen: ImageVector
    get() {
        if (_treeEvergreen != null) {
            return _treeEvergreen!!
        }
        _treeEvergreen = Builder(name = "TreeEvergreen", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.2f, 189.5f)
                lineToRelative(-51.0f, -65.5f)
                horizontalLineTo(208.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 3.6f, -2.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.4f, -4.2f)
                lineToRelative(-80.0f, -104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.4f, 0.0f)
                lineToRelative(-80.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.4f, 4.2f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 48.0f, 124.0f)
                horizontalLineTo(79.8f)
                lineToRelative(-51.0f, 65.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 32.0f, 196.0f)
                horizontalLineToRelative(92.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(196.0f)
                horizontalLineToRelative(92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.2f, -6.5f)
                close()
                moveTo(40.2f, 188.0f)
                lineToRelative(51.0f, -65.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 88.0f, 116.0f)
                horizontalLineTo(56.1f)
                lineTo(128.0f, 22.6f)
                lineTo(199.9f, 116.0f)
                horizontalLineTo(168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.2f, 6.5f)
                lineToRelative(51.0f, 65.5f)
                close()
            }
        }
        .build()
        return _treeEvergreen!!
    }

private var _treeEvergreen: ImageVector? = null
