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
                moveTo(11.0f, 1.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.485f)
                lineTo(16.243f, 12.243f)
                lineTo(17.657f, 13.657f)
                lineTo(12.0f, 19.314f)
                lineTo(6.343f, 13.657f)
                lineTo(7.757f, 12.243f)
                lineTo(11.0f, 15.485f)
                verticalLineTo(1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 20.288f)
                horizontalLineTo(6.0f)
                verticalLineTo(22.288f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.288f)
                close()
            }
        }
        .build()
        return _pushDown!!
    }

private var _pushDown: ImageVector? = null
