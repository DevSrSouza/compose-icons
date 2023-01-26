package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.MicExternalOff: ImageVector
    get() {
        if (_micExternalOff != null) {
            return _micExternalOff!!
        }
        _micExternalOff = Builder(name = "MicExternalOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.19f, 21.19f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineTo(5.17f, 8.0f)
                lineTo(4.0f, 8.0f)
                lineToRelative(1.0f, 10.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f)
                verticalLineToRelative(-1.17f)
                lineToRelative(5.78f, 5.78f)
                lineToRelative(1.41f, -1.42f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(0.56f, -5.61f)
                lineTo(12.0f, 14.83f)
                lineTo(12.0f, 18.0f)
                close()
                moveTo(14.0f, 6.0f)
                verticalLineToRelative(5.17f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(12.0f, 6.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f)
                verticalLineToRelative(11.17f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(18.0f, 6.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                close()
                moveTo(10.0f, 5.0f)
                curveToRelative(0.0f, 0.62f, -0.2f, 1.18f, -0.52f, 1.66f)
                lineTo(5.33f, 2.51f)
                curveTo(5.81f, 2.19f, 6.38f, 2.0f, 7.0f, 2.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _micExternalOff!!
    }

private var _micExternalOff: ImageVector? = null
