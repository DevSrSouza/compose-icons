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

public val LineAwesomeIcons.StackOverflow: ImageVector
    get() {
        if (_stackOverflow != null) {
            return _stackOverflow!!
        }
        _stackOverflow = Builder(name = "StackOverflow", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.594f, 2.844f)
                lineTo(17.969f, 3.969f)
                lineTo(23.563f, 12.188f)
                lineTo(25.188f, 11.063f)
                close()
                moveTo(15.375f, 6.531f)
                lineTo(14.063f, 8.031f)
                lineTo(21.563f, 14.531f)
                lineTo(22.875f, 13.031f)
                close()
                moveTo(12.375f, 10.906f)
                lineTo(11.469f, 12.688f)
                lineTo(20.313f, 17.188f)
                lineTo(21.219f, 15.406f)
                close()
                moveTo(10.656f, 15.438f)
                lineTo(10.219f, 17.375f)
                lineTo(19.875f, 19.656f)
                lineTo(20.313f, 17.719f)
                close()
                moveTo(6.0f, 18.0f)
                lineTo(6.0f, 29.0f)
                lineTo(24.0f, 29.0f)
                lineTo(24.0f, 18.0f)
                lineTo(22.0f, 18.0f)
                lineTo(22.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                lineTo(8.0f, 18.0f)
                close()
                moveTo(10.094f, 19.688f)
                lineTo(9.969f, 21.688f)
                lineTo(19.875f, 22.25f)
                lineTo(20.0f, 20.25f)
                close()
                moveTo(10.0f, 23.0f)
                lineTo(10.0f, 25.0f)
                lineTo(19.938f, 25.0f)
                lineTo(19.938f, 23.0f)
                close()
            }
        }
        .build()
        return _stackOverflow!!
    }

private var _stackOverflow: ImageVector? = null
