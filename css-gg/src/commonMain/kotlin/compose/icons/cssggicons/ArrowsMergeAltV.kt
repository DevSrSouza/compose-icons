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

public val CssGgIcons.ArrowsMergeAltV: ImageVector
    get() {
        if (_arrowsMergeAltV != null) {
            return _arrowsMergeAltV!!
        }
        _arrowsMergeAltV = Builder(name = "ArrowsMergeAltV", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 1.5033f)
                verticalLineTo(3.5033f)
                lineTo(13.0f, 3.5033f)
                verticalLineTo(7.6749f)
                lineTo(14.8285f, 5.8464f)
                lineTo(16.2427f, 7.2607f)
                lineTo(12.0f, 11.5033f)
                lineTo(7.7574f, 7.2607f)
                lineTo(9.1716f, 5.8464f)
                lineTo(11.0f, 7.6748f)
                verticalLineTo(3.5033f)
                lineTo(6.0f, 3.5033f)
                verticalLineTo(1.5033f)
                lineTo(18.0f, 1.5033f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 20.4967f)
                verticalLineTo(22.4967f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.4967f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.3251f)
                lineTo(9.1715f, 18.1536f)
                lineTo(7.7573f, 16.7393f)
                lineTo(12.0f, 12.4967f)
                lineTo(16.2426f, 16.7393f)
                lineTo(14.8284f, 18.1536f)
                lineTo(13.0f, 16.3252f)
                verticalLineTo(20.4967f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _arrowsMergeAltV!!
    }

private var _arrowsMergeAltV: ImageVector? = null
