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

public val LineAwesomeIcons.Snowflake: ImageVector
    get() {
        if (_snowflake != null) {
            return _snowflake!!
        }
        _snowflake = Builder(name = "Snowflake", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                lineTo(15.0f, 6.5625f)
                lineTo(12.7188f, 4.2813f)
                lineTo(11.2813f, 5.7188f)
                lineTo(15.0f, 9.4375f)
                lineTo(15.0f, 14.25f)
                lineTo(10.875f, 11.7813f)
                lineTo(9.5625f, 6.6875f)
                lineTo(7.625f, 7.1875f)
                lineTo(8.4375f, 10.3125f)
                lineTo(5.375f, 8.4688f)
                lineTo(4.3438f, 10.1563f)
                lineTo(7.4688f, 12.0313f)
                lineTo(4.25f, 12.8438f)
                lineTo(4.75f, 14.7813f)
                lineTo(9.875f, 13.4688f)
                lineTo(14.0938f, 16.0f)
                lineTo(9.875f, 18.5313f)
                lineTo(4.75f, 17.2188f)
                lineTo(4.25f, 19.1563f)
                lineTo(7.4688f, 19.9688f)
                lineTo(4.3438f, 21.8438f)
                lineTo(5.375f, 23.5313f)
                lineTo(8.4375f, 21.6875f)
                lineTo(7.625f, 24.8125f)
                lineTo(9.5625f, 25.3125f)
                lineTo(10.875f, 20.2188f)
                lineTo(15.0f, 17.75f)
                lineTo(15.0f, 22.5625f)
                lineTo(11.2813f, 26.2813f)
                lineTo(12.7188f, 27.7188f)
                lineTo(15.0f, 25.4375f)
                lineTo(15.0f, 29.0f)
                lineTo(17.0f, 29.0f)
                lineTo(17.0f, 25.4375f)
                lineTo(19.2813f, 27.7188f)
                lineTo(20.7188f, 26.2813f)
                lineTo(17.0f, 22.5625f)
                lineTo(17.0f, 17.75f)
                lineTo(21.125f, 20.2188f)
                lineTo(22.4375f, 25.3125f)
                lineTo(24.375f, 24.8125f)
                lineTo(23.5625f, 21.6875f)
                lineTo(26.625f, 23.5313f)
                lineTo(27.6563f, 21.8438f)
                lineTo(24.5313f, 19.9688f)
                lineTo(27.75f, 19.1563f)
                lineTo(27.25f, 17.2188f)
                lineTo(22.125f, 18.5313f)
                lineTo(17.9063f, 16.0f)
                lineTo(22.125f, 13.4688f)
                lineTo(27.25f, 14.7813f)
                lineTo(27.75f, 12.8438f)
                lineTo(24.5313f, 12.0313f)
                lineTo(27.6563f, 10.1563f)
                lineTo(26.625f, 8.4688f)
                lineTo(23.5625f, 10.3125f)
                lineTo(24.375f, 7.1875f)
                lineTo(22.4375f, 6.6875f)
                lineTo(21.125f, 11.7813f)
                lineTo(17.0f, 14.25f)
                lineTo(17.0f, 9.4375f)
                lineTo(20.7188f, 5.7188f)
                lineTo(19.2813f, 4.2813f)
                lineTo(17.0f, 6.5625f)
                lineTo(17.0f, 3.0f)
                close()
            }
        }
        .build()
        return _snowflake!!
    }

private var _snowflake: ImageVector? = null
