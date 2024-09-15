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
                moveTo(1.0f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.485f)
                lineTo(12.243f, 7.757f)
                lineTo(13.657f, 6.343f)
                lineTo(19.314f, 12.0f)
                lineTo(13.657f, 17.657f)
                lineTo(12.243f, 16.243f)
                lineTo(15.485f, 13.0f)
                horizontalLineTo(1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.288f, 6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(22.288f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.288f)
                close()
            }
        }
        .build()
        return _pushRight!!
    }

private var _pushRight: ImageVector? = null
