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

public val ThinGroup.UserGear: ImageVector
    get() {
        if (_userGear != null) {
            return _userGear!!
        }
        _userGear = Builder(name = "UserGear", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(133.3f, 158.8f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, -50.6f, 0.0f)
                arcToRelative(116.3f, 116.3f, 0.0f, false, false, -63.6f, 38.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.2f, 5.2f)
                arcToRelative(107.9f, 107.9f, 0.0f, false, true, 165.4f, 0.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 3.1f, 1.4f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 2.6f, -0.9f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 0.5f, -5.7f)
                arcTo(116.3f, 116.3f, 0.0f, false, false, 133.3f, 158.8f)
                close()
                moveTo(52.0f, 100.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 56.0f, 56.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 52.0f, 100.0f)
                close()
                moveTo(246.2f, 146.5f)
                lineTo(239.0f, 142.3f)
                arcToRelative(20.3f, 20.3f, 0.0f, false, false, 0.0f, -12.6f)
                lineToRelative(7.2f, -4.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.5f, -5.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.5f, -1.5f)
                lineToRelative(-7.3f, 4.3f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -10.9f, -6.4f)
                lineTo(224.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(8.4f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -10.9f, 6.4f)
                lineToRelative(-7.3f, -4.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.5f, 1.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.5f, 5.5f)
                lineToRelative(7.2f, 4.2f)
                arcToRelative(20.3f, 20.3f, 0.0f, false, false, 0.0f, 12.6f)
                lineToRelative(-7.2f, 4.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, 7.5f)
                arcToRelative(5.3f, 5.3f, 0.0f, false, false, 2.0f, -0.5f)
                lineToRelative(7.3f, -4.3f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 10.9f, 6.4f)
                lineTo(216.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineToRelative(-8.4f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 10.9f, -6.4f)
                lineToRelative(7.3f, 4.3f)
                arcToRelative(5.3f, 5.3f, 0.0f, false, false, 2.0f, 0.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, -7.5f)
                close()
                moveTo(220.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 148.0f)
                close()
            }
        }
        .build()
        return _userGear!!
    }

private var _userGear: ImageVector? = null
