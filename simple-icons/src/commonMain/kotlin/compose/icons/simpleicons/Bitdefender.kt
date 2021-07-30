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

public val SimpleIcons.Bitdefender: ImageVector
    get() {
        if (_bitdefender != null) {
            return _bitdefender!!
        }
        _bitdefender = Builder(name = "Bitdefender", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.685f, 0.0f)
                verticalLineToRelative(0.357f)
                lineToRelative(1.232f, 1.046f)
                curveToRelative(1.477f, 1.204f, 1.67f, 1.439f, 1.67f, 2.526f)
                lineTo(4.587f, 24.0f)
                horizontalLineToRelative(8.646f)
                curveToRelative(4.537f, 0.0f, 9.083f, -1.629f, 9.083f, -6.849f)
                curveToRelative(0.0f, -3.082f, -2.174f, -5.458f, -5.186f, -5.797f)
                verticalLineToRelative(-0.067f)
                curveToRelative(2.475f, -0.745f, 4.169f, -2.54f, 4.169f, -5.253f)
                curveToRelative(0.0f, -4.372f, -3.73f, -6.032f, -7.349f, -6.032f)
                lineTo(1.686f, 0.0f)
                close()
                moveTo(8.861f, 3.664f)
                horizontalLineToRelative(3.524f)
                curveToRelative(2.383f, 0.0f, 3.121f, 0.327f, 3.844f, 1.013f)
                curveToRelative(0.548f, 0.521f, 0.799f, 1.237f, 0.801f, 2.07f)
                curveToRelative(0.0f, 0.775f, -0.267f, 1.466f, -0.831f, 2.004f)
                curveToRelative(-0.705f, 0.676f, -1.674f, 1.011f, -3.443f, 1.011f)
                lineTo(8.862f, 9.762f)
                lineTo(8.862f, 3.664f)
                close()
                moveTo(8.861f, 13.422f)
                horizontalLineToRelative(4.099f)
                curveToRelative(3.456f, 0.0f, 5.085f, 0.881f, 5.085f, 3.39f)
                curveToRelative(0.0f, 3.153f, -3.055f, 3.526f, -5.256f, 3.526f)
                lineTo(8.86f, 20.338f)
                verticalLineToRelative(-6.916f)
                close()
            }
        }
        .build()
        return _bitdefender!!
    }

private var _bitdefender: ImageVector? = null
