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

public val SolidGroup.UserTag: ImageVector
    get() {
        if (_userTag != null) {
            return _userTag!!
        }
        _userTag = Builder(name = "UserTag", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(630.6f, 364.9f)
                lineToRelative(-90.3f, -90.2f)
                curveToRelative(-12.0f, -12.0f, -28.3f, -18.7f, -45.3f, -18.7f)
                horizontalLineToRelative(-79.3f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(79.2f)
                curveToRelative(0.0f, 17.0f, 6.7f, 33.2f, 18.7f, 45.2f)
                lineToRelative(90.3f, 90.2f)
                curveToRelative(12.5f, 12.5f, 32.8f, 12.5f, 45.3f, 0.0f)
                lineToRelative(92.5f, -92.5f)
                curveToRelative(12.6f, -12.5f, 12.6f, -32.7f, 0.1f, -45.2f)
                close()
                moveTo(447.8f, 343.9f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                curveToRelative(0.0f, 13.2f, -10.7f, 24.0f, -24.0f, 24.0f)
                close()
                moveTo(224.0f, 255.9f)
                curveToRelative(70.7f, 0.0f, 128.0f, -57.3f, 128.0f, -128.0f)
                curveTo(352.0f, 57.3f, 294.7f, 0.0f, 224.0f, 0.0f)
                reflectiveCurveTo(96.0f, 57.3f, 96.0f, 128.0f)
                curveToRelative(0.0f, 70.6f, 57.3f, 127.9f, 128.0f, 127.9f)
                close()
                moveTo(351.8f, 367.1f)
                lineTo(351.8f, 294.0f)
                curveToRelative(-12.2f, -3.6f, -24.9f, -6.2f, -38.2f, -6.2f)
                horizontalLineToRelative(-16.7f)
                curveToRelative(-22.2f, 10.2f, -46.9f, 16.0f, -72.9f, 16.0f)
                reflectiveCurveToRelative(-50.6f, -5.8f, -72.9f, -16.0f)
                horizontalLineToRelative(-16.7f)
                curveTo(60.2f, 287.9f, 0.0f, 348.1f, 0.0f, 422.3f)
                verticalLineToRelative(41.6f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(15.5f, 0.0f, 29.1f, -7.5f, 37.9f, -18.9f)
                lineToRelative(-58.0f, -58.0f)
                curveToRelative(-18.1f, -18.1f, -28.1f, -42.2f, -28.1f, -67.9f)
                close()
            }
        }
        .build()
        return _userTag!!
    }

private var _userTag: ImageVector? = null
