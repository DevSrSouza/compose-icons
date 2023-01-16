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

public val MaterialDesignIcons.RenameBox: ImageVector
    get() {
        if (_renameBox != null) {
            return _renameBox!!
        }
        _renameBox = Builder(name = "RenameBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 17.0f)
                horizontalLineTo(10.5f)
                lineTo(12.5f, 15.0f)
                horizontalLineTo(18.0f)
                moveTo(6.0f, 17.0f)
                verticalLineTo(14.5f)
                lineTo(13.88f, 6.65f)
                curveTo(14.07f, 6.45f, 14.39f, 6.45f, 14.59f, 6.65f)
                lineTo(16.35f, 8.41f)
                curveTo(16.55f, 8.61f, 16.55f, 8.92f, 16.35f, 9.12f)
                lineTo(8.47f, 17.0f)
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.89f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.89f, 20.1f, 3.0f, 19.0f, 3.0f)
                close()
            }
        }
        .build()
        return _renameBox!!
    }

private var _renameBox: ImageVector? = null
