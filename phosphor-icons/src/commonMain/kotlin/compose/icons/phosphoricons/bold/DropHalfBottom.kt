package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.DropHalfBottom: ImageVector
    get() {
        if (_dropHalfBottom != null) {
            return _dropHalfBottom!!
        }
        _dropHalfBottom = Builder(name = "DropHalfBottom", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.9f, 6.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -13.8f, 0.0f)
                arcTo(264.8f, 264.8f, 0.0f, false, false, 78.9f, 45.1f)
                curveTo(50.9f, 77.4f, 36.0f, 111.6f, 36.0f, 144.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, 184.0f, 0.0f)
                curveTo(220.0f, 66.6f, 138.4f, 8.6f, 134.9f, 6.2f)
                close()
                moveTo(191.6f, 168.0f)
                horizontalLineTo(64.4f)
                arcToRelative(65.7f, 65.7f, 0.0f, false, true, -3.9f, -16.0f)
                horizontalLineToRelative(135.0f)
                arcTo(65.7f, 65.7f, 0.0f, false, true, 191.6f, 168.0f)
                close()
                moveTo(96.7f, 61.3f)
                arcTo(247.8f, 247.8f, 0.0f, false, true, 128.0f, 31.1f)
                arcToRelative(247.8f, 247.8f, 0.0f, false, true, 31.3f, 30.2f)
                curveToRelative(14.0f, 16.2f, 30.3f, 39.9f, 35.2f, 66.7f)
                horizontalLineTo(61.5f)
                curveTo(66.4f, 101.2f, 82.7f, 77.5f, 96.7f, 61.3f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(67.9f, 67.9f, 0.0f, false, true, -48.1f, -20.0f)
                horizontalLineToRelative(96.2f)
                arcTo(67.9f, 67.9f, 0.0f, false, true, 128.0f, 212.0f)
                close()
            }
        }
        .build()
        return _dropHalfBottom!!
    }

private var _dropHalfBottom: ImageVector? = null
