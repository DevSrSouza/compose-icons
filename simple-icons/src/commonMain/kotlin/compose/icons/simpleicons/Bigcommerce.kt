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

public val SimpleIcons.Bigcommerce: ImageVector
    get() {
        if (_bigcommerce != null) {
            return _bigcommerce!!
        }
        _bigcommerce = Builder(name = "Bigcommerce", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.645f, 13.663f)
                horizontalLineToRelative(3.027f)
                curveToRelative(0.861f, 0.0f, 1.406f, -0.474f, 1.406f, -1.235f)
                curveToRelative(0.0f, -0.717f, -0.545f, -1.234f, -1.406f, -1.234f)
                horizontalLineToRelative(-3.027f)
                curveToRelative(-0.1f, 0.0f, -0.187f, 0.086f, -0.187f, 0.172f)
                verticalLineToRelative(2.125f)
                curveToRelative(0.015f, 0.1f, 0.086f, 0.172f, 0.187f, 0.172f)
                close()
                moveTo(12.645f, 18.559f)
                horizontalLineToRelative(3.128f)
                curveToRelative(0.961f, 0.0f, 1.535f, -0.488f, 1.535f, -1.35f)
                curveToRelative(0.0f, -0.746f, -0.545f, -1.35f, -1.535f, -1.35f)
                horizontalLineToRelative(-3.128f)
                curveToRelative(-0.1f, 0.0f, -0.187f, 0.087f, -0.187f, 0.173f)
                verticalLineToRelative(2.34f)
                curveToRelative(0.015f, 0.115f, 0.086f, 0.187f, 0.187f, 0.187f)
                close()
                moveTo(23.72f, 0.053f)
                lineToRelative(-8.953f, 8.93f)
                horizontalLineToRelative(1.464f)
                curveToRelative(2.281f, 0.0f, 3.63f, 1.435f, 3.63f, 3.0f)
                curveToRelative(0.0f, 1.235f, -0.832f, 2.14f, -1.722f, 2.541f)
                curveToRelative(-0.143f, 0.058f, -0.143f, 0.259f, 0.014f, 0.316f)
                curveToRelative(1.033f, 0.402f, 1.765f, 1.48f, 1.765f, 2.742f)
                curveToRelative(0.0f, 1.78f, -1.19f, 3.202f, -3.5f, 3.202f)
                horizontalLineToRelative(-6.342f)
                curveToRelative(-0.1f, 0.0f, -0.187f, -0.086f, -0.187f, -0.172f)
                lineTo(9.889f, 13.85f)
                lineTo(0.062f, 23.64f)
                curveToRelative(-0.13f, 0.13f, -0.043f, 0.359f, 0.143f, 0.359f)
                horizontalLineToRelative(23.631f)
                arcToRelative(0.16f, 0.16f, 0.0f, false, false, 0.158f, -0.158f)
                lineTo(23.994f, 0.182f)
                curveToRelative(0.043f, -0.158f, -0.158f, -0.244f, -0.273f, -0.13f)
                close()
            }
        }
        .build()
        return _bigcommerce!!
    }

private var _bigcommerce: ImageVector? = null
