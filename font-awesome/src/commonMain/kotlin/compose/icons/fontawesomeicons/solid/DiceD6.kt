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

public val SolidGroup.DiceD6: ImageVector
    get() {
        if (_diceD6 != null) {
            return _diceD6!!
        }
        _diceD6 = Builder(name = "DiceD6", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.3f, 2.0f)
                curveToRelative(4.8f, -2.6f, 10.5f, -2.6f, 15.3f, 0.0f)
                lineTo(422.3f, 106.0f)
                curveToRelative(5.1f, 2.8f, 8.3f, 8.2f, 8.3f, 14.0f)
                reflectiveCurveToRelative(-3.2f, 11.2f, -8.3f, 14.0f)
                lineTo(231.7f, 238.0f)
                curveToRelative(-4.8f, 2.6f, -10.5f, 2.6f, -15.3f, 0.0f)
                lineTo(25.7f, 134.0f)
                curveToRelative(-5.1f, -2.8f, -8.3f, -8.2f, -8.3f, -14.0f)
                reflectiveCurveToRelative(3.2f, -11.2f, 8.3f, -14.0f)
                lineTo(216.3f, 2.0f)
                close()
                moveTo(23.7f, 170.0f)
                lineToRelative(176.0f, 96.0f)
                curveToRelative(5.1f, 2.8f, 8.3f, 8.2f, 8.3f, 14.0f)
                lineTo(208.0f, 496.0f)
                curveToRelative(0.0f, 5.6f, -3.0f, 10.9f, -7.8f, 13.8f)
                reflectiveCurveToRelative(-10.9f, 3.0f, -15.8f, 0.3f)
                lineTo(8.3f, 414.0f)
                curveTo(3.2f, 411.2f, 0.0f, 405.9f, 0.0f, 400.0f)
                lineTo(0.0f, 184.0f)
                curveToRelative(0.0f, -5.6f, 3.0f, -10.9f, 7.8f, -13.8f)
                reflectiveCurveToRelative(10.9f, -3.0f, 15.8f, -0.3f)
                close()
                moveTo(424.4f, 170.0f)
                curveToRelative(5.0f, -2.7f, 11.0f, -2.6f, 15.8f, 0.3f)
                reflectiveCurveToRelative(7.8f, 8.1f, 7.8f, 13.8f)
                lineTo(448.0f, 400.0f)
                curveToRelative(0.0f, 5.9f, -3.2f, 11.2f, -8.3f, 14.0f)
                lineToRelative(-176.0f, 96.0f)
                curveToRelative(-5.0f, 2.7f, -11.0f, 2.6f, -15.8f, -0.3f)
                reflectiveCurveToRelative(-7.8f, -8.1f, -7.8f, -13.8f)
                lineTo(240.1f, 280.0f)
                curveToRelative(0.0f, -5.9f, 3.2f, -11.2f, 8.3f, -14.0f)
                lineToRelative(176.0f, -96.0f)
                close()
            }
        }
        .build()
        return _diceD6!!
    }

private var _diceD6: ImageVector? = null
