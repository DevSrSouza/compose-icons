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

public val MaterialDesignIcons.TextBoxCheck: ImageVector
    get() {
        if (_textBoxCheck != null) {
            return _textBoxCheck!!
        }
        _textBoxCheck = Builder(name = "TextBoxCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                curveTo(3.89f, 21.0f, 3.0f, 20.1f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.89f, 3.89f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 5.0f)
                verticalLineTo(12.8f)
                curveTo(20.12f, 12.29f, 19.09f, 12.0f, 18.0f, 12.0f)
                lineTo(17.0f, 12.08f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.69f)
                curveTo(13.07f, 14.07f, 12.0f, 15.91f, 12.0f, 18.0f)
                curveTo(12.0f, 19.09f, 12.29f, 20.12f, 12.8f, 21.0f)
                moveTo(12.0f, 15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(12.0f)
                moveTo(17.0f, 7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.0f)
            }
        }
        .build()
        return _textBoxCheck!!
    }

private var _textBoxCheck: ImageVector? = null
