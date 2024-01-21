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

public val SimpleIcons.Recoil: ImageVector
    get() {
        if (_recoil != null) {
            return _recoil!!
        }
        _recoil = Builder(name = "Recoil", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.09f, 8.862f)
                arcToRelative(3.017f, 3.018f, 0.0f, false, false, -2.615f, -2.43f)
                lineToRelative(-0.245f, -0.03f)
                arcToRelative(1.662f, 1.662f, 0.0f, false, true, -1.453f, -1.645f)
                verticalLineToRelative(-0.856f)
                arcToRelative(2.028f, 2.028f, 0.0f, true, false, -1.602f, -0.02f)
                verticalLineToRelative(0.874f)
                arcToRelative(3.263f, 3.264f, 0.0f, false, false, 2.855f, 3.236f)
                lineToRelative(0.245f, 0.032f)
                curveToRelative(0.764f, 0.096f, 1.144f, 0.66f, 1.246f, 1.155f)
                curveToRelative(0.1f, 0.495f, -0.03f, 1.163f, -0.698f, 1.55f)
                arcToRelative(2.569f, 2.569f, 0.0f, false, true, -1.055f, 0.337f)
                lineToRelative(-3.68f, 0.346f)
                arcToRelative(4.212f, 4.212f, 0.0f, false, false, -1.71f, 0.546f)
                arcToRelative(3.02f, 3.02f, 0.0f, false, false, -1.468f, 3.257f)
                arcToRelative(3.017f, 3.018f, 0.0f, false, false, 2.615f, 2.43f)
                lineToRelative(0.245f, 0.032f)
                arcToRelative(1.662f, 1.662f, 0.0f, false, true, 1.453f, 1.644f)
                verticalLineToRelative(0.777f)
                arcToRelative(2.03f, 2.03f, 0.0f, true, false, 1.602f, 0.016f)
                verticalLineToRelative(-0.793f)
                arcToRelative(3.263f, 3.264f, 0.0f, false, false, -2.856f, -3.236f)
                lineToRelative(-0.244f, -0.032f)
                curveToRelative(-0.764f, -0.096f, -1.145f, -0.66f, -1.246f, -1.155f)
                curveToRelative(-0.1f, -0.495f, 0.03f, -1.163f, 0.697f, -1.55f)
                arcToRelative(2.569f, 2.569f, 0.0f, false, true, 1.057f, -0.337f)
                lineToRelative(3.68f, -0.345f)
                arcToRelative(4.212f, 4.212f, 0.0f, false, false, 1.71f, -0.546f)
                arcToRelative(3.023f, 3.024f, 0.0f, false, false, 1.467f, -3.258f)
                close()
                moveTo(14.437f, 13.57f)
                arcToRelative(5.71f, 5.71f, 0.0f, false, true, -0.436f, 0.06f)
                lineToRelative(-1.543f, 0.147f)
                lineToRelative(1.93f, 2.119f)
                arcToRelative(3.47f, 3.47f, 0.0f, false, true, 0.906f, 2.34f)
                lineTo(16.9f, 18.236f)
                arcToRelative(5.07f, 5.07f, 0.0f, false, false, -1.325f, -3.42f)
                close()
                moveTo(9.434f, 10.46f)
                arcToRelative(4.65f, 4.65f, 0.0f, false, true, 0.546f, -0.08f)
                lineToRelative(1.427f, -0.136f)
                lineTo(9.469f, 8.12f)
                arcToRelative(3.47f, 3.47f, 0.0f, false, true, -0.905f, -2.34f)
                lineTo(6.963f, 5.78f)
                curveToRelative(0.0f, 1.267f, 0.47f, 2.483f, 1.324f, 3.42f)
                close()
            }
        }
        .build()
        return _recoil!!
    }

private var _recoil: ImageVector? = null
