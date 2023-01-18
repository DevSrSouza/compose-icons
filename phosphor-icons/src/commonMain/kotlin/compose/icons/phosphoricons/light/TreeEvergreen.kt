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

public val LightGroup.TreeEvergreen: ImageVector
    get() {
        if (_treeEvergreen != null) {
            return _treeEvergreen!!
        }
        _treeEvergreen = Builder(name = "TreeEvergreen", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.7f, 188.3f)
                lineTo(180.3f, 126.0f)
                horizontalLineTo(208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.4f, -3.3f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, -0.6f, -6.4f)
                lineToRelative(-80.0f, -104.0f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, -9.6f, 0.0f)
                lineToRelative(-80.0f, 104.0f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, -0.6f, 6.4f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 48.0f, 126.0f)
                horizontalLineTo(75.7f)
                lineTo(27.3f, 188.3f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 32.0f, 198.0f)
                horizontalLineToRelative(90.0f)
                verticalLineToRelative(42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(198.0f)
                horizontalLineToRelative(90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.7f, -9.7f)
                close()
                moveTo(44.3f, 186.0f)
                lineToRelative(48.4f, -62.3f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 88.0f, 114.0f)
                horizontalLineTo(60.2f)
                lineTo(128.0f, 25.8f)
                lineTo(195.8f, 114.0f)
                horizontalLineTo(168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.7f, 9.7f)
                lineTo(211.7f, 186.0f)
                close()
            }
        }
        .build()
        return _treeEvergreen!!
    }

private var _treeEvergreen: ImageVector? = null
