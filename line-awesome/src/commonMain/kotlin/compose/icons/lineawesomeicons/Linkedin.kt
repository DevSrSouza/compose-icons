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

public val LineAwesomeIcons.Linkedin: ImageVector
    get() {
        if (_linkedin != null) {
            return _linkedin!!
        }
        _linkedin = Builder(name = "Linkedin", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 5.0f)
                curveTo(6.1328f, 5.0f, 5.0f, 6.1328f, 5.0f, 7.5f)
                lineTo(5.0f, 24.5f)
                curveTo(5.0f, 25.8672f, 6.1328f, 27.0f, 7.5f, 27.0f)
                lineTo(24.5f, 27.0f)
                curveTo(25.8672f, 27.0f, 27.0f, 25.8672f, 27.0f, 24.5f)
                lineTo(27.0f, 7.5f)
                curveTo(27.0f, 6.1328f, 25.8672f, 5.0f, 24.5f, 5.0f)
                close()
                moveTo(7.5f, 7.0f)
                lineTo(24.5f, 7.0f)
                curveTo(24.7852f, 7.0f, 25.0f, 7.2148f, 25.0f, 7.5f)
                lineTo(25.0f, 24.5f)
                curveTo(25.0f, 24.7852f, 24.7852f, 25.0f, 24.5f, 25.0f)
                lineTo(7.5f, 25.0f)
                curveTo(7.2148f, 25.0f, 7.0f, 24.7852f, 7.0f, 24.5f)
                lineTo(7.0f, 7.5f)
                curveTo(7.0f, 7.2148f, 7.2148f, 7.0f, 7.5f, 7.0f)
                close()
                moveTo(10.4375f, 8.7188f)
                curveTo(9.4883f, 8.7188f, 8.7188f, 9.4883f, 8.7188f, 10.4375f)
                curveTo(8.7188f, 11.3867f, 9.4883f, 12.1563f, 10.4375f, 12.1563f)
                curveTo(11.3867f, 12.1563f, 12.1563f, 11.3867f, 12.1563f, 10.4375f)
                curveTo(12.1563f, 9.4883f, 11.3867f, 8.7188f, 10.4375f, 8.7188f)
                close()
                moveTo(19.4688f, 13.2813f)
                curveTo(18.0352f, 13.2813f, 17.082f, 14.0664f, 16.6875f, 14.8125f)
                lineTo(16.625f, 14.8125f)
                lineTo(16.625f, 13.5f)
                lineTo(13.8125f, 13.5f)
                lineTo(13.8125f, 23.0f)
                lineTo(16.75f, 23.0f)
                lineTo(16.75f, 18.3125f)
                curveTo(16.75f, 17.0742f, 16.9961f, 15.875f, 18.5313f, 15.875f)
                curveTo(20.043f, 15.875f, 20.0625f, 17.2734f, 20.0625f, 18.375f)
                lineTo(20.0625f, 23.0f)
                lineTo(23.0f, 23.0f)
                lineTo(23.0f, 17.7813f)
                curveTo(23.0f, 15.2266f, 22.457f, 13.2813f, 19.4688f, 13.2813f)
                close()
                moveTo(9.0f, 13.5f)
                lineTo(9.0f, 23.0f)
                lineTo(11.9688f, 23.0f)
                lineTo(11.9688f, 13.5f)
                close()
            }
        }
        .build()
        return _linkedin!!
    }

private var _linkedin: ImageVector? = null
