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

public val SimpleIcons.Microstation: ImageVector
    get() {
        if (_microstation != null) {
            return _microstation!!
        }
        _microstation = Builder(name = "Microstation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 0.357f)
                curveToRelative(-0.938f, 0.217f, -3.086f, 0.22f, -3.631f, 1.15f)
                lineToRelative(-0.55f, 0.922f)
                curveToRelative(-1.376f, 2.348f, -4.833f, 11.069f, -8.183f, 11.181f)
                curveToRelative(-3.35f, 0.113f, 1.762f, -10.712f, 2.27f, -11.797f)
                curveToRelative(-2.08f, 0.489f, -4.078f, 0.193f, -4.826f, 2.326f)
                curveToRelative(-0.775f, 2.212f, -1.54f, 4.425f, -2.363f, 6.62f)
                curveToRelative(-1.71f, 4.532f, -3.795f, 8.89f, -6.634f, 12.767f)
                curveToRelative(0.064f, -0.086f, 0.127f, -0.171f, -0.083f, 0.117f)
                curveToRelative(2.111f, -0.422f, 4.03f, -0.352f, 5.295f, -2.253f)
                curveToRelative(1.17f, -1.759f, 1.92f, -3.73f, 2.712f, -5.68f)
                lineToRelative(0.377f, -0.927f)
                lineToRelative(0.303f, 0.286f)
                curveToRelative(3.017f, 2.844f, 5.334f, 0.0f, 7.697f, -2.219f)
                lineToRelative(0.349f, -0.327f)
                lineToRelative(1.322f, 4.977f)
                lineToRelative(2.932f, -3.144f)
                arcToRelative(33.47f, 33.47f, 0.0f, false, true, -0.713f, -1.342f)
                lineToRelative(-0.037f, -0.08f)
                curveTo(18.302f, 8.742f, 21.6f, 3.935f, 23.861f, 0.566f)
                close()
            }
        }
        .build()
        return _microstation!!
    }

private var _microstation: ImageVector? = null
