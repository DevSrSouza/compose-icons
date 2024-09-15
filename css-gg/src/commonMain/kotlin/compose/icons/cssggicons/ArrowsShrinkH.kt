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

public val CssGgIcons.ArrowsShrinkH: ImageVector
    get() {
        if (_arrowsShrinkH != null) {
            return _arrowsShrinkH!!
        }
        _arrowsShrinkH = Builder(name = "ArrowsShrinkH", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.448f, 7.757f)
                lineTo(9.862f, 9.172f)
                lineTo(8.033f, 11.0f)
                horizontalLineTo(15.966f)
                lineTo(14.138f, 9.172f)
                lineTo(15.552f, 7.757f)
                lineTo(19.795f, 12.0f)
                lineTo(15.552f, 16.243f)
                lineTo(14.138f, 14.828f)
                lineTo(15.966f, 13.0f)
                horizontalLineTo(8.034f)
                lineTo(9.862f, 14.828f)
                lineTo(8.448f, 16.243f)
                lineTo(4.205f, 12.0f)
                lineTo(8.448f, 7.757f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _arrowsShrinkH!!
    }

private var _arrowsShrinkH: ImageVector? = null
