package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.XboxLine: ImageVector
    get() {
        if (_xboxLine != null) {
            return _xboxLine!!
        }
        _xboxLine = Builder(name = "XboxLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.797f, 15.485f)
                curveToRelative(1.124f, -2.52f, 3.2f, -5.44f, 4.487f, -6.962f)
                curveToRelative(-1.248f, -1.246f, -2.162f, -1.931f, -2.818f, -2.3f)
                arcTo(7.977f, 7.977f, 0.0f, false, false, 4.0f, 12.0f)
                curveToRelative(0.0f, 1.25f, 0.286f, 2.432f, 0.797f, 3.485f)
                close()
                moveTo(8.848f, 4.645f)
                curveTo(10.448f, 5.05f, 12.0f, 5.959f, 12.0f, 5.959f)
                verticalLineToRelative(-0.005f)
                reflectiveCurveToRelative(1.552f, -0.904f, 3.151f, -1.31f)
                arcTo(7.974f, 7.974f, 0.0f, false, false, 12.0f, 4.0f)
                curveToRelative(-1.12f, 0.0f, -2.185f, 0.23f, -3.152f, 0.645f)
                close()
                moveTo(17.534f, 6.223f)
                curveToRelative(-0.655f, 0.37f, -1.568f, 1.055f, -2.816f, 2.3f)
                curveToRelative(1.287f, 1.523f, 3.362f, 4.441f, 4.486f, 6.961f)
                arcTo(7.968f, 7.968f, 0.0f, false, false, 20.0f, 12.0f)
                curveToRelative(0.0f, -2.27f, -0.946f, -4.32f, -2.466f, -5.777f)
                close()
                moveTo(17.942f, 17.356f)
                curveToRelative(-1.403f, -2.236f, -4.09f, -4.944f, -5.942f, -6.343f)
                curveToRelative(-1.85f, 1.4f, -4.539f, 4.108f, -5.941f, 6.345f)
                arcTo(7.98f, 7.98f, 0.0f, false, false, 12.0f, 20.0f)
                arcToRelative(7.98f, 7.98f, 0.0f, false, false, 5.942f, -2.644f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
            }
        }
        .build()
        return _xboxLine!!
    }

private var _xboxLine: ImageVector? = null
