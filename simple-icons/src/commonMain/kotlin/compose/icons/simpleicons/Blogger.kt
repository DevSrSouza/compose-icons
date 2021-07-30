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

public val SimpleIcons.Blogger: ImageVector
    get() {
        if (_blogger != null) {
            return _blogger!!
        }
        _blogger = Builder(name = "Blogger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.976f, 24.0f)
                lineTo(2.026f, 24.0f)
                curveTo(0.9f, 24.0f, 0.0f, 23.1f, 0.0f, 21.976f)
                lineTo(0.0f, 2.026f)
                curveTo(0.0f, 0.9f, 0.9f, 0.0f, 2.025f, 0.0f)
                lineTo(22.05f, 0.0f)
                curveTo(23.1f, 0.0f, 24.0f, 0.9f, 24.0f, 2.025f)
                verticalLineToRelative(19.95f)
                curveTo(24.0f, 23.1f, 23.1f, 24.0f, 21.976f, 24.0f)
                close()
                moveTo(12.0f, 3.975f)
                lineTo(9.0f, 3.975f)
                curveToRelative(-2.775f, 0.0f, -5.025f, 2.25f, -5.025f, 5.025f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.774f, 2.25f, 5.024f, 5.025f, 5.024f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.774f, 0.0f, 5.024f, -2.25f, 5.024f, -5.024f)
                verticalLineToRelative(-3.975f)
                curveToRelative(0.0f, -0.6f, -0.45f, -1.05f, -1.05f, -1.05f)
                lineTo(18.0f, 9.975f)
                curveToRelative(-0.524f, 0.0f, -0.976f, -0.45f, -0.976f, -0.976f)
                curveToRelative(0.0f, -2.776f, -2.25f, -5.026f, -5.024f, -5.026f)
                close()
                moveTo(15.074f, 15.975f)
                lineTo(9.0f, 15.975f)
                curveToRelative(-0.525f, 0.0f, -0.975f, -0.45f, -0.975f, -0.975f)
                reflectiveCurveToRelative(0.45f, -0.976f, 0.975f, -0.976f)
                horizontalLineToRelative(6.074f)
                curveToRelative(0.526f, 0.0f, 0.977f, 0.45f, 0.977f, 0.976f)
                reflectiveCurveToRelative(-0.45f, 0.976f, -0.975f, 0.976f)
                close()
                moveTo(12.524f, 8.025f)
                curveToRelative(0.527f, 0.0f, 0.976f, 0.45f, 0.976f, 0.975f)
                reflectiveCurveToRelative(-0.45f, 0.975f, -0.975f, 0.975f)
                horizontalLineToRelative(-3.6f)
                curveToRelative(-0.525f, 0.0f, -0.976f, -0.45f, -0.976f, -0.975f)
                reflectiveCurveToRelative(0.45f, -0.975f, 0.975f, -0.975f)
                horizontalLineToRelative(3.6f)
                close()
            }
        }
        .build()
        return _blogger!!
    }

private var _blogger: ImageVector? = null
