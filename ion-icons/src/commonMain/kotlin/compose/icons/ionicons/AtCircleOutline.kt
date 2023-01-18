package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.AtCircleOutline: ImageVector
    get() {
        if (_atCircleOutline != null) {
            return _atCircleOutline!!
        }
        _atCircleOutline = Builder(name = "AtCircleOutline", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(448.08f, 256.08f)
                curveToRelative(0.0f, -106.0f, -86.0f, -192.0f, -192.0f, -192.0f)
                reflectiveCurveToRelative(-192.0f, 86.0f, -192.0f, 192.0f)
                reflectiveCurveToRelative(86.0f, 192.0f, 192.0f, 192.0f)
                reflectiveCurveTo(448.08f, 362.11f, 448.08f, 256.08f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 28.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(300.81f, 358.29f)
                curveToRelative(-20.83f, 7.42f, -34.05f, 9.59f, -54.19f, 9.59f)
                curveToRelative(-61.17f, 0.0f, -106.39f, -50.07f, -101.0f, -111.84f)
                reflectiveCurveTo(205.0f, 144.21f, 266.14f, 144.21f)
                curveToRelative(68.92f, 0.0f, 106.79f, 45.55f, 101.47f, 106.55f)
                curveToRelative(-4.0f, 45.54f, -32.8f, 58.66f, -47.89f, 56.0f)
                curveToRelative(-14.2f, -2.55f, -25.92f, -15.52f, -23.75f, -40.35f)
                lineToRelative(5.62f, -44.66f)
                curveToRelative(-7.58f, -9.17f, -28.11f, -18.0f, -49.93f, -14.54f)
                curveTo(231.77f, 210.3f, 209.0f, 228.0f, 206.56f, 256.0f)
                reflectiveCurveToRelative(14.49f, 50.84f, 39.93f, 50.84f)
                reflectiveCurveToRelative(47.86f, -18.39f, 50.69f, -50.84f)
            }
        }
        .build()
        return _atCircleOutline!!
    }

private var _atCircleOutline: ImageVector? = null
