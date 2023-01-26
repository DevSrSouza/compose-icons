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

public val TwotoneGroup.AccessAlarms: ImageVector
    get() {
        if (_accessAlarms != null) {
            return _accessAlarms!!
        }
        _accessAlarms = Builder(name = "AccessAlarms", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveToRelative(-3.9f, 0.0f, -7.0f, 3.1f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.1f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.1f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.1f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(15.7f, 16.9f)
                lineTo(11.0f, 14.0f)
                lineTo(11.0f, 8.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(5.3f)
                lineToRelative(4.0f, 2.4f)
                lineToRelative(-0.8f, 1.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 5.7f)
                lineToRelative(-4.6f, -3.9f)
                lineToRelative(-1.3f, 1.5f)
                lineToRelative(4.6f, 3.9f)
                close()
                moveTo(12.5f, 8.0f)
                lineTo(11.0f, 8.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(4.7f, 2.9f)
                lineToRelative(0.8f, -1.2f)
                lineToRelative(-4.0f, -2.4f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(-5.0f, 0.0f, -9.0f, 4.0f, -9.0f, 9.0f)
                reflectiveCurveToRelative(4.0f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.0f, 9.0f, -9.0f)
                reflectiveCurveToRelative(-4.0f, -9.0f, -9.0f, -9.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-3.9f, 0.0f, -7.0f, -3.1f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.1f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.1f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-3.1f, 7.0f, -7.0f, 7.0f)
                close()
                moveTo(7.9f, 3.4f)
                lineTo(6.6f, 1.9f)
                lineTo(2.0f, 5.7f)
                lineToRelative(1.3f, 1.5f)
                close()
            }
        }
        .build()
        return _accessAlarms!!
    }

private var _accessAlarms: ImageVector? = null
