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

public val MaterialDesignIcons.KettleOutline: ImageVector
    get() {
        if (_kettleOutline != null) {
            return _kettleOutline!!
        }
        _kettleOutline = Builder(name = "KettleOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 3.0f)
                curveTo(7.8f, 3.0f, 4.0f, 5.7f, 4.0f, 9.0f)
                curveTo(4.0f, 10.2f, 4.5f, 11.3f, 5.4f, 12.3f)
                arcTo(6.8f, 6.8f, 0.0f, false, false, 4.0f, 16.5f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.1f, 4.9f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 20.0f)
                verticalLineTo(16.5f)
                curveTo(21.0f, 15.3f, 20.7f, 14.1f, 20.0f, 13.0f)
                lineTo(22.0f, 11.0f)
                lineTo(19.0f, 8.0f)
                lineTo(16.9f, 10.1f)
                arcTo(9.2f, 9.2f, 0.0f, false, false, 7.6f, 10.4f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 9.0f)
                curveTo(7.0f, 7.2f, 9.5f, 5.7f, 12.5f, 5.7f)
                curveTo(13.9f, 5.7f, 15.3f, 6.1f, 16.3f, 6.7f)
                lineTo(18.3f, 4.7f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.5f, 3.0f)
                moveTo(12.5f, 11.0f)
                curveTo(16.0f, 11.0f, 19.0f, 14.0f, 19.0f, 16.5f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.5f)
                curveTo(6.0f, 14.0f, 9.0f, 11.0f, 12.5f, 11.0f)
                moveTo(13.0f, 12.5f)
                curveTo(10.0f, 12.5f, 8.0f, 14.0f, 8.0f, 17.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.0f)
                curveTo(10.0f, 16.0f, 10.0f, 13.5f, 13.0f, 12.5f)
                close()
            }
        }
        .build()
        return _kettleOutline!!
    }

private var _kettleOutline: ImageVector? = null
