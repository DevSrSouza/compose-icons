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

public val IonIcons.EggSharp: ImageVector
    get() {
        if (_eggSharp != null) {
            return _eggSharp!!
        }
        _eggSharp = Builder(name = "EggSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(418.39f, 381.05f)
                curveToRelative(-8.08f, 21.68f, -19.76f, 40.1f, -34.72f, 54.75f)
                curveToRelative(-14.38f, 14.07f, -32.1f, 24.95f, -52.67f, 32.34f)
                curveTo(309.08f, 476.0f, 283.85f, 480.0f, 256.0f, 480.0f)
                reflectiveCurveToRelative(-53.08f, -4.0f, -75.0f, -11.86f)
                curveToRelative(-20.57f, -7.39f, -38.29f, -18.27f, -52.67f, -32.34f)
                curveToRelative(-15.0f, -14.65f, -26.64f, -33.07f, -34.72f, -54.75f)
                curveTo(84.58f, 356.82f, 80.0f, 328.53f, 80.0f, 296.94f)
                curveToRelative(0.0f, -30.28f, 6.68f, -62.57f, 19.86f, -96.0f)
                arcTo(371.0f, 371.0f, 0.0f, false, true, 151.0f, 111.42f)
                curveTo(195.78f, 53.56f, 241.0f, 32.0f, 256.0f, 32.0f)
                reflectiveCurveToRelative(62.67f, 22.4f, 105.0f, 79.42f)
                curveToRelative(18.33f, 24.71f, 38.87f, 58.34f, 51.17f, 89.54f)
                curveToRelative(13.18f, 33.41f, 19.86f, 65.7f, 19.86f, 96.0f)
                curveTo(432.0f, 328.53f, 427.42f, 356.82f, 418.39f, 381.05f)
                close()
            }
        }
        .build()
        return _eggSharp!!
    }

private var _eggSharp: ImageVector? = null
