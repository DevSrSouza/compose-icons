package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.UserEdit: ImageVector
    get() {
        if (_userEdit != null) {
            return _userEdit!!
        }
        _userEdit = Builder(name = "UserEdit", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 256.0f)
                curveToRelative(70.7f, 0.0f, 128.0f, -57.3f, 128.0f, -128.0f)
                reflectiveCurveTo(294.7f, 0.0f, 224.0f, 0.0f)
                reflectiveCurveTo(96.0f, 57.3f, 96.0f, 128.0f)
                reflectiveCurveToRelative(57.3f, 128.0f, 128.0f, 128.0f)
                close()
                moveTo(313.6f, 288.0f)
                horizontalLineToRelative(-16.7f)
                curveToRelative(-22.2f, 10.2f, -46.9f, 16.0f, -72.9f, 16.0f)
                reflectiveCurveToRelative(-50.6f, -5.8f, -72.9f, -16.0f)
                horizontalLineToRelative(-16.7f)
                curveTo(60.2f, 288.0f, 0.0f, 348.2f, 0.0f, 422.4f)
                lineTo(0.0f, 464.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(274.9f)
                curveToRelative(-2.4f, -6.8f, -3.4f, -14.0f, -2.6f, -21.3f)
                lineToRelative(6.8f, -60.9f)
                lineToRelative(1.2f, -11.1f)
                lineToRelative(7.9f, -7.9f)
                lineToRelative(77.3f, -77.3f)
                curveToRelative(-24.5f, -27.7f, -60.0f, -45.5f, -99.9f, -45.5f)
                close()
                moveTo(358.9f, 433.3f)
                lineToRelative(-6.8f, 61.0f)
                curveToRelative(-1.1f, 10.2f, 7.5f, 18.8f, 17.6f, 17.6f)
                lineToRelative(60.9f, -6.8f)
                lineToRelative(137.9f, -137.9f)
                lineToRelative(-71.7f, -71.7f)
                lineToRelative(-137.9f, 137.8f)
                close()
                moveTo(633.0f, 268.9f)
                lineTo(595.1f, 231.0f)
                curveToRelative(-9.3f, -9.3f, -24.5f, -9.3f, -33.8f, 0.0f)
                lineToRelative(-37.8f, 37.8f)
                lineToRelative(-4.1f, 4.1f)
                lineToRelative(71.8f, 71.7f)
                lineToRelative(41.8f, -41.8f)
                curveToRelative(9.3f, -9.4f, 9.3f, -24.5f, 0.0f, -33.9f)
                close()
            }
        }
        .build()
        return _userEdit!!
    }

private var _userEdit: ImageVector? = null
