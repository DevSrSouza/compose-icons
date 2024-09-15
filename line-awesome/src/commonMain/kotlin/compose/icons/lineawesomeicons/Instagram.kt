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

public val LineAwesomeIcons.Instagram: ImageVector
    get() {
        if (_instagram != null) {
            return _instagram!!
        }
        _instagram = Builder(name = "Instagram", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.469f, 5.0f)
                curveTo(7.918f, 5.0f, 5.0f, 7.914f, 5.0f, 11.469f)
                lineTo(5.0f, 20.531f)
                curveTo(5.0f, 24.082f, 7.914f, 27.0f, 11.469f, 27.0f)
                lineTo(20.531f, 27.0f)
                curveTo(24.082f, 27.0f, 27.0f, 24.086f, 27.0f, 20.531f)
                lineTo(27.0f, 11.469f)
                curveTo(27.0f, 7.918f, 24.086f, 5.0f, 20.531f, 5.0f)
                close()
                moveTo(11.469f, 7.0f)
                lineTo(20.531f, 7.0f)
                curveTo(23.004f, 7.0f, 25.0f, 8.996f, 25.0f, 11.469f)
                lineTo(25.0f, 20.531f)
                curveTo(25.0f, 23.004f, 23.004f, 25.0f, 20.531f, 25.0f)
                lineTo(11.469f, 25.0f)
                curveTo(8.996f, 25.0f, 7.0f, 23.004f, 7.0f, 20.531f)
                lineTo(7.0f, 11.469f)
                curveTo(7.0f, 8.996f, 8.996f, 7.0f, 11.469f, 7.0f)
                close()
                moveTo(21.906f, 9.188f)
                curveTo(21.402f, 9.188f, 21.0f, 9.59f, 21.0f, 10.094f)
                curveTo(21.0f, 10.598f, 21.402f, 11.0f, 21.906f, 11.0f)
                curveTo(22.41f, 11.0f, 22.813f, 10.598f, 22.813f, 10.094f)
                curveTo(22.813f, 9.59f, 22.41f, 9.188f, 21.906f, 9.188f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(12.699f, 10.0f, 10.0f, 12.699f, 10.0f, 16.0f)
                curveTo(10.0f, 19.301f, 12.699f, 22.0f, 16.0f, 22.0f)
                curveTo(19.301f, 22.0f, 22.0f, 19.301f, 22.0f, 16.0f)
                curveTo(22.0f, 12.699f, 19.301f, 10.0f, 16.0f, 10.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(18.223f, 12.0f, 20.0f, 13.777f, 20.0f, 16.0f)
                curveTo(20.0f, 18.223f, 18.223f, 20.0f, 16.0f, 20.0f)
                curveTo(13.777f, 20.0f, 12.0f, 18.223f, 12.0f, 16.0f)
                curveTo(12.0f, 13.777f, 13.777f, 12.0f, 16.0f, 12.0f)
                close()
            }
        }
        .build()
        return _instagram!!
    }

private var _instagram: ImageVector? = null
