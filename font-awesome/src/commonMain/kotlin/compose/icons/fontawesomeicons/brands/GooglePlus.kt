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

public val BrandsGroup.GooglePlus: ImageVector
    get() {
        if (_googlePlus != null) {
            return _googlePlus!!
        }
        _googlePlus = Builder(name = "GooglePlus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 8.0f)
                curveTo(119.1f, 8.0f, 8.0f, 119.1f, 8.0f, 256.0f)
                reflectiveCurveTo(119.1f, 504.0f, 256.0f, 504.0f)
                reflectiveCurveTo(504.0f, 392.9f, 504.0f, 256.0f)
                reflectiveCurveTo(392.9f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(185.3f, 380.0f)
                arcToRelative(124.0f, 124.0f, 0.0f, false, true, 0.0f, -248.0f)
                curveToRelative(31.3f, 0.0f, 60.1f, 11.0f, 83.0f, 32.3f)
                lineToRelative(-33.6f, 32.6f)
                curveToRelative(-13.2f, -12.9f, -31.3f, -19.1f, -49.4f, -19.1f)
                curveToRelative(-42.9f, 0.0f, -77.2f, 35.5f, -77.2f, 78.1f)
                reflectiveCurveTo(142.3f, 334.0f, 185.3f, 334.0f)
                curveToRelative(32.6f, 0.0f, 64.9f, -19.1f, 70.1f, -53.3f)
                horizontalLineTo(185.3f)
                verticalLineTo(238.1f)
                horizontalLineTo(302.2f)
                arcToRelative(109.2f, 109.2f, 0.0f, false, true, 1.9f, 20.7f)
                curveToRelative(0.0f, 70.8f, -47.5f, 121.2f, -118.8f, 121.2f)
                close()
                moveTo(415.5f, 273.8f)
                verticalLineToRelative(35.5f)
                horizontalLineTo(380.0f)
                verticalLineTo(273.8f)
                horizontalLineTo(344.5f)
                verticalLineTo(238.3f)
                horizontalLineTo(380.0f)
                verticalLineTo(202.8f)
                horizontalLineToRelative(35.5f)
                verticalLineToRelative(35.5f)
                horizontalLineToRelative(35.2f)
                verticalLineToRelative(35.5f)
                close()
            }
        }
        .build()
        return _googlePlus!!
    }

private var _googlePlus: ImageVector? = null
