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

public val SolidGroup.Restroom: ImageVector
    get() {
        if (_restroom != null) {
            return _restroom!!
        }
        _restroom = Builder(name = "Restroom", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 128.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                reflectiveCurveTo(163.3f, 0.0f, 128.0f, 0.0f)
                reflectiveCurveTo(64.0f, 28.7f, 64.0f, 64.0f)
                reflectiveCurveToRelative(28.7f, 64.0f, 64.0f, 64.0f)
                close()
                moveTo(512.0f, 128.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                reflectiveCurveTo(547.3f, 0.0f, 512.0f, 0.0f)
                reflectiveCurveToRelative(-64.0f, 28.7f, -64.0f, 64.0f)
                reflectiveCurveToRelative(28.7f, 64.0f, 64.0f, 64.0f)
                close()
                moveTo(639.3f, 354.5f)
                lineToRelative(-45.6f, -185.8f)
                curveToRelative(-3.3f, -13.5f, -15.5f, -23.0f, -29.8f, -24.2f)
                curveToRelative(-15.0f, 9.7f, -32.8f, 15.5f, -52.0f, 15.5f)
                curveToRelative(-19.2f, 0.0f, -37.0f, -5.8f, -52.0f, -15.5f)
                curveToRelative(-14.3f, 1.2f, -26.5f, 10.7f, -29.8f, 24.2f)
                lineToRelative(-45.6f, 185.8f)
                curveTo(381.0f, 369.6f, 393.0f, 384.0f, 409.2f, 384.0f)
                lineTo(464.0f, 384.0f)
                verticalLineToRelative(104.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                lineTo(560.0f, 384.0f)
                horizontalLineToRelative(54.8f)
                curveToRelative(16.2f, 0.0f, 28.2f, -14.4f, 24.5f, -29.5f)
                close()
                moveTo(336.0f, 0.0f)
                horizontalLineToRelative(-32.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(480.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(352.0f, 16.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(180.1f, 144.4f)
                curveToRelative(-15.0f, 9.8f, -32.9f, 15.6f, -52.1f, 15.6f)
                curveToRelative(-19.2f, 0.0f, -37.1f, -5.8f, -52.1f, -15.6f)
                curveTo(51.3f, 146.5f, 32.0f, 166.9f, 32.0f, 192.0f)
                verticalLineToRelative(136.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(136.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(80.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                lineTo(192.0f, 352.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                lineTo(224.0f, 192.0f)
                curveToRelative(0.0f, -25.1f, -19.3f, -45.5f, -43.9f, -47.6f)
                close()
            }
        }
        .build()
        return _restroom!!
    }

private var _restroom: ImageVector? = null
