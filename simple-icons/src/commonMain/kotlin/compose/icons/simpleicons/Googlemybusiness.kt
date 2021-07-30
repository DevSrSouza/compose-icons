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

public val SimpleIcons.Googlemybusiness: ImageVector
    get() {
        if (_googlemybusiness != null) {
            return _googlemybusiness!!
        }
        _googlemybusiness = Builder(name = "Googlemybusiness", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.273f, 1.636f)
                curveToRelative(-0.736f, 0.0f, -1.363f, 0.492f, -1.568f, 1.16f)
                lineTo(0.0f, 9.272f)
                curveToRelative(0.0f, 1.664f, 1.336f, 3.0f, 3.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                curveToRelative(0.0f, 1.664f, 1.336f, 3.0f, 3.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                curveToRelative(1.664f, 0.0f, 3.0f, -1.336f, 3.0f, -3.0f)
                curveToRelative(0.0f, 1.664f, 1.336f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.336f, 3.0f, -3.0f)
                lineToRelative(-1.705f, -6.476f)
                arcToRelative(1.646f, 1.646f, 0.0f, false, false, -1.568f, -1.16f)
                close()
                moveTo(12.002f, 10.962f)
                curveToRelative(-0.604f, 1.063f, -1.703f, 1.81f, -3.002f, 1.81f)
                curveToRelative(-1.304f, 0.0f, -2.398f, -0.747f, -3.0f, -1.806f)
                curveToRelative(-0.604f, 1.06f, -1.702f, 1.806f, -3.0f, 1.806f)
                curveToRelative(-0.484f, 0.0f, -0.944f, -0.1f, -1.363f, -0.277f)
                verticalLineToRelative(8.232f)
                curveToRelative(0.0f, 0.9f, 0.736f, 1.637f, 1.636f, 1.637f)
                horizontalLineToRelative(17.454f)
                curveToRelative(0.9f, 0.0f, 1.636f, -0.737f, 1.636f, -1.637f)
                verticalLineToRelative(-8.232f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, true, -1.363f, 0.277f)
                curveToRelative(-1.304f, 0.0f, -2.398f, -0.746f, -3.0f, -1.804f)
                curveToRelative(-0.602f, 1.058f, -1.696f, 1.804f, -3.0f, 1.804f)
                curveToRelative(-1.299f, 0.0f, -2.394f, -0.75f, -2.998f, -1.81f)
                close()
                moveTo(17.727f, 14.727f)
                curveToRelative(0.808f, 0.0f, 1.488f, 0.298f, 2.007f, 0.782f)
                lineToRelative(-0.859f, 0.859f)
                arcToRelative(1.623f, 1.623f, 0.0f, false, false, -1.148f, -0.447f)
                curveToRelative(-0.98f, 0.0f, -1.772f, 0.827f, -1.772f, 1.806f)
                curveToRelative(0.0f, 0.98f, 0.792f, 1.807f, 1.772f, 1.807f)
                curveToRelative(0.882f, 0.0f, 1.485f, -0.501f, 1.615f, -1.191f)
                horizontalLineToRelative(-1.615f)
                verticalLineToRelative(-1.16f)
                horizontalLineToRelative(2.826f)
                curveToRelative(0.035f, 0.196f, 0.054f, 0.4f, 0.054f, 0.613f)
                curveToRelative(0.0f, 1.714f, -1.147f, 2.931f, -2.88f, 2.931f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                close()
            }
        }
        .build()
        return _googlemybusiness!!
    }

private var _googlemybusiness: ImageVector? = null
