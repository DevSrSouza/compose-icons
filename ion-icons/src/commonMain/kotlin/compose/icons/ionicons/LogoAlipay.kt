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

public val IonIcons.LogoAlipay: ImageVector
    get() {
        if (_logoAlipay != null) {
            return _logoAlipay!!
        }
        _logoAlipay = Builder(name = "LogoAlipay", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(102.41f, 32.0f)
                curveTo(62.38f, 32.0f, 32.0f, 64.12f, 32.0f, 103.78f)
                verticalLineTo(408.23f)
                curveTo(32.0f, 447.86f, 64.38f, 480.0f, 104.41f, 480.0f)
                horizontalLineToRelative(303.2f)
                curveToRelative(40.0f, 0.0f, 72.39f, -32.14f, 72.39f, -71.77f)
                verticalLineToRelative(-3.11f)
                curveToRelative(-1.35f, -0.56f, -115.47f, -48.57f, -174.5f, -76.7f)
                curveToRelative(-39.82f, 48.57f, -91.18f, 78.0f, -144.5f, 78.0f)
                curveToRelative(-90.18f, 0.0f, -120.8f, -78.22f, -78.1f, -129.72f)
                curveToRelative(9.31f, -11.22f, 25.15f, -21.94f, 49.73f, -28.0f)
                curveToRelative(38.45f, -9.36f, 99.64f, 5.85f, 157.0f, 24.61f)
                arcToRelative(309.41f, 309.41f, 0.0f, false, false, 25.46f, -61.67f)
                horizontalLineTo(138.34f)
                verticalLineTo(194.0f)
                horizontalLineToRelative(91.13f)
                verticalLineTo(162.17f)
                horizontalLineTo(119.09f)
                verticalLineTo(144.42f)
                horizontalLineTo(229.47f)
                verticalLineTo(99.0f)
                reflectiveCurveToRelative(0.0f, -7.65f, 7.82f, -7.65f)
                horizontalLineToRelative(44.55f)
                verticalLineToRelative(53.0f)
                horizontalLineTo(391.0f)
                verticalLineToRelative(17.75f)
                horizontalLineTo(281.84f)
                verticalLineTo(194.0f)
                horizontalLineToRelative(89.08f)
                arcToRelative(359.41f, 359.41f, 0.0f, false, true, -37.72f, 94.43f)
                curveToRelative(27.0f, 9.69f, 49.31f, 18.88f, 67.39f, 24.89f)
                curveToRelative(60.32f, 20.0f, 77.23f, 22.45f, 79.41f, 22.7f)
                verticalLineTo(103.78f)
                curveTo(480.0f, 64.12f, 447.6f, 32.0f, 407.61f, 32.0f)
                horizontalLineTo(102.41f)
                close()
                moveTo(152.0f, 274.73f)
                quadToRelative(-5.81f, 0.06f, -11.67f, 0.63f)
                curveToRelative(-11.3f, 1.13f, -32.5f, 6.07f, -44.09f, 16.23f)
                curveToRelative(-34.74f, 30.0f, -13.94f, 84.93f, 56.37f, 84.93f)
                curveToRelative(40.87f, 0.0f, 81.71f, -25.9f, 113.79f, -67.37f)
                curveToRelative(-41.36f, -20.0f, -77.0f, -34.85f, -114.4f, -34.42f)
                close()
            }
        }
        .build()
        return _logoAlipay!!
    }

private var _logoAlipay: ImageVector? = null
