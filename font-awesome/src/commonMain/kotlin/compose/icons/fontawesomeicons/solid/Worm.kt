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

public val SolidGroup.Worm: ImageVector
    get() {
        if (_worm != null) {
            return _worm!!
        }
        _worm = Builder(name = "Worm", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 96.0f)
                curveToRelative(0.0f, -53.0f, 43.0f, -96.0f, 96.0f, -96.0f)
                horizontalLineToRelative(38.4f)
                curveTo(407.9f, 0.0f, 448.0f, 40.1f, 448.0f, 89.6f)
                lineTo(448.0f, 176.0f)
                verticalLineToRelative(16.0f)
                lineTo(448.0f, 376.0f)
                curveToRelative(0.0f, 75.1f, -60.9f, 136.0f, -136.0f, 136.0f)
                reflectiveCurveToRelative(-136.0f, -60.9f, -136.0f, -136.0f)
                lineTo(176.0f, 296.0f)
                curveToRelative(0.0f, -22.1f, -17.9f, -40.0f, -40.0f, -40.0f)
                reflectiveCurveToRelative(-40.0f, 17.9f, -40.0f, 40.0f)
                lineTo(96.0f, 464.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                reflectiveCurveToRelative(-48.0f, -21.5f, -48.0f, -48.0f)
                lineTo(0.0f, 296.0f)
                curveToRelative(0.0f, -75.1f, 60.9f, -136.0f, 136.0f, -136.0f)
                reflectiveCurveToRelative(136.0f, 60.9f, 136.0f, 136.0f)
                verticalLineToRelative(80.0f)
                curveToRelative(0.0f, 22.1f, 17.9f, 40.0f, 40.0f, 40.0f)
                reflectiveCurveToRelative(40.0f, -17.9f, 40.0f, -40.0f)
                lineTo(352.0f, 192.0f)
                lineTo(320.0f, 192.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, -43.0f, -96.0f, -96.0f)
                close()
                moveTo(368.0f, 88.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _worm!!
    }

private var _worm: ImageVector? = null
