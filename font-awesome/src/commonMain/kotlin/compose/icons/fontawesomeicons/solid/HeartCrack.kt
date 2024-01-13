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

public val SolidGroup.HeartCrack: ImageVector
    get() {
        if (_heartCrack != null) {
            return _heartCrack!!
        }
        _heartCrack = Builder(name = "HeartCrack", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(119.4f, 44.1f)
                curveToRelative(23.3f, -3.9f, 46.8f, -1.9f, 68.6f, 5.3f)
                lineToRelative(49.8f, 77.5f)
                lineToRelative(-75.4f, 75.4f)
                curveToRelative(-1.5f, 1.5f, -2.4f, 3.6f, -2.3f, 5.8f)
                reflectiveCurveToRelative(1.0f, 4.2f, 2.6f, 5.7f)
                lineToRelative(112.0f, 104.0f)
                curveToRelative(2.9f, 2.7f, 7.4f, 2.9f, 10.5f, 0.3f)
                reflectiveCurveToRelative(3.8f, -7.0f, 1.7f, -10.4f)
                lineToRelative(-60.4f, -98.1f)
                lineToRelative(90.7f, -75.6f)
                curveToRelative(2.6f, -2.1f, 3.5f, -5.7f, 2.4f, -8.8f)
                lineTo(296.8f, 61.8f)
                curveToRelative(28.5f, -16.7f, 62.4f, -23.2f, 95.7f, -17.6f)
                curveTo(461.5f, 55.6f, 512.0f, 115.2f, 512.0f, 185.1f)
                verticalLineToRelative(5.8f)
                curveToRelative(0.0f, 41.5f, -17.2f, 81.2f, -47.6f, 109.5f)
                lineTo(283.7f, 469.1f)
                curveToRelative(-7.5f, 7.0f, -17.4f, 10.9f, -27.7f, 10.9f)
                reflectiveCurveToRelative(-20.2f, -3.9f, -27.7f, -10.9f)
                lineTo(47.6f, 300.4f)
                curveTo(17.2f, 272.1f, 0.0f, 232.4f, 0.0f, 190.9f)
                verticalLineToRelative(-5.8f)
                curveToRelative(0.0f, -69.9f, 50.5f, -129.5f, 119.4f, -141.0f)
                close()
            }
        }
        .build()
        return _heartCrack!!
    }

private var _heartCrack: ImageVector? = null
