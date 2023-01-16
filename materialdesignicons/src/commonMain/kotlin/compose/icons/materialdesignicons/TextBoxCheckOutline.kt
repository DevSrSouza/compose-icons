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

public val MaterialDesignIcons.TextBoxCheckOutline: ImageVector
    get() {
        if (_textBoxCheckOutline != null) {
            return _textBoxCheckOutline!!
        }
        _textBoxCheckOutline = Builder(name = "TextBoxCheckOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 21.0f)
                lineTo(14.25f, 18.0f)
                lineTo(15.41f, 16.84f)
                lineTo(17.0f, 18.43f)
                lineTo(20.59f, 14.84f)
                lineTo(21.75f, 16.25f)
                moveTo(12.8f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 21.0f, 3.0f, 20.11f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.89f, 3.89f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 3.0f, 21.0f, 3.89f, 21.0f, 5.0f)
                verticalLineTo(12.8f)
                curveTo(20.39f, 12.45f, 19.72f, 12.2f, 19.0f, 12.08f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(12.08f)
                curveTo(12.2f, 19.72f, 12.45f, 20.39f, 12.8f, 21.0f)
                moveTo(12.0f, 17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(12.0f)
                moveTo(14.68f, 13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.08f)
                curveTo(16.15f, 12.22f, 15.37f, 12.54f, 14.68f, 13.0f)
                moveTo(17.0f, 9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
            }
        }
        .build()
        return _textBoxCheckOutline!!
    }

private var _textBoxCheckOutline: ImageVector? = null
