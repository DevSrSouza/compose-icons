package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Tree: ImageVector
    get() {
        if (_tree != null) {
            return _tree!!
        }
        _tree = Builder(name = "Tree", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 187.9f)
                arcToRelative(91.6f, 91.6f, 0.0f, false, false, 8.0f, 4.6f)
                verticalLineTo(232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(192.5f)
                arcToRelative(91.6f, 91.6f, 0.0f, false, false, 8.0f, -4.6f)
                close()
                moveTo(198.1f, 62.6f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, -140.2f, 0.0f)
                arcTo(72.3f, 72.3f, 0.0f, false, false, 16.0f, 127.8f)
                curveTo(15.9f, 166.6f, 47.4f, 199.0f, 86.1f, 200.0f)
                arcToRelative(71.9f, 71.9f, 0.0f, false, false, 33.9f, -7.5f)
                verticalLineTo(156.9f)
                lineTo(76.4f, 135.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 7.2f, -14.4f)
                lineTo(120.0f, 139.1f)
                verticalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(27.1f)
                lineToRelative(36.4f, -18.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.2f, 14.4f)
                lineTo(136.0f, 132.9f)
                verticalLineToRelative(59.6f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, 32.0f, 7.5f)
                horizontalLineToRelative(1.9f)
                curveToRelative(38.7f, -1.0f, 70.2f, -33.4f, 70.1f, -72.2f)
                arcTo(72.3f, 72.3f, 0.0f, false, false, 198.1f, 62.6f)
                close()
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null
