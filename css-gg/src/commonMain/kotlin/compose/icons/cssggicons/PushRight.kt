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

public val CssGgIcons.PushRight: ImageVector
    get() {
        if (_pushRight != null) {
            return _pushRight!!
        }
        _pushRight = Builder(name = "PushRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 12.9999f)
                verticalLineTo(10.9999f)
                horizontalLineTo(15.4853f)
                lineTo(12.2427f, 7.7572f)
                lineTo(13.6569f, 6.343f)
                lineTo(19.3137f, 11.9999f)
                lineTo(13.6569f, 17.6567f)
                lineTo(12.2427f, 16.2425f)
                lineTo(15.4853f, 12.9999f)
                horizontalLineTo(1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.2877f, 6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(22.2877f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.2877f)
                close()
            }
        }
        .build()
        return _pushRight!!
    }

private var _pushRight: ImageVector? = null
