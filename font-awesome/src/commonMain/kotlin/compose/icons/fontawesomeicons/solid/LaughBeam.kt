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

public val SolidGroup.LaughBeam: ImageVector
    get() {
        if (_laughBeam != null) {
            return _laughBeam!!
        }
        _laughBeam = Builder(name = "LaughBeam", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(272.0f, 207.4f)
                curveToRelative(3.3f, -42.1f, 32.2f, -71.4f, 56.0f, -71.4f)
                reflectiveCurveToRelative(52.7f, 29.3f, 56.0f, 71.4f)
                curveToRelative(0.7f, 8.6f, -10.8f, 11.9f, -14.9f, 4.5f)
                lineToRelative(-9.5f, -17.0f)
                curveToRelative(-7.7f, -13.7f, -19.2f, -21.6f, -31.5f, -21.6f)
                reflectiveCurveToRelative(-23.8f, 7.9f, -31.5f, 21.6f)
                lineToRelative(-9.5f, 17.0f)
                curveToRelative(-4.2f, 7.4f, -15.8f, 4.1f, -15.1f, -4.5f)
                close()
                moveTo(112.0f, 207.4f)
                curveToRelative(3.3f, -42.1f, 32.2f, -71.4f, 56.0f, -71.4f)
                reflectiveCurveToRelative(52.7f, 29.3f, 56.0f, 71.4f)
                curveToRelative(0.7f, 8.6f, -10.8f, 11.9f, -14.9f, 4.5f)
                lineToRelative(-9.5f, -17.0f)
                curveToRelative(-7.7f, -13.7f, -19.2f, -21.6f, -31.5f, -21.6f)
                reflectiveCurveToRelative(-23.8f, 7.9f, -31.5f, 21.6f)
                lineToRelative(-9.5f, 17.0f)
                curveToRelative(-4.3f, 7.4f, -15.8f, 4.0f, -15.1f, -4.5f)
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
        return _laughBeam!!
    }

private var _laughBeam: ImageVector? = null
