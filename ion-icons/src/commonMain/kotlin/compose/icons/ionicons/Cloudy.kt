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

public val IonIcons.Cloudy: ImageVector
    get() {
        if (_cloudy != null) {
            return _cloudy!!
        }
        _cloudy = Builder(name = "Cloudy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(376.0f, 432.0f)
                horizontalLineTo(116.0f)
                curveToRelative(-32.37f, 0.0f, -60.23f, -8.57f, -80.59f, -24.77f)
                curveTo(12.24f, 388.78f, 0.0f, 361.39f, 0.0f, 328.0f)
                curveToRelative(0.0f, -57.57f, 42.0f, -90.58f, 87.56f, -100.75f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 12.12f, -12.39f)
                curveToRelative(7.68f, -36.68f, 24.45f, -68.15f, 49.18f, -92.0f)
                arcTo(153.57f, 153.57f, 0.0f, false, true, 256.0f, 80.0f)
                curveToRelative(35.5f, 0.0f, 68.24f, 11.69f, 94.68f, 33.8f)
                arcToRelative(156.24f, 156.24f, 0.0f, false, true, 42.05f, 56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 11.37f, 9.16f)
                curveToRelative(27.0f, 5.61f, 51.07f, 17.33f, 69.18f, 33.85f)
                curveTo(498.61f, 235.88f, 512.0f, 267.42f, 512.0f, 304.0f)
                curveToRelative(0.0f, 36.0f, -14.38f, 68.88f, -40.49f, 92.59f)
                curveTo(446.36f, 419.43f, 412.44f, 432.0f, 376.0f, 432.0f)
                close()
            }
        }
        .build()
        return _cloudy!!
    }

private var _cloudy: ImageVector? = null
