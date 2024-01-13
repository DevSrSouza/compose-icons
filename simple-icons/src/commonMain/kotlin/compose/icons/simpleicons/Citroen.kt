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

public val SimpleIcons.Citroen: ImageVector
    get() {
        if (_citroen != null) {
            return _citroen!!
        }
        _citroen = Builder(name = "Citroen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(6.684f, 0.0f, 2.292f, 5.38f, 2.292f, 12.0f)
                reflectiveCurveTo(6.652f, 24.0f, 12.0f, 24.0f)
                curveToRelative(5.347f, 0.0f, 9.708f, -5.38f, 9.708f, -12.0f)
                reflectiveCurveTo(17.316f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(4.106f, 16.233f)
                curveToRelative(-0.19f, -0.604f, -0.35f, -1.241f, -0.414f, -1.878f)
                lineTo(12.0f, 8.18f)
                lineToRelative(8.371f, 6.175f)
                arcToRelative(12.334f, 12.334f, 0.0f, false, true, -0.413f, 1.878f)
                verticalLineToRelative(0.032f)
                horizontalLineToRelative(-0.032f)
                lineTo(12.0f, 10.345f)
                close()
                moveTo(5.029f, 18.334f)
                lineTo(4.997f, 18.302f)
                lineTo(12.0f, 13.114f)
                lineToRelative(7.003f, 5.188f)
                verticalLineToRelative(0.032f)
                curveToRelative(-1.655f, 2.897f, -4.202f, 4.616f, -6.987f, 4.616f)
                reflectiveCurveToRelative(-5.363f, -1.751f, -6.987f, -4.616f)
                close()
                moveTo(12.0f, 5.347f)
                lineToRelative(-8.53f, 6.335f)
                verticalLineToRelative(-0.032f)
                curveToRelative(0.063f, -2.674f, 0.954f, -5.284f, 2.61f, -7.385f)
                curveTo(7.67f, 2.324f, 9.772f, 1.21f, 12.0f, 1.21f)
                curveToRelative(2.228f, 0.0f, 4.36f, 1.114f, 5.92f, 3.055f)
                curveToRelative(1.56f, 1.942f, 2.515f, 4.616f, 2.61f, 7.417f)
                verticalLineToRelative(0.032f)
                lineToRelative(-0.031f, -0.032f)
                close()
            }
        }
        .build()
        return _citroen!!
    }

private var _citroen: ImageVector? = null
