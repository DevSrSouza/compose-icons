package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.LogoPinterest: ImageVector
    get() {
        if (_logoPinterest != null) {
            return _logoPinterest!!
        }
        _logoPinterest = Builder(name = "LogoPinterest", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.05f, 32.0f)
                curveToRelative(-123.7f, 0.0f, -224.0f, 100.3f, -224.0f, 224.0f)
                curveToRelative(0.0f, 91.7f, 55.2f, 170.5f, 134.1f, 205.2f)
                curveToRelative(-0.6f, -15.6f, -0.1f, -34.4f, 3.9f, -51.4f)
                curveToRelative(4.3f, -18.2f, 28.8f, -122.1f, 28.8f, -122.1f)
                reflectiveCurveToRelative(-7.2f, -14.3f, -7.2f, -35.4f)
                curveToRelative(0.0f, -33.2f, 19.2f, -58.0f, 43.2f, -58.0f)
                curveToRelative(20.4f, 0.0f, 30.2f, 15.3f, 30.2f, 33.6f)
                curveToRelative(0.0f, 20.5f, -13.1f, 51.1f, -19.8f, 79.5f)
                curveToRelative(-5.6f, 23.8f, 11.9f, 43.1f, 35.4f, 43.1f)
                curveToRelative(42.4f, 0.0f, 71.0f, -54.5f, 71.0f, -119.1f)
                curveToRelative(0.0f, -49.1f, -33.1f, -85.8f, -93.2f, -85.8f)
                curveToRelative(-67.9f, 0.0f, -110.3f, 50.7f, -110.3f, 107.3f)
                curveToRelative(0.0f, 19.5f, 5.8f, 33.3f, 14.8f, 43.9f)
                curveToRelative(4.1f, 4.9f, 4.7f, 6.9f, 3.2f, 12.5f)
                curveToRelative(-1.1f, 4.1f, -3.5f, 14.0f, -4.6f, 18.0f)
                curveToRelative(-1.5f, 5.7f, -6.1f, 7.7f, -11.2f, 5.6f)
                curveToRelative(-31.3f, -12.8f, -45.9f, -47.0f, -45.9f, -85.6f)
                curveToRelative(0.0f, -63.6f, 53.7f, -139.9f, 160.1f, -139.9f)
                curveToRelative(85.5f, 0.0f, 141.8f, 61.9f, 141.8f, 128.3f)
                curveToRelative(0.0f, 87.9f, -48.9f, 153.5f, -120.9f, 153.5f)
                curveToRelative(-24.2f, 0.0f, -46.9f, -13.1f, -54.7f, -27.9f)
                curveToRelative(0.0f, 0.0f, -13.0f, 51.6f, -15.8f, 61.6f)
                curveToRelative(-4.7f, 17.3f, -14.0f, 34.5f, -22.5f, 48.0f)
                arcToRelative(225.13f, 225.13f, 0.0f, false, false, 63.5f, 9.2f)
                curveToRelative(123.7f, 0.0f, 224.0f, -100.3f, 224.0f, -224.0f)
                reflectiveCurveTo(379.75f, 32.0f, 256.05f, 32.0f)
                close()
            }
        }
        .build()
        return _logoPinterest!!
    }

private var _logoPinterest: ImageVector? = null
