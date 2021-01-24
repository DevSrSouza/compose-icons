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

public val SolidGroup.Flushed: ImageVector
    get() {
        if (_flushed != null) {
            return _flushed!!
        }
        _flushed = Builder(name = "Flushed", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(344.0f, 200.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                close()
                moveTo(152.0f, 200.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                close()
                moveTo(248.0f, 8.0f)
                curveTo(111.0f, 8.0f, 0.0f, 119.0f, 0.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(385.0f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(80.0f, 224.0f)
                curveToRelative(0.0f, -39.8f, 32.2f, -72.0f, 72.0f, -72.0f)
                reflectiveCurveToRelative(72.0f, 32.2f, 72.0f, 72.0f)
                reflectiveCurveToRelative(-32.2f, 72.0f, -72.0f, 72.0f)
                reflectiveCurveToRelative(-72.0f, -32.2f, -72.0f, -72.0f)
                close()
                moveTo(312.0f, 400.0f)
                lineTo(184.0f, 400.0f)
                curveToRelative(-21.2f, 0.0f, -21.2f, -32.0f, 0.0f, -32.0f)
                horizontalLineToRelative(128.0f)
                curveToRelative(21.2f, 0.0f, 21.2f, 32.0f, 0.0f, 32.0f)
                close()
                moveTo(344.0f, 296.0f)
                curveToRelative(-39.8f, 0.0f, -72.0f, -32.2f, -72.0f, -72.0f)
                reflectiveCurveToRelative(32.2f, -72.0f, 72.0f, -72.0f)
                reflectiveCurveToRelative(72.0f, 32.2f, 72.0f, 72.0f)
                reflectiveCurveToRelative(-32.2f, 72.0f, -72.0f, 72.0f)
                close()
            }
        }
        .build()
        return _flushed!!
    }

private var _flushed: ImageVector? = null
