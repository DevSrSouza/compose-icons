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

public val MaterialDesignIcons.HarddiskRemove: ImageVector
    get() {
        if (_harddiskRemove != null) {
            return _harddiskRemove!!
        }
        _harddiskRemove = Builder(name = "HarddiskRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 13.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 9.0f)
                moveTo(12.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 13.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 9.0f)
                moveTo(18.0f, 2.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 4.0f)
                verticalLineTo(13.09f)
                arcTo(5.47f, 5.47f, 0.0f, false, true, 5.0f, 13.0f)
                arcTo(5.71f, 5.71f, 0.0f, false, true, 7.0f, 13.36f)
                arcTo(6.0f, 6.0f, 0.0f, true, true, 15.71f, 14.69f)
                lineTo(13.79f, 12.27f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.42f, 11.9f)
                lineTo(11.56f, 12.4f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.19f, 13.77f)
                lineTo(12.1f, 16.0f)
                arcTo(6.12f, 6.12f, 0.0f, false, true, 10.0f, 15.62f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 10.19f, 22.0f)
                horizontalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 20.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 2.0f)
                moveTo(14.58f, 19.58f)
                lineTo(12.09f, 13.27f)
                lineTo(12.95f, 12.77f)
                lineTo(17.17f, 18.08f)
                moveTo(12.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 11.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 11.0f)
                moveTo(7.12f, 22.54f)
                lineTo(5.0f, 20.41f)
                lineTo(2.88f, 22.54f)
                lineTo(1.46f, 21.12f)
                lineTo(3.59f, 19.0f)
                lineTo(1.46f, 16.88f)
                lineTo(2.88f, 15.46f)
                lineTo(5.0f, 17.59f)
                lineTo(7.12f, 15.46f)
                lineTo(8.54f, 16.88f)
                lineTo(6.41f, 19.0f)
                lineTo(8.54f, 21.12f)
                close()
            }
        }
        .build()
        return _harddiskRemove!!
    }

private var _harddiskRemove: ImageVector? = null
