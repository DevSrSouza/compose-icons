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

public val MaterialDesignIcons.TextBoxPlus: ImageVector
    get() {
        if (_textBoxPlus != null) {
            return _textBoxPlus!!
        }
        _textBoxPlus = Builder(name = "TextBoxPlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                moveTo(12.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(12.0f)
                moveTo(17.0f, 11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.69f)
                curveTo(13.07f, 14.07f, 12.0f, 15.91f, 12.0f, 18.0f)
                curveTo(12.0f, 19.09f, 12.29f, 20.12f, 12.8f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 21.0f, 3.0f, 20.1f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.89f, 3.89f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 5.0f)
                verticalLineTo(12.8f)
                curveTo(20.12f, 12.29f, 19.09f, 12.0f, 18.0f, 12.0f)
                lineTo(17.0f, 12.08f)
                verticalLineTo(11.0f)
                moveTo(17.0f, 9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _textBoxPlus!!
    }

private var _textBoxPlus: ImageVector? = null
