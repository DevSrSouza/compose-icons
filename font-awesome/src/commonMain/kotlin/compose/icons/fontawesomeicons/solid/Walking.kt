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

public val SolidGroup.Walking: ImageVector
    get() {
        if (_walking != null) {
            return _walking!!
        }
        _walking = Builder(name = "Walking", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 96.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                reflectiveCurveTo(234.5f, 0.0f, 208.0f, 0.0f)
                reflectiveCurveToRelative(-48.0f, 21.5f, -48.0f, 48.0f)
                reflectiveCurveToRelative(21.5f, 48.0f, 48.0f, 48.0f)
                close()
                moveTo(302.5f, 245.1f)
                lineToRelative(-23.3f, -11.8f)
                lineToRelative(-9.7f, -29.4f)
                curveToRelative(-14.7f, -44.6f, -55.7f, -75.8f, -102.2f, -75.9f)
                curveToRelative(-36.0f, -0.1f, -55.9f, 10.1f, -93.3f, 25.2f)
                curveToRelative(-21.6f, 8.7f, -39.3f, 25.2f, -49.7f, 46.2f)
                lineTo(17.6f, 213.0f)
                curveToRelative(-7.8f, 15.8f, -1.5f, 35.0f, 14.2f, 42.9f)
                curveToRelative(15.6f, 7.9f, 34.6f, 1.5f, 42.5f, -14.3f)
                lineTo(81.0f, 228.0f)
                curveToRelative(3.5f, -7.0f, 9.3f, -12.5f, 16.5f, -15.4f)
                lineToRelative(26.8f, -10.8f)
                lineToRelative(-15.2f, 60.7f)
                curveToRelative(-5.2f, 20.8f, 0.4f, 42.9f, 14.9f, 58.8f)
                lineToRelative(59.9f, 65.4f)
                curveToRelative(7.2f, 7.9f, 12.3f, 17.4f, 14.9f, 27.7f)
                lineToRelative(18.3f, 73.3f)
                curveToRelative(4.3f, 17.1f, 21.7f, 27.6f, 38.8f, 23.3f)
                curveToRelative(17.1f, -4.3f, 27.6f, -21.7f, 23.3f, -38.8f)
                lineToRelative(-22.2f, -89.0f)
                curveToRelative(-2.6f, -10.3f, -7.7f, -19.9f, -14.9f, -27.7f)
                lineToRelative(-45.5f, -49.7f)
                lineToRelative(17.2f, -68.7f)
                lineToRelative(5.5f, 16.5f)
                curveToRelative(5.3f, 16.1f, 16.7f, 29.4f, 31.7f, 37.0f)
                lineToRelative(23.3f, 11.8f)
                curveToRelative(15.6f, 7.9f, 34.6f, 1.5f, 42.5f, -14.3f)
                curveToRelative(7.7f, -15.7f, 1.4f, -35.1f, -14.3f, -43.0f)
                close()
                moveTo(73.6f, 385.8f)
                curveToRelative(-3.2f, 8.1f, -8.0f, 15.4f, -14.2f, 21.5f)
                lineToRelative(-50.0f, 50.1f)
                curveToRelative(-12.5f, 12.5f, -12.5f, 32.8f, 0.0f, 45.3f)
                reflectiveCurveToRelative(32.7f, 12.5f, 45.2f, 0.0f)
                lineToRelative(59.4f, -59.4f)
                curveToRelative(6.1f, -6.1f, 10.9f, -13.4f, 14.2f, -21.5f)
                lineToRelative(13.5f, -33.8f)
                curveToRelative(-55.3f, -60.3f, -38.7f, -41.8f, -47.4f, -53.7f)
                lineToRelative(-20.7f, 51.5f)
                close()
            }
        }
        .build()
        return _walking!!
    }

private var _walking: ImageVector? = null
