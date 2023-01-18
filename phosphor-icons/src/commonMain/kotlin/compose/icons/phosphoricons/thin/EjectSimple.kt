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

public val ThinGroup.EjectSimple: ImageVector
    get() {
        if (_ejectSimple != null) {
            return _ejectSimple!!
        }
        _ejectSimple = Builder(name = "EjectSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(40.8f, 164.0f)
                lineTo(215.2f, 164.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 10.8f, -6.8f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -1.5f, -12.8f)
                lineTo(137.3f, 37.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -18.6f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineTo(31.5f, 144.4f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 30.0f, 157.2f)
                arcTo(11.8f, 11.8f, 0.0f, false, false, 40.8f, 164.0f)
                close()
                moveTo(37.7f, 149.5f)
                lineTo(124.9f, 42.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.2f, 0.0f)
                lineToRelative(87.2f, 107.3f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 0.5f, 4.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.6f, 2.3f)
                lineTo(40.8f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.6f, -2.3f)
                arcTo(3.8f, 3.8f, 0.0f, false, true, 37.7f, 149.5f)
                close()
                moveTo(228.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(32.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(224.0f, 204.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 228.0f, 208.0f)
                close()
            }
        }
        .build()
        return _ejectSimple!!
    }

private var _ejectSimple: ImageVector? = null
