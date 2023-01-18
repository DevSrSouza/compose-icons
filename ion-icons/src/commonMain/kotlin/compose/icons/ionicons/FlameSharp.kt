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

public val IonIcons.FlameSharp: ImageVector
    get() {
        if (_flameSharp != null) {
            return _flameSharp!!
        }
        _flameSharp = Builder(name = "FlameSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(394.24f, 197.56f)
                arcToRelative(300.67f, 300.67f, 0.0f, false, false, -53.38f, -90.0f)
                curveTo(301.2f, 61.65f, 240.0f, 32.0f, 192.0f, 32.0f)
                curveToRelative(19.0f, 70.0f, -14.36f, 117.12f, -44.79f, 163.77f)
                curveTo(122.0f, 234.36f, 96.0f, 274.27f, 96.0f, 320.0f)
                curveToRelative(0.0f, 88.22f, 71.78f, 160.0f, 160.0f, 160.0f)
                reflectiveCurveToRelative(160.0f, -71.78f, 160.0f, -160.0f)
                curveTo(416.0f, 276.7f, 408.68f, 235.51f, 394.24f, 197.56f)
                close()
                moveTo(288.33f, 418.69f)
                curveTo(278.0f, 429.69f, 265.05f, 432.0f, 256.0f, 432.0f)
                reflectiveCurveToRelative(-22.0f, -2.31f, -32.33f, -13.31f)
                reflectiveCurveTo(208.0f, 390.24f, 208.0f, 368.0f)
                curveToRelative(0.0f, -25.14f, 8.82f, -44.28f, 17.34f, -62.78f)
                curveToRelative(6.48f, -14.07f, 14.66f, -27.22f, 15.11f, -44.49f)
                curveToRelative(11.3f, 5.88f, 23.67f, 16.91f, 34.54f, 31.28f)
                curveToRelative(18.17f, 24.0f, 29.0f, 52.42f, 29.0f, 76.0f)
                curveTo(304.0f, 390.24f, 298.58f, 407.77f, 288.33f, 418.69f)
                close()
            }
        }
        .build()
        return _flameSharp!!
    }

private var _flameSharp: ImageVector? = null
