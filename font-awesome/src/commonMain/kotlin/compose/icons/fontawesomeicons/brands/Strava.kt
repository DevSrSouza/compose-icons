package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Strava: ImageVector
    get() {
        if (_strava != null) {
            return _strava!!
        }
        _strava = Builder(name = "Strava", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(158.4f, 0.0f)
                lineTo(7.0f, 292.0f)
                horizontalLineToRelative(89.2f)
                lineToRelative(62.2f, -116.1f)
                lineTo(220.1f, 292.0f)
                horizontalLineToRelative(88.5f)
                close()
                moveTo(308.6f, 292.0f)
                lineToRelative(-43.9f, 88.2f)
                lineToRelative(-44.6f, -88.2f)
                horizontalLineToRelative(-67.6f)
                lineToRelative(112.2f, 220.0f)
                lineToRelative(111.5f, -220.0f)
                close()
            }
        }
        .build()
        return _strava!!
    }

private var _strava: ImageVector? = null
