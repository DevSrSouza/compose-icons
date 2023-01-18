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

public val IonIcons.LogoAndroid: ImageVector
    get() {
        if (_logoAndroid != null) {
            return _logoAndroid!!
        }
        _logoAndroid = Builder(name = "LogoAndroid", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(380.91f, 199.0f)
                lineToRelative(42.47f, -73.57f)
                arcToRelative(8.63f, 8.63f, 0.0f, false, false, -3.12f, -11.76f)
                arcToRelative(8.52f, 8.52f, 0.0f, false, false, -11.71f, 3.12f)
                lineToRelative(-43.0f, 74.52f)
                curveToRelative(-32.83f, -15.0f, -69.78f, -23.35f, -109.52f, -23.35f)
                reflectiveCurveToRelative(-76.69f, 8.36f, -109.52f, 23.35f)
                lineToRelative(-43.0f, -74.52f)
                arcToRelative(8.6f, 8.6f, 0.0f, true, false, -14.88f, 8.64f)
                lineTo(131.0f, 199.0f)
                curveTo(57.8f, 238.64f, 8.19f, 312.77f, 0.0f, 399.55f)
                lineTo(512.0f, 399.55f)
                curveTo(503.81f, 312.77f, 454.2f, 238.64f, 380.91f, 199.0f)
                close()
                moveTo(138.45f, 327.65f)
                arcToRelative(21.46f, 21.46f, 0.0f, true, true, 21.46f, -21.46f)
                arcTo(21.47f, 21.47f, 0.0f, false, true, 138.45f, 327.65f)
                close()
                moveTo(373.45f, 327.65f)
                arcTo(21.46f, 21.46f, 0.0f, true, true, 395.0f, 306.19f)
                arcTo(21.47f, 21.47f, 0.0f, false, true, 373.49f, 327.65f)
                close()
            }
        }
        .build()
        return _logoAndroid!!
    }

private var _logoAndroid: ImageVector? = null
