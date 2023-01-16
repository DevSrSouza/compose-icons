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

public val MaterialDesignIcons.ApplicationSettingsOutline: ImageVector
    get() {
        if (_applicationSettingsOutline != null) {
            return _applicationSettingsOutline!!
        }
        _applicationSettingsOutline = Builder(name = "ApplicationSettingsOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 0.0f, 1.0f, 0.9f, 1.0f, 2.0f)
                verticalLineTo(18.0f)
                curveTo(1.0f, 19.1f, 1.9f, 20.0f, 3.0f, 20.0f)
                horizontalLineTo(21.0f)
                curveTo(22.1f, 20.0f, 23.0f, 19.1f, 23.0f, 18.0f)
                verticalLineTo(2.0f)
                curveTo(23.0f, 0.9f, 22.1f, 0.0f, 21.0f, 0.0f)
                moveTo(21.0f, 18.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(18.0f)
                moveTo(7.0f, 22.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(22.0f)
                moveTo(11.0f, 22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(22.0f)
                moveTo(15.0f, 22.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(22.0f)
            }
        }
        .build()
        return _applicationSettingsOutline!!
    }

private var _applicationSettingsOutline: ImageVector? = null
