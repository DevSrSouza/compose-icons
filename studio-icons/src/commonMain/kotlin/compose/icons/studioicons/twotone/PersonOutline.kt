package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.PersonOutline: ImageVector
    get() {
        if (_personOutline != null) {
            return _personOutline!!
        }
        _personOutline = Builder(name = "PersonOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                moveToRelative(-2.1f, 0.0f)
                arcToRelative(2.1f, 2.1f, 0.0f, true, true, 4.2f, 0.0f)
                arcToRelative(2.1f, 2.1f, 0.0f, true, true, -4.2f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 14.9f)
                curveToRelative(-2.97f, 0.0f, -6.1f, 1.46f, -6.1f, 2.1f)
                verticalLineToRelative(1.1f)
                horizontalLineToRelative(12.2f)
                verticalLineTo(17.0f)
                curveToRelative(0.0f, -0.64f, -3.13f, -2.1f, -6.1f, -2.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f)
                close()
                moveTo(18.1f, 18.1f)
                lineTo(5.9f, 18.1f)
                lineTo(5.9f, 17.0f)
                curveToRelative(0.0f, -0.64f, 3.13f, -2.1f, 6.1f, -2.1f)
                reflectiveCurveToRelative(6.1f, 1.46f, 6.1f, 2.1f)
                verticalLineToRelative(1.1f)
                close()
                moveTo(12.0f, 12.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f)
                close()
                moveTo(12.0f, 5.9f)
                curveToRelative(1.16f, 0.0f, 2.1f, 0.94f, 2.1f, 2.1f)
                curveToRelative(0.0f, 1.16f, -0.94f, 2.1f, -2.1f, 2.1f)
                reflectiveCurveTo(9.9f, 9.16f, 9.9f, 8.0f)
                curveToRelative(0.0f, -1.16f, 0.94f, -2.1f, 2.1f, -2.1f)
                close()
            }
        }
        .build()
        return _personOutline!!
    }

private var _personOutline: ImageVector? = null
