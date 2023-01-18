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

public val ThinGroup.Tree: ImageVector
    get() {
        if (_tree != null) {
            return _tree!!
        }
        _tree = Builder(name = "Tree", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.4f, 66.2f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.0f, -2.1f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, -132.8f, 0.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.0f, 2.1f)
                arcTo(68.3f, 68.3f, 0.0f, false, false, 20.0f, 127.8f)
                curveToRelative(-0.1f, 36.7f, 29.6f, 67.3f, 66.2f, 68.2f)
                arcTo(67.7f, 67.7f, 0.0f, false, false, 124.0f, 185.7f)
                verticalLineTo(232.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(185.7f)
                arcTo(68.2f, 68.2f, 0.0f, false, false, 168.0f, 196.0f)
                horizontalLineToRelative(1.8f)
                curveToRelative(36.6f, -0.9f, 66.3f, -31.5f, 66.2f, -68.2f)
                arcTo(68.3f, 68.3f, 0.0f, false, false, 196.4f, 66.2f)
                close()
                moveTo(169.6f, 188.0f)
                arcToRelative(59.9f, 59.9f, 0.0f, false, true, -34.9f, -10.1f)
                horizontalLineToRelative(0.0f)
                arcToRelative(11.1f, 11.1f, 0.0f, false, false, -2.7f, -1.3f)
                verticalLineTo(130.5f)
                lineToRelative(45.8f, -22.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -3.6f, -7.2f)
                lineTo(132.0f, 121.5f)
                verticalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(57.5f)
                lineTo(81.8f, 124.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -3.6f, 7.2f)
                lineTo(124.0f, 154.5f)
                verticalLineToRelative(22.1f)
                arcToRelative(11.1f, 11.1f, 0.0f, false, false, -2.7f, 1.3f)
                arcTo(59.9f, 59.9f, 0.0f, false, true, 86.4f, 188.0f)
                curveToRelative(-32.3f, -0.8f, -58.5f, -27.8f, -58.4f, -60.2f)
                arcTo(60.3f, 60.3f, 0.0f, false, true, 62.9f, 73.5f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 69.0f, 67.2f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 118.0f, 0.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 6.1f, 6.3f)
                arcTo(60.3f, 60.3f, 0.0f, false, true, 228.0f, 127.8f)
                curveTo(228.1f, 160.2f, 201.9f, 187.2f, 169.6f, 188.0f)
                close()
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null
