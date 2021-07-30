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

public val SimpleIcons.Redbubble: ImageVector
    get() {
        if (_redbubble != null) {
            return _redbubble!!
        }
        _redbubble = Builder(name = "Redbubble", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.633f, 16.324f)
                horizontalLineToRelative(-3.199f)
                arcToRelative(0.321f, 0.321f, 0.0f, false, true, -0.32f, -0.322f)
                verticalLineTo(7.974f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, true, 0.32f, -0.32f)
                horizontalLineTo(16.4f)
                curveToRelative(2.226f, 0.0f, 2.693f, 1.31f, 2.693f, 2.408f)
                curveToRelative(0.0f, 0.636f, -0.169f, 1.14f, -0.504f, 1.511f)
                curveToRelative(0.816f, 0.337f, 1.256f, 1.096f, 1.256f, 2.194f)
                curveToRelative(0.0f, 1.601f, -1.201f, 2.557f, -3.212f, 2.557f)
                moveToRelative(-4.644f, 0.0f)
                horizontalLineTo(5.345f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, true, -0.32f, -0.322f)
                verticalLineTo(7.974f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, true, 0.32f, -0.32f)
                horizontalLineToRelative(3.103f)
                curveToRelative(1.939f, 0.0f, 3.096f, 1.043f, 3.096f, 2.791f)
                curveToRelative(0.0f, 1.163f, -0.585f, 2.077f, -1.527f, 2.448f)
                lineToRelative(2.21f, 2.897f)
                arcToRelative(0.322f, 0.322f, 0.0f, false, true, -0.24f, 0.533f)
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.628f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.63f, 0.0f, 12.001f, 0.0f)
            }
        }
        .build()
        return _redbubble!!
    }

private var _redbubble: ImageVector? = null
