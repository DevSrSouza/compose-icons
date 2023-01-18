package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.GlobeHemisphereEast: ImageVector
    get() {
        if (_globeHemisphereEast != null) {
            return _globeHemisphereEast!!
        }
        _globeHemisphereEast = Builder(name = "GlobeHemisphereEast", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.5f, 169.2f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 0.5f, -1.2f)
                arcTo(103.9f, 103.9f, 0.0f, false, false, 187.8f, 43.0f)
                lineToRelative(-1.2f, -0.9f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, -144.0f, 145.2f)
                verticalLineToRelative(0.2f)
                lineToRelative(0.8f, 1.1f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, 147.8f, 21.9f)
                lineToRelative(1.4f, -1.1f)
                arcTo(105.3f, 105.3f, 0.0f, false, false, 223.5f, 169.2f)
                close()
                moveTo(187.5f, 192.8f)
                lineTo(182.0f, 187.3f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, false, -7.3f, -4.2f)
                lineToRelative(-21.4f, -5.6f)
                lineToRelative(2.4f, -16.2f)
                lineToRelative(30.4f, -12.7f)
                lineToRelative(20.6f, 18.8f)
                arcTo(90.6f, 90.6f, 0.0f, false, true, 187.5f, 192.8f)
                close()
                moveTo(128.0f, 40.0f)
                arcToRelative(87.5f, 87.5f, 0.0f, false, true, 46.9f, 13.6f)
                lineToRelative(1.0f, 20.2f)
                lineTo(153.7f, 99.4f)
                lineToRelative(-31.5f, 4.2f)
                lineTo(102.6f, 89.4f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, -12.4f, -2.8f)
                arcToRelative(16.3f, 16.3f, 0.0f, false, false, -10.5f, 7.2f)
                lineToRelative(-19.9f, 31.0f)
                arcToRelative(16.3f, 16.3f, 0.0f, false, false, -2.5f, 8.6f)
                lineToRelative(-0.2f, 36.1f)
                lineToRelative(-5.0f, 3.0f)
                arcTo(87.2f, 87.2f, 0.0f, false, true, 40.0f, 128.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 128.0f, 40.0f)
                close()
                moveTo(61.5f, 185.6f)
                lineToRelative(3.9f, -2.4f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, 7.7f, -13.6f)
                lineToRelative(0.2f, -36.1f)
                lineToRelative(19.9f, -31.1f)
                lineToRelative(19.6f, 14.2f)
                arcToRelative(16.5f, 16.5f, 0.0f, false, false, 11.6f, 2.9f)
                lineToRelative(31.4f, -4.3f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, false, 10.0f, -5.4f)
                lineTo(188.0f, 84.2f)
                arcTo(15.8f, 15.8f, 0.0f, false, false, 191.8f, 73.0f)
                lineToRelative(-0.2f, -5.8f)
                arcTo(87.7f, 87.7f, 0.0f, false, true, 216.0f, 128.0f)
                arcToRelative(86.4f, 86.4f, 0.0f, false, true, -3.2f, 23.4f)
                lineToRelative(-15.9f, -14.6f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -16.9f, -3.0f)
                lineToRelative(-30.5f, 12.7f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -9.7f, 12.4f)
                lineToRelative(-2.4f, 16.2f)
                arcTo(16.2f, 16.2f, 0.0f, false, false, 149.2f, 193.0f)
                lineToRelative(21.5f, 5.6f)
                lineToRelative(4.0f, 4.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, -113.2f, -17.0f)
                close()
            }
        }
        .build()
        return _globeHemisphereEast!!
    }

private var _globeHemisphereEast: ImageVector? = null
