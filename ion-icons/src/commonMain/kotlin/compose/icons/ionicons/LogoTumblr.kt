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

public val IonIcons.LogoTumblr: ImageVector
    get() {
        if (_logoTumblr != null) {
            return _logoTumblr!!
        }
        _logoTumblr = Builder(name = "LogoTumblr", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(390.0f, 32.0f)
                horizontalLineTo(120.0f)
                curveToRelative(-49.19f, 0.0f, -88.0f, 38.81f, -88.0f, 88.0f)
                verticalLineTo(390.0f)
                curveToRelative(0.0f, 49.19f, 38.81f, 90.0f, 88.0f, 90.0f)
                horizontalLineTo(390.0f)
                curveToRelative(49.19f, 0.0f, 90.0f, -40.81f, 90.0f, -90.0f)
                verticalLineTo(120.0f)
                curveTo(480.0f, 70.81f, 439.19f, 32.0f, 390.0f, 32.0f)
                close()
                moveTo(336.0f, 396.0f)
                horizontalLineTo(284.0f)
                curveToRelative(-42.51f, 0.0f, -72.0f, -23.68f, -72.0f, -76.0f)
                verticalLineTo(240.0f)
                horizontalLineTo(176.0f)
                verticalLineTo(192.0f)
                curveToRelative(42.51f, -11.0f, 57.95f, -48.32f, 60.0f, -80.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(72.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(56.0f)
                horizontalLineTo(280.0f)
                lineToRelative(-0.39f, 70.51f)
                curveToRelative(0.0f, 21.87f, 11.0f, 29.43f, 28.62f, 29.43f)
                lineTo(336.0f, 340.0f)
                close()
            }
        }
        .build()
        return _logoTumblr!!
    }

private var _logoTumblr: ImageVector? = null
