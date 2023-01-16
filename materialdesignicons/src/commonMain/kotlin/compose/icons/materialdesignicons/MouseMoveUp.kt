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

public val MaterialDesignIcons.MouseMoveUp: ImageVector
    get() {
        if (_mouseMoveUp != null) {
            return _mouseMoveUp!!
        }
        _mouseMoveUp = Builder(name = "MouseMoveUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 9.0f)
                horizontalLineTo(2.0f)
                curveTo(2.0f, 6.04f, 4.17f, 3.57f, 7.0f, 3.09f)
                verticalLineTo(9.0f)
                moveTo(18.0f, 17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(23.0f)
                lineTo(19.0f, 7.0f)
                lineTo(15.0f, 11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.0f)
                moveTo(9.0f, 3.09f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.0f)
                curveTo(14.0f, 6.04f, 11.83f, 3.57f, 9.0f, 3.09f)
                moveTo(2.0f, 15.0f)
                curveTo(2.0f, 18.3f, 4.7f, 21.0f, 8.0f, 21.0f)
                reflectiveCurveTo(14.0f, 18.3f, 14.0f, 15.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _mouseMoveUp!!
    }

private var _mouseMoveUp: ImageVector? = null
