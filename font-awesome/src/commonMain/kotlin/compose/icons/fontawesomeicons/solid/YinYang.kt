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

public val SolidGroup.YinYang: ImageVector
    get() {
        if (_yinYang != null) {
            return _yinYang!!
        }
        _yinYang = Builder(name = "YinYang", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 8.0f)
                curveTo(111.03f, 8.0f, 0.0f, 119.03f, 0.0f, 256.0f)
                reflectiveCurveToRelative(111.03f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.03f, 248.0f, -248.0f)
                reflectiveCurveTo(384.97f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(248.0f, 384.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, -14.33f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.33f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.33f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.33f, 32.0f, -32.0f, 32.0f)
                close()
                moveTo(248.0f, 256.0f)
                curveToRelative(-53.02f, 0.0f, -96.0f, 42.98f, -96.0f, 96.0f)
                reflectiveCurveToRelative(42.98f, 96.0f, 96.0f, 96.0f)
                curveToRelative(-106.04f, 0.0f, -192.0f, -85.96f, -192.0f, -192.0f)
                reflectiveCurveTo(141.96f, 64.0f, 248.0f, 64.0f)
                curveToRelative(53.02f, 0.0f, 96.0f, 42.98f, 96.0f, 96.0f)
                reflectiveCurveToRelative(-42.98f, 96.0f, -96.0f, 96.0f)
                close()
                moveTo(248.0f, 128.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.33f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.33f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.33f, -32.0f, -32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _yinYang!!
    }

private var _yinYang: ImageVector? = null
