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

public val ThinGroup.Eject: ImageVector
    get() {
        if (_eject != null) {
            return _eject!!
        }
        _eject = Builder(name = "Eject", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(50.3f, 140.0f)
                lineTo(205.7f, 140.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 11.0f, -7.2f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, -2.2f, -12.9f)
                lineTo(136.8f, 35.7f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -17.6f, 0.0f)
                lineTo(41.5f, 119.9f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, -2.2f, 12.9f)
                arcTo(11.8f, 11.8f, 0.0f, false, false, 50.3f, 140.0f)
                close()
                moveTo(47.3f, 125.3f)
                lineTo(125.1f, 41.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 5.8f, 0.0f)
                lineToRelative(77.8f, 84.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 0.7f, 4.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -3.7f, 2.4f)
                lineTo(50.3f, 132.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -3.7f, -2.4f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 47.3f, 125.3f)
                close()
                moveTo(208.0f, 164.0f)
                lineTo(48.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(208.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(220.0f, 176.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 164.0f)
                close()
                moveTo(212.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(48.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(208.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _eject!!
    }

private var _eject: ImageVector? = null
