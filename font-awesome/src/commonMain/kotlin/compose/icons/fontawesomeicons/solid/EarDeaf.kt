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

public val SolidGroup.EarDeaf: ImageVector
    get() {
        if (_earDeaf != null) {
            return _earDeaf!!
        }
        _earDeaf = Builder(name = "EarDeaf", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(502.6f, 54.6f)
                lineToRelative(-40.0f, 40.0f)
                curveToRelative(-12.5f, 12.5f, -32.8f, 12.5f, -45.3f, 0.0f)
                reflectiveCurveToRelative(-12.5f, -32.8f, 0.0f, -45.3f)
                lineToRelative(40.0f, -40.0f)
                curveToRelative(12.5f, -12.5f, 32.8f, -12.5f, 45.3f, 0.0f)
                reflectiveCurveToRelative(12.5f, 32.8f, 0.0f, 45.3f)
                close()
                moveTo(182.6f, 374.6f)
                lineToRelative(-128.0f, 128.0f)
                curveToRelative(-12.5f, 12.5f, -32.8f, 12.5f, -45.3f, 0.0f)
                reflectiveCurveToRelative(-12.5f, -32.8f, 0.0f, -45.3f)
                lineToRelative(128.0f, -128.0f)
                curveToRelative(12.5f, -12.5f, 32.8f, -12.5f, 45.3f, 0.0f)
                reflectiveCurveToRelative(12.5f, 32.8f, 0.0f, 45.3f)
                close()
                moveTo(240.0f, 128.0f)
                curveToRelative(-57.6f, 0.0f, -105.1f, 43.6f, -111.3f, 99.5f)
                curveToRelative(-1.9f, 17.6f, -17.8f, 30.2f, -35.3f, 28.3f)
                reflectiveCurveToRelative(-30.2f, -17.8f, -28.3f, -35.3f)
                curveTo(74.8f, 132.5f, 149.4f, 64.0f, 240.0f, 64.0f)
                curveToRelative(97.2f, 0.0f, 176.0f, 78.8f, 176.0f, 176.0f)
                curveToRelative(0.0f, 46.0f, -17.7f, 87.9f, -46.6f, 119.3f)
                curveToRelative(-12.0f, 13.0f, -17.4f, 24.8f, -17.4f, 34.7f)
                lineTo(352.0f, 400.0f)
                curveToRelative(0.0f, 61.9f, -50.1f, 112.0f, -112.0f, 112.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                verticalLineToRelative(-6.1f)
                curveToRelative(0.0f, -32.9f, 17.4f, -59.6f, 34.4f, -78.0f)
                curveToRelative(18.4f, -20.0f, 29.6f, -46.6f, 29.6f, -75.9f)
                curveToRelative(0.0f, -61.9f, -50.1f, -112.0f, -112.0f, -112.0f)
                close()
                moveTo(240.0f, 208.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                curveToRelative(0.0f, -44.2f, 35.8f, -80.0f, 80.0f, -80.0f)
                reflectiveCurveToRelative(80.0f, 35.8f, 80.0f, 80.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _earDeaf!!
    }

private var _earDeaf: ImageVector? = null
