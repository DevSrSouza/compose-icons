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

public val MaterialDesignIcons.TextBoxEditOutline: ImageVector
    get() {
        if (_textBoxEditOutline != null) {
            return _textBoxEditOutline!!
        }
        _textBoxEditOutline = Builder(name = "TextBoxEditOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 21.0f, 3.0f, 20.11f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.89f, 3.89f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 3.0f, 21.0f, 3.89f, 21.0f, 5.0f)
                verticalLineTo(10.33f)
                curveTo(20.7f, 10.21f, 20.37f, 10.14f, 20.04f, 10.14f)
                curveTo(19.67f, 10.14f, 19.32f, 10.22f, 19.0f, 10.37f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.11f)
                lineTo(10.0f, 19.11f)
                verticalLineTo(21.0f)
                moveTo(7.0f, 9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                moveTo(7.0f, 17.0f)
                horizontalLineTo(12.11f)
                lineTo(14.0f, 15.12f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                moveTo(7.0f, 13.0f)
                horizontalLineTo(16.12f)
                lineTo(17.0f, 12.12f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                moveTo(21.7f, 13.58f)
                lineTo(20.42f, 12.3f)
                curveTo(20.21f, 12.09f, 19.86f, 12.09f, 19.65f, 12.3f)
                lineTo(18.65f, 13.3f)
                lineTo(20.7f, 15.35f)
                lineTo(21.7f, 14.35f)
                curveTo(21.91f, 14.14f, 21.91f, 13.79f, 21.7f, 13.58f)
                moveTo(12.0f, 22.0f)
                horizontalLineTo(14.06f)
                lineTo(20.11f, 15.93f)
                lineTo(18.06f, 13.88f)
                lineTo(12.0f, 19.94f)
                verticalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _textBoxEditOutline!!
    }

private var _textBoxEditOutline: ImageVector? = null
