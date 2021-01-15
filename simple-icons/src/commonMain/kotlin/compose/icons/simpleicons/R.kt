package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.R: ImageVector
    get() {
        if (_r != null) {
            return _r!!
        }
        _r = Builder(name = "R", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.82f)
                curveToRelative(-6.627f, 0.0f, -12.0f, -3.598f, -12.0f, -8.037f)
                reflectiveCurveToRelative(5.373f, -8.037f, 12.0f, -8.037f)
                reflectiveCurveToRelative(12.0f, 3.599f, 12.0f, 8.037f)
                reflectiveCurveToRelative(-5.373f, 8.037f, -12.0f, 8.037f)
                close()
                moveTo(13.837f, 5.888f)
                curveToRelative(-5.038f, 0.0f, -9.121f, 2.46f, -9.121f, 5.495f)
                reflectiveCurveToRelative(4.083f, 5.494f, 9.12f, 5.494f)
                reflectiveCurveToRelative(8.756f, -1.682f, 8.756f, -5.494f)
                reflectiveCurveToRelative(-3.718f, -5.495f, -8.755f, -5.495f)
                close()
                moveTo(18.275f, 15.194f)
                arcToRelative(9.038f, 9.038f, 0.0f, false, true, 1.149f, 0.433f)
                arcToRelative(2.221f, 2.221f, 0.0f, false, true, 0.582f, 0.416f)
                arcToRelative(1.573f, 1.573f, 0.0f, false, true, 0.266f, 0.383f)
                lineToRelative(2.863f, 4.826f)
                lineToRelative(-4.627f, 0.002f)
                lineToRelative(-2.163f, -4.063f)
                arcToRelative(5.229f, 5.229f, 0.0f, false, false, -0.716f, -0.982f)
                arcToRelative(0.753f, 0.753f, 0.0f, false, false, -0.549f, -0.25f)
                horizontalLineToRelative(-1.099f)
                verticalLineToRelative(5.292f)
                lineToRelative(-4.093f, 0.001f)
                lineTo(9.888f, 7.737f)
                horizontalLineToRelative(8.221f)
                reflectiveCurveToRelative(3.744f, 0.067f, 3.744f, 3.63f)
                arcToRelative(3.822f, 3.822f, 0.0f, false, true, -3.578f, 3.827f)
                close()
                moveTo(16.495f, 10.668f)
                lineToRelative(-2.479f, -0.001f)
                verticalLineToRelative(2.298f)
                horizontalLineToRelative(2.479f)
                arcToRelative(1.134f, 1.134f, 0.0f, false, false, 1.148f, -1.17f)
                arcToRelative(1.07f, 1.07f, 0.0f, false, false, -1.148f, -1.127f)
                close()
            }
        }
        .build()
        return _r!!
    }

private var _r: ImageVector? = null
