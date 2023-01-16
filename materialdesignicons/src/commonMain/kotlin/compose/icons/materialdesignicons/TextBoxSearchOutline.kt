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

public val MaterialDesignIcons.TextBoxSearchOutline: ImageVector
    get() {
        if (_textBoxSearchOutline != null) {
            return _textBoxSearchOutline!!
        }
        _textBoxSearchOutline = Builder(name = "TextBoxSearchOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 12.0f)
                curveTo(18.0f, 12.0f, 20.0f, 14.0f, 20.0f, 16.5f)
                curveTo(20.0f, 17.38f, 19.75f, 18.21f, 19.31f, 18.9f)
                lineTo(22.39f, 22.0f)
                lineTo(21.0f, 23.39f)
                lineTo(17.88f, 20.32f)
                curveTo(17.19f, 20.75f, 16.37f, 21.0f, 15.5f, 21.0f)
                curveTo(13.0f, 21.0f, 11.0f, 19.0f, 11.0f, 16.5f)
                curveTo(11.0f, 14.0f, 13.0f, 12.0f, 15.5f, 12.0f)
                moveTo(15.5f, 14.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 13.0f, 16.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 15.5f, 19.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.0f, 16.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 15.5f, 14.0f)
                moveTo(5.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 3.0f, 21.0f, 3.89f, 21.0f, 5.0f)
                verticalLineTo(13.03f)
                curveTo(20.5f, 12.23f, 19.81f, 11.54f, 19.0f, 11.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.5f)
                curveTo(9.81f, 19.75f, 10.26f, 20.42f, 10.81f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 21.0f, 3.0f, 20.11f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.89f, 3.89f, 3.0f, 5.0f, 3.0f)
                moveTo(7.0f, 7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                moveTo(7.0f, 11.0f)
                horizontalLineTo(12.03f)
                curveTo(11.23f, 11.5f, 10.54f, 12.19f, 10.0f, 13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                moveTo(7.0f, 15.0f)
                horizontalLineTo(9.17f)
                curveTo(9.06f, 15.5f, 9.0f, 16.0f, 9.0f, 16.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _textBoxSearchOutline!!
    }

private var _textBoxSearchOutline: ImageVector? = null
