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

public val MaterialDesignIcons.FileSign: ImageVector
    get() {
        if (_fileSign != null) {
            return _fileSign!!
        }
        _fileSign = Builder(name = "FileSign", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.7f, 12.9f)
                lineTo(14.0f, 18.6f)
                horizontalLineTo(11.7f)
                verticalLineTo(16.3f)
                lineTo(17.4f, 10.6f)
                lineTo(19.7f, 12.9f)
                moveTo(23.1f, 12.1f)
                curveTo(23.1f, 12.4f, 22.8f, 12.7f, 22.5f, 13.0f)
                lineTo(20.0f, 15.5f)
                lineTo(19.1f, 14.6f)
                lineTo(21.7f, 12.0f)
                lineTo(21.1f, 11.4f)
                lineTo(20.4f, 12.1f)
                lineTo(18.1f, 9.8f)
                lineTo(20.3f, 7.7f)
                curveTo(20.5f, 7.5f, 20.9f, 7.5f, 21.2f, 7.7f)
                lineTo(22.6f, 9.1f)
                curveTo(22.8f, 9.3f, 22.8f, 9.7f, 22.6f, 10.0f)
                curveTo(22.4f, 10.2f, 22.2f, 10.4f, 22.2f, 10.6f)
                curveTo(22.2f, 10.8f, 22.4f, 11.0f, 22.6f, 11.2f)
                curveTo(22.9f, 11.5f, 23.2f, 11.8f, 23.1f, 12.1f)
                moveTo(3.0f, 20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.5f)
                lineTo(17.0f, 8.5f)
                verticalLineTo(8.0f)
                lineTo(11.0f, 2.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 2.0f, 1.0f, 2.9f, 1.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(1.0f, 21.1f, 1.9f, 22.0f, 3.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(16.1f, 22.0f, 17.0f, 21.1f, 17.0f, 20.0f)
                horizontalLineTo(3.0f)
                moveTo(11.0f, 17.1f)
                curveTo(10.8f, 17.1f, 10.6f, 17.2f, 10.5f, 17.2f)
                lineTo(10.0f, 15.0f)
                horizontalLineTo(8.5f)
                lineTo(6.4f, 16.7f)
                lineTo(7.0f, 14.0f)
                horizontalLineTo(5.5f)
                lineTo(4.5f, 19.0f)
                horizontalLineTo(6.0f)
                lineTo(8.9f, 16.4f)
                lineTo(9.5f, 18.7f)
                horizontalLineTo(10.5f)
                lineTo(11.0f, 18.6f)
                verticalLineTo(17.1f)
                close()
            }
        }
        .build()
        return _fileSign!!
    }

private var _fileSign: ImageVector? = null
