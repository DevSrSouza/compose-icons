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

public val LightGroup.MaskHappy: ImageVector
    get() {
        if (_maskHappy != null) {
            return _maskHappy!!
        }
        _maskHappy = Builder(name = "MaskHappy", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.4f, 124.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.5f, 8.5f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, -4.0f, 1.5f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -4.5f, -2.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -26.8f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.0f, -8.0f)
                arcToRelative(30.1f, 30.1f, 0.0f, false, true, 44.8f, 0.0f)
                close()
                moveTo(105.4f, 132.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 4.5f, 2.0f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 4.0f, -1.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.5f, -8.5f)
                arcToRelative(30.1f, 30.1f, 0.0f, false, false, -44.8f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.0f, 8.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 26.8f, 0.0f)
                close()
                moveTo(151.2f, 171.0f)
                arcToRelative(41.9f, 41.9f, 0.0f, false, true, -46.4f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.7f, 10.0f)
                arcToRelative(54.2f, 54.2f, 0.0f, false, false, 59.8f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.7f, -10.0f)
                close()
                moveTo(222.0f, 48.3f)
                lineTo(222.0f, 104.0f)
                curveToRelative(0.0f, 35.4f, -9.5f, 68.7f, -26.8f, 93.9f)
                reflectiveCurveTo(153.5f, 238.0f, 128.0f, 238.0f)
                reflectiveCurveToRelative(-49.4f, -14.2f, -67.2f, -40.1f)
                reflectiveCurveTo(34.0f, 139.4f, 34.0f, 104.0f)
                lineTo(34.0f, 48.3f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 19.1f, -13.0f)
                curveTo(67.2f, 40.8f, 95.9f, 50.0f, 128.0f, 50.0f)
                reflectiveCurveToRelative(60.8f, -9.2f, 74.9f, -14.7f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 19.1f, 13.0f)
                close()
                moveTo(210.0f, 48.3f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, false, -0.9f, -1.6f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -1.8f, -0.2f)
                curveTo(192.3f, 52.3f, 162.1f, 62.0f, 128.0f, 62.0f)
                reflectiveCurveTo(63.7f, 52.3f, 48.7f, 46.5f)
                lineToRelative(-0.7f, -0.2f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, -1.1f, 0.4f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, false, -0.9f, 1.6f)
                lineTo(46.0f, 104.0f)
                curveToRelative(0.0f, 67.3f, 36.8f, 122.0f, 82.0f, 122.0f)
                reflectiveCurveToRelative(82.0f, -54.7f, 82.0f, -122.0f)
                close()
            }
        }
        .build()
        return _maskHappy!!
    }

private var _maskHappy: ImageVector? = null
