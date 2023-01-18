package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.CloudOfflineSharp: ImageVector
    get() {
        if (_cloudOfflineSharp != null) {
            return _cloudOfflineSharp!!
        }
        _cloudOfflineSharp = Builder(name = "CloudOfflineSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(41.371f, 63.999f)
                lineToRelative(22.627f, -22.627f)
                lineToRelative(406.629f, 406.629f)
                lineToRelative(-22.627f, 22.627f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(38.72f, 212.78f)
                curveTo(13.39f, 235.88f, 0.0f, 267.42f, 0.0f, 304.0f)
                curveToRelative(0.0f, 36.0f, 14.38f, 68.88f, 40.49f, 92.59f)
                curveTo(65.64f, 419.43f, 99.56f, 432.0f, 136.0f, 432.0f)
                horizontalLineTo(364.12f)
                lineTo(110.51f, 178.39f)
                curveTo(82.5f, 183.78f, 57.42f, 195.72f, 38.72f, 212.78f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(476.59f, 407.23f)
                curveTo(499.76f, 388.78f, 512.0f, 361.39f, 512.0f, 328.0f)
                curveToRelative(0.0f, -61.85f, -48.44f, -95.34f, -97.75f, -102.64f)
                curveToRelative(-6.52f, -41.18f, -24.05f, -76.4f, -51.11f, -102.46f)
                arcTo(153.57f, 153.57f, 0.0f, false, false, 256.0f, 80.0f)
                curveToRelative(-30.47f, 0.0f, -58.9f, 8.62f, -83.07f, 25.0f)
                lineTo(475.75f, 407.86f)
                curveTo(476.0f, 407.65f, 476.32f, 407.45f, 476.59f, 407.23f)
                close()
            }
        }
        .build()
        return _cloudOfflineSharp!!
    }

private var _cloudOfflineSharp: ImageVector? = null
