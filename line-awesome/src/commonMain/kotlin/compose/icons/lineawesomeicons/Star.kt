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

public val LineAwesomeIcons.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.125f)
                lineTo(15.094f, 4.188f)
                lineTo(11.844f, 11.469f)
                lineTo(3.906f, 12.313f)
                lineTo(1.656f, 12.563f)
                lineTo(3.344f, 14.063f)
                lineTo(9.25f, 19.406f)
                lineTo(7.594f, 27.219f)
                lineTo(7.125f, 29.406f)
                lineTo(9.094f, 28.281f)
                lineTo(16.0f, 24.281f)
                lineTo(22.906f, 28.281f)
                lineTo(24.875f, 29.406f)
                lineTo(24.406f, 27.219f)
                lineTo(22.75f, 19.406f)
                lineTo(28.656f, 14.063f)
                lineTo(30.344f, 12.563f)
                lineTo(28.094f, 12.313f)
                lineTo(20.156f, 11.469f)
                lineTo(16.906f, 4.188f)
                close()
                moveTo(16.0f, 7.031f)
                lineTo(18.563f, 12.813f)
                lineTo(18.813f, 13.344f)
                lineTo(19.375f, 13.406f)
                lineTo(25.656f, 14.063f)
                lineTo(20.969f, 18.281f)
                lineTo(20.531f, 18.688f)
                lineTo(20.656f, 19.25f)
                lineTo(21.969f, 25.406f)
                lineTo(16.5f, 22.281f)
                lineTo(16.0f, 21.969f)
                lineTo(15.5f, 22.281f)
                lineTo(10.031f, 25.406f)
                lineTo(11.344f, 19.25f)
                lineTo(11.469f, 18.688f)
                lineTo(11.031f, 18.281f)
                lineTo(6.344f, 14.063f)
                lineTo(12.625f, 13.406f)
                lineTo(13.188f, 13.344f)
                lineTo(13.438f, 12.813f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
