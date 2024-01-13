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

public val SimpleIcons.Adonisjs: ImageVector
    get() {
        if (_adonisjs != null) {
            return _adonisjs!!
        }
        _adonisjs = Builder(name = "Adonisjs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.0f)
                curveToRelative(0.0f, 9.68f, 2.32f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -2.32f, 12.0f, -12.0f)
                reflectiveCurveTo(21.68f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(0.0f, 2.32f, 0.0f, 12.0f)
                close()
                moveTo(4.84f, 14.492f)
                lineTo(8.602f, 5.937f)
                curveTo(9.238f, 4.498f, 10.46f, 3.716f, 12.0f, 3.716f)
                curveToRelative(1.54f, 0.0f, 2.762f, 0.781f, 3.398f, 2.223f)
                lineToRelative(3.762f, 8.554f)
                curveToRelative(0.172f, 0.418f, 0.32f, 0.953f, 0.32f, 1.418f)
                curveToRelative(0.0f, 2.125f, -1.492f, 3.617f, -3.617f, 3.617f)
                curveToRelative(-0.726f, 0.0f, -1.3f, -0.183f, -1.883f, -0.37f)
                curveToRelative(-0.597f, -0.192f, -1.203f, -0.387f, -1.98f, -0.387f)
                curveToRelative(-0.77f, 0.0f, -1.39f, 0.195f, -1.996f, 0.386f)
                curveToRelative(-0.59f, 0.188f, -1.168f, 0.371f, -1.867f, 0.371f)
                curveToRelative(-2.125f, 0.0f, -3.617f, -1.492f, -3.617f, -3.617f)
                curveToRelative(0.0f, -0.465f, 0.148f, -1.0f, 0.32f, -1.418f)
                close()
                moveTo(12.0f, 7.43f)
                lineToRelative(-3.715f, 8.406f)
                curveToRelative(1.102f, -0.512f, 2.371f, -0.758f, 3.715f, -0.758f)
                curveToRelative(1.297f, 0.0f, 2.613f, 0.246f, 3.664f, 0.758f)
                close()
            }
        }
        .build()
        return _adonisjs!!
    }

private var _adonisjs: ImageVector? = null
