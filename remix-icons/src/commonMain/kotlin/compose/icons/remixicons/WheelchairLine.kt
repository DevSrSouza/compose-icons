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

public val RemixIcons.WheelchairLine: ImageVector
    get() {
        if (_wheelchairLine != null) {
            return _wheelchairLine!!
        }
        _wheelchairLine = Builder(name = "WheelchairLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 10.341f)
                verticalLineToRelative(2.194f)
                curveTo(6.804f, 13.227f, 6.0f, 14.52f, 6.0f, 16.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                curveToRelative(1.48f, 0.0f, 2.773f, -0.804f, 3.465f, -2.0f)
                horizontalLineToRelative(2.193f)
                curveToRelative(-0.823f, 2.33f, -3.046f, 4.0f, -5.658f, 4.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, -2.686f, -6.0f, -6.0f)
                curveToRelative(0.0f, -2.613f, 1.67f, -4.835f, 4.0f, -5.659f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.044f, 0.534f, -1.964f, 1.343f, -2.501f)
                curveTo(9.533f, 6.964f, 9.0f, 6.044f, 9.0f, 5.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                curveToRelative(0.0f, 1.044f, -0.534f, 1.964f, -1.343f, 2.501f)
                curveTo(14.467f, 8.036f, 15.0f, 8.956f, 15.0f, 10.0f)
                verticalLineToRelative(4.999f)
                lineToRelative(1.434f, 0.001f)
                curveToRelative(0.648f, 0.0f, 1.253f, 0.314f, 1.626f, 0.836f)
                lineToRelative(0.089f, 0.135f)
                lineToRelative(2.708f, 4.515f)
                lineToRelative(-1.714f, 1.028f)
                lineTo(16.433f, 17.0f)
                lineTo(15.0f, 16.999f)
                lineTo(12.0f, 17.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.999f)
                lineTo(13.0f, 10.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _wheelchairLine!!
    }

private var _wheelchairLine: ImageVector? = null
