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

public val MaterialDesignIcons.CompareRemove: ImageVector
    get() {
        if (_compareRemove != null) {
            return _compareRemove!!
        }
        _compareRemove = Builder(name = "CompareRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 3.0f, 21.0f, 3.9f, 21.0f, 5.0f)
                verticalLineTo(13.4f)
                curveTo(20.4f, 13.2f, 19.7f, 13.0f, 19.0f, 13.0f)
                verticalLineTo(5.0f)
                moveTo(10.0f, 1.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 21.0f, 3.0f, 20.1f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.9f, 3.9f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(1.0f)
                moveTo(10.0f, 12.0f)
                lineTo(5.0f, 18.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                moveTo(15.7f, 14.0f)
                lineTo(14.0f, 12.0f)
                verticalLineTo(15.7f)
                curveTo(14.4f, 15.0f, 15.0f, 14.5f, 15.7f, 14.0f)
                moveTo(21.1f, 15.5f)
                lineTo(19.0f, 17.6f)
                lineTo(16.9f, 15.5f)
                lineTo(15.5f, 16.9f)
                lineTo(17.6f, 19.0f)
                lineTo(15.5f, 21.1f)
                lineTo(16.9f, 22.5f)
                lineTo(19.0f, 20.4f)
                lineTo(21.1f, 22.5f)
                lineTo(22.5f, 21.1f)
                lineTo(20.4f, 19.0f)
                lineTo(22.5f, 16.9f)
                lineTo(21.1f, 15.5f)
                close()
            }
        }
        .build()
        return _compareRemove!!
    }

private var _compareRemove: ImageVector? = null
