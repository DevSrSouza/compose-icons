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

public val SolidGroup.Syringe: ImageVector
    get() {
        if (_syringe != null) {
            return _syringe!!
        }
        _syringe = Builder(name = "Syringe", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(441.0f, 7.0f)
                lineToRelative(32.0f, 32.0f)
                lineToRelative(32.0f, 32.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(-24.6f, 9.4f, -33.9f, 0.0f)
                lineToRelative(-15.0f, -15.0f)
                lineTo(417.9f, 128.0f)
                lineToRelative(55.0f, 55.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(-24.6f, 9.4f, -33.9f, 0.0f)
                lineToRelative(-72.0f, -72.0f)
                lineTo(295.0f, 73.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(55.0f, 55.0f)
                lineTo(422.1f, 56.0f)
                lineTo(407.0f, 41.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(24.6f, -9.4f, 33.9f, 0.0f)
                close()
                moveTo(210.3f, 155.7f)
                lineToRelative(61.1f, -61.1f)
                curveToRelative(0.3f, 0.3f, 0.6f, 0.7f, 1.0f, 1.0f)
                lineToRelative(16.0f, 16.0f)
                lineToRelative(56.0f, 56.0f)
                lineToRelative(56.0f, 56.0f)
                lineToRelative(16.0f, 16.0f)
                curveToRelative(0.3f, 0.3f, 0.6f, 0.6f, 1.0f, 1.0f)
                lineToRelative(-191.0f, 191.0f)
                curveToRelative(-10.5f, 10.5f, -24.7f, 16.4f, -39.6f, 16.4f)
                horizontalLineTo(97.9f)
                lineTo(41.0f, 505.0f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                reflectiveCurveToRelative(-9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(57.0f, -57.0f)
                verticalLineTo(325.3f)
                curveToRelative(0.0f, -14.9f, 5.9f, -29.1f, 16.4f, -39.6f)
                lineToRelative(43.3f, -43.3f)
                lineToRelative(57.0f, 57.0f)
                curveToRelative(6.2f, 6.2f, 16.4f, 6.2f, 22.6f, 0.0f)
                reflectiveCurveToRelative(6.2f, -16.4f, 0.0f, -22.6f)
                lineToRelative(-57.0f, -57.0f)
                lineToRelative(41.4f, -41.4f)
                lineToRelative(57.0f, 57.0f)
                curveToRelative(6.2f, 6.2f, 16.4f, 6.2f, 22.6f, 0.0f)
                reflectiveCurveToRelative(6.2f, -16.4f, 0.0f, -22.6f)
                lineToRelative(-57.0f, -57.0f)
                close()
            }
        }
        .build()
        return _syringe!!
    }

private var _syringe: ImageVector? = null
