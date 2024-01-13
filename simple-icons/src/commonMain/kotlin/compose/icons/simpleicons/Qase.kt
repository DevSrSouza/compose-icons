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

public val SimpleIcons.Qase: ImageVector
    get() {
        if (_qase != null) {
            return _qase!!
        }
        _qase = Builder(name = "Qase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.85f, 18.994f)
                reflectiveCurveToRelative(-0.802f, 0.46f, -1.795f, 0.28f)
                curveToRelative(-0.19f, -0.03f, -0.37f, -0.1f, -0.551f, -0.19f)
                arcToRelative(11.768f, 11.768f, 0.0f, false, false, 2.367f, -7.088f)
                curveTo(23.87f, 5.428f, 18.525f, 0.1f, 11.935f, 0.1f)
                reflectiveCurveTo(0.0f, 5.428f, 0.0f, 11.996f)
                curveToRelative(0.0f, 6.568f, 5.346f, 11.897f, 11.935f, 11.897f)
                curveToRelative(2.087f, 0.0f, 4.042f, -0.54f, 5.747f, -1.47f)
                curveToRelative(0.562f, 0.59f, 1.344f, 1.21f, 2.297f, 1.4f)
                curveToRelative(1.796f, 0.34f, 3.1f, -0.48f, 3.631f, -1.58f)
                curveToRelative(0.451f, -0.96f, 0.482f, -2.1f, 0.24f, -3.249f)
                moveToRelative(-11.925f, -0.13f)
                curveToRelative(-3.79f, 0.0f, -6.88f, -3.079f, -6.88f, -6.858f)
                curveToRelative(0.0f, -3.779f, 3.09f, -6.858f, 6.88f, -6.858f)
                curveToRelative(3.792f, 0.0f, 6.89f, 3.07f, 6.89f, 6.848f)
                curveToRelative(0.0f, 1.16f, -0.29f, 2.26f, -0.812f, 3.22f)
                curveToRelative(-0.15f, -0.19f, -0.28f, -0.37f, -0.37f, -0.49f)
                curveToRelative(-0.352f, -0.48f, -0.713f, -0.97f, -1.064f, -1.47f)
                curveToRelative(-0.461f, -0.65f, -1.524f, -1.95f, -2.989f, -2.23f)
                curveToRelative(-1.795f, -0.34f, -3.099f, 0.48f, -3.63f, 1.58f)
                curveToRelative(-0.452f, 0.96f, -0.482f, 2.1f, -0.251f, 3.239f)
                curveToRelative(0.0f, 0.0f, 0.802f, -0.46f, 1.795f, -0.28f)
                curveToRelative(0.722f, 0.13f, 1.404f, 0.68f, 2.277f, 1.76f)
                curveToRelative(0.07f, 0.09f, 0.371f, 0.49f, 0.772f, 1.01f)
                curveToRelative(-0.802f, 0.34f, -1.685f, 0.53f, -2.618f, 0.53f)
            }
        }
        .build()
        return _qase!!
    }

private var _qase: ImageVector? = null
