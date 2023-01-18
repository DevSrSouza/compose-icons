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

public val IonIcons.SpeedometerSharp: ImageVector
    get() {
        if (_speedometerSharp != null) {
            return _speedometerSharp!!
        }
        _speedometerSharp = Builder(name = "SpeedometerSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(123.46f, 48.0f, 16.0f, 156.55f, 16.0f, 290.56f)
                arcTo(243.3f, 243.3f, 0.0f, false, false, 76.32f, 451.43f)
                curveToRelative(1.18f, 1.3f, 2.25f, 2.6f, 3.43f, 3.79f)
                curveTo(89.2f, 464.0f, 92.07f, 464.0f, 99.57f, 464.0f)
                reflectiveCurveToRelative(12.43f, 0.0f, 19.93f, -8.88f)
                curveTo(152.0f, 416.64f, 202.0f, 400.0f, 256.0f, 400.0f)
                reflectiveCurveToRelative(104.07f, 16.71f, 136.5f, 55.12f)
                curveTo(400.0f, 464.0f, 404.82f, 464.0f, 412.43f, 464.0f)
                reflectiveCurveToRelative(11.3f, 0.0f, 19.82f, -8.78f)
                curveToRelative(1.22f, -1.25f, 2.25f, -2.49f, 3.43f, -3.79f)
                arcTo(243.3f, 243.3f, 0.0f, false, false, 496.0f, 290.56f)
                curveTo(496.0f, 156.55f, 388.54f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(240.0f, 112.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(64.0f)
                lineTo(240.0f, 176.0f)
                close()
                moveTo(144.0f, 304.0f)
                lineTo(80.0f, 304.0f)
                lineTo(80.0f, 272.0f)
                horizontalLineToRelative(64.0f)
                close()
                moveTo(165.49f, 220.12f)
                lineTo(120.24f, 174.86f)
                lineTo(142.86f, 152.24f)
                lineTo(188.12f, 197.49f)
                close()
                moveTo(278.6f, 307.4f)
                arcToRelative(31.0f, 31.0f, 0.0f, false, true, -7.0f, 7.0f)
                arcToRelative(30.11f, 30.11f, 0.0f, false, true, -35.0f, -49.0f)
                lineTo(320.0f, 224.0f)
                close()
                moveTo(323.88f, 197.49f)
                lineTo(369.14f, 152.24f)
                lineTo(391.76f, 174.86f)
                lineTo(346.51f, 220.12f)
                close()
                moveTo(432.0f, 304.0f)
                lineTo(368.0f, 304.0f)
                lineTo(368.0f, 272.0f)
                horizontalLineToRelative(64.0f)
                close()
            }
        }
        .build()
        return _speedometerSharp!!
    }

private var _speedometerSharp: ImageVector? = null
