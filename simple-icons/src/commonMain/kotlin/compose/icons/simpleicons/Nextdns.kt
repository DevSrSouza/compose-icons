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

public val SimpleIcons.Nextdns: ImageVector
    get() {
        if (_nextdns != null) {
            return _nextdns!!
        }
        _nextdns = Builder(name = "Nextdns", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.195f, 6.512f)
                lineToRelative(-0.001f, -0.019f)
                curveToRelative(-0.01f, -0.23f, -0.017f, -0.474f, -0.022f, -0.746f)
                arcToRelative(2.543f, 2.543f, 0.0f, false, false, -2.395f, -2.492f)
                curveToRelative(-2.759f, -0.154f, -4.894f, -1.053f, -6.717f, -2.831f)
                lineToRelative(-0.016f, -0.015f)
                arcToRelative(1.536f, 1.536f, 0.0f, false, false, -2.087f, 0.0f)
                lineToRelative(-0.016f, 0.015f)
                curveTo(9.117f, 2.202f, 6.982f, 3.101f, 4.223f, 3.256f)
                arcToRelative(2.543f, 2.543f, 0.0f, false, false, -2.395f, 2.492f)
                curveToRelative(-0.004f, 0.269f, -0.011f, 0.513f, -0.022f, 0.745f)
                lineToRelative(-0.001f, 0.044f)
                curveToRelative(-0.053f, 2.813f, -0.12f, 6.315f, 1.052f, 9.494f)
                curveToRelative(0.644f, 1.748f, 1.619f, 3.267f, 2.899f, 4.516f)
                curveToRelative(1.458f, 1.422f, 3.367f, 2.552f, 5.674f, 3.356f)
                curveToRelative(0.075f, 0.026f, 0.153f, 0.048f, 0.233f, 0.063f)
                arcToRelative(1.668f, 1.668f, 0.0f, false, false, 0.675f, 0.0f)
                curveToRelative(0.079f, -0.015f, 0.158f, -0.037f, 0.233f, -0.063f)
                curveToRelative(2.305f, -0.806f, 4.212f, -1.936f, 5.668f, -3.358f)
                curveToRelative(1.28f, -1.25f, 2.255f, -2.769f, 2.9f, -4.518f)
                curveToRelative(1.176f, -3.188f, 1.109f, -6.696f, 1.056f, -9.515f)
                close()
            }
        }
        .build()
        return _nextdns!!
    }

private var _nextdns: ImageVector? = null
