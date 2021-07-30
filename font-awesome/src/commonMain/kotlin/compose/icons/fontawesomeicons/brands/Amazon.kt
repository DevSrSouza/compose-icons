package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Amazon: ImageVector
    get() {
        if (_amazon != null) {
            return _amazon!!
        }
        _amazon = Builder(name = "Amazon", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(257.2f, 162.7f)
                curveToRelative(-48.7f, 1.8f, -169.5f, 15.5f, -169.5f, 117.5f)
                curveToRelative(0.0f, 109.5f, 138.3f, 114.0f, 183.5f, 43.2f)
                curveToRelative(6.5f, 10.2f, 35.4f, 37.5f, 45.3f, 46.8f)
                lineToRelative(56.8f, -56.0f)
                reflectiveCurveTo(341.0f, 288.9f, 341.0f, 261.4f)
                lineTo(341.0f, 114.3f)
                curveTo(341.0f, 89.0f, 316.5f, 32.0f, 228.7f, 32.0f)
                curveTo(140.7f, 32.0f, 94.0f, 87.0f, 94.0f, 136.3f)
                lineToRelative(73.5f, 6.8f)
                curveToRelative(16.3f, -49.5f, 54.2f, -49.5f, 54.2f, -49.5f)
                curveToRelative(40.7f, -0.1f, 35.5f, 29.8f, 35.5f, 69.1f)
                close()
                moveTo(257.2f, 249.5f)
                curveToRelative(0.0f, 80.0f, -84.2f, 68.0f, -84.2f, 17.2f)
                curveToRelative(0.0f, -47.2f, 50.5f, -56.7f, 84.2f, -57.8f)
                verticalLineToRelative(40.6f)
                close()
                moveTo(393.2f, 413.0f)
                curveToRelative(-7.7f, 10.0f, -70.0f, 67.0f, -174.5f, 67.0f)
                reflectiveCurveTo(34.2f, 408.5f, 9.7f, 379.0f)
                curveToRelative(-6.8f, -7.7f, 1.0f, -11.3f, 5.5f, -8.3f)
                curveTo(88.5f, 415.2f, 203.0f, 488.5f, 387.7f, 401.0f)
                curveToRelative(7.5f, -3.7f, 13.3f, 2.0f, 5.5f, 12.0f)
                close()
                moveTo(433.0f, 415.2f)
                curveToRelative(-6.5f, 15.8f, -16.0f, 26.8f, -21.2f, 31.0f)
                curveToRelative(-5.5f, 4.5f, -9.5f, 2.7f, -6.5f, -3.8f)
                reflectiveCurveToRelative(19.3f, -46.5f, 12.7f, -55.0f)
                curveToRelative(-6.5f, -8.3f, -37.0f, -4.3f, -48.0f, -3.2f)
                curveToRelative(-10.8f, 1.0f, -13.0f, 2.0f, -14.0f, -0.3f)
                curveToRelative(-2.3f, -5.7f, 21.7f, -15.5f, 37.5f, -17.5f)
                curveToRelative(15.7f, -1.8f, 41.0f, -0.8f, 46.0f, 5.7f)
                curveToRelative(3.7f, 5.1f, 0.0f, 27.1f, -6.5f, 43.1f)
                close()
            }
        }
        .build()
        return _amazon!!
    }

private var _amazon: ImageVector? = null
