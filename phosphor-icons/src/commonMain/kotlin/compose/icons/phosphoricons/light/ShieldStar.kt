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

public val LightGroup.ShieldStar: ImageVector
    get() {
        if (_shieldStar != null) {
            return _shieldStar!!
        }
        _shieldStar = Builder(name = "ShieldStar", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 42.0f)
                lineTo(48.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 56.0f)
                verticalLineToRelative(58.7f)
                curveToRelative(0.0f, 88.0f, 74.7f, 117.3f, 89.7f, 122.2f)
                arcToRelative(13.6f, 13.6f, 0.0f, false, false, 8.6f, 0.0f)
                curveToRelative(15.0f, -4.9f, 89.7f, -34.2f, 89.7f, -122.2f)
                lineTo(222.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 42.0f)
                close()
                moveTo(210.0f, 114.7f)
                curveToRelative(0.0f, 79.8f, -67.8f, 106.3f, -81.4f, 110.8f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, -1.2f, 0.0f)
                curveTo(113.8f, 221.0f, 46.0f, 194.5f, 46.0f, 114.7f)
                lineTo(46.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(208.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(171.7f, 121.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -3.8f, 7.5f)
                lineToRelative(-30.2f, 9.9f)
                lineToRelative(18.7f, 25.6f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -1.4f, 8.4f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, true, -3.5f, 1.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -4.8f, -2.5f)
                lineTo(128.0f, 146.2f)
                lineToRelative(-18.7f, 25.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -4.8f, 2.5f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, true, -3.5f, -1.2f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -1.4f, -8.4f)
                lineToRelative(18.7f, -25.6f)
                lineToRelative(-30.2f, -9.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.7f, -11.4f)
                lineToRelative(30.2f, 9.8f)
                lineTo(122.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(31.7f)
                lineToRelative(30.2f, -9.8f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 171.7f, 121.8f)
                close()
            }
        }
        .build()
        return _shieldStar!!
    }

private var _shieldStar: ImageVector? = null
