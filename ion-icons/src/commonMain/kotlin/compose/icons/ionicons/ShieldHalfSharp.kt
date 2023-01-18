package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ShieldHalfSharp: ImageVector
    get() {
        if (_shieldHalfSharp != null) {
            return _shieldHalfSharp!!
        }
        _shieldHalfSharp = Builder(name = "ShieldHalfSharp", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 32.0f)
                curveTo(174.0f, 69.06f, 121.38f, 86.46f, 32.0f, 96.0f)
                curveToRelative(0.0f, 77.59f, 5.27f, 133.36f, 25.29f, 184.51f)
                arcToRelative(348.86f, 348.86f, 0.0f, false, false, 71.43f, 112.41f)
                curveTo(178.32f, 445.58f, 232.89f, 473.32f, 256.0f, 480.0f)
                curveToRelative(23.11f, -6.68f, 77.68f, -34.42f, 127.28f, -87.08f)
                arcToRelative(348.86f, 348.86f, 0.0f, false, false, 71.43f, -112.41f)
                curveTo(474.73f, 229.36f, 480.0f, 173.59f, 480.0f, 96.0f)
                curveTo(390.62f, 86.46f, 338.0f, 69.06f, 256.0f, 32.0f)
                close()
                moveTo(417.47f, 265.93f)
                arcToRelative(309.18f, 309.18f, 0.0f, false, true, -63.31f, 99.56f)
                curveTo(316.0f, 406.0f, 276.65f, 428.31f, 256.0f, 437.36f)
                verticalLineTo(75.8f)
                curveToRelative(38.75f, 17.0f, 68.73f, 28.3f, 97.93f, 36.89f)
                arcToRelative(613.12f, 613.12f, 0.0f, false, false, 85.6f, 18.52f)
                curveTo(437.81f, 191.43f, 431.17f, 230.9f, 417.47f, 265.93f)
                close()
            }
        }
        .build()
        return _shieldHalfSharp!!
    }

private var _shieldHalfSharp: ImageVector? = null
