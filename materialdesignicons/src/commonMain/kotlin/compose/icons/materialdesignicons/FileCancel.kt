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

public val MaterialDesignIcons.FileCancel: ImageVector
    get() {
        if (_fileCancel != null) {
            return _fileCancel!!
        }
        _fileCancel = Builder(name = "FileCancel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(10.5f, 11.0f)
                curveTo(8.0f, 11.0f, 6.0f, 13.0f, 6.0f, 15.5f)
                curveTo(6.0f, 18.0f, 8.0f, 20.0f, 10.5f, 20.0f)
                curveTo(13.0f, 20.0f, 15.0f, 18.0f, 15.0f, 15.5f)
                curveTo(15.0f, 13.0f, 13.0f, 11.0f, 10.5f, 11.0f)
                moveTo(10.5f, 12.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 13.5f, 15.5f)
                curveTo(13.5f, 16.06f, 13.35f, 16.58f, 13.08f, 17.0f)
                lineTo(9.0f, 12.92f)
                curveTo(9.42f, 12.65f, 9.94f, 12.5f, 10.5f, 12.5f)
                moveTo(7.5f, 15.5f)
                curveTo(7.5f, 14.94f, 7.65f, 14.42f, 7.92f, 14.0f)
                lineTo(12.0f, 18.08f)
                curveTo(11.58f, 18.35f, 11.06f, 18.5f, 10.5f, 18.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.5f, 15.5f)
                close()
            }
        }
        .build()
        return _fileCancel!!
    }

private var _fileCancel: ImageVector? = null
