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

public val LightGroup.CloudSun: ImageVector
    get() {
        if (_cloudSun != null) {
            return _cloudSun!!
        }
        _cloudSun = Builder(name = "CloudSun", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 74.0f)
                arcToRelative(73.9f, 73.9f, 0.0f, false, false, -21.2f, 3.1f)
                arcToRelative(52.5f, 52.5f, 0.0f, false, false, -11.1f, -13.6f)
                lineToRelative(10.5f, -15.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -1.5f, -8.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.3f, 1.5f)
                lineToRelative(-10.5f, 15.0f)
                arcToRelative(53.6f, 53.6f, 0.0f, false, false, -29.3f, -6.5f)
                lineToRelative(-3.2f, -18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.8f, 2.0f)
                lineToRelative(3.2f, 18.1f)
                arcTo(52.3f, 52.3f, 0.0f, false, false, 47.5f, 68.3f)
                lineToRelative(-15.0f, -10.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -6.9f, 9.8f)
                lineToRelative(15.0f, 10.5f)
                arcToRelative(53.5f, 53.5f, 0.0f, false, false, -6.5f, 29.3f)
                lineToRelative(-18.0f, 3.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -4.9f, 6.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.9f, 5.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(18.1f, -3.2f)
                arcToRelative(53.5f, 53.5f, 0.0f, false, false, 7.1f, 15.1f)
                arcTo(49.5f, 49.5f, 0.0f, false, false, 26.0f, 172.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, false, 50.0f, 50.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, false, 0.0f, -148.0f)
                close()
                moveTo(46.7f, 111.4f)
                horizontalLineToRelative(-0.1f)
                verticalLineToRelative(-0.2f)
                arcTo(41.9f, 41.9f, 0.0f, false, true, 53.5f, 80.0f)
                horizontalLineToRelative(0.1f)
                curveToRelative(0.0f, -0.1f, 0.1f, -0.1f, 0.1f, -0.2f)
                arcToRelative(41.5f, 41.5f, 0.0f, false, true, 26.9f, -17.0f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, 0.1f, -0.1f)
                horizontalLineToRelative(0.2f)
                arcToRelative(42.1f, 42.1f, 0.0f, false, true, 30.7f, 6.6f)
                lineToRelative(0.5f, 0.4f)
                lineToRelative(0.4f, 0.3f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 11.0f, 11.6f)
                arcToRelative(74.6f, 74.6f, 0.0f, false, false, -37.2f, 41.6f)
                arcTo(50.7f, 50.7f, 0.0f, false, false, 76.0f, 122.0f)
                arcToRelative(49.8f, 49.8f, 0.0f, false, false, -22.8f, 5.5f)
                arcTo(40.6f, 40.6f, 0.0f, false, true, 46.7f, 111.4f)
                close()
                moveTo(156.0f, 210.0f)
                horizontalLineTo(76.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, true, 0.0f, -76.0f)
                arcToRelative(35.1f, 35.1f, 0.0f, false, true, 7.2f, 0.7f)
                arcTo(73.1f, 73.1f, 0.0f, false, false, 82.0f, 148.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(62.0f, 62.0f, 0.0f, true, true, 62.0f, 62.0f)
                close()
            }
        }
        .build()
        return _cloudSun!!
    }

private var _cloudSun: ImageVector? = null
