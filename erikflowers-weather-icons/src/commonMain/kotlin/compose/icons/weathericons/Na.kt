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

public val WeatherIcons.Na: ImageVector
    get() {
        if (_na != null) {
            return _na!!
        }
        _na = Builder(name = "Na", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp, viewportWidth =
                30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.87f, 18.23f)
                horizontalLineToRelative(1.94f)
                verticalLineToRelative(-3.64f)
                horizontalLineToRelative(0.02f)
                lineToRelative(2.05f, 3.64f)
                horizontalLineToRelative(1.99f)
                verticalLineToRelative(-6.66f)
                horizontalLineToRelative(-1.94f)
                verticalLineToRelative(3.55f)
                horizontalLineToRelative(-0.02f)
                lineToRelative(-1.94f, -3.55f)
                horizontalLineToRelative(-2.1f)
                verticalLineTo(18.23f)
                close()
                moveTo(13.39f, 18.38f)
                horizontalLineToRelative(1.43f)
                lineToRelative(2.61f, -6.97f)
                horizontalLineToRelative(-1.42f)
                lineTo(13.39f, 18.38f)
                close()
                moveTo(16.26f, 18.23f)
                horizontalLineToRelative(2.07f)
                lineToRelative(0.29f, -0.95f)
                horizontalLineToRelative(2.12f)
                lineToRelative(0.28f, 0.95f)
                horizontalLineToRelative(2.13f)
                lineToRelative(-2.43f, -6.66f)
                horizontalLineToRelative(-2.01f)
                lineTo(16.26f, 18.23f)
                close()
                moveTo(19.07f, 15.84f)
                lineToRelative(0.64f, -2.04f)
                horizontalLineToRelative(0.03f)
                lineToRelative(0.6f, 2.04f)
                horizontalLineTo(19.07f)
                close()
            }
        }
        .build()
        return _na!!
    }

private var _na: ImageVector? = null
