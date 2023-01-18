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

public val IonIcons.CloudySharp: ImageVector
    get() {
        if (_cloudySharp != null) {
            return _cloudySharp!!
        }
        _cloudySharp = Builder(name = "CloudySharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(376.0f, 432.0f)
                horizontalLineTo(116.0f)
                curveToRelative(-32.37f, 0.0f, -60.23f, -8.57f, -80.59f, -24.77f)
                curveTo(12.24f, 388.78f, 0.0f, 361.39f, 0.0f, 328.0f)
                curveToRelative(0.0f, -61.85f, 48.44f, -95.34f, 97.75f, -102.64f)
                curveToRelative(6.52f, -41.18f, 24.0f, -76.4f, 51.11f, -102.46f)
                arcTo(153.57f, 153.57f, 0.0f, false, true, 256.0f, 80.0f)
                curveToRelative(35.5f, 0.0f, 68.24f, 11.69f, 94.68f, 33.8f)
                arcToRelative(156.42f, 156.42f, 0.0f, false, true, 45.22f, 63.61f)
                curveToRelative(30.26f, 4.81f, 57.45f, 17.18f, 77.38f, 35.36f)
                curveTo(498.61f, 235.88f, 512.0f, 267.42f, 512.0f, 304.0f)
                curveToRelative(0.0f, 36.0f, -14.38f, 68.88f, -40.49f, 92.59f)
                curveTo(446.36f, 419.43f, 412.44f, 432.0f, 376.0f, 432.0f)
                close()
            }
        }
        .build()
        return _cloudySharp!!
    }

private var _cloudySharp: ImageVector? = null
