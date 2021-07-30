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

public val CssGgIcons.GoogleTasks: ImageVector
    get() {
        if (_googleTasks != null) {
            return _googleTasks!!
        }
        _googleTasks = Builder(name = "GoogleTasks", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.7679f, 5.7145f)
                curveTo(17.4779f, 4.8683f, 18.7394f, 4.7579f, 19.5856f, 5.468f)
                curveTo(20.4317f, 6.178f, 20.5421f, 7.4395f, 19.8321f, 8.2856f)
                lineTo(10.833f, 19.0102f)
                curveTo(10.123f, 19.8564f, 8.8615f, 19.9668f, 8.0154f, 19.2568f)
                curveTo(7.1692f, 18.5468f, 7.0589f, 17.2852f, 7.7689f, 16.4391f)
                lineTo(16.7679f, 5.7145f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 12.7396f)
                curveTo(3.0f, 11.6351f, 3.8954f, 10.7396f, 5.0f, 10.7396f)
                curveTo(6.1046f, 10.7396f, 7.0f, 11.6351f, 7.0f, 12.7396f)
                curveTo(7.0f, 13.8442f, 6.1046f, 14.7396f, 5.0f, 14.7396f)
                curveTo(3.8954f, 14.7396f, 3.0f, 13.8442f, 3.0f, 12.7396f)
                close()
            }
        }
        .build()
        return _googleTasks!!
    }

private var _googleTasks: ImageVector? = null
