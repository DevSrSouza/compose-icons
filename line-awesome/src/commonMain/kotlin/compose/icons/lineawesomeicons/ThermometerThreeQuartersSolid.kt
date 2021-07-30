package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.ThermometerThreeQuartersSolid: ImageVector
    get() {
        if (_thermometerThreeQuartersSolid != null) {
            return _thermometerThreeQuartersSolid!!
        }
        _thermometerThreeQuartersSolid = Builder(name = "ThermometerThreeQuartersSolid",
                defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth = 32.0f,
                viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                verticalLineToRelative(11.5f)
                curveToRelative(-1.8f, 1.3f, -3.0f, 3.2f, -3.0f, 5.5f)
                curveToRelative(0.0f, 3.9f, 3.1f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.1f, 7.0f, -7.0f)
                curveToRelative(0.0f, -2.3f, -1.3f, -4.3f, -3.0f, -5.5f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(14.0f, 6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(10.4f)
                lineToRelative(0.5f, 0.3f)
                curveTo(20.0f, 17.6f, 21.0f, 19.1f, 21.0f, 21.0f)
                curveToRelative(0.0f, 2.8f, -2.2f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.2f, -5.0f, -5.0f)
                curveToRelative(0.0f, -1.9f, 1.0f, -3.4f, 2.5f, -4.3f)
                lineToRelative(0.5f, -0.3f)
                verticalLineTo(6.0f)
                close()
                moveTo(15.0f, 10.0f)
                verticalLineToRelative(8.2f)
                curveToRelative(-1.2f, 0.4f, -2.0f, 1.5f, -2.0f, 2.8f)
                curveToRelative(0.0f, 1.7f, 1.3f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.3f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.3f, -0.8f, -2.4f, -2.0f, -2.8f)
                verticalLineTo(10.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _thermometerThreeQuartersSolid!!
    }

private var _thermometerThreeQuartersSolid: ImageVector? = null
