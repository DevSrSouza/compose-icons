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

public val SolidGroup.Umbrella: ImageVector
    get() {
        if (_umbrella != null) {
            return _umbrella!!
        }
        _umbrella = Builder(name = "Umbrella", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(575.7f, 280.8f)
                curveTo(547.1f, 144.5f, 437.3f, 62.6f, 320.0f, 49.9f)
                verticalLineTo(32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(17.9f)
                curveTo(138.3f, 62.6f, 29.5f, 144.5f, 0.3f, 280.8f)
                curveToRelative(-2.2f, 10.1f, 8.5f, 21.3f, 18.7f, 11.4f)
                curveToRelative(52.0f, -55.0f, 107.7f, -52.4f, 158.6f, 37.0f)
                curveToRelative(5.3f, 9.5f, 14.9f, 8.6f, 19.7f, 0.0f)
                curveToRelative(20.2f, -35.4f, 44.9f, -73.2f, 90.7f, -73.2f)
                curveToRelative(58.5f, 0.0f, 88.2f, 68.8f, 90.7f, 73.2f)
                curveToRelative(4.8f, 8.6f, 14.4f, 9.5f, 19.7f, 0.0f)
                curveToRelative(51.0f, -89.5f, 107.1f, -91.4f, 158.6f, -37.0f)
                curveToRelative(10.3f, 10.0f, 20.9f, -1.3f, 18.7f, -11.4f)
                close()
                moveTo(256.0f, 301.7f)
                verticalLineTo(432.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                curveToRelative(-7.8f, 0.0f, -13.2f, -5.3f, -15.1f, -10.7f)
                curveToRelative(-5.9f, -16.7f, -24.1f, -25.4f, -40.8f, -19.5f)
                curveToRelative(-16.7f, 5.9f, -25.4f, 24.2f, -19.5f, 40.8f)
                curveToRelative(11.2f, 31.9f, 41.6f, 53.3f, 75.4f, 53.3f)
                curveToRelative(44.1f, 0.0f, 80.0f, -35.9f, 80.0f, -80.0f)
                verticalLineTo(301.6f)
                curveToRelative(-9.1f, -7.9f, -19.8f, -13.6f, -32.0f, -13.6f)
                curveToRelative(-12.3f, 0.1f, -22.4f, 4.8f, -32.0f, 13.7f)
                close()
            }
        }
        .build()
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
