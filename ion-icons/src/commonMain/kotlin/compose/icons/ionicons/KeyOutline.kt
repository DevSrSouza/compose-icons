package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.KeyOutline: ImageVector
    get() {
        if (_keyOutline != null) {
            return _keyOutline!!
        }
        _keyOutline = Builder(name = "KeyOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(218.1f, 167.17f)
                curveToRelative(0.0f, 13.0f, 0.0f, 25.6f, 4.1f, 37.4f)
                curveToRelative(-43.1f, 50.6f, -156.9f, 184.3f, -167.5f, 194.5f)
                arcToRelative(20.17f, 20.17f, 0.0f, false, false, -6.7f, 15.0f)
                curveToRelative(0.0f, 8.5f, 5.2f, 16.7f, 9.6f, 21.3f)
                curveToRelative(6.6f, 6.9f, 34.8f, 33.0f, 40.0f, 28.0f)
                curveToRelative(15.4f, -15.0f, 18.5f, -19.0f, 24.8f, -25.2f)
                curveToRelative(9.5f, -9.3f, -1.0f, -28.3f, 2.3f, -36.0f)
                reflectiveCurveToRelative(6.8f, -9.2f, 12.5f, -10.4f)
                reflectiveCurveToRelative(15.8f, 2.9f, 23.7f, 3.0f)
                curveToRelative(8.3f, 0.1f, 12.8f, -3.4f, 19.0f, -9.2f)
                curveToRelative(5.0f, -4.6f, 8.6f, -8.9f, 8.7f, -15.6f)
                curveToRelative(0.2f, -9.0f, -12.8f, -20.9f, -3.1f, -30.4f)
                reflectiveCurveToRelative(23.7f, 6.2f, 34.0f, 5.0f)
                reflectiveCurveToRelative(22.8f, -15.5f, 24.1f, -21.6f)
                reflectiveCurveToRelative(-11.7f, -21.8f, -9.7f, -30.7f)
                curveToRelative(0.7f, -3.0f, 6.8f, -10.0f, 11.4f, -11.0f)
                reflectiveCurveToRelative(25.0f, 6.9f, 29.6f, 5.9f)
                curveToRelative(5.6f, -1.2f, 12.1f, -7.1f, 17.4f, -10.4f)
                curveToRelative(15.5f, 6.7f, 29.6f, 9.4f, 47.7f, 9.4f)
                curveToRelative(68.5f, 0.0f, 124.0f, -53.4f, 124.0f, -119.2f)
                reflectiveCurveTo(408.5f, 48.0f, 340.0f, 48.0f)
                reflectiveCurveTo(218.1f, 101.37f, 218.1f, 167.17f)
                close()
                moveTo(400.0f, 144.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 400.0f, 144.0f)
                close()
            }
        }
        .build()
        return _keyOutline!!
    }

private var _keyOutline: ImageVector? = null
