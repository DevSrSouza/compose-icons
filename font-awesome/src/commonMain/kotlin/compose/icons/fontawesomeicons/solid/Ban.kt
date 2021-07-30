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

public val SolidGroup.Ban: ImageVector
    get() {
        if (_ban != null) {
            return _ban!!
        }
        _ban = Builder(name = "Ban", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 8.0f)
                curveTo(119.034f, 8.0f, 8.0f, 119.033f, 8.0f, 256.0f)
                reflectiveCurveToRelative(111.034f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.034f, 248.0f, -248.0f)
                reflectiveCurveTo(392.967f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(386.108f, 125.892f)
                curveToRelative(65.448f, 65.448f, 70.0f, 165.481f, 20.677f, 235.637f)
                lineTo(150.47f, 105.216f)
                curveToRelative(70.204f, -49.356f, 170.226f, -44.735f, 235.638f, 20.676f)
                close()
                moveTo(125.892f, 386.108f)
                curveToRelative(-65.448f, -65.448f, -70.0f, -165.481f, -20.677f, -235.637f)
                lineTo(361.53f, 406.784f)
                curveToRelative(-70.203f, 49.356f, -170.226f, 44.736f, -235.638f, -20.676f)
                close()
            }
        }
        .build()
        return _ban!!
    }

private var _ban: ImageVector? = null
