package compose.icons.weathericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.WeatherIcons

public val WeatherIcons.SmallCraftAdvisory: ImageVector
    get() {
        if (_smallCraftAdvisory != null) {
            return _smallCraftAdvisory!!
        }
        _smallCraftAdvisory = Builder(name = "SmallCraftAdvisory", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.81f, 24.6f)
                verticalLineTo(7.45f)
                horizontalLineToRelative(1.03f)
                verticalLineTo(24.6f)
                horizontalLineTo(9.81f)
                close()
                moveTo(11.54f, 14.86f)
                verticalLineTo(7.45f)
                lineToRelative(8.65f, 3.69f)
                lineTo(11.54f, 14.86f)
                close()
            }
        }
        .build()
        return _smallCraftAdvisory!!
    }

private var _smallCraftAdvisory: ImageVector? = null
