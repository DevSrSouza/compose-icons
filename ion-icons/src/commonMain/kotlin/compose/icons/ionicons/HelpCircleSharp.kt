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

public val IonIcons.HelpCircleSharp: ImageVector
    get() {
        if (_helpCircleSharp != null) {
            return _helpCircleSharp!!
        }
        _helpCircleSharp = Builder(name = "HelpCircleSharp", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 64.0f)
                curveTo(150.0f, 64.0f, 64.0f, 150.0f, 64.0f, 256.0f)
                reflectiveCurveToRelative(86.0f, 192.0f, 192.0f, 192.0f)
                reflectiveCurveToRelative(192.0f, -86.0f, 192.0f, -192.0f)
                reflectiveCurveTo(362.0f, 64.0f, 256.0f, 64.0f)
                close()
                moveTo(266.44f, 366.0f)
                lineTo(236.23f, 366.0f)
                arcToRelative(2.57f, 2.57f, 0.0f, false, true, -2.56f, -2.57f)
                verticalLineToRelative(-30.2f)
                arcToRelative(2.57f, 2.57f, 0.0f, false, true, 2.56f, -2.57f)
                horizontalLineToRelative(30.21f)
                arcToRelative(2.57f, 2.57f, 0.0f, false, true, 2.56f, 2.57f)
                verticalLineToRelative(30.2f)
                arcTo(2.57f, 2.57f, 0.0f, false, true, 266.44f, 366.0f)
                close()
                moveTo(283.44f, 267.0f)
                curveTo(267.23f, 277.88f, 265.0f, 287.85f, 265.0f, 297.0f)
                verticalLineToRelative(11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineTo(240.0f, 311.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                lineTo(237.0f, 297.0f)
                curveToRelative(0.0f, -21.91f, 10.08f, -39.33f, 30.82f, -53.26f)
                curveTo(287.1f, 230.8f, 298.0f, 222.6f, 298.0f, 204.57f)
                curveToRelative(0.0f, -12.26f, -7.0f, -21.57f, -21.49f, -28.46f)
                curveToRelative(-3.41f, -1.62f, -11.0f, -3.2f, -20.34f, -3.09f)
                curveToRelative(-11.72f, 0.15f, -20.82f, 2.95f, -27.83f, 8.59f)
                curveTo(215.12f, 192.25f, 214.0f, 203.84f, 214.0f, 204.0f)
                arcToRelative(65.7f, 65.7f, 0.0f, false, false, -0.84f, 10.28f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineTo(188.91f, 217.28f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -2.69f)
                arcToRelative(61.69f, 61.69f, 0.0f, false, true, 0.09f, -12.0f)
                curveToRelative(0.22f, -2.43f, 1.8f, -24.32f, 24.77f, -42.8f)
                curveToRelative(11.91f, -9.58f, 27.06f, -14.56f, 45.0f, -14.78f)
                curveToRelative(12.7f, -0.15f, 24.63f, 2.0f, 32.72f, 5.82f)
                curveTo(312.7f, 162.34f, 326.0f, 181.43f, 326.0f, 204.57f)
                curveTo(326.0f, 238.4f, 303.39f, 253.59f, 283.44f, 267.0f)
                close()
            }
        }
        .build()
        return _helpCircleSharp!!
    }

private var _helpCircleSharp: ImageVector? = null
