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

public val IonIcons.LogoVenmo: ImageVector
    get() {
        if (_logoVenmo != null) {
            return _logoVenmo!!
        }
        _logoVenmo = Builder(name = "LogoVenmo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(444.17f, 32.0f)
                horizontalLineTo(70.28f)
                curveTo(49.85f, 32.0f, 32.0f, 46.7f, 32.0f, 66.89f)
                verticalLineTo(441.6f)
                curveTo(32.0f, 461.91f, 49.85f, 480.0f, 70.28f, 480.0f)
                horizontalLineTo(444.06f)
                curveTo(464.6f, 480.0f, 480.0f, 461.8f, 480.0f, 441.61f)
                verticalLineTo(66.89f)
                curveTo(480.12f, 46.7f, 464.6f, 32.0f, 444.17f, 32.0f)
                close()
                moveTo(278.0f, 387.0f)
                horizontalLineTo(174.32f)
                lineTo(132.75f, 138.44f)
                lineToRelative(90.75f, -8.62f)
                lineToRelative(22.0f, 176.87f)
                curveToRelative(20.53f, -33.45f, 45.88f, -86.0f, 45.88f, -121.87f)
                curveToRelative(0.0f, -19.62f, -3.36f, -33.0f, -8.61f, -44.0f)
                lineTo(365.4f, 124.1f)
                curveToRelative(9.56f, 15.78f, 13.86f, 32.0f, 13.86f, 52.57f)
                curveTo(379.25f, 242.17f, 323.34f, 327.26f, 278.0f, 387.0f)
                close()
            }
        }
        .build()
        return _logoVenmo!!
    }

private var _logoVenmo: ImageVector? = null
