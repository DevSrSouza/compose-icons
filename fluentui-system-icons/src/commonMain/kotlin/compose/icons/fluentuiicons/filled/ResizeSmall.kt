package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.ResizeSmall: ImageVector
    get() {
        if (_resizeSmall != null) {
            return _resizeSmall!!
        }
        _resizeSmall = Builder(name = "ResizeSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.25f, 4.5f)
                curveTo(5.2835f, 4.5f, 4.5f, 5.2835f, 4.5f, 6.25f)
                verticalLineTo(7.75f)
                curveTo(4.5f, 8.1642f, 4.1642f, 8.5f, 3.75f, 8.5f)
                curveTo(3.3358f, 8.5f, 3.0f, 8.1642f, 3.0f, 7.75f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(7.75f)
                curveTo(8.1642f, 3.0f, 8.5f, 3.3358f, 8.5f, 3.75f)
                curveTo(8.5f, 4.1642f, 8.1642f, 4.5f, 7.75f, 4.5f)
                horizontalLineTo(6.25f)
                close()
                moveTo(10.2f, 8.0f)
                curveTo(8.9574f, 8.0f, 7.95f, 9.0074f, 7.95f, 10.25f)
                verticalLineTo(13.75f)
                curveTo(7.95f, 14.9926f, 8.9574f, 16.0f, 10.2f, 16.0f)
                horizontalLineTo(13.7f)
                curveTo(14.9427f, 16.0f, 15.95f, 14.9926f, 15.95f, 13.75f)
                verticalLineTo(10.25f)
                curveTo(15.95f, 9.0074f, 14.9427f, 8.0f, 13.7f, 8.0f)
                horizontalLineTo(10.2f)
                close()
                moveTo(17.75f, 4.5f)
                curveTo(18.7165f, 4.5f, 19.5f, 5.2835f, 19.5f, 6.25f)
                verticalLineTo(7.75f)
                curveTo(19.5f, 8.1642f, 19.8358f, 8.5f, 20.25f, 8.5f)
                curveTo(20.6642f, 8.5f, 21.0f, 8.1642f, 21.0f, 7.75f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.4551f, 19.5449f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(16.25f)
                curveTo(15.8358f, 3.0f, 15.5f, 3.3358f, 15.5f, 3.75f)
                curveTo(15.5f, 4.1642f, 15.8358f, 4.5f, 16.25f, 4.5f)
                lineTo(17.75f, 4.5f)
                close()
                moveTo(17.75f, 19.5f)
                curveTo(18.7165f, 19.5f, 19.5f, 18.7165f, 19.5f, 17.75f)
                verticalLineTo(16.25f)
                curveTo(19.5f, 15.8358f, 19.8358f, 15.5f, 20.25f, 15.5f)
                curveTo(20.6642f, 15.5f, 21.0f, 15.8358f, 21.0f, 16.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.5449f, 19.5449f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(16.25f)
                curveTo(15.8358f, 21.0f, 15.5f, 20.6642f, 15.5f, 20.25f)
                curveTo(15.5f, 19.8358f, 15.8358f, 19.5f, 16.25f, 19.5f)
                horizontalLineTo(17.75f)
                close()
                moveTo(6.25f, 19.5f)
                curveTo(5.2835f, 19.5f, 4.5f, 18.7165f, 4.5f, 17.75f)
                lineTo(4.5f, 16.25f)
                curveTo(4.5f, 15.8358f, 4.1642f, 15.5f, 3.75f, 15.5f)
                curveTo(3.3358f, 15.5f, 3.0f, 15.8358f, 3.0f, 16.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(7.75f)
                curveTo(8.1642f, 21.0f, 8.5f, 20.6642f, 8.5f, 20.25f)
                curveTo(8.5f, 19.8358f, 8.1642f, 19.5f, 7.75f, 19.5f)
                horizontalLineTo(6.25f)
                close()
            }
        }
        .build()
        return _resizeSmall!!
    }

private var _resizeSmall: ImageVector? = null
