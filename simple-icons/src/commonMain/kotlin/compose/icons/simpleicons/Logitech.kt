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

public val SimpleIcons.Logitech: ImageVector
    get() {
        if (_logitech != null) {
            return _logitech!!
        }
        _logitech = Builder(name = "Logitech", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 5.098f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, true, -1.35f, 1.35f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, true, -1.352f, -1.35f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, true, 1.351f, -1.351f)
                arcTo(1.35f, 1.35f, 0.0f, false, true, 24.0f, 5.097f)
                close()
                moveTo(16.549f, 18.31f)
                arcToRelative(2.289f, 2.289f, 0.0f, false, true, -2.322f, -2.322f)
                lineTo(12.2f, 15.988f)
                curveToRelative(0.0f, 2.449f, 1.9f, 4.264f, 4.306f, 4.264f)
                reflectiveCurveToRelative(4.348f, -1.857f, 4.348f, -4.264f)
                lineTo(18.87f, 15.988f)
                curveToRelative(-0.043f, 1.351f, -1.056f, 2.322f, -2.322f, 2.322f)
                close()
                moveTo(21.657f, 15.482f)
                horizontalLineToRelative(1.984f)
                lineTo(23.641f, 7.377f)
                horizontalLineToRelative(-1.984f)
                close()
                moveTo(0.0f, 15.483f)
                horizontalLineToRelative(1.984f)
                lineTo(1.984f, 4.0f)
                lineTo(0.0f, 4.0f)
                verticalLineToRelative(11.483f)
                close()
                moveTo(7.135f, 7.124f)
                curveToRelative(-2.449f, 0.0f, -4.307f, 1.858f, -4.307f, 4.264f)
                arcToRelative(4.27f, 4.27f, 0.0f, false, false, 4.307f, 4.306f)
                curveToRelative(2.406f, 0.0f, 4.306f, -1.858f, 4.306f, -4.264f)
                reflectiveCurveTo(9.583f, 7.124f, 7.135f, 7.124f)
                close()
                moveTo(7.135f, 13.752f)
                curveToRelative(-1.31f, 0.0f, -2.322f, -1.013f, -2.322f, -2.364f)
                arcToRelative(2.289f, 2.289f, 0.0f, false, true, 2.322f, -2.322f)
                arcToRelative(2.289f, 2.289f, 0.0f, false, true, 2.321f, 2.322f)
                curveToRelative(0.0f, 1.309f, -0.97f, 2.364f, -2.321f, 2.364f)
                close()
                moveTo(20.77f, 8.982f)
                lineTo(20.77f, 7.377f)
                horizontalLineToRelative(-2.828f)
                curveToRelative(-0.464f, -0.21f, -0.929f, -0.253f, -1.393f, -0.253f)
                curveToRelative(-2.449f, 0.0f, -4.348f, 1.858f, -4.348f, 4.306f)
                curveToRelative(0.0f, 2.449f, 1.9f, 4.264f, 4.306f, 4.264f)
                reflectiveCurveToRelative(4.306f, -1.858f, 4.306f, -4.264f)
                curveToRelative(0.0f, -0.844f, -0.254f, -1.604f, -0.676f, -2.195f)
                close()
                moveTo(16.549f, 13.752f)
                curveToRelative(-1.309f, 0.0f, -2.322f, -1.013f, -2.322f, -2.364f)
                arcToRelative(2.289f, 2.289f, 0.0f, false, true, 2.322f, -2.322f)
                arcToRelative(2.289f, 2.289f, 0.0f, false, true, 2.322f, 2.322f)
                curveToRelative(0.0f, 1.309f, -1.056f, 2.364f, -2.322f, 2.364f)
                close()
            }
        }
        .build()
        return _logitech!!
    }

private var _logitech: ImageVector? = null
