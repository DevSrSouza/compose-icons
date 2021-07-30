package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.OdnoklassnikiSquare: ImageVector
    get() {
        if (_odnoklassnikiSquare != null) {
            return _odnoklassnikiSquare!!
        }
        _odnoklassnikiSquare = Builder(name = "OdnoklassnikiSquare", defaultWidth = 448.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.2f, 177.1f)
                curveToRelative(0.0f, -22.1f, 17.9f, -40.0f, 39.8f, -40.0f)
                reflectiveCurveToRelative(39.8f, 17.9f, 39.8f, 40.0f)
                curveToRelative(0.0f, 22.0f, -17.9f, 39.8f, -39.8f, 39.8f)
                reflectiveCurveToRelative(-39.8f, -17.9f, -39.8f, -39.8f)
                close()
                moveTo(448.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineTo(48.0f, 480.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineTo(0.0f, 80.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                close()
                moveTo(142.9f, 177.1f)
                curveToRelative(0.0f, 44.6f, 36.4f, 80.9f, 81.1f, 80.9f)
                reflectiveCurveToRelative(81.1f, -36.2f, 81.1f, -80.9f)
                curveToRelative(0.0f, -44.8f, -36.4f, -81.1f, -81.1f, -81.1f)
                reflectiveCurveToRelative(-81.1f, 36.2f, -81.1f, 81.1f)
                close()
                moveTo(317.4f, 267.8f)
                curveToRelative(-4.6f, -9.1f, -17.3f, -16.8f, -34.1f, -3.6f)
                curveToRelative(0.0f, 0.0f, -22.7f, 18.0f, -59.3f, 18.0f)
                reflectiveCurveToRelative(-59.3f, -18.0f, -59.3f, -18.0f)
                curveToRelative(-16.8f, -13.2f, -29.5f, -5.5f, -34.1f, 3.6f)
                curveToRelative(-7.9f, 16.1f, 1.1f, 23.7f, 21.4f, 37.0f)
                curveToRelative(17.3f, 11.1f, 41.2f, 15.2f, 56.6f, 16.8f)
                lineToRelative(-12.9f, 12.9f)
                curveToRelative(-18.2f, 18.0f, -35.5f, 35.5f, -47.7f, 47.7f)
                curveToRelative(-17.6f, 17.6f, 10.7f, 45.8f, 28.4f, 28.6f)
                lineToRelative(47.7f, -47.9f)
                curveToRelative(18.2f, 18.2f, 35.7f, 35.7f, 47.7f, 47.9f)
                curveToRelative(17.6f, 17.2f, 46.0f, -10.7f, 28.6f, -28.6f)
                lineToRelative(-47.7f, -47.7f)
                lineToRelative(-13.0f, -12.9f)
                curveToRelative(15.5f, -1.6f, 39.1f, -5.9f, 56.2f, -16.8f)
                curveToRelative(20.4f, -13.3f, 29.3f, -21.0f, 21.5f, -37.0f)
                close()
            }
        }
        .build()
        return _odnoklassnikiSquare!!
    }

private var _odnoklassnikiSquare: ImageVector? = null
