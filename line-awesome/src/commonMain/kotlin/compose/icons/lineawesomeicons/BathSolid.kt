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

public val LineAwesomeIcons.BathSolid: ImageVector
    get() {
        if (_bathSolid != null) {
            return _bathSolid!!
        }
        _bathSolid = Builder(name = "BathSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.0f, 4.0f)
                curveTo(23.789f, 4.0f, 22.0f, 5.789f, 22.0f, 8.0f)
                lineTo(20.0f, 8.0f)
                lineTo(20.0f, 10.0f)
                lineTo(26.0f, 10.0f)
                lineTo(26.0f, 8.0f)
                lineTo(24.0f, 8.0f)
                curveTo(24.0f, 6.809f, 24.809f, 6.0f, 26.0f, 6.0f)
                curveTo(27.191f, 6.0f, 28.0f, 6.809f, 28.0f, 8.0f)
                lineTo(28.0f, 14.0f)
                lineTo(1.0f, 14.0f)
                lineTo(1.0f, 16.0f)
                lineTo(2.188f, 16.0f)
                lineTo(3.719f, 23.594f)
                lineTo(3.719f, 23.625f)
                curveTo(3.949f, 24.656f, 4.715f, 25.504f, 5.719f, 25.844f)
                lineTo(5.0f, 28.0f)
                lineTo(7.0f, 28.0f)
                lineTo(7.656f, 26.0f)
                lineTo(24.344f, 26.0f)
                lineTo(25.0f, 28.0f)
                lineTo(27.0f, 28.0f)
                lineTo(26.281f, 25.844f)
                curveTo(27.328f, 25.523f, 28.141f, 24.684f, 28.375f, 23.625f)
                lineTo(28.375f, 23.594f)
                lineTo(29.813f, 16.0f)
                lineTo(31.0f, 16.0f)
                lineTo(31.0f, 14.0f)
                lineTo(30.0f, 14.0f)
                lineTo(30.0f, 8.0f)
                curveTo(30.0f, 5.789f, 28.211f, 4.0f, 26.0f, 4.0f)
                close()
                moveTo(4.219f, 16.0f)
                lineTo(27.813f, 16.0f)
                lineTo(26.406f, 23.219f)
                curveTo(26.289f, 23.652f, 25.922f, 24.0f, 25.406f, 24.0f)
                lineTo(6.688f, 24.0f)
                curveTo(6.152f, 24.0f, 5.789f, 23.645f, 5.688f, 23.188f)
                close()
            }
        }
        .build()
        return _bathSolid!!
    }

private var _bathSolid: ImageVector? = null
