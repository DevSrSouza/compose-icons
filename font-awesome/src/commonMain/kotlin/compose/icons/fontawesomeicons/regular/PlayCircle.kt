package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.PlayCircle: ImageVector
    get() {
        if (_playCircle != null) {
            return _playCircle!!
        }
        _playCircle = Builder(name = "PlayCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(371.7f, 238.0f)
                lineToRelative(-176.0f, -107.0f)
                curveToRelative(-15.8f, -8.8f, -35.7f, 2.5f, -35.7f, 21.0f)
                verticalLineToRelative(208.0f)
                curveToRelative(0.0f, 18.4f, 19.8f, 29.8f, 35.7f, 21.0f)
                lineToRelative(176.0f, -101.0f)
                curveToRelative(16.4f, -9.1f, 16.4f, -32.8f, 0.0f, -42.0f)
                close()
                moveTo(504.0f, 256.0f)
                curveTo(504.0f, 119.0f, 393.0f, 8.0f, 256.0f, 8.0f)
                reflectiveCurveTo(8.0f, 119.0f, 8.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                close()
                moveTo(56.0f, 256.0f)
                curveToRelative(0.0f, -110.5f, 89.5f, -200.0f, 200.0f, -200.0f)
                reflectiveCurveToRelative(200.0f, 89.5f, 200.0f, 200.0f)
                reflectiveCurveToRelative(-89.5f, 200.0f, -200.0f, 200.0f)
                reflectiveCurveTo(56.0f, 366.5f, 56.0f, 256.0f)
                close()
            }
        }
        .build()
        return _playCircle!!
    }

private var _playCircle: ImageVector? = null
