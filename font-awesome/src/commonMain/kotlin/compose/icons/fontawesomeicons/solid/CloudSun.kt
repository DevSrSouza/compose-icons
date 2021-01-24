package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.CloudSun: ImageVector
    get() {
        if (_cloudSun != null) {
            return _cloudSun!!
        }
        _cloudSun = Builder(name = "CloudSun", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(575.2f, 325.7f)
                curveToRelative(0.2f, -1.9f, 0.8f, -3.7f, 0.8f, -5.6f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                curveToRelative(-12.6f, 0.0f, -24.2f, 3.8f, -34.1f, 10.0f)
                curveToRelative(-17.6f, -38.8f, -56.5f, -66.0f, -101.9f, -66.0f)
                curveToRelative(-61.8f, 0.0f, -112.0f, 50.1f, -112.0f, 112.0f)
                curveToRelative(0.0f, 3.0f, 0.7f, 5.8f, 0.9f, 8.7f)
                curveToRelative(-49.6f, 3.7f, -88.9f, 44.7f, -88.9f, 95.3f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                horizontalLineToRelative(272.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, -43.0f, 96.0f, -96.0f)
                curveToRelative(0.0f, -42.1f, -27.2f, -77.4f, -64.8f, -90.4f)
                close()
                moveTo(144.8f, 303.1f)
                curveToRelative(-43.7f, -43.7f, -43.7f, -114.7f, 0.0f, -158.3f)
                curveToRelative(43.7f, -43.7f, 114.7f, -43.7f, 158.4f, 0.0f)
                curveToRelative(9.7f, 9.7f, 16.9f, 20.9f, 22.3f, 32.7f)
                curveToRelative(9.8f, -3.7f, 20.1f, -6.0f, 30.7f, -7.5f)
                lineTo(386.0f, 81.1f)
                curveToRelative(4.0f, -11.9f, -7.3f, -23.1f, -19.2f, -19.2f)
                lineTo(279.0f, 91.2f)
                lineTo(237.5f, 8.4f)
                curveTo(232.0f, -2.8f, 216.0f, -2.8f, 210.4f, 8.4f)
                lineTo(169.0f, 91.2f)
                lineTo(81.1f, 61.9f)
                curveTo(69.3f, 58.0f, 58.0f, 69.3f, 61.9f, 81.1f)
                lineToRelative(29.3f, 87.8f)
                lineToRelative(-82.8f, 41.5f)
                curveToRelative(-11.2f, 5.6f, -11.2f, 21.5f, 0.0f, 27.1f)
                lineToRelative(82.8f, 41.4f)
                lineToRelative(-29.3f, 87.8f)
                curveToRelative(-4.0f, 11.9f, 7.3f, 23.1f, 19.2f, 19.2f)
                lineToRelative(76.1f, -25.3f)
                curveToRelative(6.1f, -12.4f, 14.0f, -23.7f, 23.6f, -33.5f)
                curveToRelative(-13.1f, -5.4f, -25.4f, -13.4f, -36.0f, -24.0f)
                close()
                moveTo(140.0f, 223.9f)
                curveToRelative(0.0f, 40.8f, 29.3f, 74.8f, 67.9f, 82.3f)
                curveToRelative(8.0f, -4.7f, 16.3f, -8.8f, 25.2f, -11.7f)
                curveToRelative(5.4f, -44.3f, 31.0f, -82.5f, 67.4f, -105.0f)
                curveTo(287.3f, 160.4f, 258.0f, 140.0f, 224.0f, 140.0f)
                curveToRelative(-46.3f, 0.0f, -84.0f, 37.6f, -84.0f, 83.9f)
                close()
            }
        }
        .build()
        return _cloudSun!!
    }

private var _cloudSun: ImageVector? = null
