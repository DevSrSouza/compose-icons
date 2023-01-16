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

public val MaterialDesignIcons.WatchImport: ImageVector
    get() {
        if (_watchImport != null) {
            return _watchImport!!
        }
        _watchImport = Builder(name = "WatchImport", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 11.0f)
                horizontalLineTo(7.0f)
                lineTo(4.5f, 8.5f)
                lineTo(5.92f, 7.08f)
                lineTo(10.84f, 12.0f)
                lineTo(5.92f, 16.92f)
                lineTo(4.5f, 15.5f)
                lineTo(7.0f, 13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                moveTo(12.0f, 18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 18.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 12.0f, 6.0f)
                curveTo(10.6f, 6.0f, 9.31f, 6.5f, 8.29f, 7.29f)
                lineTo(6.87f, 5.87f)
                lineTo(7.05f, 5.73f)
                lineTo(8.0f, 0.0f)
                horizontalLineTo(16.0f)
                lineTo(16.95f, 5.73f)
                curveTo(18.81f, 7.19f, 20.0f, 9.45f, 20.0f, 12.0f)
                curveTo(20.0f, 14.54f, 18.81f, 16.81f, 16.95f, 18.27f)
                lineTo(16.0f, 24.0f)
                horizontalLineTo(8.0f)
                lineTo(7.05f, 18.27f)
                lineTo(6.87f, 18.13f)
                lineTo(8.29f, 16.71f)
                curveTo(9.31f, 17.5f, 10.6f, 18.0f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _watchImport!!
    }

private var _watchImport: ImageVector? = null
