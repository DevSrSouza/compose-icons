package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.UserGear: ImageVector
    get() {
        if (_userGear != null) {
            return _userGear!!
        }
        _userGear = Builder(name = "UserGear", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(139.1f, 158.2f)
                arcToRelative(66.0f, 66.0f, 0.0f, true, false, -62.2f, 0.0f)
                arcToRelative(117.9f, 117.9f, 0.0f, false, false, -59.3f, 37.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.2f, 7.8f)
                arcToRelative(105.9f, 105.9f, 0.0f, false, true, 162.4f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.6f, 2.1f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, 3.9f, -1.4f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 0.7f, -8.5f)
                arcTo(117.9f, 117.9f, 0.0f, false, false, 139.1f, 158.2f)
                close()
                moveTo(54.0f, 100.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, true, true, 54.0f, 54.0f)
                arcTo(54.0f, 54.0f, 0.0f, false, true, 54.0f, 100.0f)
                close()
                moveTo(247.2f, 144.8f)
                lineTo(241.3f, 141.4f)
                arcToRelative(21.2f, 21.2f, 0.0f, false, false, 0.0f, -10.8f)
                lineToRelative(5.9f, -3.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -10.4f)
                lineToRelative(-5.9f, 3.4f)
                arcToRelative(21.8f, 21.8f, 0.0f, false, false, -9.3f, -5.4f)
                lineTo(226.0f, 108.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(6.8f)
                arcToRelative(21.8f, 21.8f, 0.0f, false, false, -9.3f, 5.4f)
                lineToRelative(-5.9f, -3.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -6.0f, 10.4f)
                lineToRelative(5.9f, 3.4f)
                arcToRelative(21.2f, 21.2f, 0.0f, false, false, 0.0f, 10.8f)
                lineToRelative(-5.9f, 3.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.0f, 11.2f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, false, 3.0f, -0.8f)
                lineToRelative(5.9f, -3.4f)
                arcToRelative(21.8f, 21.8f, 0.0f, false, false, 9.3f, 5.4f)
                lineTo(214.0f, 164.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineToRelative(-6.8f)
                arcToRelative(21.8f, 21.8f, 0.0f, false, false, 9.3f, -5.4f)
                lineToRelative(5.9f, 3.4f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, false, 3.0f, 0.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.0f, -11.2f)
                close()
                moveTo(220.0f, 146.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 220.0f, 146.0f)
                close()
            }
        }
        .build()
        return _userGear!!
    }

private var _userGear: ImageVector? = null
