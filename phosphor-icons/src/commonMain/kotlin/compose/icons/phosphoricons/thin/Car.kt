package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Car: ImageVector
    get() {
        if (_car != null) {
            return _car!!
        }
        _car = Builder(name = "Car", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 116.0f)
                lineTo(226.6f, 116.0f)
                lineTo(197.8f, 51.1f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -11.0f, -7.1f)
                lineTo(69.2f, 44.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -11.0f, 7.1f)
                lineTo(29.4f, 116.0f)
                lineTo(16.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(28.0f, 124.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(64.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(76.0f, 188.0f)
                lineTo(180.0f, 188.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 124.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(65.5f, 54.4f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 69.2f, 52.0f)
                lineTo(186.8f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.7f, 2.4f)
                lineTo(217.8f, 116.0f)
                lineTo(38.2f, 116.0f)
                close()
                moveTo(68.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(40.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(36.0f, 188.0f)
                lineTo(68.0f, 188.0f)
                close()
                moveTo(216.0f, 212.0f)
                lineTo(192.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(188.0f, 188.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 216.0f, 212.0f)
                close()
                moveTo(220.0f, 180.0f)
                lineTo(36.0f, 180.0f)
                lineTo(36.0f, 124.0f)
                lineTo(220.0f, 124.0f)
                close()
                moveTo(60.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(80.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(64.0f, 156.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 60.0f, 152.0f)
                close()
                moveTo(172.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(176.0f, 156.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 172.0f, 152.0f)
                close()
            }
        }
        .build()
        return _car!!
    }

private var _car: ImageVector? = null
