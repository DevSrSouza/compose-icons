package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.0f, 8.7722f)
                lineTo(14.0208f, 1.793f)
                curveTo(12.8492f, 0.6214f, 10.9497f, 0.6214f, 9.7782f, 1.793f)
                lineTo(3.0f, 8.5712f)
                verticalLineTo(23.0858f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.0858f)
                curveTo(10.0f, 15.9812f, 10.8954f, 15.0858f, 12.0f, 15.0858f)
                curveTo(13.1046f, 15.0858f, 14.0f, 15.9812f, 14.0f, 17.0858f)
                verticalLineTo(23.0858f)
                horizontalLineTo(21.0f)
                verticalLineTo(8.7722f)
                close()
                moveTo(11.1924f, 3.2072f)
                lineTo(5.0f, 9.3996f)
                verticalLineTo(21.0858f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0858f)
                curveTo(8.0f, 14.8767f, 9.7909f, 13.0858f, 12.0f, 13.0858f)
                curveTo(14.2091f, 13.0858f, 16.0f, 14.8767f, 16.0f, 17.0858f)
                verticalLineTo(21.0858f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.6006f)
                lineTo(12.6066f, 3.2072f)
                curveTo(12.2161f, 2.8167f, 11.5829f, 2.8167f, 11.1924f, 3.2072f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
