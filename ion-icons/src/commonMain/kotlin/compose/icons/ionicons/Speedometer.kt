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

public val IonIcons.Speedometer: ImageVector
    get() {
        if (_speedometer != null) {
            return _speedometer!!
        }
        _speedometer = Builder(name = "Speedometer", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(425.7f, 118.25f)
                arcTo(240.0f, 240.0f, 0.0f, false, false, 76.32f, 447.0f)
                lineToRelative(0.18f, 0.2f)
                curveToRelative(0.33f, 0.35f, 0.64f, 0.71f, 1.0f, 1.05f)
                curveToRelative(0.74f, 0.84f, 1.58f, 1.79f, 2.57f, 2.78f)
                arcToRelative(41.17f, 41.17f, 0.0f, false, false, 60.36f, -0.42f)
                arcToRelative(157.13f, 157.13f, 0.0f, false, true, 231.26f, 0.0f)
                arcToRelative(41.18f, 41.18f, 0.0f, false, false, 60.65f, 0.06f)
                lineToRelative(3.21f, -3.5f)
                lineToRelative(0.18f, -0.2f)
                arcToRelative(239.93f, 239.93f, 0.0f, false, false, -10.0f, -328.76f)
                close()
                moveTo(240.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                close()
                moveTo(128.0f, 304.0f)
                lineTo(96.0f, 304.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -32.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 32.0f)
                close()
                moveTo(176.8f, 208.8f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.62f, 0.0f)
                lineToRelative(-22.63f, -22.62f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.63f, -22.63f)
                lineToRelative(22.62f, 22.63f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 176.8f, 208.8f)
                close()
                moveTo(326.1f, 231.9f)
                lineTo(278.6f, 307.4f)
                arcToRelative(31.0f, 31.0f, 0.0f, false, true, -7.0f, 7.0f)
                arcToRelative(30.11f, 30.11f, 0.0f, false, true, -35.0f, -49.0f)
                lineToRelative(75.5f, -47.5f)
                arcToRelative(10.23f, 10.23f, 0.0f, false, true, 11.7f, 0.0f)
                arcTo(10.06f, 10.06f, 0.0f, false, true, 326.1f, 231.9f)
                close()
                moveTo(357.82f, 208.8f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.62f, -22.62f)
                lineToRelative(22.62f, -22.63f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.63f, 22.63f)
                close()
                moveTo(423.7f, 436.4f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(416.0f, 304.0f)
                lineTo(384.0f, 304.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -32.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 32.0f)
                close()
            }
        }
        .build()
        return _speedometer!!
    }

private var _speedometer: ImageVector? = null
