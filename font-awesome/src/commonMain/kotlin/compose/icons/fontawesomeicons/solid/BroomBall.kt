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

public val SolidGroup.BroomBall: ImageVector
    get() {
        if (_broomBall != null) {
            return _broomBall!!
        }
        _broomBall = Builder(name = "BroomBall", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(633.3f, 12.4f)
                curveToRelative(10.8f, 14.0f, 8.3f, 34.1f, -5.6f, 44.9f)
                lineToRelative(-144.0f, 112.0f)
                lineToRelative(-72.0f, 56.0f)
                lineTo(403.0f, 232.0f)
                lineToRelative(28.3f, 36.3f)
                curveToRelative(3.7f, 4.8f, 4.4f, 11.2f, 1.8f, 16.7f)
                reflectiveCurveToRelative(-8.1f, 9.0f, -14.1f, 9.1f)
                lineToRelative(-48.0f, 0.9f)
                lineTo(292.3f, 194.2f)
                lineToRelative(12.5f, -46.3f)
                curveToRelative(1.6f, -5.9f, 6.3f, -10.3f, 12.3f, -11.5f)
                reflectiveCurveToRelative(12.0f, 1.1f, 15.8f, 5.8f)
                lineToRelative(30.8f, 39.4f)
                lineToRelative(8.7f, -6.8f)
                lineToRelative(72.0f, -56.0f)
                lineToRelative(144.0f, -112.0f)
                curveToRelative(13.9f, -10.9f, 34.1f, -8.3f, 44.9f, 5.6f)
                close()
                moveTo(269.1f, 476.3f)
                curveToRelative(-55.5f, 43.4f, -215.0f, 34.2f, -252.3f, 31.4f)
                curveToRelative(-5.1f, -0.4f, -9.7f, -2.9f, -12.8f, -7.0f)
                reflectiveCurveToRelative(-4.5f, -9.1f, -3.6f, -14.1f)
                curveToRelative(0.5f, -3.2f, 1.3f, -7.2f, 2.2f, -12.1f)
                curveToRelative(3.0f, -16.5f, 10.8f, -31.6f, 21.9f, -44.1f)
                lineToRelative(73.5f, -82.5f)
                curveToRelative(3.1f, -3.5f, 3.2f, -8.6f, 0.4f, -12.3f)
                reflectiveCurveToRelative(-7.9f, -4.7f, -12.0f, -2.6f)
                lineTo(47.3f, 353.5f)
                curveToRelative(-6.3f, 3.3f, -13.4f, -2.7f, -11.0f, -9.4f)
                curveToRelative(14.3f, -39.9f, 32.7f, -76.9f, 55.5f, -94.7f)
                curveToRelative(57.7f, -45.1f, 175.3f, -35.5f, 175.3f, -35.5f)
                lineToRelative(78.8f, 100.9f)
                reflectiveCurveToRelative(-19.1f, 116.4f, -76.8f, 161.5f)
                close()
                moveTo(496.0f, 512.0f)
                curveToRelative(-44.2f, 0.0f, -80.0f, -35.8f, -80.0f, -80.0f)
                reflectiveCurveToRelative(35.8f, -80.0f, 80.0f, -80.0f)
                reflectiveCurveToRelative(80.0f, 35.8f, 80.0f, 80.0f)
                reflectiveCurveToRelative(-35.8f, 80.0f, -80.0f, 80.0f)
                close()
            }
        }
        .build()
        return _broomBall!!
    }

private var _broomBall: ImageVector? = null
