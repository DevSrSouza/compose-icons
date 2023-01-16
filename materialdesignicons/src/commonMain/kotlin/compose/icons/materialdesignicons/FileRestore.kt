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

public val MaterialDesignIcons.FileRestore: ImageVector
    get() {
        if (_fileRestore != null) {
            return _fileRestore!!
        }
        _fileRestore = Builder(name = "FileRestore", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(12.0f, 18.0f)
                curveTo(9.95f, 18.0f, 8.19f, 16.76f, 7.42f, 15.0f)
                horizontalLineTo(9.13f)
                curveTo(9.76f, 15.9f, 10.81f, 16.5f, 12.0f, 16.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 15.5f, 13.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.0f, 9.5f)
                curveTo(10.65f, 9.5f, 9.5f, 10.28f, 8.9f, 11.4f)
                lineTo(10.5f, 13.0f)
                horizontalLineTo(6.5f)
                verticalLineTo(9.0f)
                lineTo(7.8f, 10.3f)
                curveTo(8.69f, 8.92f, 10.23f, 8.0f, 12.0f, 8.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 17.0f, 13.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _fileRestore!!
    }

private var _fileRestore: ImageVector? = null
