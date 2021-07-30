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

public val BrandsGroup.RProject: ImageVector
    get() {
        if (_rProject != null) {
            return _rProject!!
        }
        _rProject = Builder(name = "RProject", defaultWidth = 581.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 581.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(581.0f, 226.6f)
                curveTo(581.0f, 119.1f, 450.9f, 32.0f, 290.5f, 32.0f)
                reflectiveCurveTo(0.0f, 119.1f, 0.0f, 226.6f)
                curveTo(0.0f, 322.4f, 103.3f, 402.0f, 239.4f, 418.1f)
                lineTo(239.4f, 480.0f)
                horizontalLineToRelative(99.1f)
                verticalLineToRelative(-61.5f)
                curveToRelative(24.3f, -2.7f, 47.6f, -7.4f, 69.4f, -13.9f)
                lineTo(448.0f, 480.0f)
                horizontalLineToRelative(112.0f)
                lineToRelative(-67.4f, -113.7f)
                curveToRelative(54.5f, -35.4f, 88.4f, -84.9f, 88.4f, -139.7f)
                close()
                moveTo(114.2f, 241.1f)
                curveToRelative(0.0f, -73.5f, 98.9f, -133.0f, 220.8f, -133.0f)
                reflectiveCurveToRelative(211.9f, 40.7f, 211.9f, 133.0f)
                curveToRelative(0.0f, 50.1f, -26.5f, 85.0f, -70.3f, 106.4f)
                curveToRelative(-2.4f, -1.6f, -4.7f, -2.9f, -6.4f, -3.7f)
                curveToRelative(-10.2f, -5.2f, -27.8f, -10.5f, -27.8f, -10.5f)
                reflectiveCurveToRelative(86.6f, -6.4f, 86.6f, -92.7f)
                reflectiveCurveToRelative(-90.6f, -87.9f, -90.6f, -87.9f)
                horizontalLineToRelative(-199.0f)
                lineTo(239.4f, 361.0f)
                curveToRelative(-74.1f, -21.5f, -125.2f, -67.1f, -125.2f, -119.9f)
                close()
                moveTo(339.3f, 279.4f)
                verticalLineToRelative(-55.6f)
                curveToRelative(57.8f, 0.0f, 87.8f, -6.8f, 87.8f, 27.3f)
                curveToRelative(0.0f, 36.5f, -38.2f, 28.3f, -87.8f, 28.3f)
                close()
                moveTo(338.4f, 351.9f)
                lineTo(365.0f, 351.9f)
                curveToRelative(10.8f, 0.0f, 18.9f, 11.7f, 24.0f, 19.2f)
                curveToRelative(-16.1f, 1.9f, -33.0f, 2.8f, -50.6f, 2.9f)
                verticalLineToRelative(-22.1f)
                close()
            }
        }
        .build()
        return _rProject!!
    }

private var _rProject: ImageVector? = null
