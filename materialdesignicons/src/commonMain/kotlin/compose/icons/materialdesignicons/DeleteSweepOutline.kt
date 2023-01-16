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

public val MaterialDesignIcons.DeleteSweepOutline: ImageVector
    get() {
        if (_deleteSweepOutline != null) {
            return _deleteSweepOutline!!
        }
        _deleteSweepOutline = Builder(name = "DeleteSweepOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                moveTo(15.0f, 8.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.0f)
                moveTo(15.0f, 12.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.0f)
                moveTo(11.0f, 10.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(11.0f)
                moveTo(13.0f, 8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 20.0f)
                horizontalLineTo(11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 18.0f)
                verticalLineTo(8.0f)
                moveTo(14.0f, 5.0f)
                horizontalLineTo(11.0f)
                lineTo(10.0f, 4.0f)
                horizontalLineTo(6.0f)
                lineTo(5.0f, 5.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _deleteSweepOutline!!
    }

private var _deleteSweepOutline: ImageVector? = null
