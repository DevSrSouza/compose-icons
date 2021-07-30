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

public val BrandsGroup.JediOrder: ImageVector
    get() {
        if (_jediOrder != null) {
            return _jediOrder!!
        }
        _jediOrder = Builder(name = "JediOrder", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(398.5f, 373.6f)
                curveToRelative(95.9f, -122.1f, 17.2f, -233.1f, 17.2f, -233.1f)
                curveToRelative(45.4f, 85.8f, -41.4f, 170.5f, -41.4f, 170.5f)
                curveToRelative(105.0f, -171.5f, -60.5f, -271.5f, -60.5f, -271.5f)
                curveToRelative(96.9f, 72.7f, -10.1f, 190.7f, -10.1f, 190.7f)
                curveToRelative(85.8f, 158.4f, -68.6f, 230.1f, -68.6f, 230.1f)
                reflectiveCurveToRelative(-0.4f, -16.9f, -2.2f, -85.7f)
                curveToRelative(4.3f, 4.5f, 34.5f, 36.2f, 34.5f, 36.2f)
                lineToRelative(-24.2f, -47.4f)
                lineToRelative(62.6f, -9.1f)
                lineToRelative(-62.6f, -9.1f)
                lineToRelative(20.2f, -55.5f)
                lineToRelative(-31.4f, 45.9f)
                curveToRelative(-2.2f, -87.7f, -7.8f, -305.1f, -7.9f, -306.9f)
                verticalLineToRelative(-2.4f)
                verticalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                verticalLineToRelative(2.4f)
                curveToRelative(0.0f, 1.0f, -5.6f, 219.0f, -7.9f, 306.9f)
                lineToRelative(-31.4f, -45.9f)
                lineToRelative(20.2f, 55.5f)
                lineToRelative(-62.6f, 9.1f)
                lineToRelative(62.6f, 9.1f)
                lineToRelative(-24.2f, 47.4f)
                lineToRelative(34.5f, -36.2f)
                curveToRelative(-1.8f, 68.8f, -2.2f, 85.7f, -2.2f, 85.7f)
                reflectiveCurveToRelative(-154.4f, -71.7f, -68.6f, -230.1f)
                curveToRelative(0.0f, 0.0f, -107.0f, -118.1f, -10.1f, -190.7f)
                curveToRelative(0.0f, 0.0f, -165.5f, 99.9f, -60.5f, 271.5f)
                curveToRelative(0.0f, 0.0f, -86.8f, -84.8f, -41.4f, -170.5f)
                curveToRelative(0.0f, 0.0f, -78.7f, 111.0f, 17.2f, 233.1f)
                curveToRelative(0.0f, 0.0f, -26.2f, -16.1f, -49.4f, -77.7f)
                curveToRelative(0.0f, 0.0f, 16.9f, 183.3f, 222.0f, 185.7f)
                horizontalLineToRelative(4.1f)
                curveToRelative(205.0f, -2.4f, 222.0f, -185.7f, 222.0f, -185.7f)
                curveToRelative(-23.6f, 61.5f, -49.9f, 77.7f, -49.9f, 77.7f)
                close()
            }
        }
        .build()
        return _jediOrder!!
    }

private var _jediOrder: ImageVector? = null
