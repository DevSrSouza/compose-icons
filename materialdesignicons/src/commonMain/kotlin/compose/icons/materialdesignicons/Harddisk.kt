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

public val MaterialDesignIcons.Harddisk: ImageVector
    get() {
        if (_harddisk != null) {
            return _harddisk!!
        }
        _harddisk = Builder(name = "Harddisk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                horizontalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 4.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 20.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 2.0f)
                moveTo(12.0f, 4.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 6.0f, 10.0f)
                curveTo(6.0f, 13.31f, 8.69f, 16.0f, 12.1f, 16.0f)
                lineTo(11.22f, 13.77f)
                curveTo(10.95f, 13.29f, 11.11f, 12.68f, 11.59f, 12.4f)
                lineTo(12.45f, 11.9f)
                curveTo(12.93f, 11.63f, 13.54f, 11.79f, 13.82f, 12.27f)
                lineTo(15.74f, 14.69f)
                curveTo(17.12f, 13.59f, 18.0f, 11.9f, 18.0f, 10.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 12.0f, 4.0f)
                moveTo(12.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 9.0f)
                moveTo(7.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 18.0f)
                moveTo(12.09f, 13.27f)
                lineTo(14.58f, 19.58f)
                lineTo(17.17f, 18.08f)
                lineTo(12.95f, 12.77f)
                lineTo(12.09f, 13.27f)
                close()
            }
        }
        .build()
        return _harddisk!!
    }

private var _harddisk: ImageVector? = null
