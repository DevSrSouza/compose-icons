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

public val TwotoneGroup.WaterDamage: ImageVector
    get() {
        if (_waterDamage != null) {
            return _waterDamage!!
        }
        _waterDamage = Builder(name = "WaterDamage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 5.69f)
                lineToRelative(-5.0f, 4.5f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-7.81f)
                lineTo(12.0f, 5.69f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                curveToRelative(0.0f, -1.1f, 2.0f, -4.0f, 2.0f, -4.0f)
                reflectiveCurveToRelative(2.0f, 2.9f, 2.0f, 4.0f)
                curveTo(14.0f, 15.1f, 13.1f, 16.0f, 12.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                lineTo(2.0f, 12.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(3.0f)
                lineTo(12.0f, 3.0f)
                close()
                moveTo(7.0f, 18.0f)
                verticalLineToRelative(-7.81f)
                lineToRelative(5.0f, -4.5f)
                lineToRelative(5.0f, 4.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(14.0f, 14.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                curveToRelative(0.0f, -1.1f, 2.0f, -4.0f, 2.0f, -4.0f)
                reflectiveCurveTo(14.0f, 12.9f, 14.0f, 14.0f)
                close()
            }
        }
        .build()
        return _waterDamage!!
    }

private var _waterDamage: ImageVector? = null
