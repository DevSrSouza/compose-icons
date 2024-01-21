package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.LocationArrow: ImageVector
    get() {
        if (_locationArrow != null) {
            return _locationArrow!!
        }
        _locationArrow = Builder(name = "LocationArrow", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(429.6f, 92.1f)
                curveToRelative(4.9f, -11.9f, 2.1f, -25.6f, -7.0f, -34.7f)
                reflectiveCurveToRelative(-22.8f, -11.9f, -34.7f, -7.0f)
                lineToRelative(-352.0f, 144.0f)
                curveToRelative(-14.2f, 5.8f, -22.2f, 20.8f, -19.3f, 35.8f)
                reflectiveCurveToRelative(16.1f, 25.8f, 31.4f, 25.8f)
                horizontalLineTo(224.0f)
                verticalLineTo(432.0f)
                curveToRelative(0.0f, 15.3f, 10.8f, 28.4f, 25.8f, 31.4f)
                reflectiveCurveToRelative(30.0f, -5.1f, 35.8f, -19.3f)
                lineToRelative(144.0f, -352.0f)
                close()
            }
        }
        .build()
        return _locationArrow!!
    }

private var _locationArrow: ImageVector? = null
