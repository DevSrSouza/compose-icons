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

public val IonIcons.HelpCircle: ImageVector
    get() {
        if (_helpCircle != null) {
            return _helpCircle!!
        }
        _helpCircle = Builder(name = "HelpCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 64.0f)
                curveTo(150.0f, 64.0f, 64.0f, 150.0f, 64.0f, 256.0f)
                reflectiveCurveToRelative(86.0f, 192.0f, 192.0f, 192.0f)
                reflectiveCurveToRelative(192.0f, -86.0f, 192.0f, -192.0f)
                reflectiveCurveTo(362.0f, 64.0f, 256.0f, 64.0f)
                close()
                moveTo(250.0f, 368.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 250.0f, 368.0f)
                close()
                moveTo(283.44f, 266.0f)
                curveTo(267.23f, 276.88f, 265.0f, 286.85f, 265.0f, 296.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -28.0f, 0.0f)
                curveToRelative(0.0f, -21.91f, 10.08f, -39.33f, 30.82f, -53.26f)
                curveTo(287.1f, 229.8f, 298.0f, 221.6f, 298.0f, 203.57f)
                curveToRelative(0.0f, -12.26f, -7.0f, -21.57f, -21.49f, -28.46f)
                curveToRelative(-3.41f, -1.62f, -11.0f, -3.2f, -20.34f, -3.09f)
                curveToRelative(-11.72f, 0.15f, -20.82f, 2.95f, -27.83f, 8.59f)
                curveTo(215.12f, 191.25f, 214.0f, 202.83f, 214.0f, 203.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -28.0f, -1.35f)
                curveToRelative(0.11f, -2.43f, 1.8f, -24.32f, 24.77f, -42.8f)
                curveToRelative(11.91f, -9.58f, 27.06f, -14.56f, 45.0f, -14.78f)
                curveToRelative(12.7f, -0.15f, 24.63f, 2.0f, 32.72f, 5.82f)
                curveTo(312.7f, 161.34f, 326.0f, 180.43f, 326.0f, 203.57f)
                curveTo(326.0f, 237.4f, 303.39f, 252.59f, 283.44f, 266.0f)
                close()
            }
        }
        .build()
        return _helpCircle!!
    }

private var _helpCircle: ImageVector? = null
