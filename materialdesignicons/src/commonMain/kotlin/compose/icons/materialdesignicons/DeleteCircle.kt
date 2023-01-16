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

public val MaterialDesignIcons.DeleteCircle: ImageVector
    get() {
        if (_deleteCircle != null) {
            return _deleteCircle!!
        }
        _deleteCircle = Builder(name = "DeleteCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.53f, 2.0f, 22.0f, 6.47f, 22.0f, 12.0f)
                curveTo(22.0f, 17.53f, 17.53f, 22.0f, 12.0f, 22.0f)
                curveTo(6.47f, 22.0f, 2.0f, 17.53f, 2.0f, 12.0f)
                curveTo(2.0f, 6.47f, 6.47f, 2.0f, 12.0f, 2.0f)
                moveTo(17.0f, 7.0f)
                horizontalLineTo(14.5f)
                lineTo(13.5f, 6.0f)
                horizontalLineTo(10.5f)
                lineTo(9.5f, 7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                moveTo(9.0f, 18.0f)
                horizontalLineTo(15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 17.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 18.0f)
                close()
            }
        }
        .build()
        return _deleteCircle!!
    }

private var _deleteCircle: ImageVector? = null
