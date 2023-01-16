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

public val MaterialDesignIcons.FileClock: ImageVector
    get() {
        if (_fileClock != null) {
            return _fileClock!!
        }
        _fileClock = Builder(name = "FileClock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                curveTo(2.89f, 2.0f, 2.0f, 2.89f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 22.0f)
                horizontalLineTo(12.41f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 16.0f, 23.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 23.0f, 16.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 18.0f, 9.3f)
                verticalLineTo(8.0f)
                lineTo(12.0f, 2.0f)
                horizontalLineTo(4.0f)
                moveTo(11.0f, 3.5f)
                lineTo(16.5f, 9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(3.5f)
                moveTo(16.0f, 11.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 21.0f, 16.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 16.0f, 21.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 11.0f, 16.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 16.0f, 11.0f)
                moveTo(15.0f, 12.0f)
                verticalLineTo(17.0f)
                lineTo(18.61f, 19.16f)
                lineTo(19.36f, 17.94f)
                lineTo(16.5f, 16.25f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _fileClock!!
    }

private var _fileClock: ImageVector? = null
