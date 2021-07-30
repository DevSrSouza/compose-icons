package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Sync: ImageVector
    get() {
        if (_sync != null) {
            return _sync!!
        }
        _sync = Builder(name = "Sync", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5608f, 10.6418f)
                lineTo(6.3539f, 3.9497f)
                lineTo(8.254f, 5.8498f)
                curveTo(11.7312f, 3.6588f, 16.3814f, 4.0776f, 19.41f, 7.1063f)
                lineTo(17.9958f, 8.5205f)
                curveTo(15.7536f, 6.2783f, 12.3686f, 5.8752f, 9.7155f, 7.3113f)
                lineTo(11.2529f, 8.8487f)
                lineTo(4.5608f, 10.6418f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.4392f, 13.3581f)
                lineTo(17.646f, 20.0502f)
                lineTo(15.7459f, 18.1501f)
                curveTo(12.2688f, 20.3411f, 7.6186f, 19.9223f, 4.5899f, 16.8936f)
                lineTo(6.0041f, 15.4794f)
                curveTo(8.2464f, 17.7217f, 11.6313f, 18.1247f, 14.2844f, 16.6887f)
                lineTo(12.747f, 15.1512f)
                lineTo(19.4392f, 13.3581f)
                close()
            }
        }
        .build()
        return _sync!!
    }

private var _sync: ImageVector? = null
