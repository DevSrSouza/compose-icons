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

public val SimpleIcons.Newyorktimes: ImageVector
    get() {
        if (_newyorktimes != null) {
            return _newyorktimes!!
        }
        _newyorktimes = Builder(name = "Newyorktimes", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.272f, 14.815f)
                horizontalLineToRelative(-0.098f)
                curveToRelative(-0.747f, 2.049f, -2.335f, 3.681f, -4.363f, 4.483f)
                verticalLineToRelative(-4.483f)
                lineToRelative(2.444f, -2.182f)
                lineToRelative(-2.444f, -2.182f)
                verticalLineTo(7.397f)
                curveToRelative(2.138f, 0.006f, 3.885f, -1.703f, 3.927f, -3.84f)
                curveToRelative(0.0f, -2.629f, -2.509f, -3.556f, -3.927f, -3.556f)
                curveToRelative(-0.367f, -0.007f, -0.734f, 0.033f, -1.091f, 0.12f)
                verticalLineToRelative(0.131f)
                horizontalLineToRelative(0.556f)
                curveToRelative(0.801f, -0.141f, 1.565f, 0.394f, 1.706f, 1.195f)
                curveTo(17.99f, 1.491f, 17.996f, 1.537f, 18.0f, 1.583f)
                curveToRelative(-0.033f, 0.789f, -0.7f, 1.401f, -1.488f, 1.367f)
                curveToRelative(-0.02f, -0.001f, -0.041f, -0.002f, -0.061f, -0.004f)
                curveToRelative(-2.444f, 0.0f, -5.323f, -1.985f, -8.454f, -1.985f)
                curveTo(5.547f, 0.83f, 3.448f, 2.692f, 3.284f, 5.139f)
                curveTo(3.208f, 6.671f, 4.258f, 8.031f, 5.76f, 8.346f)
                verticalLineToRelative(-0.12f)
                curveTo(5.301f, 7.931f, 5.041f, 7.407f, 5.084f, 6.862f)
                curveToRelative(0.074f, -1.015f, 0.957f, -1.779f, 1.973f, -1.705f)
                curveTo(7.068f, 5.159f, 7.08f, 5.16f, 7.091f, 5.161f)
                curveToRelative(2.629f, 0.0f, 6.872f, 2.182f, 9.501f, 2.182f)
                horizontalLineToRelative(0.098f)
                verticalLineToRelative(3.142f)
                lineToRelative(-2.444f, 2.182f)
                lineToRelative(2.444f, 2.182f)
                verticalLineToRelative(4.549f)
                curveToRelative(-0.978f, 0.322f, -2.003f, 0.481f, -3.033f, 0.469f)
                curveToRelative(-1.673f, 0.084f, -3.318f, -0.456f, -4.614f, -1.516f)
                lineToRelative(4.429f, -1.985f)
                verticalLineTo(7.451f)
                lineToRelative(-6.196f, 2.727f)
                curveToRelative(0.592f, -1.75f, 1.895f, -3.168f, 3.589f, -3.905f)
                verticalLineTo(6.175f)
                curveToRelative(-4.516f, 1.004f, -8.138f, 4.243f, -8.138f, 8.705f)
                curveToRelative(0.0f, 5.193f, 4.025f, 9.12f, 9.818f, 9.12f)
                curveToRelative(6.011f, 0.0f, 8.727f, -4.363f, 8.727f, -8.814f)
                verticalLineTo(14.815f)
                close()
                moveTo(8.858f, 18.186f)
                curveToRelative(-1.363f, -1.362f, -2.091f, -3.235f, -2.007f, -5.16f)
                curveToRelative(-0.016f, -0.88f, 0.109f, -1.756f, 0.371f, -2.596f)
                lineToRelative(2.051f, -0.938f)
                verticalLineToRelative(8.476f)
                lineTo(8.858f, 18.186f)
                close()
            }
        }
        .build()
        return _newyorktimes!!
    }

private var _newyorktimes: ImageVector? = null
