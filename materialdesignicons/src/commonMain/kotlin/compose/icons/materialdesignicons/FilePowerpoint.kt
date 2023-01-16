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

public val MaterialDesignIcons.FilePowerpoint: ImageVector
    get() {
        if (_filePowerpoint != null) {
            return _filePowerpoint!!
        }
        _filePowerpoint = Builder(name = "FilePowerpoint", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.6f, 12.3f)
                horizontalLineTo(10.6f)
                verticalLineTo(15.5f)
                horizontalLineTo(12.7f)
                curveTo(13.3f, 15.5f, 13.6f, 15.3f, 13.9f, 15.0f)
                curveTo(14.2f, 14.7f, 14.3f, 14.4f, 14.3f, 13.9f)
                curveTo(14.3f, 13.4f, 14.2f, 13.1f, 13.9f, 12.8f)
                curveTo(13.6f, 12.5f, 13.2f, 12.3f, 12.6f, 12.3f)
                moveTo(14.0f, 2.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 20.0f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                moveTo(15.2f, 16.0f)
                curveTo(14.6f, 16.5f, 14.1f, 16.7f, 12.8f, 16.7f)
                horizontalLineTo(10.6f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.8f)
                curveTo(14.1f, 11.0f, 14.7f, 11.3f, 15.2f, 11.8f)
                curveTo(15.8f, 12.4f, 16.0f, 13.0f, 16.0f, 13.9f)
                curveTo(16.0f, 14.8f, 15.8f, 15.5f, 15.2f, 16.0f)
                moveTo(13.0f, 9.0f)
                verticalLineTo(3.5f)
                lineTo(18.5f, 9.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _filePowerpoint!!
    }

private var _filePowerpoint: ImageVector? = null
