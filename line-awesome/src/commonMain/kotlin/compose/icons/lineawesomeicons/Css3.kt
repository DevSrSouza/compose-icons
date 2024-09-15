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

public val LineAwesomeIcons.Css3: ImageVector
    get() {
        if (_css3 != null) {
            return _css3!!
        }
        _css3 = Builder(name = "Css3", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.219f, 5.0f)
                lineTo(8.063f, 5.813f)
                lineTo(7.563f, 8.688f)
                lineTo(7.344f, 9.875f)
                lineTo(21.469f, 9.875f)
                lineTo(21.156f, 11.688f)
                lineTo(7.031f, 11.688f)
                lineTo(6.875f, 12.5f)
                lineTo(6.375f, 15.375f)
                lineTo(6.156f, 16.531f)
                lineTo(20.281f, 16.531f)
                lineTo(19.563f, 20.594f)
                lineTo(14.344f, 23.0f)
                lineTo(10.25f, 20.75f)
                lineTo(10.469f, 19.531f)
                lineTo(10.688f, 18.375f)
                lineTo(5.813f, 18.375f)
                lineTo(5.688f, 19.188f)
                lineTo(5.0f, 23.0f)
                lineTo(4.844f, 23.75f)
                lineTo(5.531f, 24.094f)
                lineTo(13.344f, 27.906f)
                lineTo(13.75f, 28.094f)
                lineTo(14.156f, 27.938f)
                lineTo(23.313f, 24.094f)
                lineTo(23.813f, 23.906f)
                lineTo(23.938f, 23.344f)
                lineTo(27.0f, 6.188f)
                lineTo(27.219f, 5.0f)
                close()
                moveTo(9.875f, 7.0f)
                lineTo(24.813f, 7.0f)
                lineTo(22.063f, 22.469f)
                lineTo(13.781f, 25.875f)
                lineTo(7.094f, 22.625f)
                lineTo(7.5f, 20.375f)
                lineTo(8.281f, 20.375f)
                lineTo(8.031f, 21.813f)
                lineTo(8.656f, 22.156f)
                lineTo(13.813f, 25.0f)
                lineTo(14.25f, 25.25f)
                lineTo(14.719f, 25.031f)
                lineTo(20.875f, 22.188f)
                lineTo(21.344f, 21.969f)
                lineTo(21.438f, 21.438f)
                lineTo(22.469f, 15.719f)
                lineTo(22.688f, 14.531f)
                lineTo(8.563f, 14.531f)
                lineTo(8.688f, 13.688f)
                lineTo(22.844f, 13.688f)
                lineTo(22.969f, 12.844f)
                lineTo(23.656f, 9.031f)
                lineTo(23.875f, 7.875f)
                lineTo(9.75f, 7.875f)
                close()
            }
        }
        .build()
        return _css3!!
    }

private var _css3: ImageVector? = null
