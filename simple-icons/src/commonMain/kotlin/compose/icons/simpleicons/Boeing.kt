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

public val SimpleIcons.Boeing: ImageVector
    get() {
        if (_boeing != null) {
            return _boeing!!
        }
        _boeing = Builder(name = "Boeing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.904f, 17.287f)
                arcToRelative(6.051f, 6.051f, 0.0f, false, true, -3.76f, -1.301f)
                curveToRelative(1.205f, -2.715f, 3.655f, -6.358f, 6.998f, -9.917f)
                arcToRelative(6.07f, 6.07f, 0.0f, false, true, 2.262f, 7.729f)
                curveToRelative(-1.06f, -0.49f, -2.05f, -1.106f, -2.888f, -1.88f)
                lineToRelative(1.831f, 3.438f)
                arcToRelative(6.058f, 6.058f, 0.0f, false, true, -4.443f, 1.931f)
                moveTo(0.829f, 11.212f)
                arcToRelative(6.075f, 6.075f, 0.0f, false, true, 6.076f, -6.077f)
                curveToRelative(0.9f, 0.0f, 1.753f, 0.196f, 2.523f, 0.546f)
                curveToRelative(-3.293f, 2.909f, -5.843f, 6.293f, -7.353f, 9.218f)
                arcToRelative(6.051f, 6.051f, 0.0f, false, true, -1.246f, -3.688f)
                moveToRelative(12.34f, 2.913f)
                arcToRelative(6.862f, 6.862f, 0.0f, false, false, 0.642f, -2.913f)
                curveToRelative(0.0f, -2.4f, -1.225f, -4.514f, -3.085f, -5.753f)
                arcToRelative(49.607f, 49.607f, 0.0f, false, true, 3.582f, -3.342f)
                arcTo(31.173f, 31.173f, 0.0f, false, false, 10.11f, 5.09f)
                arcToRelative(6.907f, 6.907f, 0.0f, false, false, -8.437f, 10.627f)
                curveTo(0.349f, 18.58f, 0.119f, 20.878f, 1.285f, 21.654f)
                curveToRelative(1.249f, 0.832f, 3.963f, -0.677f, 5.59f, -3.135f)
                curveToRelative(0.0f, 0.0f, -2.518f, 2.274f, -3.901f, 1.752f)
                curveToRelative(-0.852f, -0.322f, -0.855f, -1.625f, -0.152f, -3.493f)
                arcToRelative(6.871f, 6.871f, 0.0f, false, false, 4.083f, 1.338f)
                curveToRelative(1.894f, 0.0f, 3.606f, -0.76f, 4.853f, -1.992f)
                lineToRelative(0.245f, 0.462f)
                curveToRelative(3.01f, -0.245f, 11.996f, -0.483f, 11.996f, -0.483f)
                curveToRelative(0.0f, -0.431f, -5.95f, -0.04f, -10.833f, -1.98f)
            }
        }
        .build()
        return _boeing!!
    }

private var _boeing: ImageVector? = null
