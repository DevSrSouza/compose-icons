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

public val MaterialDesignIcons.GamepadVariantOutline: ImageVector
    get() {
        if (_gamepadVariantOutline != null) {
            return _gamepadVariantOutline!!
        }
        _gamepadVariantOutline = Builder(name = "GamepadVariantOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                moveTo(18.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.5f, 9.0f)
                moveTo(15.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.5f, 12.0f)
                moveTo(17.0f, 5.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 24.0f, 12.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 17.0f, 19.0f)
                curveTo(15.04f, 19.0f, 13.27f, 18.2f, 12.0f, 16.9f)
                curveTo(10.73f, 18.2f, 8.96f, 19.0f, 7.0f, 19.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 0.0f, 12.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 7.0f, 5.0f)
                horizontalLineTo(17.0f)
                moveTo(7.0f, 7.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 2.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.0f, 17.0f)
                curveTo(8.64f, 17.0f, 10.09f, 16.21f, 11.0f, 15.0f)
                horizontalLineTo(13.0f)
                curveTo(13.91f, 16.21f, 15.36f, 17.0f, 17.0f, 17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 17.0f, 7.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _gamepadVariantOutline!!
    }

private var _gamepadVariantOutline: ImageVector? = null
