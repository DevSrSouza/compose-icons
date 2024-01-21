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

public val SolidGroup.MicrophoneSlash: ImageVector
    get() {
        if (_microphoneSlash != null) {
            return _microphoneSlash!!
        }
        _microphoneSlash = Builder(name = "MicrophoneSlash", defaultWidth = 640.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(38.8f, 5.1f)
                curveTo(28.4f, -3.1f, 13.3f, -1.2f, 5.1f, 9.2f)
                reflectiveCurveTo(-1.2f, 34.7f, 9.2f, 42.9f)
                lineToRelative(592.0f, 464.0f)
                curveToRelative(10.4f, 8.2f, 25.5f, 6.3f, 33.7f, -4.1f)
                reflectiveCurveToRelative(6.3f, -25.5f, -4.1f, -33.7f)
                lineTo(472.1f, 344.7f)
                curveToRelative(15.2f, -26.0f, 23.9f, -56.3f, 23.9f, -88.7f)
                lineTo(496.0f, 216.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 21.2f, -5.1f, 41.1f, -14.2f, 58.7f)
                lineTo(416.0f, 300.8f)
                lineTo(416.0f, 96.0f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                reflectiveCurveToRelative(-96.0f, 43.0f, -96.0f, 96.0f)
                verticalLineToRelative(54.3f)
                lineTo(38.8f, 5.1f)
                close()
                moveTo(401.3f, 412.1f)
                lineToRelative(-43.1f, -33.9f)
                curveTo(346.1f, 382.0f, 333.3f, 384.0f, 320.0f, 384.0f)
                curveToRelative(-70.7f, 0.0f, -128.0f, -57.3f, -128.0f, -128.0f)
                verticalLineToRelative(-8.7f)
                lineTo(144.7f, 210.0f)
                curveToRelative(-0.5f, 1.9f, -0.7f, 3.9f, -0.7f, 6.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 89.1f, 66.2f, 162.7f, 152.0f, 174.4f)
                lineTo(296.0f, 464.0f)
                lineTo(248.0f, 464.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(72.0f)
                horizontalLineToRelative(72.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineTo(344.0f, 464.0f)
                lineTo(344.0f, 430.4f)
                curveToRelative(20.4f, -2.8f, 39.7f, -9.1f, 57.3f, -18.2f)
                close()
            }
        }
        .build()
        return _microphoneSlash!!
    }

private var _microphoneSlash: ImageVector? = null
