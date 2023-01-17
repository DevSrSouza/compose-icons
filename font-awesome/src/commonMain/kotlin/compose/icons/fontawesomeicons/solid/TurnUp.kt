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

public val SolidGroup.TurnUp: ImageVector
    get() {
        if (_turnUp != null) {
            return _turnUp!!
        }
        _turnUp = Builder(name = "TurnUp", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.3f, 5.7f)
                lineTo(40.3f, 143.7f)
                curveTo(35.0f, 149.0f, 32.0f, 156.2f, 32.0f, 163.7f)
                curveTo(32.0f, 179.3f, 44.7f, 192.0f, 60.3f, 192.0f)
                horizontalLineTo(144.0f)
                verticalLineTo(400.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(61.9f, 0.0f, 112.0f, -50.1f, 112.0f, -112.0f)
                verticalLineTo(192.0f)
                horizontalLineToRelative(83.7f)
                curveToRelative(15.6f, 0.0f, 28.3f, -12.7f, 28.3f, -28.3f)
                curveToRelative(0.0f, -7.5f, -3.0f, -14.7f, -8.3f, -20.0f)
                lineTo(205.7f, 5.7f)
                curveTo(202.0f, 2.0f, 197.1f, 0.0f, 192.0f, 0.0f)
                reflectiveCurveToRelative(-10.0f, 2.0f, -13.7f, 5.7f)
                close()
            }
        }
        .build()
        return _turnUp!!
    }

private var _turnUp: ImageVector? = null
