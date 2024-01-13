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

public val SolidGroup.TentArrowTurnLeft: ImageVector
    get() {
        if (_tentArrowTurnLeft != null) {
            return _tentArrowTurnLeft!!
        }
        _tentArrowTurnLeft = Builder(name = "TentArrowTurnLeft", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.1f, 41.8f)
                curveToRelative(9.9f, -8.9f, 10.7f, -24.0f, 1.8f, -33.9f)
                reflectiveCurveTo(97.8f, -2.7f, 87.9f, 6.2f)
                lineToRelative(-80.0f, 72.0f)
                curveTo(2.9f, 82.7f, 0.0f, 89.2f, 0.0f, 96.0f)
                reflectiveCurveToRelative(2.9f, 13.3f, 7.9f, 17.8f)
                lineToRelative(80.0f, 72.0f)
                curveToRelative(9.9f, 8.9f, 25.0f, 8.1f, 33.9f, -1.8f)
                reflectiveCurveToRelative(8.1f, -25.0f, -1.8f, -33.9f)
                lineTo(86.5f, 120.0f)
                lineTo(456.0f, 120.0f)
                curveToRelative(39.8f, 0.0f, 72.0f, 32.2f, 72.0f, 72.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                verticalLineTo(192.0f)
                curveToRelative(0.0f, -66.3f, -53.7f, -120.0f, -120.0f, -120.0f)
                lineTo(86.5f, 72.0f)
                lineToRelative(33.5f, -30.2f)
                close()
                moveTo(307.4f, 166.5f)
                curveToRelative(-11.5f, -8.7f, -27.3f, -8.7f, -38.8f, 0.0f)
                lineToRelative(-168.0f, 128.0f)
                curveToRelative(-6.6f, 5.0f, -11.0f, 12.5f, -12.3f, 20.7f)
                lineToRelative(-24.0f, 160.0f)
                curveToRelative(-1.4f, 9.2f, 1.3f, 18.6f, 7.4f, 25.6f)
                reflectiveCurveTo(86.7f, 512.0f, 96.0f, 512.0f)
                horizontalLineTo(240.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(361.9f)
                curveToRelative(0.0f, -5.5f, 4.4f, -9.9f, 9.9f, -9.9f)
                curveToRelative(3.7f, 0.0f, 7.2f, 2.1f, 8.8f, 5.5f)
                lineToRelative(68.4f, 136.8f)
                curveToRelative(5.4f, 10.8f, 16.5f, 17.7f, 28.6f, 17.7f)
                horizontalLineTo(464.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(9.3f, 0.0f, 18.2f, -4.1f, 24.2f, -11.1f)
                reflectiveCurveToRelative(8.8f, -16.4f, 7.4f, -25.6f)
                lineToRelative(-24.0f, -160.0f)
                curveToRelative(-1.2f, -8.2f, -5.6f, -15.7f, -12.3f, -20.7f)
                lineToRelative(-168.0f, -128.0f)
                close()
            }
        }
        .build()
        return _tentArrowTurnLeft!!
    }

private var _tentArrowTurnLeft: ImageVector? = null
