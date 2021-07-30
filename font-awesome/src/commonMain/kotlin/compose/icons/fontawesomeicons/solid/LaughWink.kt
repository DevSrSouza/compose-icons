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

public val SolidGroup.LaughWink: ImageVector
    get() {
        if (_laughWink != null) {
            return _laughWink!!
        }
        _laughWink = Builder(name = "LaughWink", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 8.0f)
                curveTo(111.0f, 8.0f, 0.0f, 119.0f, 0.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(385.0f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(268.1f, 206.1f)
                curveToRelative(4.0f, -25.2f, 34.2f, -42.1f, 59.9f, -42.1f)
                reflectiveCurveToRelative(55.9f, 16.9f, 59.9f, 42.1f)
                curveToRelative(1.7f, 11.1f, -11.4f, 18.3f, -19.8f, 10.8f)
                lineToRelative(-9.5f, -8.5f)
                curveToRelative(-14.8f, -13.2f, -46.2f, -13.2f, -61.0f, 0.0f)
                lineTo(288.0f, 217.0f)
                curveToRelative(-8.4f, 7.4f, -21.6f, 0.3f, -19.9f, -10.9f)
                close()
                moveTo(168.0f, 160.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(398.9f, 306.0f)
                curveTo(390.0f, 377.0f, 329.4f, 432.0f, 256.0f, 432.0f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(-73.4f, 0.0f, -134.0f, -55.0f, -142.9f, -126.0f)
                curveToRelative(-1.2f, -9.5f, 6.3f, -18.0f, 15.9f, -18.0f)
                horizontalLineToRelative(270.0f)
                curveToRelative(9.6f, 0.0f, 17.1f, 8.4f, 15.9f, 18.0f)
                close()
            }
        }
        .build()
        return _laughWink!!
    }

private var _laughWink: ImageVector? = null
