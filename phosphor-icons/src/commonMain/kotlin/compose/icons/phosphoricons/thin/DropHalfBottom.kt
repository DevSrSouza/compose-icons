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

public val ThinGroup.DropHalfBottom: ImageVector
    get() {
        if (_dropHalfBottom != null) {
            return _dropHalfBottom!!
        }
        _dropHalfBottom = Builder(name = "DropHalfBottom", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(90.9f, 55.8f)
                arcTo(247.5f, 247.5f, 0.0f, false, true, 128.0f, 21.0f)
                arcToRelative(247.5f, 247.5f, 0.0f, false, true, 37.1f, 34.8f)
                curveToRelative(14.4f, 16.5f, 31.0f, 40.6f, 36.8f, 68.2f)
                horizontalLineTo(54.1f)
                curveTo(59.9f, 96.4f, 76.5f, 72.3f, 90.9f, 55.8f)
                close()
                moveTo(204.0f, 144.0f)
                arcToRelative(67.8f, 67.8f, 0.0f, false, true, -1.0f, 12.0f)
                horizontalLineTo(53.0f)
                arcToRelative(67.8f, 67.8f, 0.0f, false, true, -1.0f, -12.0f)
                arcToRelative(94.2f, 94.2f, 0.0f, false, true, 0.8f, -12.0f)
                horizontalLineTo(203.2f)
                arcTo(94.2f, 94.2f, 0.0f, false, true, 204.0f, 144.0f)
                close()
                moveTo(54.7f, 164.0f)
                horizontalLineTo(201.3f)
                arcToRelative(76.9f, 76.9f, 0.0f, false, true, -11.4f, 24.0f)
                horizontalLineTo(66.1f)
                arcTo(76.9f, 76.9f, 0.0f, false, true, 54.7f, 164.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(75.8f, 75.8f, 0.0f, false, true, -55.4f, -24.0f)
                horizontalLineTo(183.4f)
                arcTo(75.8f, 75.8f, 0.0f, false, true, 128.0f, 220.0f)
                close()
            }
        }
        .build()
        return _dropHalfBottom!!
    }

private var _dropHalfBottom: ImageVector? = null
