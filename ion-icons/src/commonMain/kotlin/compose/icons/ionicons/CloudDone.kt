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

public val IonIcons.CloudDone: ImageVector
    get() {
        if (_cloudDone != null) {
            return _cloudDone!!
        }
        _cloudDone = Builder(name = "CloudDone", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(424.44f, 227.25f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -12.12f, -12.39f)
                curveToRelative(-7.68f, -36.68f, -24.45f, -68.15f, -49.18f, -92.0f)
                arcTo(153.57f, 153.57f, 0.0f, false, false, 256.0f, 80.0f)
                curveToRelative(-35.5f, 0.0f, -68.24f, 11.69f, -94.68f, 33.8f)
                arcToRelative(156.24f, 156.24f, 0.0f, false, false, -42.0f, 56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -11.37f, 9.15f)
                curveToRelative(-27.0f, 5.62f, -51.07f, 17.34f, -69.18f, 33.87f)
                curveTo(13.39f, 235.88f, 0.0f, 267.42f, 0.0f, 304.0f)
                curveToRelative(0.0f, 36.0f, 14.38f, 68.88f, 40.49f, 92.59f)
                curveTo(65.64f, 419.43f, 99.56f, 432.0f, 136.0f, 432.0f)
                lineTo(396.0f, 432.0f)
                curveToRelative(32.37f, 0.0f, 60.23f, -8.57f, 80.59f, -24.77f)
                curveTo(499.76f, 388.78f, 512.0f, 361.39f, 512.0f, 328.0f)
                curveTo(512.0f, 270.43f, 470.0f, 237.42f, 424.44f, 227.25f)
                close()
                moveTo(329.24f, 218.31f)
                lineTo(221.44f, 346.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -12.0f, 5.69f)
                horizontalLineToRelative(-0.27f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -11.88f, -5.28f)
                lineToRelative(-45.9f, -50.87f)
                curveToRelative(-5.77f, -6.39f, -5.82f, -16.33f, 0.3f, -22.4f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 23.16f, 0.63f)
                lineToRelative(33.9f, 37.58f)
                lineToRelative(96.0f, -114.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 24.48f, 20.62f)
                close()
            }
        }
        .build()
        return _cloudDone!!
    }

private var _cloudDone: ImageVector? = null
