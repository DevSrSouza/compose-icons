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

public val IonIcons.Car: ImageVector
    get() {
        if (_car != null) {
            return _car!!
        }
        _car = Builder(name = "Car", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(447.68f, 220.78f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -1.0f, -3.08f)
                lineToRelative(-37.78f, -88.16f)
                curveTo(400.19f, 109.17f, 379.0f, 96.0f, 354.89f, 96.0f)
                lineTo(157.11f, 96.0f)
                curveToRelative(-24.09f, 0.0f, -45.3f, 13.17f, -54.0f, 33.54f)
                lineTo(65.29f, 217.7f)
                arcTo(15.72f, 15.72f, 0.0f, false, false, 64.0f, 224.0f)
                lineTo(64.0f, 400.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(128.0f, 384.0f)
                lineTo(384.0f, 384.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(448.0f, 224.0f)
                arcTo(16.15f, 16.15f, 0.0f, false, false, 447.68f, 220.78f)
                close()
                moveTo(144.0f, 320.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 144.0f, 320.0f)
                close()
                moveTo(368.0f, 320.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 368.0f, 320.0f)
                close()
                moveTo(104.26f, 208.0f)
                lineToRelative(28.23f, -65.85f)
                curveTo(136.11f, 133.69f, 146.0f, 128.0f, 157.11f, 128.0f)
                lineTo(354.89f, 128.0f)
                curveToRelative(11.1f, 0.0f, 21.0f, 5.69f, 24.62f, 14.15f)
                lineTo(407.74f, 208.0f)
                close()
            }
        }
        .build()
        return _car!!
    }

private var _car: ImageVector? = null
