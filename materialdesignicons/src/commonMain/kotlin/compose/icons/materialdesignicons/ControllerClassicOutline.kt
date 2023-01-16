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

public val MaterialDesignIcons.ControllerClassicOutline: ImageVector
    get() {
        if (_controllerClassicOutline != null) {
            return _controllerClassicOutline!!
        }
        _controllerClassicOutline = Builder(name = "ControllerClassicOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 7.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 23.0f, 12.5f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 17.5f, 18.0f)
                curveTo(15.79f, 18.0f, 14.27f, 17.22f, 13.26f, 16.0f)
                horizontalLineTo(10.74f)
                curveTo(9.73f, 17.22f, 8.21f, 18.0f, 6.5f, 18.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 1.0f, 12.5f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 6.5f, 7.0f)
                horizontalLineTo(17.5f)
                moveTo(6.5f, 9.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 3.0f, 12.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 6.5f, 16.0f)
                curveTo(7.9f, 16.0f, 9.1f, 15.18f, 9.66f, 14.0f)
                horizontalLineTo(14.34f)
                curveTo(14.9f, 15.18f, 16.1f, 16.0f, 17.5f, 16.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 21.0f, 12.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 17.5f, 9.0f)
                horizontalLineTo(6.5f)
                moveTo(5.75f, 10.25f)
                horizontalLineTo(7.25f)
                verticalLineTo(11.75f)
                horizontalLineTo(8.75f)
                verticalLineTo(13.25f)
                horizontalLineTo(7.25f)
                verticalLineTo(14.75f)
                horizontalLineTo(5.75f)
                verticalLineTo(13.25f)
                horizontalLineTo(4.25f)
                verticalLineTo(11.75f)
                horizontalLineTo(5.75f)
                verticalLineTo(10.25f)
                moveTo(16.75f, 12.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.75f, 13.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.75f, 14.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.75f, 13.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.75f, 12.5f)
                moveTo(18.75f, 10.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.75f, 11.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.75f, 12.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.75f, 11.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.75f, 10.5f)
                close()
            }
        }
        .build()
        return _controllerClassicOutline!!
    }

private var _controllerClassicOutline: ImageVector? = null
