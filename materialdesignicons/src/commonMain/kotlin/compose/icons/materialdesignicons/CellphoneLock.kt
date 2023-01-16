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

public val MaterialDesignIcons.CellphoneLock: ImageVector
    get() {
        if (_cellphoneLock != null) {
            return _cellphoneLock!!
        }
        _cellphoneLock = Builder(name = "CellphoneLock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 1.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 23.0f)
                horizontalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 21.0f)
                verticalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 1.0f)
                moveTo(8.8f, 11.0f)
                verticalLineTo(9.5f)
                curveTo(8.8f, 8.1f, 7.4f, 7.0f, 6.0f, 7.0f)
                curveTo(4.6f, 7.0f, 3.2f, 8.1f, 3.2f, 9.5f)
                verticalLineTo(11.0f)
                curveTo(2.6f, 11.0f, 2.0f, 11.6f, 2.0f, 12.2f)
                verticalLineTo(15.7f)
                curveTo(2.0f, 16.4f, 2.6f, 17.0f, 3.2f, 17.0f)
                horizontalLineTo(8.7f)
                curveTo(9.4f, 17.0f, 10.0f, 16.4f, 10.0f, 15.8f)
                verticalLineTo(12.3f)
                curveTo(10.0f, 11.6f, 9.4f, 11.0f, 8.8f, 11.0f)
                moveTo(7.5f, 11.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(9.5f)
                curveTo(4.5f, 8.7f, 5.2f, 8.2f, 6.0f, 8.2f)
                curveTo(6.8f, 8.2f, 7.5f, 8.7f, 7.5f, 9.5f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _cellphoneLock!!
    }

private var _cellphoneLock: ImageVector? = null
