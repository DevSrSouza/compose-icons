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

public val CssGgIcons.ArrowsMergeAltH: ImageVector
    get() {
        if (_arrowsMergeAltH != null) {
            return _arrowsMergeAltH!!
        }
        _arrowsMergeAltH = Builder(name = "ArrowsMergeAltH", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5033f, 6.0f)
                horizontalLineTo(3.5033f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.6749f)
                lineTo(5.8464f, 9.1715f)
                lineTo(7.2607f, 7.7573f)
                lineTo(11.5033f, 12.0f)
                lineTo(7.2607f, 16.2426f)
                lineTo(5.8464f, 14.8284f)
                lineTo(7.6748f, 13.0f)
                horizontalLineTo(3.5033f)
                verticalLineTo(18.0f)
                horizontalLineTo(1.5033f)
                verticalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.4967f, 6.0f)
                horizontalLineTo(22.4967f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.4967f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.3251f)
                lineTo(18.1536f, 14.8285f)
                lineTo(16.7393f, 16.2427f)
                lineTo(12.4967f, 12.0f)
                lineTo(16.7393f, 7.7574f)
                lineTo(18.1536f, 9.1716f)
                lineTo(16.3252f, 11.0f)
                horizontalLineTo(20.4967f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _arrowsMergeAltH!!
    }

private var _arrowsMergeAltH: ImageVector? = null
