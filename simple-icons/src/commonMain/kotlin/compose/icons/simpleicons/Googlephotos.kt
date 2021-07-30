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

public val SimpleIcons.Googlephotos: ImageVector
    get() {
        if (_googlephotos != null) {
            return _googlephotos!!
        }
        _googlephotos = Builder(name = "Googlephotos", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.678f, 16.672f)
                curveToRelative(0.0f, 2.175f, 0.002f, 4.565f, -0.001f, 6.494f)
                curveToRelative(-0.001f, 0.576f, -0.244f, 0.814f, -0.817f, 0.833f)
                curveToRelative(-7.045f, 0.078f, -8.927f, -7.871f, -4.468f, -11.334f)
                curveToRelative(-1.95f, 0.016f, -4.019f, 0.007f, -5.986f, 0.007f)
                curveToRelative(-1.351f, 0.0f, -1.414f, -0.01f, -1.405f, -1.351f)
                curveToRelative(0.258f, -6.583f, 7.946f, -8.275f, 11.323f, -3.936f)
                lineTo(11.308f, 0.928f)
                curveToRelative(-0.001f, -0.695f, 0.212f, -0.906f, 0.906f, -0.925f)
                curveToRelative(6.409f, -0.187f, 9.16f, 7.308f, 4.426f, 11.326f)
                lineToRelative(6.131f, 0.002f)
                curveToRelative(1.097f, 0.0f, 1.241f, 0.105f, 1.228f, 1.217f)
                curveToRelative(-0.223f, 6.723f, -7.802f, 8.376f, -11.321f, 4.124f)
                close()
                moveTo(12.68f, 1.388f)
                lineToRelative(-0.003f, 9.972f)
                curveToRelative(6.56f, -0.465f, 6.598f, -9.532f, 0.003f, -9.972f)
                close()
                moveTo(11.32f, 22.612f)
                lineToRelative(-0.001f, -9.97f)
                curveToRelative(-6.927f, 0.598f, -6.29f, 9.726f, 0.002f, 9.97f)
                close()
                moveTo(1.4f, 11.315f)
                lineToRelative(9.95f, 0.008f)
                curveToRelative(-0.527f, -6.829f, -9.762f, -6.367f, -9.95f, -0.008f)
                close()
                moveTo(12.638f, 12.68f)
                curveToRelative(0.682f, 6.875f, 9.67f, 6.284f, 9.977f, 0.01f)
                close()
            }
        }
        .build()
        return _googlephotos!!
    }

private var _googlephotos: ImageVector? = null
