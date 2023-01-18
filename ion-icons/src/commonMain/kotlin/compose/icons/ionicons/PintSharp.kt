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

public val IonIcons.PintSharp: ImageVector
    get() {
        if (_pintSharp != null) {
            return _pintSharp!!
        }
        _pintSharp = Builder(name = "PintSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(399.0f, 99.29f)
                lineTo(394.0f, 16.0f)
                horizontalLineTo(118.45f)
                lineTo(113.0f, 99.26f)
                curveToRelative(-1.29f, 19.24f, -2.23f, 33.14f, 3.73f, 65.66f)
                curveToRelative(1.67f, 9.11f, 5.22f, 22.66f, 9.73f, 39.82f)
                curveToRelative(12.61f, 48.0f, 33.71f, 128.36f, 33.71f, 195.63f)
                verticalLineTo(496.0f)
                horizontalLineTo(351.85f)
                verticalLineTo(400.38f)
                curveToRelative(0.0f, -77.09f, 21.31f, -153.29f, 34.0f, -198.81f)
                curveToRelative(4.38f, -15.63f, 7.83f, -28.0f, 9.41f, -36.62f)
                curveTo(401.27f, 132.44f, 400.33f, 118.53f, 399.0f, 99.29f)
                close()
                moveTo(146.23f, 80.0f)
                lineToRelative(2.0f, -32.0f)
                horizontalLineTo(363.75f)
                lineToRelative(2.0f, 32.0f)
                close()
            }
        }
        .build()
        return _pintSharp!!
    }

private var _pintSharp: ImageVector? = null
