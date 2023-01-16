package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.MicrosoftOnenote: ImageVector
    get() {
        if (_microsoftOnenote != null) {
            return _microsoftOnenote!!
        }
        _microsoftOnenote = Builder(name = "MicrosoftOnenote", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.17f, 3.25f)
                quadTo(21.5f, 3.25f, 21.76f, 3.5f)
                quadTo(22.0f, 3.74f, 22.0f, 4.08f)
                verticalLineTo(19.92f)
                quadTo(22.0f, 20.26f, 21.76f, 20.5f)
                quadTo(21.5f, 20.75f, 21.17f, 20.75f)
                horizontalLineTo(7.83f)
                quadTo(7.5f, 20.75f, 7.24f, 20.5f)
                quadTo(7.0f, 20.26f, 7.0f, 19.92f)
                verticalLineTo(17.0f)
                horizontalLineTo(2.83f)
                quadTo(2.5f, 17.0f, 2.24f, 16.76f)
                quadTo(2.0f, 16.5f, 2.0f, 16.17f)
                verticalLineTo(7.83f)
                quadTo(2.0f, 7.5f, 2.24f, 7.24f)
                quadTo(2.5f, 7.0f, 2.83f, 7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.08f)
                quadTo(7.0f, 3.74f, 7.24f, 3.5f)
                quadTo(7.5f, 3.25f, 7.83f, 3.25f)
                moveTo(5.8f, 11.17f)
                lineTo(8.16f, 15.27f)
                horizontalLineTo(9.65f)
                verticalLineTo(8.73f)
                horizontalLineTo(8.2f)
                verticalLineTo(12.92f)
                lineTo(5.93f, 8.73f)
                horizontalLineTo(4.35f)
                verticalLineTo(15.27f)
                horizontalLineTo(5.8f)
                moveTo(20.75f, 19.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(18.25f)
                verticalLineTo(19.5f)
                moveTo(20.75f, 15.75f)
                verticalLineTo(13.25f)
                horizontalLineTo(18.25f)
                verticalLineTo(15.75f)
                moveTo(20.75f, 12.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(18.25f)
                verticalLineTo(12.0f)
                moveTo(20.75f, 8.25f)
                verticalLineTo(4.5f)
                horizontalLineTo(8.25f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.17f)
                quadTo(11.5f, 7.0f, 11.76f, 7.24f)
                quadTo(12.0f, 7.5f, 12.0f, 7.83f)
                verticalLineTo(16.17f)
                quadTo(12.0f, 16.5f, 11.76f, 16.76f)
                quadTo(11.5f, 17.0f, 11.17f, 17.0f)
                horizontalLineTo(8.25f)
                verticalLineTo(19.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.25f)
                close()
            }
        }
        .build()
        return _microsoftOnenote!!
    }

private var _microsoftOnenote: ImageVector? = null
