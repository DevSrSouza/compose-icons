package compose.icons.lineaicons.weather

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
import compose.icons.lineaicons.WeatherGroup

public val WeatherGroup.CloudDrop: ImageVector
    get() {
        if (_cloudDrop != null) {
            return _cloudDrop!!
        }
        _cloudDrop = Builder(name = "CloudDrop", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 40.0f)
                horizontalLineToRelative(-7.0f)
                curveTo(5.292f, 40.0f, 1.0f, 35.708f, 1.0f, 30.0f)
                reflectiveCurveToRelative(4.292f, -11.0f, 10.0f, -11.0f)
                curveToRelative(0.835f, 0.0f, 2.0f, 0.0f, 2.0f, 0.0f)
                curveTo(14.8f, 9.423f, 23.898f, 3.0f, 34.0f, 3.0f)
                curveToRelative(11.414f, 0.0f, 21.0f, 8.586f, 21.0f, 20.0f)
                curveToRelative(4.565f, 0.0f, 8.0f, 4.435f, 8.0f, 9.0f)
                curveToRelative(0.0f, 4.565f, -3.435f, 8.0f, -8.0f, 8.0f)
                horizontalLineTo(45.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.0f, 42.0f)
                curveToRelative(0.0f, 5.034f, 4.136f, 8.0f, 9.0f, 8.0f)
                curveToRelative(4.864f, 0.0f, 8.0f, -2.966f, 8.0f, -8.0f)
                curveToRelative(0.0f, -7.0f, -8.0f, -17.0f, -8.0f, -17.0f)
                reflectiveCurveTo(23.0f, 35.0f, 23.0f, 42.0f)
                close()
            }
        }
        .build()
        return _cloudDrop!!
    }

private var _cloudDrop: ImageVector? = null
