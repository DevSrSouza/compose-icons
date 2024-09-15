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

public val LineAwesomeIcons.Js: ImageVector
    get() {
        if (_js != null) {
            return _js!!
        }
        _js = Builder(name = "Js", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth =
                32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 7.0f)
                lineTo(0.0f, 25.0f)
                lineTo(32.0f, 25.0f)
                lineTo(32.0f, 7.0f)
                close()
                moveTo(2.0f, 9.0f)
                lineTo(30.0f, 9.0f)
                lineTo(30.0f, 23.0f)
                lineTo(2.0f, 23.0f)
                close()
                moveTo(12.0f, 12.0f)
                lineTo(12.0f, 17.5f)
                curveTo(12.0f, 17.715f, 11.715f, 18.0f, 11.5f, 18.0f)
                curveTo(11.285f, 18.0f, 11.0f, 17.715f, 11.0f, 17.5f)
                lineTo(11.0f, 17.0f)
                lineTo(9.0f, 17.0f)
                lineTo(9.0f, 17.5f)
                curveTo(9.0f, 18.883f, 10.117f, 20.0f, 11.5f, 20.0f)
                curveTo(12.883f, 20.0f, 14.0f, 18.883f, 14.0f, 17.5f)
                lineTo(14.0f, 12.0f)
                close()
                moveTo(18.5f, 12.0f)
                curveTo(17.117f, 12.0f, 16.0f, 13.117f, 16.0f, 14.5f)
                curveTo(16.0f, 15.883f, 17.117f, 17.0f, 18.5f, 17.0f)
                curveTo(18.715f, 17.0f, 19.0f, 17.285f, 19.0f, 17.5f)
                curveTo(19.0f, 17.801f, 18.883f, 18.0f, 18.5f, 18.0f)
                curveTo(18.133f, 18.0f, 18.074f, 17.922f, 18.063f, 17.906f)
                curveTo(18.051f, 17.891f, 18.0f, 17.828f, 18.0f, 17.594f)
                lineTo(16.0f, 17.594f)
                curveTo(16.0f, 18.16f, 16.164f, 18.797f, 16.625f, 19.281f)
                curveTo(17.086f, 19.766f, 17.77f, 20.0f, 18.5f, 20.0f)
                curveTo(19.918f, 20.0f, 21.0f, 18.801f, 21.0f, 17.5f)
                curveTo(21.0f, 16.117f, 19.883f, 15.0f, 18.5f, 15.0f)
                curveTo(18.285f, 15.0f, 18.0f, 14.715f, 18.0f, 14.5f)
                curveTo(18.0f, 14.285f, 18.285f, 14.0f, 18.5f, 14.0f)
                curveTo(18.766f, 14.0f, 18.848f, 14.063f, 18.906f, 14.125f)
                curveTo(18.965f, 14.188f, 19.0f, 14.293f, 19.0f, 14.406f)
                lineTo(21.0f, 14.406f)
                curveTo(21.0f, 13.816f, 20.785f, 13.215f, 20.344f, 12.75f)
                curveTo(19.902f, 12.285f, 19.234f, 12.0f, 18.5f, 12.0f)
                close()
            }
        }
        .build()
        return _js!!
    }

private var _js: ImageVector? = null
