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

public val MaterialDesignIcons.RenameBoxOutline: ImageVector
    get() {
        if (_renameBoxOutline != null) {
            return _renameBoxOutline!!
        }
        _renameBoxOutline = Builder(name = "RenameBoxOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 17.0f)
                horizontalLineTo(11.5f)
                lineTo(13.5f, 15.0f)
                horizontalLineTo(17.0f)
                moveTo(7.0f, 17.0f)
                verticalLineTo(14.5f)
                lineTo(14.9f, 6.7f)
                curveTo(15.1f, 6.5f, 15.4f, 6.5f, 15.6f, 6.7f)
                lineTo(17.4f, 8.5f)
                curveTo(17.6f, 8.7f, 17.6f, 9.0f, 17.4f, 9.2f)
                lineTo(9.5f, 17.0f)
                moveTo(19.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 21.0f, 21.0f, 20.1f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                close()
            }
        }
        .build()
        return _renameBoxOutline!!
    }

private var _renameBoxOutline: ImageVector? = null
