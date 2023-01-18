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

public val BoldGroup.CloudSun: ImageVector
    get() {
        if (_cloudSun != null) {
            return _cloudSun!!
        }
        _cloudSun = Builder(name = "CloudSun", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 68.0f)
                arcToRelative(79.9f, 79.9f, 0.0f, false, false, -18.4f, 2.2f)
                arcToRelative(75.8f, 75.8f, 0.0f, false, false, -6.0f, -7.5f)
                lineToRelative(7.5f, -10.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -19.6f, -13.8f)
                lineToRelative(-7.6f, 10.8f)
                arcTo(60.3f, 60.3f, 0.0f, false, false, 89.6f, 44.0f)
                lineTo(87.3f, 31.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -23.6f, 4.2f)
                lineToRelative(2.3f, 13.0f)
                arcTo(59.1f, 59.1f, 0.0f, false, false, 46.7f, 60.4f)
                lineTo(35.9f, 52.9f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 22.1f, 72.5f)
                lineToRelative(10.8f, 7.6f)
                arcTo(60.8f, 60.8f, 0.0f, false, false, 28.0f, 102.4f)
                lineToRelative(-13.0f, 2.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 2.1f, 23.8f)
                lineToRelative(2.1f, -0.2f)
                lineToRelative(13.0f, -2.3f)
                arcToRelative(68.9f, 68.9f, 0.0f, false, false, 3.4f, 7.3f)
                arcTo(55.9f, 55.9f, 0.0f, false, false, 76.0f, 228.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 0.0f, -160.0f)
                close()
                moveTo(81.5f, 68.6f)
                horizontalLineToRelative(0.4f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, true, 26.2f, 5.6f)
                lineToRelative(0.5f, 0.4f)
                lineToRelative(0.7f, 0.4f)
                arcToRelative(38.7f, 38.7f, 0.0f, false, true, 5.2f, 4.7f)
                arcToRelative(80.7f, 80.7f, 0.0f, false, false, -32.0f, 36.8f)
                arcTo(46.3f, 46.3f, 0.0f, false, false, 76.0f, 116.0f)
                arcToRelative(56.8f, 56.8f, 0.0f, false, false, -20.3f, 3.8f)
                arcToRelative(33.5f, 33.5f, 0.0f, false, true, -3.1f, -9.4f)
                curveToRelative(0.0f, -0.1f, 0.0f, -0.1f, -0.1f, -0.2f)
                lineTo(52.5f, 110.0f)
                arcToRelative(35.7f, 35.7f, 0.0f, false, true, 5.9f, -26.5f)
                curveToRelative(0.0f, -0.1f, 0.1f, -0.1f, 0.1f, -0.2f)
                horizontalLineToRelative(0.1f)
                arcTo(35.6f, 35.6f, 0.0f, false, true, 81.5f, 68.6f)
                close()
                moveTo(156.0f, 204.0f)
                lineTo(76.0f, 204.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, -64.0f)
                horizontalLineToRelative(0.4f)
                arcToRelative(70.3f, 70.3f, 0.0f, false, false, -0.4f, 8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 56.0f, 56.0f)
                close()
            }
        }
        .build()
        return _cloudSun!!
    }

private var _cloudSun: ImageVector? = null
