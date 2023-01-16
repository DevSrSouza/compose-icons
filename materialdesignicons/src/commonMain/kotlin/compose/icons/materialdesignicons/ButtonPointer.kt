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

public val MaterialDesignIcons.ButtonPointer: ImageVector
    get() {
        if (_buttonPointer != null) {
            return _buttonPointer!!
        }
        _buttonPointer = Builder(name = "ButtonPointer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 20.5f)
                curveTo(20.0f, 21.3f, 19.3f, 22.0f, 18.5f, 22.0f)
                horizontalLineTo(13.0f)
                curveTo(12.6f, 22.0f, 12.3f, 21.9f, 12.0f, 21.6f)
                lineTo(8.0f, 17.4f)
                lineTo(8.7f, 16.6f)
                curveTo(8.9f, 16.4f, 9.2f, 16.3f, 9.5f, 16.3f)
                horizontalLineTo(9.7f)
                lineTo(12.0f, 18.0f)
                verticalLineTo(9.0f)
                curveTo(12.0f, 8.4f, 12.4f, 8.0f, 13.0f, 8.0f)
                reflectiveCurveTo(14.0f, 8.4f, 14.0f, 9.0f)
                verticalLineTo(13.5f)
                lineTo(15.2f, 13.6f)
                lineTo(19.1f, 15.8f)
                curveTo(19.6f, 16.0f, 20.0f, 16.6f, 20.0f, 17.1f)
                verticalLineTo(20.5f)
                moveTo(20.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 13.1f, 2.9f, 14.0f, 4.0f, 14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 14.0f, 22.0f, 13.1f, 22.0f, 12.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f)
                close()
            }
        }
        .build()
        return _buttonPointer!!
    }

private var _buttonPointer: ImageVector? = null
