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

public val MaterialDesignIcons.CheckerboardRemove: ImageVector
    get() {
        if (_checkerboardRemove != null) {
            return _checkerboardRemove!!
        }
        _checkerboardRemove = Builder(name = "CheckerboardRemove", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.0f)
                moveTo(12.0f, 12.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(12.0f)
                moveTo(2.0f, 2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.5f)
                curveTo(13.0f, 21.4f, 12.6f, 20.7f, 12.3f, 20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.4f)
                curveTo(20.7f, 12.7f, 21.4f, 13.1f, 22.0f, 13.6f)
                verticalLineTo(2.0f)
                horizontalLineTo(2.0f)
                moveTo(20.1f, 14.5f)
                lineTo(18.0f, 16.6f)
                lineTo(15.9f, 14.5f)
                lineTo(14.5f, 15.9f)
                lineTo(16.6f, 18.0f)
                lineTo(14.5f, 20.1f)
                lineTo(15.9f, 21.5f)
                lineTo(18.0f, 19.4f)
                lineTo(20.1f, 21.5f)
                lineTo(21.5f, 20.1f)
                lineTo(19.4f, 18.0f)
                lineTo(21.5f, 15.9f)
                lineTo(20.1f, 14.5f)
                close()
            }
        }
        .build()
        return _checkerboardRemove!!
    }

private var _checkerboardRemove: ImageVector? = null
