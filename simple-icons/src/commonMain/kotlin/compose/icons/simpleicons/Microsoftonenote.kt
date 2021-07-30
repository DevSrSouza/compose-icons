package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Microsoftonenote: ImageVector
    get() {
        if (_microsoftonenote != null) {
            return _microsoftonenote!!
        }
        _microsoftonenote = Builder(name = "Microsoftonenote", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 1.5f)
                quadTo(23.41f, 1.5f, 23.7f, 1.8f)
                quadTo(24.0f, 2.09f, 24.0f, 2.5f)
                verticalLineTo(21.5f)
                quadTo(24.0f, 21.91f, 23.7f, 22.2f)
                quadTo(23.41f, 22.5f, 23.0f, 22.5f)
                horizontalLineTo(7.0f)
                quadTo(6.59f, 22.5f, 6.3f, 22.2f)
                quadTo(6.0f, 21.91f, 6.0f, 21.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(1.0f)
                quadTo(0.59f, 18.0f, 0.3f, 17.7f)
                quadTo(0.0f, 17.41f, 0.0f, 17.0f)
                verticalLineTo(7.0f)
                quadTo(0.0f, 6.59f, 0.3f, 6.3f)
                quadTo(0.58f, 6.0f, 1.0f, 6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(2.5f)
                quadTo(6.0f, 2.09f, 6.3f, 1.8f)
                quadTo(6.59f, 1.5f, 7.0f, 1.5f)
                close()
                moveTo(4.56f, 11.0f)
                lineTo(7.39f, 15.93f)
                horizontalLineTo(9.18f)
                verticalLineTo(8.07f)
                horizontalLineTo(7.44f)
                verticalLineTo(13.1f)
                lineTo(4.71f, 8.07f)
                horizontalLineTo(2.82f)
                verticalLineTo(15.93f)
                horizontalLineTo(4.56f)
                close()
                moveTo(22.5f, 21.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(21.0f)
                close()
                moveTo(22.5f, 16.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(16.5f)
                close()
                moveTo(22.5f, 12.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(12.0f)
                close()
                moveTo(22.5f, 7.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                quadTo(11.41f, 6.0f, 11.7f, 6.3f)
                quadTo(12.0f, 6.59f, 12.0f, 7.0f)
                verticalLineTo(17.0f)
                quadTo(12.0f, 17.41f, 11.7f, 17.7f)
                quadTo(11.41f, 18.0f, 11.0f, 18.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.5f)
                close()
            }
        }
        .build()
        return _microsoftonenote!!
    }

private var _microsoftonenote: ImageVector? = null
