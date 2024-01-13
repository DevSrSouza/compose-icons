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

public val SolidGroup.EarthAmericas: ImageVector
    get() {
        if (_earthAmericas != null) {
            return _earthAmericas!!
        }
        _earthAmericas = Builder(name = "EarthAmericas", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(57.7f, 193.0f)
                lineToRelative(9.4f, 16.4f)
                curveToRelative(8.3f, 14.5f, 21.9f, 25.2f, 38.0f, 29.8f)
                lineTo(163.0f, 255.7f)
                curveToRelative(17.2f, 4.9f, 29.0f, 20.6f, 29.0f, 38.5f)
                verticalLineToRelative(39.9f)
                curveToRelative(0.0f, 11.0f, 6.2f, 21.0f, 16.0f, 25.9f)
                reflectiveCurveToRelative(16.0f, 14.9f, 16.0f, 25.9f)
                verticalLineToRelative(39.0f)
                curveToRelative(0.0f, 15.6f, 14.9f, 26.9f, 29.9f, 22.6f)
                curveToRelative(16.1f, -4.6f, 28.6f, -17.5f, 32.7f, -33.8f)
                lineToRelative(2.8f, -11.2f)
                curveToRelative(4.2f, -16.9f, 15.2f, -31.4f, 30.3f, -40.0f)
                lineToRelative(8.1f, -4.6f)
                curveToRelative(15.0f, -8.5f, 24.2f, -24.5f, 24.2f, -41.7f)
                verticalLineToRelative(-8.3f)
                curveToRelative(0.0f, -12.7f, -5.1f, -24.9f, -14.1f, -33.9f)
                lineToRelative(-3.9f, -3.9f)
                curveToRelative(-9.0f, -9.0f, -21.2f, -14.1f, -33.9f, -14.1f)
                horizontalLineTo(257.0f)
                curveToRelative(-11.1f, 0.0f, -22.1f, -2.9f, -31.8f, -8.4f)
                lineToRelative(-34.5f, -19.7f)
                curveToRelative(-4.3f, -2.5f, -7.6f, -6.5f, -9.2f, -11.2f)
                curveToRelative(-3.2f, -9.6f, 1.1f, -20.0f, 10.2f, -24.5f)
                lineToRelative(5.9f, -3.0f)
                curveToRelative(6.6f, -3.3f, 14.3f, -3.9f, 21.3f, -1.5f)
                lineToRelative(23.2f, 7.7f)
                curveToRelative(8.2f, 2.7f, 17.2f, -0.4f, 21.9f, -7.5f)
                curveToRelative(4.7f, -7.0f, 4.2f, -16.3f, -1.2f, -22.8f)
                lineToRelative(-13.6f, -16.3f)
                curveToRelative(-10.0f, -12.0f, -9.9f, -29.5f, 0.3f, -41.3f)
                lineToRelative(15.7f, -18.3f)
                curveToRelative(8.8f, -10.3f, 10.2f, -25.0f, 3.5f, -36.7f)
                lineToRelative(-2.4f, -4.2f)
                curveToRelative(-3.5f, -0.2f, -6.9f, -0.3f, -10.4f, -0.3f)
                curveTo(163.1f, 48.0f, 84.4f, 108.9f, 57.7f, 193.0f)
                close()
                moveTo(464.0f, 256.0f)
                curveToRelative(0.0f, -36.8f, -9.6f, -71.4f, -26.4f, -101.5f)
                lineTo(412.0f, 164.8f)
                curveToRelative(-15.7f, 6.3f, -23.8f, 23.8f, -18.5f, 39.8f)
                lineToRelative(16.9f, 50.7f)
                curveToRelative(3.5f, 10.4f, 12.0f, 18.3f, 22.6f, 20.9f)
                lineToRelative(29.1f, 7.3f)
                curveToRelative(1.2f, -9.0f, 1.8f, -18.2f, 1.8f, -27.5f)
                close()
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, true, 0.0f, 256.0f)
                close()
            }
        }
        .build()
        return _earthAmericas!!
    }

private var _earthAmericas: ImageVector? = null
