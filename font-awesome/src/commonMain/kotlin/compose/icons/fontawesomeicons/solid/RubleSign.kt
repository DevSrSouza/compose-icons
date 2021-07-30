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

public val SolidGroup.RubleSign: ImageVector
    get() {
        if (_rubleSign != null) {
            return _rubleSign!!
        }
        _rubleSign = Builder(name = "RubleSign", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.36f, 320.0f)
                curveTo(324.48f, 320.0f, 384.0f, 260.542f, 384.0f, 175.071f)
                reflectiveCurveTo(324.48f, 32.0f, 239.36f, 32.0f)
                lineTo(76.0f, 32.0f)
                curveToRelative(-6.627f, 0.0f, -12.0f, 5.373f, -12.0f, 12.0f)
                verticalLineToRelative(206.632f)
                lineTo(12.0f, 250.632f)
                curveToRelative(-6.627f, 0.0f, -12.0f, 5.373f, -12.0f, 12.0f)
                lineTo(0.0f, 308.0f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(32.0f)
                lineTo(12.0f, 352.0f)
                curveToRelative(-6.627f, 0.0f, -12.0f, 5.373f, -12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(52.0f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(58.56f)
                curveToRelative(6.627f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                verticalLineToRelative(-52.0f)
                lineTo(308.0f, 416.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -6.627f, -5.373f, -12.0f, -12.0f, -12.0f)
                lineTo(146.56f, 352.0f)
                verticalLineToRelative(-32.0f)
                horizontalLineToRelative(92.8f)
                close()
                moveTo(146.56f, 100.748f)
                horizontalLineToRelative(78.72f)
                curveToRelative(46.72f, 0.0f, 74.88f, 29.11f, 74.88f, 74.323f)
                curveToRelative(0.0f, 45.832f, -28.16f, 75.561f, -76.16f, 75.561f)
                horizontalLineToRelative(-77.44f)
                lineTo(146.56f, 100.748f)
                close()
            }
        }
        .build()
        return _rubleSign!!
    }

private var _rubleSign: ImageVector? = null
