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

public val MaterialDesignIcons.Train: ImageVector
    get() {
        if (_train != null) {
            return _train!!
        }
        _train = Builder(name = "Train", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(8.0f, 2.0f, 4.0f, 2.5f, 4.0f, 6.0f)
                verticalLineTo(15.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 7.5f, 19.0f)
                lineTo(6.0f, 20.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(8.23f)
                lineTo(10.23f, 19.0f)
                horizontalLineTo(14.0f)
                lineTo(16.0f, 21.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.5f)
                lineTo(16.5f, 19.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.0f, 15.5f)
                verticalLineTo(6.0f)
                curveTo(20.0f, 2.5f, 16.42f, 2.0f, 12.0f, 2.0f)
                moveTo(7.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 17.0f)
                moveTo(11.0f, 10.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                moveTo(13.0f, 10.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.0f)
                moveTo(16.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.5f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.5f, 17.0f)
                close()
            }
        }
        .build()
        return _train!!
    }

private var _train: ImageVector? = null
