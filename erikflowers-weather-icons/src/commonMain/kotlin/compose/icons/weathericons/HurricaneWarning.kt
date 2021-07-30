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

public val WeatherIcons.HurricaneWarning: ImageVector
    get() {
        if (_hurricaneWarning != null) {
            return _hurricaneWarning!!
        }
        _hurricaneWarning = Builder(name = "HurricaneWarning", defaultWidth = 30.0.dp, defaultHeight
                = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.8f, 24.6f)
                verticalLineTo(7.45f)
                horizontalLineToRelative(1.13f)
                verticalLineTo(24.6f)
                horizontalLineTo(7.8f)
                close()
                moveTo(9.73f, 21.52f)
                verticalLineToRelative(-6.6f)
                horizontalLineToRelative(8.55f)
                verticalLineToRelative(6.6f)
                horizontalLineTo(9.73f)
                close()
                moveTo(9.73f, 14.05f)
                verticalLineToRelative(-6.6f)
                horizontalLineToRelative(8.55f)
                verticalLineToRelative(6.6f)
                horizontalLineTo(9.73f)
                close()
                moveTo(12.09f, 19.52f)
                horizontalLineToRelative(3.81f)
                verticalLineToRelative(-2.51f)
                horizontalLineToRelative(-3.81f)
                verticalLineTo(19.52f)
                close()
                moveTo(12.09f, 12.05f)
                horizontalLineToRelative(3.81f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-3.81f)
                verticalLineTo(12.05f)
                close()
            }
        }
        .build()
        return _hurricaneWarning!!
    }

private var _hurricaneWarning: ImageVector? = null
