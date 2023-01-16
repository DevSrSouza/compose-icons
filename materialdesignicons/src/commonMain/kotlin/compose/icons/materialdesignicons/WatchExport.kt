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

public val MaterialDesignIcons.WatchExport: ImageVector
    get() {
        if (_watchExport != null) {
            return _watchExport!!
        }
        _watchExport = Builder(name = "WatchExport", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 11.0f)
                horizontalLineTo(19.0f)
                lineTo(16.5f, 8.5f)
                lineTo(17.92f, 7.08f)
                lineTo(22.84f, 12.0f)
                lineTo(17.92f, 16.92f)
                lineTo(16.5f, 15.5f)
                lineTo(19.0f, 13.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(11.0f)
                moveTo(12.0f, 18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 6.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 12.0f, 6.0f)
                curveTo(13.4f, 6.0f, 14.69f, 6.5f, 15.71f, 7.29f)
                lineTo(17.13f, 5.87f)
                lineTo(16.95f, 5.73f)
                lineTo(16.0f, 0.0f)
                horizontalLineTo(8.0f)
                lineTo(7.05f, 5.73f)
                curveTo(5.19f, 7.19f, 4.0f, 9.46f, 4.0f, 12.0f)
                curveTo(4.0f, 14.55f, 5.19f, 16.81f, 7.05f, 18.27f)
                lineTo(8.0f, 24.0f)
                horizontalLineTo(16.0f)
                lineTo(16.95f, 18.27f)
                lineTo(17.13f, 18.13f)
                lineTo(15.71f, 16.71f)
                curveTo(14.69f, 17.5f, 13.4f, 18.0f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _watchExport!!
    }

private var _watchExport: ImageVector? = null
