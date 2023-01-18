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

public val FilledGroup.AlignCenterVertical: ImageVector
    get() {
        if (_alignCenterVertical != null) {
            return _alignCenterVertical!!
        }
        _alignCenterVertical = Builder(name = "AlignCenterVertical", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.25f, 21.25f)
                curveTo(11.25f, 21.6642f, 11.5858f, 22.0f, 12.0f, 22.0f)
                curveTo(12.4142f, 22.0f, 12.75f, 21.6642f, 12.75f, 21.25f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.25f)
                curveTo(16.4926f, 20.0f, 17.5f, 18.9926f, 17.5f, 17.75f)
                verticalLineTo(15.25f)
                curveTo(17.5f, 14.0074f, 16.4926f, 13.0f, 15.25f, 13.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.25f)
                curveTo(18.4926f, 11.0f, 19.5f, 9.9926f, 19.5f, 8.75f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.0074f, 18.4926f, 4.0f, 17.25f, 4.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(2.75f)
                curveTo(12.75f, 2.3358f, 12.4142f, 2.0f, 12.0f, 2.0f)
                curveTo(11.5858f, 2.0f, 11.25f, 2.3358f, 11.25f, 2.75f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.75f)
                curveTo(5.5074f, 4.0f, 4.5f, 5.0074f, 4.5f, 6.25f)
                verticalLineTo(8.75f)
                curveTo(4.5f, 9.9926f, 5.5074f, 11.0f, 6.75f, 11.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.75f)
                curveTo(7.5074f, 13.0f, 6.5f, 14.0074f, 6.5f, 15.25f)
                verticalLineTo(17.75f)
                curveTo(6.5f, 18.9926f, 7.5074f, 20.0f, 8.75f, 20.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(21.25f)
                close()
            }
        }
        .build()
        return _alignCenterVertical!!
    }

private var _alignCenterVertical: ImageVector? = null
