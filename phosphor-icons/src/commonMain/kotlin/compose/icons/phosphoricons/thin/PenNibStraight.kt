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

public val ThinGroup.PenNibStraight: ImageVector
    get() {
        if (_penNibStraight != null) {
            return _penNibStraight!!
        }
        _penNibStraight = Builder(name = "PenNibStraight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.0f, 125.7f)
                lineTo(188.0f, 71.1f)
                lineTo(188.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(80.0f, 20.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 68.0f, 32.0f)
                lineTo(68.0f, 71.1f)
                lineTo(41.0f, 125.7f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 1.1f, 12.4f)
                lineToRelative(82.7f, 112.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.4f, 0.0f)
                lineToRelative(82.7f, -112.3f)
                arcTo(11.8f, 11.8f, 0.0f, false, false, 215.0f, 125.7f)
                close()
                moveTo(80.0f, 28.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(180.0f, 68.0f)
                lineTo(76.0f, 68.0f)
                lineTo(76.0f, 32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 80.0f, 28.0f)
                close()
                moveTo(128.0f, 148.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 148.0f)
                close()
                moveTo(207.4f, 133.3f)
                lineTo(132.0f, 235.8f)
                lineTo(132.0f, 155.7f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -8.0f, 0.0f)
                verticalLineToRelative(80.1f)
                lineTo(48.6f, 133.3f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -0.4f, -4.1f)
                lineTo(74.5f, 76.0f)
                horizontalLineToRelative(107.0f)
                lineToRelative(26.3f, 53.2f)
                arcTo(3.8f, 3.8f, 0.0f, false, true, 207.4f, 133.3f)
                close()
            }
        }
        .build()
        return _penNibStraight!!
    }

private var _penNibStraight: ImageVector? = null
