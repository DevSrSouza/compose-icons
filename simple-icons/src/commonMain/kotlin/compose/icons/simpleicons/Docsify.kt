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

public val SimpleIcons.Docsify: ImageVector
    get() {
        if (_docsify != null) {
            return _docsify!!
        }
        _docsify = Builder(name = "Docsify", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.862f)
                curveToRelative(-6.617f, 0.0f, -12.0f, 5.383f, -12.0f, 12.0f)
                curveToRelative(0.0f, 1.964f, 0.49f, 3.406f, 1.5f, 4.408f)
                curveToRelative(1.706f, 1.696f, 4.619f, 1.868f, 8.05f, 1.868f)
                curveToRelative(0.43f, 0.0f, 0.87f, -0.002f, 1.315f, -0.005f)
                arcToRelative(217.6f, 217.6f, 0.0f, false, true, 2.765f, 0.0f)
                curveToRelative(3.792f, 0.024f, 7.066f, 0.044f, 8.88f, -1.758f)
                curveTo(23.511f, 18.378f, 24.0f, 16.9f, 24.0f, 14.862f)
                curveToRelative(0.0f, -6.617f, -5.383f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(3.148f, 11.016f)
                arcToRelative(0.393f, 0.393f, 0.0f, true, true, 0.0f, -0.787f)
                arcToRelative(0.393f, 0.393f, 0.0f, false, true, 0.0f, 0.787f)
                close()
                moveTo(5.113f, 8.48f)
                curveToRelative(-0.55f, 0.637f, -1.01f, 1.361f, -1.01f, 1.361f)
                curveToRelative(-0.06f, 0.092f, -0.167f, 0.099f, -0.24f, 0.017f)
                lineToRelative(-0.26f, -0.29f)
                arcToRelative(0.251f, 0.251f, 0.0f, false, true, -0.02f, -0.303f)
                reflectiveCurveToRelative(1.11f, -1.559f, 1.806f, -2.186f)
                curveToRelative(0.25f, -0.225f, 0.248f, -0.239f, 0.891f, -0.692f)
                curveToRelative(0.643f, -0.453f, 1.4f, -0.826f, 1.4f, -0.826f)
                arcToRelative(0.272f, 0.272f, 0.0f, false, true, 0.308f, 0.059f)
                lineToRelative(0.26f, 0.29f)
                curveToRelative(0.075f, 0.082f, 0.056f, 0.186f, -0.04f, 0.235f)
                curveToRelative(0.0f, 0.0f, -1.772f, 0.887f, -2.353f, 1.509f)
                curveToRelative(-0.394f, 0.422f, -0.192f, 0.19f, -0.742f, 0.826f)
                close()
                moveTo(6.689f, 10.623f)
                arcToRelative(1.377f, 1.377f, 0.0f, true, true, 2.754f, 0.0f)
                arcToRelative(1.377f, 1.377f, 0.0f, false, true, -2.754f, 0.0f)
                close()
                moveTo(12.099f, 18.552f)
                curveToRelative(-1.902f, 0.0f, -3.443f, -1.542f, -3.443f, -3.443f)
                reflectiveCurveToRelative(1.644f, -0.854f, 3.545f, -0.854f)
                reflectiveCurveToRelative(3.34f, -1.047f, 3.34f, 0.854f)
                reflectiveCurveToRelative(-1.541f, 3.443f, -3.443f, 3.443f)
                close()
                moveTo(16.72f, 12.0f)
                arcToRelative(1.377f, 1.377f, 0.0f, true, true, 0.0f, -2.754f)
                arcToRelative(1.377f, 1.377f, 0.0f, false, true, 0.0f, 2.754f)
                close()
            }
        }
        .build()
        return _docsify!!
    }

private var _docsify: ImageVector? = null
