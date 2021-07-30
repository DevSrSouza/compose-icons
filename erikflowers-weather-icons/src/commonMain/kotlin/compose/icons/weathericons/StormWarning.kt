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

public val WeatherIcons.StormWarning: ImageVector
    get() {
        if (_stormWarning != null) {
            return _stormWarning!!
        }
        _stormWarning = Builder(name = "StormWarning", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.76f, 24.6f)
                verticalLineTo(7.45f)
                horizontalLineToRelative(1.13f)
                verticalLineTo(24.6f)
                horizontalLineTo(9.76f)
                close()
                moveTo(11.7f, 14.05f)
                verticalLineToRelative(-6.6f)
                horizontalLineToRelative(8.55f)
                verticalLineToRelative(6.6f)
                horizontalLineTo(11.7f)
                close()
                moveTo(14.06f, 12.05f)
                horizontalLineToRelative(3.81f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-3.81f)
                verticalLineTo(12.05f)
                close()
            }
        }
        .build()
        return _stormWarning!!
    }

private var _stormWarning: ImageVector? = null
