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

public val MaterialDesignIcons.TextRecognition: ImageVector
    get() {
        if (_textRecognition != null) {
            return _textRecognition!!
        }
        _textRecognition = Builder(name = "TextRecognition", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.0f)
                curveTo(2.0f, 2.9f, 2.9f, 2.0f, 4.0f, 2.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                moveTo(22.0f, 20.0f)
                curveTo(22.0f, 21.11f, 21.11f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                moveTo(4.0f, 22.0f)
                curveTo(2.9f, 22.0f, 2.0f, 21.11f, 2.0f, 20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                moveTo(20.0f, 2.0f)
                curveTo(21.11f, 2.0f, 22.0f, 2.9f, 22.0f, 4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(20.0f)
                moveTo(9.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _textRecognition!!
    }

private var _textRecognition: ImageVector? = null
