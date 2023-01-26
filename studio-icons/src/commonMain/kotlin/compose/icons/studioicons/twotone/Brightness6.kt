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

public val TwotoneGroup.Brightness6: ImageVector
    get() {
        if (_brightness6 != null) {
            return _brightness6!!
        }
        _brightness6 = Builder(name = "Brightness6", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 9.52f)
                lineTo(18.0f, 6.0f)
                horizontalLineToRelative(-3.52f)
                lineTo(12.0f, 3.52f)
                lineTo(9.52f, 6.0f)
                lineTo(6.0f, 6.0f)
                verticalLineToRelative(3.52f)
                lineTo(3.52f, 12.0f)
                lineTo(6.0f, 14.48f)
                lineTo(6.0f, 18.0f)
                horizontalLineToRelative(3.52f)
                lineTo(12.0f, 20.48f)
                lineTo(14.48f, 18.0f)
                lineTo(18.0f, 18.0f)
                verticalLineToRelative(-3.52f)
                lineTo(20.48f, 12.0f)
                lineTo(18.0f, 9.52f)
                close()
                moveTo(12.0f, 17.5f)
                verticalLineToRelative(-11.0f)
                curveToRelative(3.03f, 0.0f, 5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.69f)
                lineTo(20.0f, 4.0f)
                horizontalLineToRelative(-4.69f)
                lineTo(12.0f, 0.69f)
                lineTo(8.69f, 4.0f)
                lineTo(4.0f, 4.0f)
                verticalLineToRelative(4.69f)
                lineTo(0.69f, 12.0f)
                lineTo(4.0f, 15.31f)
                lineTo(4.0f, 20.0f)
                horizontalLineToRelative(4.69f)
                lineTo(12.0f, 23.31f)
                lineTo(15.31f, 20.0f)
                lineTo(20.0f, 20.0f)
                verticalLineToRelative(-4.69f)
                lineTo(23.31f, 12.0f)
                lineTo(20.0f, 8.69f)
                close()
                moveTo(18.0f, 14.48f)
                lineTo(18.0f, 18.0f)
                horizontalLineToRelative(-3.52f)
                lineTo(12.0f, 20.48f)
                lineTo(9.52f, 18.0f)
                lineTo(6.0f, 18.0f)
                verticalLineToRelative(-3.52f)
                lineTo(3.52f, 12.0f)
                lineTo(6.0f, 9.52f)
                lineTo(6.0f, 6.0f)
                horizontalLineToRelative(3.52f)
                lineTo(12.0f, 3.52f)
                lineTo(14.48f, 6.0f)
                lineTo(18.0f, 6.0f)
                verticalLineToRelative(3.52f)
                lineTo(20.48f, 12.0f)
                lineTo(18.0f, 14.48f)
                close()
                moveTo(12.0f, 6.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(3.03f, 0.0f, 5.5f, -2.47f, 5.5f, -5.5f)
                reflectiveCurveTo(15.03f, 6.5f, 12.0f, 6.5f)
                close()
            }
        }
        .build()
        return _brightness6!!
    }

private var _brightness6: ImageVector? = null
