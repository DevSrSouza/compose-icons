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

public val MaterialDesignIcons.FileChartCheck: ImageVector
    get() {
        if (_fileChartCheck != null) {
            return _fileChartCheck!!
        }
        _fileChartCheck = Builder(name = "FileChartCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.5f, 17.0f)
                lineTo(18.5f, 22.0f)
                lineTo(15.0f, 18.5f)
                lineTo(16.5f, 17.0f)
                lineTo(18.5f, 19.0f)
                lineTo(22.0f, 15.5f)
                lineTo(23.5f, 17.0f)
                moveTo(6.0f, 2.0f)
                curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.1f, 4.9f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(13.8f)
                curveTo(13.3f, 21.1f, 13.0f, 20.1f, 13.0f, 19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                curveTo(13.0f, 15.7f, 15.7f, 13.0f, 19.0f, 13.0f)
                curveTo(19.3f, 13.0f, 19.7f, 13.0f, 20.0f, 13.1f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                horizontalLineTo(6.0f)
                moveTo(13.0f, 3.5f)
                lineTo(18.5f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.5f)
                moveTo(7.0f, 14.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _fileChartCheck!!
    }

private var _fileChartCheck: ImageVector? = null
