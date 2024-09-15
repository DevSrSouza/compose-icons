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
                curveTo(119.03f, 8.0f, 8.0f, 119.03f, 8.0f, 256.0f)
                reflectiveCurveToRelative(111.03f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.03f, 248.0f, -248.0f)
                reflectiveCurveTo(392.97f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(386.11f, 125.89f)
                curveToRelative(65.45f, 65.45f, 70.0f, 165.48f, 20.68f, 235.64f)
                lineTo(150.47f, 105.22f)
                curveToRelative(70.2f, -49.36f, 170.23f, -44.74f, 235.64f, 20.68f)
                close()
                moveTo(125.89f, 386.11f)
                curveToRelative(-65.45f, -65.45f, -70.0f, -165.48f, -20.68f, -235.64f)
                lineTo(361.53f, 406.78f)
                curveToRelative(-70.2f, 49.36f, -170.23f, 44.74f, -235.64f, -20.68f)
                close()
            }
        }
        .build()
        return _ban!!
    }

private var _ban: ImageVector? = null
