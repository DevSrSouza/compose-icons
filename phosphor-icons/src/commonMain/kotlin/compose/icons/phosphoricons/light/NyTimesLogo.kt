package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.NyTimesLogo: ImageVector
    get() {
        if (_nyTimesLogo != null) {
            return _nyTimesLogo!!
        }
        _nyTimesLogo = Builder(name = "NyTimesLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.1f, 138.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 172.1f, 138.0f)
                close()
                moveTo(211.5f, 164.8f)
                arcTo(86.1f, 86.1f, 0.0f, false, true, 94.2f, 223.1f)
                lineToRelative(-1.3f, -0.6f)
                arcToRelative(86.2f, 86.2f, 0.0f, false, true, -50.1f, -66.9f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, -0.1f, -1.1f)
                arcTo(72.2f, 72.2f, 0.0f, false, true, 42.0f, 144.0f)
                arcTo(85.8f, 85.8f, 0.0f, false, true, 57.1f, 95.4f)
                arcTo(33.7f, 33.7f, 0.0f, false, true, 36.1f, 64.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 34.0f, -34.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 2.6f, 0.6f)
                lineTo(187.4f, 86.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -1.3f, -44.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 0.0f, 68.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -2.6f, -0.6f)
                lineTo(126.8f, 70.0f)
                arcTo(74.1f, 74.1f, 0.0f, false, false, 54.0f, 144.0f)
                verticalLineToRelative(0.7f)
                lineToRelative(39.1f, -20.9f)
                horizontalLineToRelative(0.1f)
                lineToRelative(32.0f, -17.1f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 5.9f, 0.2f)
                arcTo(5.8f, 5.8f, 0.0f, false, true, 134.0f, 112.0f)
                lineTo(134.0f, 217.8f)
                arcToRelative(73.9f, 73.9f, 0.0f, false, false, 65.8f, -55.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.7f, 2.9f)
                close()
                moveTo(65.1f, 85.4f)
                arcToRelative(86.8f, 86.8f, 0.0f, false, true, 42.1f, -24.8f)
                lineTo(68.8f, 42.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 48.1f, 64.0f)
                arcTo(21.8f, 21.8f, 0.0f, false, false, 65.1f, 85.4f)
                close()
                moveTo(122.0f, 122.0f)
                lineToRelative(-20.0f, 10.7f)
                verticalLineToRelative(80.6f)
                arcToRelative(73.6f, 73.6f, 0.0f, false, false, 20.0f, 4.4f)
                close()
                moveTo(90.0f, 207.5f)
                lineTo(90.0f, 139.1f)
                lineTo(55.3f, 157.6f)
                arcTo(74.2f, 74.2f, 0.0f, false, false, 90.0f, 207.5f)
                close()
            }
        }
        .build()
        return _nyTimesLogo!!
    }

private var _nyTimesLogo: ImageVector? = null
