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

public val SimpleIcons.Automattic: ImageVector
    get() {
        if (_automattic != null) {
            return _automattic!!
        }
        _automattic = Builder(name = "Automattic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.521f, 8.11f)
                arcToRelative(1.497f, 1.497f, 0.0f, false, true, 0.433f, 2.102f)
                lineToRelative(-3.511f, 5.441f)
                arcToRelative(1.496f, 1.496f, 0.0f, false, true, -2.068f, 0.457f)
                arcToRelative(1.507f, 1.507f, 0.0f, false, true, -0.44f, -2.08f)
                lineToRelative(3.513f, -5.44f)
                curveToRelative(0.215f, -0.335f, 0.554f, -0.57f, 0.943f, -0.655f)
                curveToRelative(0.39f, -0.085f, 0.796f, -0.04f, 1.13f, 0.175f)
                close()
                moveTo(11.98f, 23.03f)
                curveTo(4.713f, 23.03f, 0.0f, 17.79f, 0.0f, 12.338f)
                verticalLineToRelative(-0.676f)
                curveTo(0.0f, 6.117f, 4.713f, 0.97f, 11.98f, 0.97f)
                curveTo(19.246f, 0.97f, 24.0f, 6.117f, 24.0f, 11.662f)
                verticalLineToRelative(0.676f)
                curveToRelative(0.0f, 5.453f, -4.713f, 10.692f, -12.02f, 10.692f)
                close()
                moveTo(20.113f, 11.72f)
                curveToRelative(0.0f, -3.974f, -2.888f, -7.51f, -8.133f, -7.51f)
                curveToRelative(-5.245f, 0.0f, -8.087f, 3.542f, -8.087f, 7.51f)
                verticalLineToRelative(0.497f)
                curveToRelative(0.0f, 3.974f, 2.888f, 7.578f, 8.087f, 7.578f)
                curveToRelative(5.198f, 0.0f, 8.133f, -3.604f, 8.133f, -7.578f)
                verticalLineToRelative(-0.497f)
                close()
            }
        }
        .build()
        return _automattic!!
    }

private var _automattic: ImageVector? = null
