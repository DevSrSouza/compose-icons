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

public val BoldGroup.PenNibStraight: ImageVector
    get() {
        if (_penNibStraight != null) {
            return _penNibStraight!!
        }
        _penNibStraight = Builder(name = "PenNibStraight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.3f, 126.5f)
                lineTo(196.0f, 69.2f)
                lineTo(196.0f, 32.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(80.0f, 12.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 60.0f, 32.0f)
                lineTo(60.0f, 69.2f)
                lineTo(31.7f, 126.5f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 1.2f, 12.6f)
                lineToRelative(85.6f, 112.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 19.0f, 0.0f)
                lineToRelative(85.6f, -112.2f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.3f, 126.5f)
                close()
                moveTo(172.0f, 36.0f)
                lineTo(172.0f, 60.0f)
                lineTo(84.0f, 60.0f)
                lineTo(84.0f, 36.0f)
                close()
                moveTo(128.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 144.0f)
                close()
                moveTo(140.0f, 208.5f)
                lineTo(140.0f, 165.9f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -24.0f, 0.0f)
                verticalLineToRelative(42.6f)
                lineTo(56.5f, 130.4f)
                lineTo(79.5f, 84.0f)
                horizontalLineToRelative(97.0f)
                lineToRelative(23.0f, 46.4f)
                close()
            }
        }
        .build()
        return _penNibStraight!!
    }

private var _penNibStraight: ImageVector? = null
