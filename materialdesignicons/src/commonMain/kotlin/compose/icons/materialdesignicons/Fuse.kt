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

public val MaterialDesignIcons.Fuse: ImageVector
    get() {
        if (_fuse != null) {
            return _fuse!!
        }
        _fuse = Builder(name = "Fuse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.0f)
                moveTo(11.16f, 16.0f)
                verticalLineTo(12.87f)
                horizontalLineTo(9.41f)
                lineTo(11.91f, 8.0f)
                verticalLineTo(11.14f)
                horizontalLineTo(13.59f)
                lineTo(11.16f, 16.0f)
                moveTo(16.0f, 2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 1.0f)
                horizontalLineTo(15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 2.0f)
                moveTo(16.0f, 18.0f)
                verticalLineTo(22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 23.0f)
                horizontalLineTo(8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 22.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _fuse!!
    }

private var _fuse: ImageVector? = null
