package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Tablecheck: ImageVector
    get() {
        if (_tablecheck != null) {
            return _tablecheck!!
        }
        _tablecheck = Builder(name = "Tablecheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.9139f, 3.8281f)
                lineTo(7.2482f, 0.1639f)
                curveTo(7.1253f, 0.0411f, 6.8783f, -0.001f, 6.7133f, 0.0411f)
                curveTo(3.7531f, 1.3603f, 1.3793f, 3.7181f, 0.0408f, 6.6687f)
                arcToRelative(0.449f, 0.449f, 0.0f, false, false, 0.1241f, 0.5346f)
                lineTo(3.8294f, 10.8675f)
                curveToRelative(0.1241f, 0.124f, 0.371f, 0.0819f, 0.412f, -0.1228f)
                arcToRelative(7.9088f, 7.9088f, 0.0f, false, true, 2.2163f, -4.3304f)
                arcToRelative(7.9145f, 7.9145f, 0.0f, false, true, 4.3322f, -2.2153f)
                curveToRelative(0.1651f, 0.0f, 0.247f, -0.2468f, 0.1241f, -0.3709f)
                close()
                moveTo(20.18f, 10.9084f)
                lineTo(23.8458f, 7.2442f)
                curveToRelative(0.1229f, -0.1228f, 0.165f, -0.3697f, 0.1228f, -0.5346f)
                curveToRelative(-1.3199f, -2.9585f, -3.6788f, -5.3309f, -6.6303f, -6.6685f)
                arcToRelative(0.4496f, 0.4496f, 0.0f, false, false, -0.2884f, -0.0297f)
                arcToRelative(0.4494f, 0.4494f, 0.0f, false, false, -0.2465f, 0.1525f)
                lineTo(13.1377f, 3.8281f)
                curveToRelative(-0.1241f, 0.1228f, -0.0819f, 0.3709f, 0.1229f, 0.4118f)
                arcToRelative(7.9147f, 7.9147f, 0.0f, false, true, 4.3322f, 2.2153f)
                arcToRelative(7.909f, 7.909f, 0.0f, false, true, 2.2162f, 4.3304f)
                curveToRelative(0.0f, 0.1638f, 0.2482f, 0.2468f, 0.371f, 0.1228f)
                close()
                moveTo(23.8458f, 16.7954f)
                lineTo(20.18f, 13.0903f)
                curveToRelative(-0.1228f, -0.1228f, -0.3698f, -0.0819f, -0.4119f, 0.124f)
                curveToRelative(-0.5349f, 3.3355f, -3.1707f, 6.0099f, -6.5485f, 6.5457f)
                curveToRelative(-0.2048f, 0.041f, -0.2879f, 0.2878f, -0.1229f, 0.4118f)
                lineToRelative(3.6658f, 3.663f)
                curveToRelative(0.1228f, 0.124f, 0.3698f, 0.165f, 0.5348f, 0.124f)
                curveToRelative(2.9486f, -1.3214f, 5.3084f, -3.6802f, 6.6304f, -6.6275f)
                curveToRelative(0.1241f, -0.2059f, 0.0831f, -0.4118f, -0.0819f, -0.5359f)
                close()
                moveTo(3.8306f, 13.0903f)
                lineTo(0.1637f, 16.7954f)
                curveToRelative(-0.1241f, 0.1241f, -0.165f, 0.3709f, -0.1241f, 0.5359f)
                curveToRelative(1.322f, 2.9473f, 3.6818f, 5.3061f, 6.6304f, 6.6275f)
                arcToRelative(0.4487f, 0.4487f, 0.0f, false, false, 0.2892f, 0.0296f)
                arcToRelative(0.4492f, 0.4492f, 0.0f, false, false, 0.2468f, -0.1536f)
                lineToRelative(3.6657f, -3.663f)
                curveToRelative(0.1229f, -0.124f, 0.082f, -0.3708f, -0.124f, -0.4118f)
                curveToRelative(-1.641f, -0.2653f, -3.1568f, -1.0404f, -4.3322f, -2.2153f)
                arcToRelative(7.9088f, 7.9088f, 0.0f, false, true, -2.2162f, -4.3304f)
                curveToRelative(0.0f, -0.1649f, -0.247f, -0.2468f, -0.371f, -0.124f)
                horizontalLineToRelative(0.0024f)
                close()
            }
        }
        .build()
        return _tablecheck!!
    }

private var _tablecheck: ImageVector? = null
