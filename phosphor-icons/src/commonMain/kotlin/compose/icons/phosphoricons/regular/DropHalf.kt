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

public val RegularGroup.DropHalf: ImageVector
    get() {
        if (_dropHalf != null) {
            return _dropHalf!!
        }
        _dropHalf = Builder(name = "DropHalf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.0f, 47.8f)
                arcTo(259.4f, 259.4f, 0.0f, false, false, 132.6f, 9.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -9.2f, 0.0f)
                arcTo(259.4f, 259.4f, 0.0f, false, false, 82.0f, 47.8f)
                curveTo(54.5f, 79.3f, 40.0f, 112.6f, 40.0f, 144.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f)
                curveTo(216.0f, 112.6f, 201.5f, 79.3f, 174.0f, 47.8f)
                close()
                moveTo(200.0f, 144.0f)
                arcToRelative(70.1f, 70.1f, 0.0f, false, true, -0.5f, 8.0f)
                lineTo(136.0f, 152.0f)
                lineTo(136.0f, 136.0f)
                horizontalLineToRelative(63.6f)
                arcTo(70.3f, 70.3f, 0.0f, false, true, 200.0f, 144.0f)
                close()
                moveTo(183.4f, 88.0f)
                lineTo(136.0f, 88.0f)
                lineTo(136.0f, 72.0f)
                horizontalLineToRelative(36.9f)
                arcTo(184.1f, 184.1f, 0.0f, false, true, 183.4f, 88.0f)
                close()
                moveTo(136.0f, 200.0f)
                horizontalLineToRelative(37.2f)
                arcTo(71.3f, 71.3f, 0.0f, false, true, 136.0f, 215.5f)
                close()
                moveTo(136.0f, 184.0f)
                lineTo(136.0f, 168.0f)
                horizontalLineToRelative(59.9f)
                arcToRelative(70.8f, 70.8f, 0.0f, false, true, -8.1f, 16.0f)
                close()
                moveTo(136.0f, 120.0f)
                lineTo(136.0f, 104.0f)
                horizontalLineToRelative(55.4f)
                arcToRelative(111.5f, 111.5f, 0.0f, false, true, 5.4f, 16.0f)
                close()
                moveTo(159.9f, 56.0f)
                lineTo(136.0f, 56.0f)
                lineTo(136.0f, 32.6f)
                arcTo(266.2f, 266.2f, 0.0f, false, true, 159.9f, 56.0f)
                close()
                moveTo(56.0f, 144.0f)
                curveToRelative(0.0f, -50.0f, 42.3f, -92.7f, 64.0f, -111.4f)
                lineTo(120.0f, 215.5f)
                arcTo(72.0f, 72.0f, 0.0f, false, true, 56.0f, 144.0f)
                close()
            }
        }
        .build()
        return _dropHalf!!
    }

private var _dropHalf: ImageVector? = null
