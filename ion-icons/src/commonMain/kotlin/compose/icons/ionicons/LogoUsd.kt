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

public val IonIcons.LogoUsd: ImageVector
    get() {
        if (_logoUsd != null) {
            return _logoUsd!!
        }
        _logoUsd = Builder(name = "LogoUsd", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 480.0f)
                lineTo(240.0f, 443.58f)
                curveTo(160.53f, 439.0f, 112.25f, 398.06f, 112.0f, 336.0f)
                horizontalLineToRelative(72.0f)
                curveToRelative(1.77f, 26.34f, 23.86f, 46.45f, 56.0f, 50.0f)
                lineTo(240.0f, 288.0f)
                lineTo(213.23f, 281.0f)
                curveToRelative(-61.0f, -14.18f, -93.64f, -49.39f, -93.64f, -102.08f)
                curveTo(119.59f, 116.81f, 164.08f, 76.08f, 240.0f, 70.0f)
                lineTo(240.0f, 32.0f)
                horizontalLineToRelative(32.0f)
                lineTo(272.0f, 70.0f)
                curveToRelative(77.39f, 6.3f, 119.0f, 47.74f, 120.0f, 106.0f)
                lineTo(320.0f, 176.0f)
                curveToRelative(-0.76f, -24.06f, -15.83f, -43.39f, -48.0f, -46.0f)
                verticalLineToRelative(92.0f)
                lineToRelative(30.82f, 7.28f)
                curveTo(367.61f, 243.46f, 400.0f, 277.0f, 400.0f, 332.0f)
                curveToRelative(0.0f, 64.34f, -43.74f, 105.88f, -128.0f, 111.32f)
                lineTo(272.0f, 480.0f)
                close()
                moveTo(240.0f, 216.0f)
                lineTo(240.0f, 130.0f)
                curveToRelative(-27.59f, 1.52f, -47.27f, 18.47f, -47.27f, 42.53f)
                curveTo(192.73f, 194.83f, 209.12f, 209.41f, 240.0f, 216.0f)
                close()
                moveTo(272.0f, 294.0f)
                verticalLineToRelative(92.0f)
                curveToRelative(38.15f, -1.54f, 56.38f, -18.92f, 56.38f, -45.77f)
                curveTo(328.38f, 315.65f, 310.15f, 299.1f, 272.0f, 294.0f)
                close()
            }
        }
        .build()
        return _logoUsd!!
    }

private var _logoUsd: ImageVector? = null
