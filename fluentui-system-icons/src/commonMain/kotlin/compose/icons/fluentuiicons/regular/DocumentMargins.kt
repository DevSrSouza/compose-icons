package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.DocumentMargins: ImageVector
    get() {
        if (_documentMargins != null) {
            return _documentMargins!!
        }
        _documentMargins = Builder(name = "DocumentMargins", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 15.5f)
                verticalLineTo(8.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(15.5f)
                horizontalLineTo(7.0f)
                close()
                moveTo(15.5f, 15.5f)
                verticalLineTo(8.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(15.5f)
                close()
                moveTo(4.0f, 4.5f)
                verticalLineTo(19.5f)
                curveTo(4.0f, 20.8807f, 5.1193f, 22.0f, 6.5f, 22.0f)
                horizontalLineTo(17.5f)
                curveTo(18.8807f, 22.0f, 20.0f, 20.8807f, 20.0f, 19.5f)
                verticalLineTo(4.5f)
                curveTo(20.0f, 3.1193f, 18.8807f, 2.0f, 17.5f, 2.0f)
                horizontalLineTo(6.5f)
                curveTo(5.1193f, 2.0f, 4.0f, 3.1193f, 4.0f, 4.5f)
                close()
                moveTo(17.0f, 3.5f)
                horizontalLineTo(17.5f)
                curveTo(18.0523f, 3.5f, 18.5f, 3.9477f, 18.5f, 4.5f)
                verticalLineTo(19.5f)
                curveTo(18.5f, 20.0523f, 18.0523f, 20.5f, 17.5f, 20.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(20.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.5f)
                horizontalLineTo(6.5f)
                curveTo(5.9477f, 20.5f, 5.5f, 20.0523f, 5.5f, 19.5f)
                verticalLineTo(4.5f)
                curveTo(5.5f, 3.9477f, 5.9477f, 3.5f, 6.5f, 3.5f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(3.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(3.5f)
                close()
            }
        }
        .build()
        return _documentMargins!!
    }

private var _documentMargins: ImageVector? = null
