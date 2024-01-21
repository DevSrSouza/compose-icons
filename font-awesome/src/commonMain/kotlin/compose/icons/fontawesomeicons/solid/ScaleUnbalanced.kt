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

public val SolidGroup.ScaleUnbalanced: ImageVector
    get() {
        if (_scaleUnbalanced != null) {
            return _scaleUnbalanced!!
        }
        _scaleUnbalanced = Builder(name = "ScaleUnbalanced", defaultWidth = 640.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(522.1f, 62.4f)
                curveToRelative(16.8f, -5.6f, 25.8f, -23.7f, 20.2f, -40.5f)
                reflectiveCurveTo(518.6f, -3.9f, 501.9f, 1.6f)
                lineToRelative(-113.0f, 37.7f)
                curveTo(375.0f, 15.8f, 349.3f, 0.0f, 320.0f, 0.0f)
                curveToRelative(-44.2f, 0.0f, -80.0f, 35.8f, -80.0f, 80.0f)
                curveToRelative(0.0f, 3.0f, 0.2f, 5.9f, 0.5f, 8.8f)
                lineTo(117.9f, 129.6f)
                curveToRelative(-16.8f, 5.6f, -25.8f, 23.7f, -20.2f, 40.5f)
                reflectiveCurveToRelative(23.7f, 25.8f, 40.5f, 20.2f)
                lineToRelative(135.5f, -45.2f)
                curveToRelative(4.5f, 3.2f, 9.3f, 5.9f, 14.4f, 8.2f)
                verticalLineTo(480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(512.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(352.0f)
                verticalLineTo(153.3f)
                curveToRelative(21.0f, -9.2f, 37.2f, -27.0f, 44.2f, -49.0f)
                lineToRelative(125.9f, -42.0f)
                close()
                moveTo(439.6f, 288.0f)
                lineTo(512.0f, 163.8f)
                lineTo(584.4f, 288.0f)
                horizontalLineTo(439.6f)
                close()
                moveTo(512.0f, 384.0f)
                curveToRelative(62.9f, 0.0f, 115.2f, -34.0f, 126.0f, -78.9f)
                curveToRelative(2.6f, -11.0f, -1.0f, -22.3f, -6.7f, -32.1f)
                lineTo(536.1f, 109.8f)
                curveToRelative(-5.0f, -8.6f, -14.2f, -13.8f, -24.1f, -13.8f)
                reflectiveCurveToRelative(-19.1f, 5.3f, -24.1f, 13.8f)
                lineTo(392.7f, 273.1f)
                curveToRelative(-5.7f, 9.8f, -9.3f, 21.1f, -6.7f, 32.1f)
                curveTo(396.8f, 350.0f, 449.1f, 384.0f, 512.0f, 384.0f)
                close()
                moveTo(129.2f, 291.8f)
                lineTo(201.6f, 416.0f)
                horizontalLineTo(56.7f)
                lineToRelative(72.4f, -124.2f)
                close()
                moveTo(3.2f, 433.1f)
                curveTo(14.0f, 478.0f, 66.3f, 512.0f, 129.2f, 512.0f)
                reflectiveCurveToRelative(115.2f, -34.0f, 126.0f, -78.9f)
                curveToRelative(2.6f, -11.0f, -1.0f, -22.3f, -6.7f, -32.1f)
                lineTo(153.2f, 237.8f)
                curveToRelative(-5.0f, -8.6f, -14.2f, -13.8f, -24.1f, -13.8f)
                reflectiveCurveToRelative(-19.1f, 5.3f, -24.1f, 13.8f)
                lineTo(9.9f, 401.1f)
                curveToRelative(-5.7f, 9.8f, -9.3f, 21.1f, -6.7f, 32.1f)
                close()
            }
        }
        .build()
        return _scaleUnbalanced!!
    }

private var _scaleUnbalanced: ImageVector? = null
