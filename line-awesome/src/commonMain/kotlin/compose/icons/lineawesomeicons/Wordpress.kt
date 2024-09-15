package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Wordpress: ImageVector
    get() {
        if (_wordpress != null) {
            return _wordpress!!
        }
        _wordpress = Builder(name = "Wordpress", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.383f, 4.0f, 4.0f, 9.383f, 4.0f, 16.0f)
                curveTo(4.0f, 22.617f, 9.383f, 28.0f, 16.0f, 28.0f)
                curveTo(22.617f, 28.0f, 28.0f, 22.617f, 28.0f, 16.0f)
                curveTo(28.0f, 9.383f, 22.617f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 4.563f)
                curveTo(22.313f, 4.563f, 27.438f, 9.688f, 27.438f, 16.0f)
                curveTo(27.438f, 22.313f, 22.313f, 27.438f, 16.0f, 27.438f)
                curveTo(9.688f, 27.438f, 4.563f, 22.313f, 4.563f, 16.0f)
                curveTo(4.563f, 9.688f, 9.688f, 4.563f, 16.0f, 4.563f)
                close()
                moveTo(16.0f, 5.719f)
                curveTo(12.402f, 5.719f, 9.246f, 7.547f, 7.406f, 10.344f)
                curveTo(7.648f, 10.352f, 7.867f, 10.344f, 8.063f, 10.344f)
                curveTo(9.141f, 10.344f, 10.813f, 10.219f, 10.813f, 10.219f)
                curveTo(11.367f, 10.188f, 11.43f, 10.996f, 10.875f, 11.063f)
                curveTo(10.875f, 11.063f, 10.309f, 11.156f, 9.688f, 11.188f)
                lineTo(13.438f, 22.313f)
                lineTo(15.688f, 15.563f)
                lineTo(14.094f, 11.188f)
                curveTo(13.539f, 11.156f, 13.0f, 11.063f, 13.0f, 11.063f)
                curveTo(12.445f, 11.031f, 12.508f, 10.188f, 13.063f, 10.219f)
                curveTo(13.063f, 10.219f, 14.77f, 10.344f, 15.781f, 10.344f)
                curveTo(16.859f, 10.344f, 18.531f, 10.219f, 18.531f, 10.219f)
                curveTo(19.086f, 10.188f, 19.148f, 10.996f, 18.594f, 11.063f)
                curveTo(18.594f, 11.063f, 18.023f, 11.156f, 17.406f, 11.188f)
                lineTo(21.125f, 22.25f)
                lineTo(22.156f, 18.813f)
                curveTo(22.676f, 17.477f, 22.938f, 16.352f, 22.938f, 15.469f)
                curveTo(22.938f, 14.195f, 22.488f, 13.34f, 22.094f, 12.656f)
                curveTo(21.574f, 11.809f, 21.094f, 11.066f, 21.094f, 10.219f)
                curveTo(21.094f, 9.273f, 21.801f, 8.406f, 22.813f, 8.406f)
                curveTo(22.859f, 8.406f, 22.891f, 8.406f, 22.938f, 8.406f)
                curveTo(21.105f, 6.727f, 18.68f, 5.719f, 16.0f, 5.719f)
                close()
                moveTo(25.031f, 11.063f)
                curveTo(25.078f, 11.391f, 25.094f, 11.746f, 25.094f, 12.125f)
                curveTo(25.094f, 13.168f, 24.898f, 14.344f, 24.313f, 15.813f)
                lineTo(21.188f, 24.906f)
                curveTo(24.25f, 23.121f, 26.281f, 19.797f, 26.281f, 16.0f)
                curveTo(26.281f, 14.211f, 25.836f, 12.527f, 25.031f, 11.063f)
                close()
                moveTo(6.594f, 11.813f)
                curveTo(6.023f, 13.09f, 5.719f, 14.508f, 5.719f, 16.0f)
                curveTo(5.719f, 20.074f, 8.066f, 23.582f, 11.5f, 25.25f)
                close()
                moveTo(16.188f, 16.906f)
                lineTo(13.094f, 25.875f)
                curveTo(14.016f, 26.145f, 14.988f, 26.281f, 16.0f, 26.281f)
                curveTo(17.199f, 26.281f, 18.336f, 26.094f, 19.406f, 25.719f)
                curveTo(19.379f, 25.676f, 19.363f, 25.613f, 19.344f, 25.563f)
                close()
            }
        }
        .build()
        return _wordpress!!
    }

private var _wordpress: ImageVector? = null
