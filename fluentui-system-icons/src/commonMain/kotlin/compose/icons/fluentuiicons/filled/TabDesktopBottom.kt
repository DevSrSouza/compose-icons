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

public val FilledGroup.TabDesktopBottom: ImageVector
    get() {
        if (_tabDesktopBottom != null) {
            return _tabDesktopBottom!!
        }
        _tabDesktopBottom = Builder(name = "TabDesktopBottom", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.5449f, 19.5449f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(17.75f)
                curveTo(14.5f, 16.5074f, 13.4926f, 15.5f, 12.25f, 15.5f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.25f)
                close()
                moveTo(3.0f, 17.0f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.75f)
                curveTo(13.0f, 17.3358f, 12.6642f, 17.0f, 12.25f, 17.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _tabDesktopBottom!!
    }

private var _tabDesktopBottom: ImageVector? = null
