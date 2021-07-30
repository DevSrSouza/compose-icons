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

public val LineAwesomeIcons.StarHalf: ImageVector
    get() {
        if (_starHalf != null) {
            return _starHalf!!
        }
        _starHalf = Builder(name = "StarHalf", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.1328f)
                lineTo(11.8359f, 11.4727f)
                lineTo(1.6641f, 12.5469f)
                lineTo(9.2617f, 19.3945f)
                lineTo(7.1406f, 29.3984f)
                lineTo(16.0f, 24.2891f)
                close()
            }
        }
        .build()
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
