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
                moveTo(0.0f, 160.0f)
                curveToRelative(0.0f, -53.0f, 114.6f, -96.0f, 256.0f, -96.0f)
                reflectiveCurveToRelative(256.0f, 43.0f, 256.0f, 96.0f)
                reflectiveCurveToRelative(-114.6f, 96.0f, -256.0f, 96.0f)
                reflectiveCurveTo(0.0f, 213.0f, 0.0f, 160.0f)
                close()
                moveTo(0.0f, 242.2f)
                lineTo(0.0f, 352.0f)
                curveToRelative(0.0f, 53.0f, 114.6f, 96.0f, 256.0f, 96.0f)
                reflectiveCurveToRelative(256.0f, -43.0f, 256.0f, -96.0f)
                lineTo(512.0f, 242.2f)
                curveToRelative(-113.4f, 82.3f, -398.5f, 82.4f, -512.0f, 0.0f)
                close()
            }
        }
        .build()
        return _hockeyPuck!!
    }

private var _hockeyPuck: ImageVector? = null
