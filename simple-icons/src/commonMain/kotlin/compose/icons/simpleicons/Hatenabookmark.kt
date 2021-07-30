package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Hatenabookmark: ImageVector
    get() {
        if (_hatenabookmark != null) {
            return _hatenabookmark!!
        }
        _hatenabookmark = Builder(name = "Hatenabookmark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.47f, 0.0f)
                curveTo(22.42f, 0.0f, 24.0f, 1.58f, 24.0f, 3.53f)
                verticalLineToRelative(16.94f)
                curveToRelative(0.0f, 1.95f, -1.58f, 3.53f, -3.53f, 3.53f)
                lineTo(3.53f, 24.0f)
                curveTo(1.58f, 24.0f, 0.0f, 22.42f, 0.0f, 20.47f)
                lineTo(0.0f, 3.53f)
                curveTo(0.0f, 1.58f, 1.58f, 0.0f, 3.53f, 0.0f)
                horizontalLineToRelative(16.94f)
                close()
                moveTo(16.765f, 14.47f)
                curveToRelative(-0.78f, 0.0f, -1.41f, 0.63f, -1.41f, 1.41f)
                reflectiveCurveToRelative(0.63f, 1.414f, 1.41f, 1.414f)
                reflectiveCurveToRelative(1.41f, -0.645f, 1.41f, -1.425f)
                reflectiveCurveToRelative(-0.63f, -1.41f, -1.41f, -1.41f)
                close()
                moveTo(8.61f, 17.247f)
                curveToRelative(1.2f, 0.0f, 2.056f, -0.042f, 2.58f, -0.12f)
                curveToRelative(0.526f, -0.084f, 0.976f, -0.222f, 1.32f, -0.412f)
                curveToRelative(0.45f, -0.232f, 0.78f, -0.564f, 1.02f, -0.99f)
                reflectiveCurveToRelative(0.36f, -0.915f, 0.36f, -1.48f)
                curveToRelative(0.0f, -0.78f, -0.21f, -1.403f, -0.63f, -1.87f)
                curveToRelative(-0.42f, -0.48f, -0.99f, -0.734f, -1.74f, -0.794f)
                curveToRelative(0.66f, -0.18f, 1.156f, -0.45f, 1.456f, -0.81f)
                curveToRelative(0.315f, -0.344f, 0.465f, -0.824f, 0.465f, -1.424f)
                curveToRelative(0.0f, -0.48f, -0.103f, -0.885f, -0.3f, -1.26f)
                curveToRelative(-0.21f, -0.36f, -0.493f, -0.645f, -0.883f, -0.87f)
                curveToRelative(-0.345f, -0.195f, -0.735f, -0.315f, -1.215f, -0.405f)
                curveToRelative(-0.464f, -0.074f, -1.29f, -0.12f, -2.474f, -0.12f)
                lineTo(5.654f, 6.692f)
                verticalLineToRelative(10.486f)
                lineTo(8.61f, 17.178f)
                close()
                moveTo(9.346f, 13.062f)
                curveToRelative(0.705f, 0.0f, 1.185f, 0.088f, 1.44f, 0.262f)
                curveToRelative(0.27f, 0.18f, 0.39f, 0.495f, 0.39f, 0.93f)
                curveToRelative(0.0f, 0.405f, -0.135f, 0.69f, -0.42f, 0.855f)
                curveToRelative(-0.27f, 0.18f, -0.765f, 0.254f, -1.44f, 0.254f)
                lineTo(8.31f, 15.363f)
                verticalLineToRelative(-2.297f)
                horizontalLineToRelative(1.05f)
                close()
                moveTo(18.002f, 13.768f)
                verticalLineToRelative(-7.06f)
                horizontalLineToRelative(-2.46f)
                verticalLineToRelative(7.06f)
                lineTo(18.0f, 13.768f)
                close()
                moveTo(8.925f, 9.08f)
                curveToRelative(0.71f, 0.0f, 1.185f, 0.08f, 1.432f, 0.24f)
                curveToRelative(0.245f, 0.16f, 0.367f, 0.435f, 0.367f, 0.83f)
                curveToRelative(0.0f, 0.38f, -0.13f, 0.646f, -0.39f, 0.804f)
                curveToRelative(-0.265f, 0.154f, -0.747f, 0.232f, -1.452f, 0.232f)
                horizontalLineToRelative(-0.57f)
                lineTo(8.312f, 9.08f)
                horizontalLineToRelative(0.615f)
                close()
            }
        }
        .build()
        return _hatenabookmark!!
    }

private var _hatenabookmark: ImageVector? = null
