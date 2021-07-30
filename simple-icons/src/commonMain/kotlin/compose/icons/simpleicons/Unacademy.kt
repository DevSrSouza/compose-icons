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

public val SimpleIcons.Unacademy: ImageVector
    get() {
        if (_unacademy != null) {
            return _unacademy!!
        }
        _unacademy = Builder(name = "Unacademy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.715f, 2.188f)
                arcToRelative(0.696f, 0.696f, 0.0f, false, false, -0.711f, 0.713f)
                lineTo(0.0f, 2.901f)
                lineToRelative(0.002f, 0.027f)
                curveToRelative(-0.01f, 0.306f, 0.03f, 0.658f, 0.123f, 1.081f)
                curveToRelative(0.905f, 5.546f, 5.875f, 9.788f, 11.87f, 9.788f)
                curveToRelative(5.935f, 0.0f, 10.864f, -4.157f, 11.84f, -9.622f)
                curveToRelative(0.126f, -0.512f, 0.177f, -0.921f, 0.162f, -1.273f)
                arcToRelative(0.696f, 0.696f, 0.0f, false, false, -0.713f, -0.714f)
                close()
                moveTo(11.958f, 16.008f)
                curveToRelative(-2.967f, 0.0f, -5.432f, 2.079f, -5.92f, 4.81f)
                arcToRelative(2.287f, 2.287f, 0.0f, false, false, -0.08f, 0.638f)
                curveToRelative(0.0f, 0.201f, 0.15f, 0.356f, 0.355f, 0.356f)
                horizontalLineToRelative(11.285f)
                arcToRelative(0.348f, 0.348f, 0.0f, false, false, 0.356f, -0.356f)
                horizontalLineToRelative(0.002f)
                verticalLineToRelative(-0.014f)
                arcToRelative(2.21f, 2.21f, 0.0f, false, false, -0.063f, -0.54f)
                curveToRelative(-0.453f, -2.774f, -2.938f, -4.894f, -5.935f, -4.894f)
                close()
            }
        }
        .build()
        return _unacademy!!
    }

private var _unacademy: ImageVector? = null
