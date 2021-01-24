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

public val SolidGroup.Quidditch: ImageVector
    get() {
        if (_quidditch != null) {
            return _quidditch!!
        }
        _quidditch = Builder(name = "Quidditch", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.5f, 216.8f)
                lineTo(343.2f, 326.0f)
                reflectiveCurveToRelative(-16.6f, 102.4f, -76.6f, 150.1f)
                curveTo(206.7f, 523.8f, 0.0f, 510.2f, 0.0f, 510.2f)
                reflectiveCurveToRelative(3.8f, -23.1f, 11.0f, -55.4f)
                lineToRelative(94.6f, -112.2f)
                curveToRelative(4.0f, -4.7f, -0.9f, -11.6f, -6.6f, -9.5f)
                lineToRelative(-60.4f, 22.1f)
                curveToRelative(14.4f, -41.7f, 32.7f, -80.0f, 54.6f, -97.5f)
                curveToRelative(59.9f, -47.8f, 163.3f, -40.9f, 163.3f, -40.9f)
                close()
                moveTo(494.5f, 351.8f)
                curveToRelative(-44.0f, 0.0f, -79.8f, 35.8f, -79.8f, 79.9f)
                curveToRelative(0.0f, 44.1f, 35.7f, 79.9f, 79.8f, 79.9f)
                curveToRelative(44.1f, 0.0f, 79.8f, -35.8f, 79.8f, -79.9f)
                curveToRelative(0.0f, -44.2f, -35.8f, -79.9f, -79.8f, -79.9f)
                close()
                moveTo(636.5f, 31.0f)
                lineTo(616.7f, 6.0f)
                curveToRelative(-5.5f, -6.9f, -15.5f, -8.0f, -22.4f, -2.6f)
                lineTo(361.8f, 181.3f)
                lineToRelative(-34.1f, -43.0f)
                curveToRelative(-5.1f, -6.4f, -15.1f, -5.2f, -18.6f, 2.2f)
                lineToRelative(-25.3f, 54.6f)
                lineToRelative(86.7f, 109.2f)
                lineToRelative(58.8f, -12.4f)
                curveToRelative(8.0f, -1.7f, 11.4f, -11.2f, 6.3f, -17.6f)
                lineToRelative(-34.1f, -42.9f)
                lineTo(634.0f, 53.5f)
                curveToRelative(6.9f, -5.5f, 8.0f, -15.6f, 2.5f, -22.5f)
                close()
            }
        }
        .build()
        return _quidditch!!
    }

private var _quidditch: ImageVector? = null
