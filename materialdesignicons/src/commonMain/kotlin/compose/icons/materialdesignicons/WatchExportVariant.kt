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

public val MaterialDesignIcons.WatchExportVariant: ImageVector
    get() {
        if (_watchExportVariant != null) {
            return _watchExportVariant!!
        }
        _watchExportVariant = Builder(name = "WatchExportVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(8.0f, 0.0f)
                horizontalLineTo(16.0f)
                lineTo(16.83f, 5.0f)
                horizontalLineTo(17.0f)
                curveTo(17.28f, 5.0f, 17.54f, 5.06f, 17.78f, 5.16f)
                lineTo(15.94f, 7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.94f)
                lineTo(17.78f, 18.84f)
                curveTo(17.54f, 18.94f, 17.28f, 19.0f, 17.0f, 19.0f)
                horizontalLineTo(16.83f)
                lineTo(16.0f, 24.0f)
                horizontalLineTo(8.0f)
                lineTo(7.17f, 19.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(5.0f, 5.89f, 5.9f, 5.0f, 7.0f, 5.0f)
                horizontalLineTo(7.17f)
                lineTo(8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _watchExportVariant!!
    }

private var _watchExportVariant: ImageVector? = null
