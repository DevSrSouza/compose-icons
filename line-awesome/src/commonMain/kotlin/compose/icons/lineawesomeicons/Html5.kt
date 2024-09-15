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

public val LineAwesomeIcons.Html5: ImageVector
    get() {
        if (_html5 != null) {
            return _html5!!
        }
        _html5 = Builder(name = "Html5", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.219f, 4.0f)
                lineTo(5.313f, 5.094f)
                lineTo(7.063f, 24.875f)
                lineTo(7.125f, 25.563f)
                lineTo(7.781f, 25.75f)
                lineTo(15.719f, 27.969f)
                lineTo(15.969f, 28.031f)
                lineTo(16.25f, 27.969f)
                lineTo(24.188f, 25.781f)
                lineTo(24.844f, 25.594f)
                lineTo(24.906f, 24.906f)
                lineTo(26.688f, 5.094f)
                lineTo(26.781f, 4.031f)
                lineTo(25.688f, 4.031f)
                lineTo(6.313f, 4.0f)
                close()
                moveTo(7.406f, 6.0f)
                lineTo(24.594f, 6.031f)
                lineTo(22.969f, 24.031f)
                lineTo(16.0f, 25.969f)
                lineTo(9.0f, 24.031f)
                close()
                moveTo(9.813f, 9.0f)
                lineTo(10.469f, 16.469f)
                lineTo(19.031f, 16.469f)
                lineTo(18.75f, 19.688f)
                lineTo(16.0f, 20.438f)
                lineTo(15.969f, 20.438f)
                lineTo(13.219f, 19.688f)
                lineTo(13.063f, 17.625f)
                lineTo(10.563f, 17.625f)
                lineTo(10.906f, 21.594f)
                lineTo(15.969f, 23.0f)
                lineTo(16.0f, 23.0f)
                lineTo(21.063f, 21.594f)
                lineTo(21.75f, 14.0f)
                lineTo(12.719f, 14.0f)
                lineTo(12.5f, 11.469f)
                lineTo(21.969f, 11.469f)
                lineTo(22.188f, 9.0f)
                close()
            }
        }
        .build()
        return _html5!!
    }

private var _html5: ImageVector? = null
