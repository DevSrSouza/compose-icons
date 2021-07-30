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

public val WeatherIcons.GaleWarning: ImageVector
    get() {
        if (_galeWarning != null) {
            return _galeWarning!!
        }
        _galeWarning = Builder(name = "GaleWarning", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.67f, 24.6f)
                verticalLineTo(7.45f)
                horizontalLineToRelative(1.03f)
                verticalLineTo(24.6f)
                horizontalLineTo(10.67f)
                close()
                moveTo(12.4f, 22.44f)
                verticalLineToRelative(-7.41f)
                lineToRelative(8.65f, 3.69f)
                lineTo(12.4f, 22.44f)
                close()
                moveTo(12.4f, 14.86f)
                verticalLineTo(7.45f)
                lineToRelative(8.65f, 3.69f)
                lineTo(12.4f, 14.86f)
                close()
            }
        }
        .build()
        return _galeWarning!!
    }

private var _galeWarning: ImageVector? = null
