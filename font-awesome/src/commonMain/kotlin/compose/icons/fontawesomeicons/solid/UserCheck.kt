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

public val SolidGroup.UserCheck: ImageVector
    get() {
        if (_userCheck != null) {
            return _userCheck!!
        }
        _userCheck = Builder(name = "UserCheck", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
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
                horizontalLineToRelative(352.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                verticalLineToRelative(-41.6f)
                curveToRelative(0.0f, -74.2f, -60.2f, -134.4f, -134.4f, -134.4f)
                close()
                moveTo(636.6f, 159.6f)
                lineToRelative(-27.8f, -28.1f)
                curveToRelative(-4.6f, -4.7f, -12.1f, -4.7f, -16.8f, -0.1f)
                lineToRelative(-104.8f, 104.0f)
                lineToRelative(-45.5f, -45.8f)
                curveToRelative(-4.6f, -4.7f, -12.1f, -4.7f, -16.8f, -0.1f)
                lineToRelative(-28.1f, 27.9f)
                curveToRelative(-4.7f, 4.6f, -4.7f, 12.1f, -0.1f, 16.8f)
                lineToRelative(81.7f, 82.3f)
                curveToRelative(4.6f, 4.7f, 12.1f, 4.7f, 16.8f, 0.1f)
                lineToRelative(141.3f, -140.2f)
                curveToRelative(4.6f, -4.7f, 4.7f, -12.2f, 0.1f, -16.8f)
                close()
            }
        }
        .build()
        return _userCheck!!
    }

private var _userCheck: ImageVector? = null
