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

public val SolidGroup.SadTear: ImageVector
    get() {
        if (_sadTear != null) {
            return _sadTear!!
        }
        _sadTear = Builder(name = "SadTear", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(328.0f, 176.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(152.0f, 416.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.0f, -48.0f, -47.0f)
                curveToRelative(0.0f, -20.0f, 28.5f, -60.4f, 41.6f, -77.8f)
                curveToRelative(3.2f, -4.3f, 9.6f, -4.3f, 12.8f, 0.0f)
                curveTo(171.5f, 308.6f, 200.0f, 349.0f, 200.0f, 369.0f)
                curveToRelative(0.0f, 26.0f, -21.5f, 47.0f, -48.0f, 47.0f)
                close()
                moveTo(168.0f, 240.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                close()
                moveTo(338.2f, 394.2f)
                curveTo(315.8f, 367.4f, 282.9f, 352.0f, 248.0f, 352.0f)
                curveToRelative(-21.2f, 0.0f, -21.2f, -32.0f, 0.0f, -32.0f)
                curveToRelative(44.4f, 0.0f, 86.3f, 19.6f, 114.7f, 53.8f)
                curveToRelative(13.8f, 16.4f, -11.2f, 36.5f, -24.5f, 20.4f)
                close()
            }
        }
        .build()
        return _sadTear!!
    }

private var _sadTear: ImageVector? = null
