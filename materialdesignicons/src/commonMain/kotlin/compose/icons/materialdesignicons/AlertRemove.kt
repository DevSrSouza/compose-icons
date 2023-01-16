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

public val MaterialDesignIcons.AlertRemove: ImageVector
    get() {
        if (_alertRemove != null) {
            return _alertRemove!!
        }
        _alertRemove = Builder(name = "AlertRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 19.0f)
                curveTo(14.0f, 16.21f, 15.91f, 13.87f, 18.5f, 13.2f)
                lineTo(12.0f, 2.0f)
                lineTo(1.0f, 21.0f)
                horizontalLineTo(14.35f)
                curveTo(14.13f, 20.37f, 14.0f, 19.7f, 14.0f, 19.0f)
                moveTo(13.0f, 18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                moveTo(13.0f, 14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                moveTo(23.54f, 16.88f)
                lineTo(21.41f, 19.0f)
                lineTo(23.54f, 21.12f)
                lineTo(22.12f, 22.54f)
                lineTo(20.0f, 20.41f)
                lineTo(17.88f, 22.54f)
                lineTo(16.47f, 21.12f)
                lineTo(18.59f, 19.0f)
                lineTo(16.47f, 16.88f)
                lineTo(17.88f, 15.47f)
                lineTo(20.0f, 17.59f)
                lineTo(22.12f, 15.46f)
                lineTo(23.54f, 16.88f)
                close()
            }
        }
        .build()
        return _alertRemove!!
    }

private var _alertRemove: ImageVector? = null
