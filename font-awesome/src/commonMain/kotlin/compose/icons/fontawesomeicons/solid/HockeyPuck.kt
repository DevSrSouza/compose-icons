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

public val SolidGroup.HockeyPuck: ImageVector
    get() {
        if (_hockeyPuck != null) {
            return _hockeyPuck!!
        }
        _hockeyPuck = Builder(name = "HockeyPuck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                curveTo(114.6f, 256.0f, 0.0f, 213.0f, 0.0f, 160.0f)
                reflectiveCurveToRelative(114.6f, -96.0f, 256.0f, -96.0f)
                reflectiveCurveToRelative(256.0f, 43.0f, 256.0f, 96.0f)
                reflectiveCurveToRelative(-114.6f, 96.0f, -256.0f, 96.0f)
                close()
                moveTo(448.3f, 257.8f)
                curveToRelative(24.7f, -9.3f, 46.9f, -21.0f, 63.7f, -35.6f)
                lineTo(512.0f, 352.0f)
                curveToRelative(0.0f, 53.0f, -114.6f, 96.0f, -256.0f, 96.0f)
                reflectiveCurveTo(0.0f, 405.0f, 0.0f, 352.0f)
                lineTo(0.0f, 222.3f)
                curveToRelative(16.8f, 14.6f, 39.0f, 26.3f, 63.7f, 35.6f)
                curveTo(114.5f, 276.9f, 182.5f, 288.0f, 256.0f, 288.0f)
                reflectiveCurveToRelative(141.5f, -11.1f, 192.3f, -30.2f)
                close()
            }
        }
        .build()
        return _hockeyPuck!!
    }

private var _hockeyPuck: ImageVector? = null
