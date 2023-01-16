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

public val MaterialDesignIcons.TextSearch: ImageVector
    get() {
        if (_textSearch != null) {
            return _textSearch!!
        }
        _textSearch = Builder(name = "TextSearch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.31f, 18.9f)
                lineTo(22.39f, 22.0f)
                lineTo(21.0f, 23.39f)
                lineTo(17.88f, 20.32f)
                curveTo(17.19f, 20.75f, 16.37f, 21.0f, 15.5f, 21.0f)
                curveTo(13.0f, 21.0f, 11.0f, 19.0f, 11.0f, 16.5f)
                curveTo(11.0f, 14.0f, 13.0f, 12.0f, 15.5f, 12.0f)
                curveTo(18.0f, 12.0f, 20.0f, 14.0f, 20.0f, 16.5f)
                curveTo(20.0f, 17.38f, 19.75f, 18.21f, 19.31f, 18.9f)
                moveTo(15.5f, 19.0f)
                curveTo(16.88f, 19.0f, 18.0f, 17.88f, 18.0f, 16.5f)
                curveTo(18.0f, 15.12f, 16.88f, 14.0f, 15.5f, 14.0f)
                curveTo(14.12f, 14.0f, 13.0f, 15.12f, 13.0f, 16.5f)
                curveTo(13.0f, 17.88f, 14.12f, 19.0f, 15.5f, 19.0f)
                moveTo(21.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(21.0f)
                moveTo(3.0f, 16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(3.0f)
                moveTo(3.0f, 11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.97f)
                curveTo(17.96f, 10.37f, 16.77f, 10.0f, 15.5f, 10.0f)
                curveTo(14.23f, 10.0f, 13.04f, 10.37f, 12.03f, 11.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _textSearch!!
    }

private var _textSearch: ImageVector? = null
