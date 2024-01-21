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

public val SolidGroup.Smog: ImageVector
    get() {
        if (_smog != null) {
            return _smog!!
        }
        _smog = Builder(name = "Smog", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 144.0f)
                curveToRelative(0.0f, 79.5f, 64.5f, 144.0f, 144.0f, 144.0f)
                lineTo(299.3f, 288.0f)
                curveToRelative(22.6f, 19.9f, 52.2f, 32.0f, 84.7f, 32.0f)
                reflectiveCurveToRelative(62.1f, -12.1f, 84.7f, -32.0f)
                lineTo(496.0f, 288.0f)
                curveToRelative(61.9f, 0.0f, 112.0f, -50.1f, 112.0f, -112.0f)
                reflectiveCurveToRelative(-50.1f, -112.0f, -112.0f, -112.0f)
                curveToRelative(-10.7f, 0.0f, -21.0f, 1.5f, -30.8f, 4.3f)
                curveTo(443.8f, 27.7f, 401.1f, 0.0f, 352.0f, 0.0f)
                curveToRelative(-32.6f, 0.0f, -62.4f, 12.2f, -85.1f, 32.3f)
                curveTo(242.1f, 12.1f, 210.5f, 0.0f, 176.0f, 0.0f)
                curveTo(96.5f, 0.0f, 32.0f, 64.5f, 32.0f, 144.0f)
                close()
                moveTo(616.0f, 368.0f)
                lineTo(280.0f, 368.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineTo(616.0f, 416.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                close()
                moveTo(552.0f, 464.0f)
                lineTo(440.0f, 464.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineTo(552.0f, 512.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                close()
                moveTo(360.0f, 464.0f)
                lineTo(24.0f, 464.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineTo(360.0f, 512.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                close()
                moveTo(224.0f, 392.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                lineTo(96.0f, 368.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineTo(200.0f, 416.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _smog!!
    }

private var _smog: ImageVector? = null
