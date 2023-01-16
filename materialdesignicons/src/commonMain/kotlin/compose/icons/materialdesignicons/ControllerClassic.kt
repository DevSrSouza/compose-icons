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

public val MaterialDesignIcons.ControllerClassic: ImageVector
    get() {
        if (_controllerClassic != null) {
            return _controllerClassic!!
        }
        _controllerClassic = Builder(name = "ControllerClassic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 7.0f)
                horizontalLineTo(18.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 23.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 18.0f, 17.0f)
                curveTo(16.36f, 17.0f, 14.91f, 16.21f, 14.0f, 15.0f)
                horizontalLineTo(10.0f)
                curveTo(9.09f, 16.21f, 7.64f, 17.0f, 6.0f, 17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 1.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 6.0f, 7.0f)
                moveTo(19.75f, 9.5f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 18.5f, 10.75f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 19.75f, 12.0f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 21.0f, 10.75f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 19.75f, 9.5f)
                moveTo(17.25f, 12.0f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 16.0f, 13.25f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 17.25f, 14.5f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 18.5f, 13.25f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 17.25f, 12.0f)
                moveTo(5.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _controllerClassic!!
    }

private var _controllerClassic: ImageVector? = null
