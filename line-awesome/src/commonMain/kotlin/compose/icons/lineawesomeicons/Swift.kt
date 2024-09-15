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

public val LineAwesomeIcons.Swift: ImageVector
    get() {
        if (_swift != null) {
            return _swift!!
        }
        _swift = Builder(name = "Swift", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.938f, 5.0f)
                curveTo(6.773f, 5.0f, 5.0f, 6.773f, 5.0f, 8.938f)
                lineTo(5.0f, 23.063f)
                curveTo(5.0f, 25.227f, 6.773f, 27.0f, 8.938f, 27.0f)
                lineTo(23.063f, 27.0f)
                curveTo(25.227f, 27.0f, 27.0f, 25.227f, 27.0f, 23.063f)
                lineTo(27.0f, 8.938f)
                curveTo(27.0f, 6.773f, 25.227f, 5.0f, 23.063f, 5.0f)
                close()
                moveTo(8.938f, 7.0f)
                lineTo(23.063f, 7.0f)
                curveTo(24.145f, 7.0f, 25.0f, 7.855f, 25.0f, 8.938f)
                lineTo(25.0f, 23.063f)
                curveTo(25.0f, 24.145f, 24.145f, 25.0f, 23.063f, 25.0f)
                lineTo(8.938f, 25.0f)
                curveTo(7.855f, 25.0f, 7.0f, 24.145f, 7.0f, 23.063f)
                lineTo(7.0f, 8.938f)
                curveTo(7.0f, 7.855f, 7.855f, 7.0f, 8.938f, 7.0f)
                close()
                moveTo(17.625f, 9.5f)
                curveTo(17.625f, 9.5f, 20.129f, 12.66f, 18.844f, 16.219f)
                curveTo(18.844f, 16.219f, 14.336f, 13.023f, 12.063f, 10.719f)
                curveTo(12.063f, 10.719f, 14.891f, 14.816f, 15.906f, 15.656f)
                curveTo(15.906f, 15.656f, 14.211f, 14.754f, 10.281f, 11.406f)
                curveTo(10.281f, 11.406f, 14.816f, 17.301f, 16.938f, 18.531f)
                curveTo(16.938f, 18.531f, 13.711f, 20.723f, 9.0f, 17.625f)
                curveTo(9.0f, 17.625f, 11.461f, 22.0f, 16.688f, 22.0f)
                curveTo(19.035f, 22.0f, 19.742f, 20.781f, 20.906f, 20.781f)
                curveTo(22.117f, 20.781f, 22.844f, 22.0f, 22.844f, 22.0f)
                curveTo(23.551f, 20.273f, 21.781f, 18.313f, 21.781f, 18.313f)
                curveTo(21.781f, 18.313f, 23.777f, 13.684f, 17.625f, 9.5f)
                close()
            }
        }
        .build()
        return _swift!!
    }

private var _swift: ImageVector? = null
