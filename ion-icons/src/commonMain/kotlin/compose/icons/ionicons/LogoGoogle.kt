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

public val IonIcons.LogoGoogle: ImageVector
    get() {
        if (_logoGoogle != null) {
            return _logoGoogle!!
        }
        _logoGoogle = Builder(name = "LogoGoogle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(473.16f, 221.48f)
                lineToRelative(-2.26f, -9.59f)
                horizontalLineTo(262.46f)
                verticalLineToRelative(88.22f)
                horizontalLineTo(387.0f)
                curveToRelative(-12.93f, 61.4f, -72.93f, 93.72f, -121.94f, 93.72f)
                curveToRelative(-35.66f, 0.0f, -73.25f, -15.0f, -98.13f, -39.11f)
                arcToRelative(140.08f, 140.08f, 0.0f, false, true, -41.8f, -98.88f)
                curveToRelative(0.0f, -37.16f, 16.7f, -74.33f, 41.0f, -98.78f)
                reflectiveCurveToRelative(61.0f, -38.13f, 97.49f, -38.13f)
                curveToRelative(41.79f, 0.0f, 71.74f, 22.19f, 82.94f, 32.31f)
                lineToRelative(62.69f, -62.36f)
                curveTo(390.86f, 72.72f, 340.34f, 32.0f, 261.6f, 32.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-60.75f, 0.0f, -119.0f, 23.27f, -161.58f, 65.71f)
                curveTo(58.0f, 139.5f, 36.25f, 199.93f, 36.25f, 256.0f)
                reflectiveCurveTo(56.83f, 369.48f, 97.55f, 411.6f)
                curveTo(141.06f, 456.52f, 202.68f, 480.0f, 266.13f, 480.0f)
                curveToRelative(57.73f, 0.0f, 112.45f, -22.62f, 151.45f, -63.66f)
                curveToRelative(38.34f, -40.4f, 58.17f, -96.3f, 58.17f, -154.9f)
                curveTo(475.75f, 236.77f, 473.27f, 222.12f, 473.16f, 221.48f)
                close()
            }
        }
        .build()
        return _logoGoogle!!
    }

private var _logoGoogle: ImageVector? = null
