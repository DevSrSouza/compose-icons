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

public val CssGgIcons.PushDown: ImageVector
    get() {
        if (_pushDown != null) {
            return _pushDown!!
        }
        _pushDown = Builder(name = "PushDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0001f, 1.0f)
                horizontalLineTo(13.0001f)
                verticalLineTo(15.4853f)
                lineTo(16.2428f, 12.2427f)
                lineTo(17.657f, 13.6569f)
                lineTo(12.0001f, 19.3137f)
                lineTo(6.3433f, 13.6569f)
                lineTo(7.7575f, 12.2427f)
                lineTo(11.0001f, 15.4853f)
                verticalLineTo(1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 20.2877f)
                horizontalLineTo(6.0f)
                verticalLineTo(22.2877f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.2877f)
                close()
            }
        }
        .build()
        return _pushDown!!
    }

private var _pushDown: ImageVector? = null
