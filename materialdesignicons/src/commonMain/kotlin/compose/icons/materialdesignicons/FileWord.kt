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

public val MaterialDesignIcons.FileWord: ImageVector
    get() {
        if (_fileWord != null) {
            return _fileWord!!
        }
        _fileWord = Builder(name = "FileWord", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 20.0f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                moveTo(15.2f, 20.0f)
                horizontalLineTo(13.8f)
                lineTo(12.0f, 13.2f)
                lineTo(10.2f, 20.0f)
                horizontalLineTo(8.8f)
                lineTo(6.6f, 11.0f)
                horizontalLineTo(8.1f)
                lineTo(9.5f, 17.8f)
                lineTo(11.3f, 11.0f)
                horizontalLineTo(12.6f)
                lineTo(14.4f, 17.8f)
                lineTo(15.8f, 11.0f)
                horizontalLineTo(17.3f)
                lineTo(15.2f, 20.0f)
                moveTo(13.0f, 9.0f)
                verticalLineTo(3.5f)
                lineTo(18.5f, 9.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _fileWord!!
    }

private var _fileWord: ImageVector? = null
