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

public val IonIcons.KeySharp: ImageVector
    get() {
        if (_keySharp != null) {
            return _keySharp!!
        }
        _keySharp = Builder(name = "KeySharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.1f, 167.2f)
                curveToRelative(0.0f, 13.0f, 0.0f, 25.6f, 4.1f, 37.4f)
                curveTo(179.1f, 255.2f, 54.7f, 399.1f, 54.7f, 399.1f)
                lineToRelative(2.9f, 36.3f)
                reflectiveCurveToRelative(34.8f, 33.0f, 40.0f, 28.0f)
                curveToRelative(15.4f, -15.0f, 24.8f, -25.2f, 24.8f, -25.2f)
                lineToRelative(7.24f, -43.35f)
                lineToRelative(47.11f, -3.47f)
                lineToRelative(3.78f, -46.8f)
                lineToRelative(49.63f, -0.95f)
                lineToRelative(0.49f, -50.09f)
                lineToRelative(52.69f, 2.1f)
                lineToRelative(9.0f, -18.84f)
                curveToRelative(15.5f, 6.7f, 29.6f, 9.4f, 47.7f, 9.4f)
                curveToRelative(68.5f, 0.0f, 124.0f, -53.4f, 124.0f, -119.2f)
                reflectiveCurveTo(408.5f, 48.0f, 340.0f, 48.0f)
                reflectiveCurveTo(218.1f, 101.4f, 218.1f, 167.2f)
                close()
                moveTo(406.85f, 144.0f)
                arcTo(38.85f, 38.85f, 0.0f, true, true, 368.0f, 105.15f)
                arcTo(38.81f, 38.81f, 0.0f, false, true, 406.85f, 144.0f)
                close()
            }
        }
        .build()
        return _keySharp!!
    }

private var _keySharp: ImageVector? = null
