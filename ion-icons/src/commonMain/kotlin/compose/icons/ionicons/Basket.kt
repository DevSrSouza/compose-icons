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

public val IonIcons.Basket: ImageVector
    get() {
        if (_basket != null) {
            return _basket!!
        }
        _basket = Builder(name = "Basket", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(424.11f, 192.0f)
                lineTo(360.0f, 192.0f)
                lineTo(268.8f, 70.4f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -25.6f, 0.0f)
                lineTo(152.0f, 192.0f)
                lineTo(87.89f, 192.0f)
                arcToRelative(32.57f, 32.57f, 0.0f, false, false, -32.62f, 32.44f)
                arcToRelative(30.3f, 30.3f, 0.0f, false, false, 1.31f, 9.0f)
                lineToRelative(46.27f, 163.14f)
                arcToRelative(50.72f, 50.72f, 0.0f, false, false, 48.84f, 36.91f)
                lineTo(360.31f, 433.49f)
                arcToRelative(51.21f, 51.21f, 0.0f, false, false, 49.0f, -36.86f)
                lineToRelative(46.33f, -163.36f)
                arcToRelative(15.62f, 15.62f, 0.0f, false, false, 0.46f, -2.36f)
                lineToRelative(0.53f, -4.93f)
                arcToRelative(13.3f, 13.3f, 0.0f, false, false, 0.09f, -1.55f)
                arcTo(32.57f, 32.57f, 0.0f, false, false, 424.11f, 192.0f)
                close()
                moveTo(256.0f, 106.67f)
                lineTo(320.0f, 192.0f)
                lineTo(192.0f, 192.0f)
                close()
                moveTo(256.0f, 351.67f)
                arcToRelative(37.7f, 37.7f, 0.0f, true, true, 37.88f, -37.7f)
                arcTo(37.87f, 37.87f, 0.0f, false, true, 256.0f, 351.63f)
                close()
            }
        }
        .build()
        return _basket!!
    }

private var _basket: ImageVector? = null
