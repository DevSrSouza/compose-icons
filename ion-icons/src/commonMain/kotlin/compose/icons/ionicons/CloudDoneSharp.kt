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

public val IonIcons.CloudDoneSharp: ImageVector
    get() {
        if (_cloudDoneSharp != null) {
            return _cloudDoneSharp!!
        }
        _cloudDoneSharp = Builder(name = "CloudDoneSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(414.25f, 225.36f)
                curveToRelative(-6.52f, -41.18f, -24.05f, -76.4f, -51.11f, -102.46f)
                arcTo(153.57f, 153.57f, 0.0f, false, false, 256.0f, 80.0f)
                curveToRelative(-35.5f, 0.0f, -68.24f, 11.69f, -94.68f, 33.8f)
                arcToRelative(156.42f, 156.42f, 0.0f, false, false, -45.22f, 63.61f)
                curveToRelative(-30.26f, 4.81f, -57.45f, 17.18f, -77.38f, 35.37f)
                curveTo(13.39f, 235.88f, 0.0f, 267.42f, 0.0f, 304.0f)
                curveToRelative(0.0f, 36.0f, 14.38f, 68.88f, 40.49f, 92.59f)
                curveTo(65.64f, 419.43f, 99.56f, 432.0f, 136.0f, 432.0f)
                lineTo(396.0f, 432.0f)
                curveToRelative(32.37f, 0.0f, 60.23f, -8.57f, 80.59f, -24.77f)
                curveTo(499.76f, 388.78f, 512.0f, 361.39f, 512.0f, 328.0f)
                curveTo(512.0f, 266.15f, 463.56f, 232.66f, 414.25f, 225.36f)
                close()
                moveTo(209.62f, 360.36f)
                lineTo(140.4f, 283.66f)
                lineTo(164.16f, 262.22f)
                lineTo(208.78f, 311.68f)
                lineTo(315.07f, 185.48f)
                lineTo(339.54f, 206.09f)
                close()
            }
        }
        .build()
        return _cloudDoneSharp!!
    }

private var _cloudDoneSharp: ImageVector? = null
