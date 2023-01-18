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

public val RegularGroup.DropHalfBottom: ImageVector
    get() {
        if (_dropHalfBottom != null) {
            return _dropHalfBottom!!
        }
        _dropHalfBottom = Builder(name = "DropHalfBottom", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(128.0f, 26.0f)
                curveToRelative(14.2f, 11.1f, 56.9f, 47.8f, 68.8f, 94.0f)
                lineTo(59.2f, 120.0f)
                curveTo(71.1f, 73.8f, 113.8f, 37.1f, 128.0f, 26.0f)
                close()
                moveTo(200.0f, 144.0f)
                arcToRelative(70.1f, 70.1f, 0.0f, false, true, -0.5f, 8.0f)
                lineTo(56.5f, 152.0f)
                arcToRelative(71.3f, 71.3f, 0.0f, false, true, -0.1f, -16.0f)
                lineTo(199.6f, 136.0f)
                arcTo(70.3f, 70.3f, 0.0f, false, true, 200.0f, 144.0f)
                close()
                moveTo(68.2f, 184.0f)
                arcToRelative(70.8f, 70.8f, 0.0f, false, true, -8.1f, -16.0f)
                lineTo(195.9f, 168.0f)
                arcToRelative(70.8f, 70.8f, 0.0f, false, true, -8.1f, 16.0f)
                close()
                moveTo(82.8f, 200.0f)
                horizontalLineToRelative(90.4f)
                arcToRelative(71.8f, 71.8f, 0.0f, false, true, -90.4f, 0.0f)
                close()
            }
        }
        .build()
        return _dropHalfBottom!!
    }

private var _dropHalfBottom: ImageVector? = null
