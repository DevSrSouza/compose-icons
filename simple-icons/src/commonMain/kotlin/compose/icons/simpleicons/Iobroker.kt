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

public val SimpleIcons.Iobroker: ImageVector
    get() {
        if (_iobroker != null) {
            return _iobroker!!
        }
        _iobroker = Builder(name = "Iobroker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(-0.61f, 0.0f, -1.201f, 0.044f, -1.787f, 0.133f)
                verticalLineToRelative(3.285f)
                arcToRelative(8.943f, 8.943f, 0.0f, false, true, 3.574f, 0.004f)
                verticalLineTo(0.139f)
                arcTo(11.83f, 11.83f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(9.38f, 0.295f)
                curveTo(4.084f, 1.5f, 0.13f, 6.283f, 0.13f, 12.0f)
                curveTo(0.129f, 18.628f, 5.44f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveToRelative(11.871f, -5.372f, 11.871f, -12.0f)
                curveToRelative(0.0f, -5.717f, -3.953f, -10.499f, -9.246f, -11.705f)
                verticalLineToRelative(3.34f)
                curveToRelative(3.575f, 1.113f, 6.18f, 4.44f, 6.18f, 8.365f)
                curveToRelative(0.0f, 4.83f, -3.949f, 8.76f, -8.8f, 8.76f)
                curveToRelative(-4.85f, 0.0f, -8.804f, -3.93f, -8.804f, -8.76f)
                curveToRelative(0.0f, -3.924f, 2.605f, -7.247f, 6.18f, -8.365f)
                verticalLineTo(0.295f)
                close()
                moveTo(12.0f, 4.137f)
                curveToRelative(-0.616f, 0.0f, -1.212f, 0.068f, -1.783f, 0.2f)
                verticalLineTo(19.53f)
                arcTo(7.887f, 7.887f, 0.0f, false, false, 12.0f, 19.73f)
                curveToRelative(0.616f, 0.0f, 1.211f, -0.068f, 1.787f, -0.2f)
                verticalLineTo(4.343f)
                arcTo(7.65f, 7.65f, 0.0f, false, false, 12.0f, 4.137f)
                close()
            }
        }
        .build()
        return _iobroker!!
    }

private var _iobroker: ImageVector? = null
