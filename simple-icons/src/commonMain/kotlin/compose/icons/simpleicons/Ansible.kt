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

public val SimpleIcons.Ansible: ImageVector
    get() {
        if (_ansible != null) {
            return _ansible!!
        }
        _ansible = Builder(name = "Ansible", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.617f, 11.473f)
                lineToRelative(4.686f, 3.695f)
                lineToRelative(-3.102f, -7.662f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.371f, 0.0f, 0.0f, 5.371f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.371f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.371f, 12.0f, -12.0f)
                reflectiveCurveTo(18.629f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(17.797f, 17.305f)
                curveToRelative(-0.011f, 0.471f, -0.403f, 0.842f, -0.875f, 0.83f)
                curveToRelative(-0.236f, 0.0f, -0.416f, -0.09f, -0.664f, -0.293f)
                lineToRelative(-6.19f, -5.0f)
                lineToRelative(-2.079f, 5.203f)
                lineTo(6.191f, 18.045f)
                lineTo(11.438f, 5.44f)
                curveToRelative(0.124f, -0.314f, 0.427f, -0.52f, 0.764f, -0.506f)
                curveToRelative(0.326f, -0.014f, 0.63f, 0.189f, 0.742f, 0.506f)
                lineToRelative(4.774f, 11.494f)
                curveToRelative(0.045f, 0.111f, 0.08f, 0.234f, 0.08f, 0.348f)
                curveToRelative(-0.001f, 0.009f, -0.001f, 0.009f, -0.001f, 0.023f)
                close()
            }
        }
        .build()
        return _ansible!!
    }

private var _ansible: ImageVector? = null
