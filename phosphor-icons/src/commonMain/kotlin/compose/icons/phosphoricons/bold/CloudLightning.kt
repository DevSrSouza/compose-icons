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

public val BoldGroup.CloudLightning: ImageVector
    get() {
        if (_cloudLightning != null) {
            return _cloudLightning!!
        }
        _cloudLightning = Builder(name = "CloudLightning", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 172.0f)
                arcTo(80.0f, 80.0f, 0.0f, true, false, 82.5f, 60.4f)
                arcTo(46.3f, 46.3f, 0.0f, false, false, 76.0f, 60.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 0.0f, 112.0f)
                horizontalLineToRelative(32.0f)
                lineTo(94.0f, 193.4f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -0.6f, 12.3f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 104.0f, 212.0f)
                horizontalLineToRelative(28.0f)
                lineToRelative(-14.0f, 21.4f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 3.4f, 16.6f)
                arcToRelative(11.4f, 11.4f, 0.0f, false, false, 6.6f, 2.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 10.0f, -5.4f)
                lineToRelative(26.3f, -40.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 0.5f, -12.3f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -10.6f, -6.3f)
                horizontalLineToRelative(-28.0f)
                lineToRelative(10.5f, -16.0f)
                close()
                moveTo(44.0f, 116.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 76.0f, 84.0f)
                horizontalLineToRelative(0.4f)
                arcToRelative(70.3f, 70.3f, 0.0f, false, false, -0.4f, 8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 56.0f, 56.0f)
                horizontalLineTo(76.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 44.0f, 116.0f)
                close()
            }
        }
        .build()
        return _cloudLightning!!
    }

private var _cloudLightning: ImageVector? = null
