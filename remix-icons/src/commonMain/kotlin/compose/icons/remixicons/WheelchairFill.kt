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

public val RemixIcons.WheelchairFill: ImageVector
    get() {
        if (_wheelchairFill != null) {
            return _wheelchairFill!!
        }
        _wheelchairFill = Builder(name = "WheelchairFill", defaultWidth = 24.0.dp, defaultHeight =
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
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.434f)
                curveToRelative(0.648f, 0.0f, 1.253f, 0.314f, 1.626f, 0.836f)
                lineToRelative(0.089f, 0.135f)
                lineToRelative(2.708f, 4.515f)
                lineToRelative(-1.714f, 1.028f)
                lineTo(16.433f, 17.0f)
                lineTo(12.0f, 17.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveTo(13.38f, 7.0f, 12.0f, 7.0f)
                reflectiveCurveTo(9.5f, 5.88f, 9.5f, 4.5f)
                reflectiveCurveTo(10.62f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _wheelchairFill!!
    }

private var _wheelchairFill: ImageVector? = null
