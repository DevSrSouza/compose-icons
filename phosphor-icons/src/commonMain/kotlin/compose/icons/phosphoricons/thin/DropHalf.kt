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

public val ThinGroup.DropHalf: ImageVector
    get() {
        if (_dropHalf != null) {
            return _dropHalf!!
        }
        _dropHalf = Builder(name = "DropHalf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(171.0f, 50.4f)
                arcToRelative(255.4f, 255.4f, 0.0f, false, false, -40.7f, -37.7f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, -4.6f, 0.0f)
                arcTo(255.4f, 255.4f, 0.0f, false, false, 85.0f, 50.4f)
                curveTo(58.2f, 81.2f, 44.0f, 113.6f, 44.0f, 144.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, 168.0f, 0.0f)
                curveTo(212.0f, 113.6f, 197.8f, 81.2f, 171.0f, 50.4f)
                close()
                moveTo(204.0f, 144.0f)
                arcToRelative(67.8f, 67.8f, 0.0f, false, true, -1.0f, 12.0f)
                lineTo(132.0f, 156.0f)
                lineTo(132.0f, 132.0f)
                horizontalLineToRelative(71.2f)
                arcTo(94.2f, 94.2f, 0.0f, false, true, 204.0f, 144.0f)
                close()
                moveTo(190.1f, 92.0f)
                lineTo(132.0f, 92.0f)
                lineTo(132.0f, 68.0f)
                horizontalLineToRelative(43.0f)
                arcTo(175.4f, 175.4f, 0.0f, false, true, 190.1f, 92.0f)
                close()
                moveTo(132.0f, 164.0f)
                horizontalLineToRelative(69.3f)
                arcToRelative(76.9f, 76.9f, 0.0f, false, true, -11.4f, 24.0f)
                lineTo(132.0f, 188.0f)
                close()
                moveTo(132.0f, 124.0f)
                lineTo(132.0f, 100.0f)
                horizontalLineToRelative(62.0f)
                arcToRelative(120.6f, 120.6f, 0.0f, false, true, 7.9f, 24.0f)
                close()
                moveTo(165.1f, 55.8f)
                quadToRelative(1.8f, 2.0f, 3.6f, 4.2f)
                lineTo(132.0f, 60.0f)
                lineTo(132.0f, 24.1f)
                arcTo(253.5f, 253.5f, 0.0f, false, true, 165.1f, 55.8f)
                close()
                moveTo(52.0f, 144.0f)
                curveToRelative(0.0f, -35.9f, 21.2f, -67.8f, 38.9f, -88.2f)
                arcTo(253.5f, 253.5f, 0.0f, false, true, 124.0f, 24.1f)
                lineTo(124.0f, 219.9f)
                arcTo(76.1f, 76.1f, 0.0f, false, true, 52.0f, 144.0f)
                close()
                moveTo(132.0f, 219.9f)
                lineTo(132.0f, 196.0f)
                horizontalLineToRelative(51.4f)
                arcTo(76.5f, 76.5f, 0.0f, false, true, 132.0f, 219.9f)
                close()
            }
        }
        .build()
        return _dropHalf!!
    }

private var _dropHalf: ImageVector? = null
