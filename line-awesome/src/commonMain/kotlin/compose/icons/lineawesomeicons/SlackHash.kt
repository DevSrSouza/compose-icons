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

public val LineAwesomeIcons.SlackHash: ImageVector
    get() {
        if (_slackHash != null) {
            return _slackHash!!
        }
        _slackHash = Builder(name = "SlackHash", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.6563f, 3.0f)
                curveTo(17.375f, 2.9766f, 17.0625f, 3.0313f, 16.7813f, 3.125f)
                curveTo(15.6523f, 3.5039f, 15.0586f, 4.7148f, 15.4375f, 5.8438f)
                lineTo(16.3438f, 8.5f)
                lineTo(11.2188f, 10.2188f)
                lineTo(10.375f, 7.6563f)
                curveTo(9.9961f, 6.5273f, 8.7852f, 5.9336f, 7.6563f, 6.3125f)
                curveTo(6.5234f, 6.6914f, 5.9023f, 7.9023f, 6.2813f, 9.0313f)
                lineTo(7.125f, 11.5625f)
                lineTo(4.4688f, 12.4688f)
                curveTo(3.3398f, 12.8477f, 2.7461f, 14.0898f, 3.125f, 15.2188f)
                curveTo(3.5039f, 16.3477f, 4.7148f, 16.9414f, 5.8438f, 16.5625f)
                lineTo(8.5f, 15.6875f)
                lineTo(10.2188f, 20.7813f)
                lineTo(7.6563f, 21.625f)
                curveTo(6.5273f, 22.0039f, 5.9336f, 23.2148f, 6.3125f, 24.3438f)
                curveTo(6.6914f, 25.4766f, 7.9023f, 26.0977f, 9.0313f, 25.7188f)
                lineTo(11.5625f, 24.875f)
                lineTo(12.4688f, 27.5313f)
                curveTo(12.8477f, 28.6602f, 14.0898f, 29.2539f, 15.2188f, 28.875f)
                curveTo(16.3477f, 28.4961f, 16.9414f, 27.2852f, 16.5625f, 26.1563f)
                lineTo(15.6875f, 23.5f)
                lineTo(20.7813f, 21.7813f)
                lineTo(21.625f, 24.3438f)
                curveTo(22.0039f, 25.4727f, 23.2148f, 26.0664f, 24.3438f, 25.6875f)
                curveTo(25.4766f, 25.3086f, 26.0977f, 24.0977f, 25.7188f, 22.9688f)
                lineTo(24.875f, 20.4375f)
                lineTo(27.5313f, 19.5313f)
                curveTo(28.6602f, 19.1523f, 29.2539f, 17.9102f, 28.875f, 16.7813f)
                curveTo(28.4961f, 15.6523f, 27.2852f, 15.0586f, 26.1563f, 15.4375f)
                lineTo(23.5f, 16.3125f)
                lineTo(21.7813f, 11.2188f)
                lineTo(24.3438f, 10.375f)
                curveTo(25.4727f, 9.9961f, 26.0664f, 8.7852f, 25.6875f, 7.6563f)
                curveTo(25.3086f, 6.5273f, 24.0977f, 5.9023f, 22.9688f, 6.2813f)
                lineTo(20.4375f, 7.125f)
                lineTo(19.5313f, 4.4688f)
                curveTo(19.2461f, 3.6211f, 18.4961f, 3.0664f, 17.6563f, 3.0f)
                close()
                moveTo(17.6875f, 12.5938f)
                lineTo(19.4063f, 17.6875f)
                lineTo(14.3125f, 19.4063f)
                lineTo(12.5938f, 14.3125f)
                close()
            }
        }
        .build()
        return _slackHash!!
    }

private var _slackHash: ImageVector? = null
