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

public val LightGroup.Tree: ImageVector
    get() {
        if (_tree != null) {
            return _tree!!
        }
        _tree = Builder(name = "Tree", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(197.3f, 64.4f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.0f, -1.0f)
                arcToRelative(74.1f, 74.1f, 0.0f, false, false, -136.6f, 0.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.0f, 1.0f)
                arcTo(70.5f, 70.5f, 0.0f, false, false, 18.0f, 127.8f)
                curveTo(17.9f, 165.5f, 48.5f, 197.0f, 86.2f, 198.0f)
                arcToRelative(69.7f, 69.7f, 0.0f, false, false, 35.8f, -8.8f)
                verticalLineTo(232.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(189.2f)
                arcToRelative(69.5f, 69.5f, 0.0f, false, false, 34.0f, 8.8f)
                horizontalLineToRelative(1.8f)
                curveToRelative(37.7f, -1.0f, 68.3f, -32.5f, 68.2f, -70.2f)
                arcTo(70.5f, 70.5f, 0.0f, false, false, 197.3f, 64.4f)
                close()
                moveTo(169.5f, 186.0f)
                arcToRelative(57.6f, 57.6f, 0.0f, false, true, -33.7f, -9.8f)
                lineToRelative(-1.8f, -1.0f)
                verticalLineTo(131.7f)
                lineToRelative(44.7f, -22.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.4f, -10.8f)
                lineTo(134.0f, 118.3f)
                verticalLineTo(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(54.3f)
                lineTo(82.7f, 122.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -5.4f, 10.8f)
                lineTo(122.0f, 155.7f)
                verticalLineToRelative(19.5f)
                lineToRelative(-1.8f, 1.0f)
                arcTo(57.6f, 57.6f, 0.0f, false, true, 86.5f, 186.0f)
                curveToRelative(-31.2f, -0.8f, -56.6f, -26.9f, -56.5f, -58.2f)
                arcTo(58.1f, 58.1f, 0.0f, false, true, 63.8f, 75.3f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, false, 7.0f, -7.3f)
                arcToRelative(62.1f, 62.1f, 0.0f, false, true, 114.4f, 0.0f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, false, 7.0f, 7.3f)
                arcTo(58.1f, 58.1f, 0.0f, false, true, 226.0f, 127.8f)
                curveTo(226.1f, 159.1f, 200.7f, 185.2f, 169.5f, 186.0f)
                close()
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null
