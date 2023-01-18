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

public val ThinGroup.FastForward: ImageVector
    get() {
        if (_fastForward != null) {
            return _fastForward!!
        }
        _fastForward = Builder(name = "FastForward", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.7f, 117.9f)
                lineTo(154.5f, 60.6f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 136.0f, 70.7f)
                verticalLineToRelative(52.1f)
                arcToRelative(11.3f, 11.3f, 0.0f, false, false, -4.3f, -4.9f)
                lineTo(42.5f, 60.6f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 24.0f, 70.7f)
                lineTo(24.0f, 185.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.2f, 10.6f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 5.8f, 1.5f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 6.5f, -2.0f)
                lineToRelative(89.2f, -57.3f)
                arcToRelative(11.3f, 11.3f, 0.0f, false, false, 4.3f, -4.9f)
                verticalLineToRelative(52.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.2f, 10.6f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 5.8f, 1.5f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 6.5f, -2.0f)
                lineToRelative(89.2f, -57.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -20.2f)
                close()
                moveTo(127.4f, 131.4f)
                lineTo(38.2f, 188.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.1f, 0.2f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -2.1f, -3.6f)
                lineTo(32.0f, 70.7f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 2.1f, -3.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.9f, -0.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.2f, 0.7f)
                lineToRelative(89.2f, 57.3f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 0.0f, 6.8f)
                close()
                moveTo(239.4f, 131.4f)
                lineTo(150.2f, 188.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.1f, 0.2f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -2.1f, -3.6f)
                lineTo(144.0f, 70.7f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 2.1f, -3.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.9f, -0.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.2f, 0.7f)
                lineToRelative(89.2f, 57.3f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 0.0f, 6.8f)
                close()
            }
        }
        .build()
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
