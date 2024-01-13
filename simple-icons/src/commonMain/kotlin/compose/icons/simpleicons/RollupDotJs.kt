package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Rollupdotjs: ImageVector
    get() {
        if (_rollupdotjs != null) {
            return _rollupdotjs!!
        }
        _rollupdotjs = Builder(name = "Rollupdotjs", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.42f, 2.0E-4f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, false, -0.369f, 0.37f)
                verticalLineTo(19.885f)
                curveToRelative(0.577f, -1.488f, 1.557f, -3.6168f, 3.1378f, -6.5297f)
                curveTo(11.8885f, 2.876f, 12.6355f, 1.8191f, 15.6043f, 1.8191f)
                curveToRelative(1.56f, 0.0f, 3.1338f, 0.704f, 4.1518f, 1.9549f)
                arcTo(7.9616f, 7.9616f, 0.0f, false, false, 13.1014f, 2.0E-4f)
                close()
                moveTo(16.1393f, 2.544f)
                curveToRelative(-1.19f, 0.01f, -2.257f, 0.466f, -2.6979f, 1.498f)
                curveToRelative(-0.967f, 2.2558f, 1.624f, 4.7667f, 2.7569f, 4.5677f)
                curveToRelative(1.4419f, -0.255f, -0.255f, -3.5628f, -0.255f, -3.5628f)
                curveToRelative(2.2049f, 4.1558f, 1.6969f, 2.8838f, -2.2899f, 6.6996f)
                curveTo(9.6666f, 15.5623f, 5.596f, 23.6188f, 5.002f, 23.9568f)
                arcToRelative(0.477f, 0.477f, 0.0f, false, true, -0.08f, 0.043f)
                horizontalLineTo(20.558f)
                arcToRelative(0.373f, 0.373f, 0.0f, false, false, 0.33f, -0.538f)
                lineToRelative(-4.0878f, -8.0915f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, 0.144f, -0.488f)
                arcToRelative(7.9596f, 7.9596f, 0.0f, false, false, 4.0048f, -6.9126f)
                curveToRelative(0.0f, -1.4249f, -0.373f, -2.7608f, -1.03f, -3.9198f)
                curveToRelative(-0.9269f, -0.9519f, -2.4298f, -1.5159f, -3.7787f, -1.5059f)
                close()
            }
        }
        .build()
        return _rollupdotjs!!
    }

private var _rollupdotjs: ImageVector? = null
