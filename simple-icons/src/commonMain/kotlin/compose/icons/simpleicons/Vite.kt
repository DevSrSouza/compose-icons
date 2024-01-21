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

public val SimpleIcons.Vite: ImageVector
    get() {
        if (_vite != null) {
            return _vite!!
        }
        _vite = Builder(name = "Vite", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.286f, 10.578f)
                lineToRelative(0.512f, -8.657f)
                arcToRelative(0.306f, 0.306f, 0.0f, false, true, 0.247f, -0.282f)
                lineTo(17.377f, 0.006f)
                arcToRelative(0.306f, 0.306f, 0.0f, false, true, 0.353f, 0.385f)
                lineToRelative(-1.558f, 5.403f)
                arcToRelative(0.306f, 0.306f, 0.0f, false, false, 0.352f, 0.385f)
                lineToRelative(2.388f, -0.46f)
                arcToRelative(0.306f, 0.306f, 0.0f, false, true, 0.332f, 0.438f)
                lineToRelative(-6.79f, 13.55f)
                lineToRelative(-0.123f, 0.19f)
                arcToRelative(0.294f, 0.294f, 0.0f, false, true, -0.252f, 0.14f)
                curveToRelative(-0.177f, 0.0f, -0.35f, -0.152f, -0.305f, -0.369f)
                lineToRelative(1.095f, -5.301f)
                arcToRelative(0.306f, 0.306f, 0.0f, false, false, -0.388f, -0.355f)
                lineToRelative(-1.433f, 0.435f)
                arcToRelative(0.306f, 0.306f, 0.0f, false, true, -0.389f, -0.354f)
                lineToRelative(0.69f, -3.375f)
                arcToRelative(0.306f, 0.306f, 0.0f, false, false, -0.37f, -0.36f)
                lineToRelative(-2.32f, 0.536f)
                arcToRelative(0.306f, 0.306f, 0.0f, false, true, -0.374f, -0.316f)
                close()
                moveTo(23.262f, 2.652f)
                lineTo(17.284f, 3.74f)
                lineToRelative(-0.544f, 1.887f)
                lineToRelative(2.077f, -0.4f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 0.84f, 0.369f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 0.034f, 0.783f)
                lineTo(12.9f, 19.93f)
                lineToRelative(-0.013f, 0.025f)
                lineToRelative(-0.015f, 0.023f)
                lineToRelative(-0.122f, 0.19f)
                arcToRelative(0.801f, 0.801f, 0.0f, false, true, -0.672f, 0.37f)
                arcToRelative(0.826f, 0.826f, 0.0f, false, true, -0.634f, -0.302f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -0.16f, -0.67f)
                lineToRelative(1.029f, -4.981f)
                lineToRelative(-1.12f, 0.34f)
                arcToRelative(0.81f, 0.81f, 0.0f, false, true, -0.86f, -0.262f)
                arcToRelative(0.802f, 0.802f, 0.0f, false, true, -0.165f, -0.67f)
                lineToRelative(0.63f, -3.08f)
                lineToRelative(-2.027f, 0.468f)
                arcToRelative(0.808f, 0.808f, 0.0f, false, true, -0.768f, -0.233f)
                arcToRelative(0.81f, 0.81f, 0.0f, false, true, -0.217f, -0.6f)
                lineToRelative(0.389f, -6.57f)
                lineToRelative(-7.44f, -1.33f)
                arcToRelative(0.612f, 0.612f, 0.0f, false, false, -0.64f, 0.906f)
                lineTo(11.58f, 23.691f)
                arcToRelative(0.612f, 0.612f, 0.0f, false, false, 1.066f, -0.004f)
                lineToRelative(11.26f, -20.135f)
                arcToRelative(0.612f, 0.612f, 0.0f, false, false, -0.644f, -0.9f)
                close()
            }
        }
        .build()
        return _vite!!
    }

private var _vite: ImageVector? = null
