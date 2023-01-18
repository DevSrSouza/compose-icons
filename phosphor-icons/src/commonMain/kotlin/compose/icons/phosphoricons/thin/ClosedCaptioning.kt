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

public val ThinGroup.ClosedCaptioning: ImageVector
    get() {
        if (_closedCaptioning != null) {
            return _closedCaptioning!!
        }
        _closedCaptioning = Builder(name = "ClosedCaptioning", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 44.0f)
                lineTo(40.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 56.0f)
                lineTo(28.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(216.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 44.0f)
                close()
                moveTo(220.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(40.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(36.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(216.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(72.0f, 128.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, 24.0f, 24.0f)
                arcToRelative(23.8f, 23.8f, 0.0f, false, false, 17.1f, -7.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.8f, 5.6f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -44.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.8f, 5.6f)
                arcTo(23.8f, 23.8f, 0.0f, false, false, 96.0f, 104.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 72.0f, 128.0f)
                close()
                moveTo(144.0f, 128.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, 24.0f, 24.0f)
                arcToRelative(23.8f, 23.8f, 0.0f, false, false, 17.1f, -7.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.8f, 5.6f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -44.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.8f, 5.6f)
                arcTo(23.8f, 23.8f, 0.0f, false, false, 168.0f, 104.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 144.0f, 128.0f)
                close()
            }
        }
        .build()
        return _closedCaptioning!!
    }

private var _closedCaptioning: ImageVector? = null
