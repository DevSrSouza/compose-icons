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
                lineTo(15.0f, 6.563f)
                lineTo(12.719f, 4.281f)
                lineTo(11.281f, 5.719f)
                lineTo(15.0f, 9.438f)
                lineTo(15.0f, 14.25f)
                lineTo(10.875f, 11.781f)
                lineTo(9.563f, 6.688f)
                lineTo(7.625f, 7.188f)
                lineTo(8.438f, 10.313f)
                lineTo(5.375f, 8.469f)
                lineTo(4.344f, 10.156f)
                lineTo(7.469f, 12.031f)
                lineTo(4.25f, 12.844f)
                lineTo(4.75f, 14.781f)
                lineTo(9.875f, 13.469f)
                lineTo(14.094f, 16.0f)
                lineTo(9.875f, 18.531f)
                lineTo(4.75f, 17.219f)
                lineTo(4.25f, 19.156f)
                lineTo(7.469f, 19.969f)
                lineTo(4.344f, 21.844f)
                lineTo(5.375f, 23.531f)
                lineTo(8.438f, 21.688f)
                lineTo(7.625f, 24.813f)
                lineTo(9.563f, 25.313f)
                lineTo(10.875f, 20.219f)
                lineTo(15.0f, 17.75f)
                lineTo(15.0f, 22.563f)
                lineTo(11.281f, 26.281f)
                lineTo(12.719f, 27.719f)
                lineTo(15.0f, 25.438f)
                lineTo(15.0f, 29.0f)
                lineTo(17.0f, 29.0f)
                lineTo(17.0f, 25.438f)
                lineTo(19.281f, 27.719f)
                lineTo(20.719f, 26.281f)
                lineTo(17.0f, 22.563f)
                lineTo(17.0f, 17.75f)
                lineTo(21.125f, 20.219f)
                lineTo(22.438f, 25.313f)
                lineTo(24.375f, 24.813f)
                lineTo(23.563f, 21.688f)
                lineTo(26.625f, 23.531f)
                lineTo(27.656f, 21.844f)
                lineTo(24.531f, 19.969f)
                lineTo(27.75f, 19.156f)
                lineTo(27.25f, 17.219f)
                lineTo(22.125f, 18.531f)
                lineTo(17.906f, 16.0f)
                lineTo(22.125f, 13.469f)
                lineTo(27.25f, 14.781f)
                lineTo(27.75f, 12.844f)
                lineTo(24.531f, 12.031f)
                lineTo(27.656f, 10.156f)
                lineTo(26.625f, 8.469f)
                lineTo(23.563f, 10.313f)
                lineTo(24.375f, 7.188f)
                lineTo(22.438f, 6.688f)
                lineTo(21.125f, 11.781f)
                lineTo(17.0f, 14.25f)
                lineTo(17.0f, 9.438f)
                lineTo(20.719f, 5.719f)
                lineTo(19.281f, 4.281f)
                lineTo(17.0f, 6.563f)
                lineTo(17.0f, 3.0f)
                close()
            }
        }
        .build()
        return _snowflake!!
    }

private var _snowflake: ImageVector? = null
