package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket = Builder(name = "Rocket", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(112.0f, 240.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 156.0f, 228.0f)
                close()
                moveTo(226.9f, 158.4f)
                lineTo(214.5f, 214.1f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, true, -12.9f, 14.5f)
                arcToRelative(19.2f, 19.2f, 0.0f, false, true, -6.7f, 1.1f)
                arcToRelative(20.3f, 20.3f, 0.0f, false, true, -12.4f, -4.3f)
                lineTo(155.8f, 204.0f)
                lineTo(100.2f, 204.0f)
                lineTo(73.5f, 225.4f)
                arcToRelative(20.3f, 20.3f, 0.0f, false, true, -12.4f, 4.3f)
                arcToRelative(19.2f, 19.2f, 0.0f, false, true, -6.7f, -1.1f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, true, -12.9f, -14.5f)
                lineTo(29.1f, 158.4f)
                arcToRelative(20.3f, 20.3f, 0.0f, false, true, 4.2f, -17.1f)
                lineToRelative(28.8f, -34.5f)
                arcToRelative(126.9f, 126.9f, 0.0f, false, true, 8.2f, -35.6f)
                curveToRelative(12.1f, -31.1f, 33.5f, -51.5f, 45.2f, -60.8f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 25.1f, 0.1f)
                curveToRelative(11.5f, 9.3f, 32.6f, 29.7f, 44.5f, 60.8f)
                arcToRelative(128.0f, 128.0f, 0.0f, false, true, 8.2f, 34.7f)
                lineToRelative(29.4f, 35.3f)
                arcTo(20.3f, 20.3f, 0.0f, false, true, 226.9f, 158.4f)
                close()
                moveTo(92.7f, 79.8f)
                curveToRelative(-12.0f, 31.0f, -8.5f, 64.7f, 10.4f, 100.2f)
                horizontalLineToRelative(49.8f)
                curveToRelative(18.4f, -35.5f, 21.8f, -69.1f, 9.8f, -100.1f)
                curveToRelative(-9.3f, -24.3f, -25.9f, -41.0f, -34.8f, -48.7f)
                curveTo(119.0f, 38.8f, 102.2f, 55.6f, 92.7f, 79.8f)
                close()
                moveTo(80.6f, 188.9f)
                arcTo(172.7f, 172.7f, 0.0f, false, true, 64.0f, 142.0f)
                lineTo(53.0f, 155.2f)
                lineToRelative(10.5f, 47.4f)
                close()
                moveTo(203.0f, 155.2f)
                lineToRelative(-11.4f, -13.7f)
                curveToRelative(-2.7f, 15.5f, -8.2f, 31.3f, -16.3f, 47.4f)
                lineToRelative(17.2f, 13.7f)
                close()
                moveTo(128.0f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 128.0f, 112.0f)
                close()
            }
        }
        .build()
        return _rocket!!
    }

private var _rocket: ImageVector? = null
