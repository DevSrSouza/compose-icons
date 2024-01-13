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

public val SolidGroup.DrumstickBite: ImageVector
    get() {
        if (_drumstickBite != null) {
            return _drumstickBite!!
        }
        _drumstickBite = Builder(name = "DrumstickBite", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 265.2f)
                curveToRelative(0.0f, 8.5f, -3.4f, 16.6f, -9.4f, 22.6f)
                lineToRelative(-26.8f, 26.8f)
                curveToRelative(-12.3f, 12.3f, -32.5f, 11.4f, -49.4f, 7.2f)
                curveTo(69.8f, 320.6f, 65.0f, 320.0f, 60.0f, 320.0f)
                curveToRelative(-33.1f, 0.0f, -60.0f, 26.9f, -60.0f, 60.0f)
                reflectiveCurveToRelative(26.9f, 60.0f, 60.0f, 60.0f)
                curveToRelative(6.3f, 0.0f, 12.0f, 5.7f, 12.0f, 12.0f)
                curveToRelative(0.0f, 33.1f, 26.9f, 60.0f, 60.0f, 60.0f)
                reflectiveCurveToRelative(60.0f, -26.9f, 60.0f, -60.0f)
                curveToRelative(0.0f, -5.0f, -0.6f, -9.8f, -1.8f, -14.5f)
                curveToRelative(-4.2f, -16.9f, -5.2f, -37.1f, 7.2f, -49.4f)
                lineToRelative(26.8f, -26.8f)
                curveToRelative(6.0f, -6.0f, 14.1f, -9.4f, 22.6f, -9.4f)
                horizontalLineTo(336.0f)
                curveToRelative(6.3f, 0.0f, 12.4f, -0.3f, 18.5f, -1.0f)
                curveToRelative(11.9f, -1.2f, 16.4f, -15.5f, 10.8f, -26.0f)
                curveToRelative(-8.5f, -15.8f, -13.3f, -33.8f, -13.3f, -53.0f)
                curveToRelative(0.0f, -61.9f, 50.1f, -112.0f, 112.0f, -112.0f)
                curveToRelative(8.0f, 0.0f, 15.7f, 0.8f, 23.2f, 2.4f)
                curveToRelative(11.7f, 2.5f, 24.1f, -5.9f, 22.0f, -17.6f)
                curveTo(494.5f, 62.5f, 422.5f, 0.0f, 336.0f, 0.0f)
                curveTo(238.8f, 0.0f, 160.0f, 78.8f, 160.0f, 176.0f)
                verticalLineToRelative(89.2f)
                close()
            }
        }
        .build()
        return _drumstickBite!!
    }

private var _drumstickBite: ImageVector? = null
