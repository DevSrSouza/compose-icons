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

public val MaterialDesignIcons.WindowOpenVariant: ImageVector
    get() {
        if (_windowOpenVariant != null) {
            return _windowOpenVariant!!
        }
        _windowOpenVariant = Builder(name = "WindowOpenVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 20.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(20.0f)
                moveTo(19.0f, 4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.0f)
                moveTo(5.0f, 4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                moveTo(5.0f, 20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                moveTo(9.0f, 20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                moveTo(17.0f, 20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _windowOpenVariant!!
    }

private var _windowOpenVariant: ImageVector? = null
