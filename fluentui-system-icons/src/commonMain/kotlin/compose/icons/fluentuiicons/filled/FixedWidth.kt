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

public val FilledGroup.FixedWidth: ImageVector
    get() {
        if (_fixedWidth != null) {
            return _fixedWidth!!
        }
        _fixedWidth = Builder(name = "FixedWidth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.75f, 4.0f)
                curveTo(4.1642f, 4.0f, 4.5f, 4.3078f, 4.5f, 4.6875f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(4.6875f)
                curveTo(11.25f, 4.3078f, 11.5858f, 4.0f, 12.0f, 4.0f)
                curveTo(12.4142f, 4.0f, 12.75f, 4.3078f, 12.75f, 4.6875f)
                verticalLineTo(6.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(4.6875f)
                curveTo(19.5f, 4.3078f, 19.8358f, 4.0f, 20.25f, 4.0f)
                curveTo(20.6642f, 4.0f, 21.0f, 4.3078f, 21.0f, 4.6875f)
                verticalLineTo(8.8125f)
                curveTo(21.0f, 9.1922f, 20.6642f, 9.5f, 20.25f, 9.5f)
                curveTo(19.8358f, 9.5f, 19.5f, 9.1922f, 19.5f, 8.8125f)
                verticalLineTo(7.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(8.8125f)
                curveTo(12.75f, 9.1922f, 12.4142f, 9.5f, 12.0f, 9.5f)
                curveTo(11.5858f, 9.5f, 11.25f, 9.1922f, 11.25f, 8.8125f)
                verticalLineTo(7.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(8.8125f)
                curveTo(4.5f, 9.1922f, 4.1642f, 9.5f, 3.75f, 9.5f)
                curveTo(3.3358f, 9.5f, 3.0f, 9.1922f, 3.0f, 8.8125f)
                verticalLineTo(4.6875f)
                curveTo(3.0f, 4.3078f, 3.3358f, 4.0f, 3.75f, 4.0f)
                close()
                moveTo(5.75f, 11.0f)
                curveTo(4.2312f, 11.0f, 3.0f, 12.2312f, 3.0f, 13.75f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.2688f, 4.2312f, 20.5f, 5.75f, 20.5f)
                horizontalLineTo(11.25f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.75f)
                close()
                moveTo(18.25f, 20.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.25f)
                curveTo(19.7688f, 11.0f, 21.0f, 12.2312f, 21.0f, 13.75f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.2688f, 19.7688f, 20.5f, 18.25f, 20.5f)
                close()
            }
        }
        .build()
        return _fixedWidth!!
    }

private var _fixedWidth: ImageVector? = null
