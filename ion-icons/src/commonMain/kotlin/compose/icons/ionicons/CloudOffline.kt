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

public val IonIcons.CloudOffline: ImageVector
    get() {
        if (_cloudOffline != null) {
            return _cloudOffline!!
        }
        _cloudOffline = Builder(name = "CloudOffline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 464.0f)
                arcToRelative(15.92f, 15.92f, 0.0f, false, true, -11.31f, -4.69f)
                lineToRelative(-384.0f, -384.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 75.31f, 52.69f)
                lineToRelative(384.0f, 384.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 448.0f, 464.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(38.72f, 196.78f)
                curveTo(13.39f, 219.88f, 0.0f, 251.42f, 0.0f, 288.0f)
                curveToRelative(0.0f, 36.0f, 14.38f, 68.88f, 40.49f, 92.59f)
                curveTo(65.64f, 403.43f, 99.56f, 416.0f, 136.0f, 416.0f)
                horizontalLineTo(328.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, -13.66f)
                lineTo(100.88f, 168.76f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -2.0f)
                curveTo(72.0f, 173.15f, 53.4f, 183.38f, 38.72f, 196.78f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(476.59f, 391.23f)
                curveTo(499.76f, 372.78f, 512.0f, 345.39f, 512.0f, 312.0f)
                curveToRelative(0.0f, -57.57f, -42.0f, -90.58f, -87.56f, -100.75f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -12.12f, -12.39f)
                curveToRelative(-7.68f, -36.68f, -24.45f, -68.15f, -49.18f, -92.0f)
                arcTo(153.57f, 153.57f, 0.0f, false, false, 256.0f, 64.0f)
                curveToRelative(-31.12f, 0.0f, -60.12f, 9.0f, -84.62f, 26.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -1.14f, 12.26f)
                lineTo(461.68f, 393.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.2f, 0.93f)
                quadTo(474.31f, 393.05f, 476.59f, 391.23f)
                close()
            }
        }
        .build()
        return _cloudOffline!!
    }

private var _cloudOffline: ImageVector? = null
