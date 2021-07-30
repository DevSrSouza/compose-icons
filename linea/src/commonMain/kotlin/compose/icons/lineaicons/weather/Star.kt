package compose.icons.lineaicons.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.WeatherGroup

public val WeatherGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 47.0f)
                lineToRelative(-20.0f, 15.0f)
                lineToRelative(8.0f, -24.0f)
                lineToRelative(-18.0f, -14.0f)
                lineToRelative(22.0f, 0.0f)
                lineToRelative(8.0f, -23.0f)
                lineToRelative(8.0f, 23.0f)
                lineToRelative(22.0f, 0.0f)
                lineToRelative(-18.0f, 14.0f)
                lineToRelative(8.0f, 24.0f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
