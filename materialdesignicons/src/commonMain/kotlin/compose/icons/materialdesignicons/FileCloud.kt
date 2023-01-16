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

public val MaterialDesignIcons.FileCloud: ImageVector
    get() {
        if (_fileCloud != null) {
            return _fileCloud!!
        }
        _fileCloud = Builder(name = "FileCloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 9.0f)
                horizontalLineTo(18.5f)
                lineTo(13.0f, 3.5f)
                verticalLineTo(9.0f)
                moveTo(6.0f, 2.0f)
                horizontalLineTo(14.0f)
                lineTo(20.0f, 8.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 22.0f, 4.0f, 21.1f, 4.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 2.89f, 4.89f, 2.0f, 6.0f, 2.0f)
                moveTo(15.68f, 15.0f)
                curveTo(15.34f, 13.3f, 13.82f, 12.0f, 12.0f, 12.0f)
                curveTo(10.55f, 12.0f, 9.3f, 12.82f, 8.68f, 14.0f)
                curveTo(7.17f, 14.18f, 6.0f, 15.45f, 6.0f, 17.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 20.0f)
                horizontalLineTo(15.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.0f, 17.5f)
                curveTo(18.0f, 16.18f, 16.97f, 15.11f, 15.68f, 15.0f)
                close()
            }
        }
        .build()
        return _fileCloud!!
    }

private var _fileCloud: ImageVector? = null
