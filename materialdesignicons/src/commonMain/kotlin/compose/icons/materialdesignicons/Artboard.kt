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

public val MaterialDesignIcons.Artboard: ImageVector
    get() {
        if (_artboard != null) {
            return _artboard!!
        }
        _artboard = Builder(name = "Artboard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.0f)
                moveTo(19.0f, 3.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(3.0f)
                moveTo(7.0f, 3.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(3.0f)
                moveTo(23.0f, 7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(7.0f)
                moveTo(19.0f, 7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                moveTo(4.0f, 7.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                moveTo(23.0f, 15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(15.0f)
                moveTo(4.0f, 15.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.0f)
                moveTo(19.0f, 18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(18.0f)
                moveTo(7.0f, 18.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _artboard!!
    }

private var _artboard: ImageVector? = null
