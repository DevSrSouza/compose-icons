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

public val LightGroup.DropHalf: ImageVector
    get() {
        if (_dropHalf != null) {
            return _dropHalf!!
        }
        _dropHalf = Builder(name = "DropHalf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.5f, 49.1f)
                arcToRelative(247.8f, 247.8f, 0.0f, false, false, -41.1f, -38.0f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, -6.8f, 0.0f)
                arcToRelative(247.8f, 247.8f, 0.0f, false, false, -41.1f, 38.0f)
                curveTo(56.3f, 80.3f, 42.0f, 113.1f, 42.0f, 144.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, false, 172.0f, 0.0f)
                curveTo(214.0f, 113.1f, 199.7f, 80.3f, 172.5f, 49.1f)
                close()
                moveTo(202.0f, 144.0f)
                arcToRelative(66.3f, 66.3f, 0.0f, false, true, -0.7f, 10.0f)
                lineTo(134.0f, 154.0f)
                lineTo(134.0f, 134.0f)
                horizontalLineToRelative(67.4f)
                arcTo(82.6f, 82.6f, 0.0f, false, true, 202.0f, 144.0f)
                close()
                moveTo(186.8f, 90.0f)
                lineTo(134.0f, 90.0f)
                lineTo(134.0f, 70.0f)
                horizontalLineToRelative(39.9f)
                arcTo(175.6f, 175.6f, 0.0f, false, true, 186.8f, 90.0f)
                close()
                moveTo(134.0f, 198.0f)
                horizontalLineToRelative(44.5f)
                arcTo(73.1f, 73.1f, 0.0f, false, true, 134.0f, 217.7f)
                close()
                moveTo(134.0f, 186.0f)
                lineTo(134.0f, 166.0f)
                horizontalLineToRelative(64.7f)
                arcToRelative(75.9f, 75.9f, 0.0f, false, true, -9.8f, 20.0f)
                close()
                moveTo(134.0f, 122.0f)
                lineTo(134.0f, 102.0f)
                horizontalLineToRelative(58.7f)
                arcToRelative(114.6f, 114.6f, 0.0f, false, true, 6.7f, 20.0f)
                close()
                moveTo(164.3f, 58.0f)
                lineTo(134.0f, 58.0f)
                lineTo(134.0f, 28.3f)
                arcTo(261.0f, 261.0f, 0.0f, false, true, 164.3f, 58.0f)
                close()
                moveTo(54.0f, 144.0f)
                curveToRelative(0.0f, -53.4f, 47.3f, -98.6f, 68.0f, -115.7f)
                lineTo(122.0f, 217.7f)
                arcTo(74.0f, 74.0f, 0.0f, false, true, 54.0f, 144.0f)
                close()
            }
        }
        .build()
        return _dropHalf!!
    }

private var _dropHalf: ImageVector? = null
