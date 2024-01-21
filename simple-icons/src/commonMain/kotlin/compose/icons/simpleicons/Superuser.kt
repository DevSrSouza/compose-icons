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

public val SimpleIcons.Superuser: ImageVector
    get() {
        if (_superuser != null) {
            return _superuser!!
        }
        _superuser = Builder(name = "Superuser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.523f, 0.0f)
                curveToRelative(-0.223f, 0.0f, -0.336f, 0.111f, -0.336f, 0.28f)
                verticalLineToRelative(23.439f)
                curveToRelative(0.0f, 0.196f, 0.113f, 0.252f, 0.336f, 0.252f)
                horizontalLineToRelative(5.594f)
                curveToRelative(0.224f, 0.0f, 0.335f, -0.084f, 0.307f, -0.252f)
                verticalLineToRelative(-1.483f)
                curveToRelative(0.0f, -0.167f, -0.14f, -0.252f, -0.363f, -0.252f)
                lineTo(5.543f, 21.984f)
                curveToRelative(-0.252f, 0.0f, -0.363f, -0.083f, -0.363f, -0.279f)
                lineTo(5.18f, 2.293f)
                curveToRelative(0.0f, -0.196f, 0.112f, -0.307f, 0.42f, -0.307f)
                horizontalLineToRelative(2.488f)
                curveToRelative(0.224f, 0.0f, 0.336f, -0.056f, 0.336f, -0.252f)
                lineTo(8.424f, 0.28f)
                curveTo(8.424f, 0.084f, 8.284f, 0.0f, 8.06f, 0.0f)
                lineTo(2.523f, 0.0f)
                close()
                moveTo(11.323f, 0.02f)
                curveToRelative(-0.224f, 0.0f, -0.364f, 0.083f, -0.364f, 0.279f)
                verticalLineToRelative(1.398f)
                curveToRelative(0.0f, 0.196f, 0.112f, 0.28f, 0.336f, 0.28f)
                horizontalLineToRelative(0.447f)
                curveToRelative(2.154f, 0.0f, 3.664f, 1.706f, 3.664f, 3.412f)
                verticalLineToRelative(4.42f)
                curveToRelative(0.0f, 1.37f, 0.98f, 2.517f, 2.518f, 3.216f)
                curveToRelative(0.112f, 0.056f, 0.139f, 0.14f, 0.139f, 0.196f)
                curveToRelative(0.0f, 0.056f, -0.027f, 0.112f, -0.14f, 0.14f)
                curveToRelative(-1.677f, 0.616f, -2.517f, 2.294f, -2.517f, 3.496f)
                verticalLineToRelative(3.916f)
                curveToRelative(0.0f, 1.735f, -1.51f, 1.258f, -3.664f, 1.258f)
                horizontalLineToRelative(-0.447f)
                curveToRelative(-0.224f, 0.0f, -0.336f, 0.084f, -0.336f, 0.28f)
                verticalLineToRelative(1.398f)
                curveToRelative(0.0f, 0.196f, 0.14f, 0.28f, 0.363f, 0.28f)
                horizontalLineToRelative(0.56f)
                curveToRelative(3.609f, 0.0f, 6.516f, 0.335f, 6.516f, -2.714f)
                verticalLineToRelative(-4.082f)
                curveToRelative(0.0f, -1.426f, 1.008f, -2.295f, 2.49f, -2.714f)
                curveToRelative(0.672f, -0.196f, 0.95f, -0.307f, 0.923f, -0.56f)
                verticalLineToRelative(-1.173f)
                curveToRelative(0.0f, -0.447f, -0.308f, -0.477f, -0.868f, -0.644f)
                curveToRelative(-1.51f, -0.532f, -2.515f, -1.342f, -2.515f, -2.74f)
                lineTo(18.428f, 5.64f)
                curveToRelative(0.0f, -3.05f, -2.937f, -5.621f, -6.545f, -5.621f)
                horizontalLineToRelative(-0.56f)
                close()
                moveTo(11.506f, 8.416f)
                curveToRelative(-0.336f, 0.0f, -0.645f, 0.252f, -0.645f, 0.588f)
                verticalLineToRelative(1.342f)
                curveToRelative(0.0f, 0.307f, 0.281f, 0.588f, 0.645f, 0.588f)
                horizontalLineToRelative(1.482f)
                curveToRelative(0.336f, 0.0f, 0.643f, -0.253f, 0.643f, -0.588f)
                lineTo(13.631f, 9.004f)
                curveToRelative(0.0f, -0.308f, -0.28f, -0.588f, -0.643f, -0.588f)
                horizontalLineToRelative(-1.482f)
                close()
            }
        }
        .build()
        return _superuser!!
    }

private var _superuser: ImageVector? = null
