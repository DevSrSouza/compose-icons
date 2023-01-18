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

public val RegularGroup.AlignCenterHorizontal: ImageVector
    get() {
        if (_alignCenterHorizontal != null) {
            return _alignCenterHorizontal!!
        }
        _alignCenterHorizontal = Builder(name = "AlignCenterHorizontal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.25f, 12.75f)
                curveTo(21.6642f, 12.75f, 22.0f, 12.4142f, 22.0f, 12.0f)
                curveTo(22.0f, 11.5858f, 21.6642f, 11.25f, 21.25f, 11.25f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.75f)
                curveTo(20.0f, 7.5074f, 18.9926f, 6.5f, 17.75f, 6.5f)
                horizontalLineTo(15.25f)
                curveTo(14.0074f, 6.5f, 13.0f, 7.5074f, 13.0f, 8.75f)
                verticalLineTo(11.25f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.75f)
                curveTo(11.0f, 5.5074f, 9.9926f, 4.5f, 8.75f, 4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.0074f, 4.5f, 4.0f, 5.5074f, 4.0f, 6.75f)
                verticalLineTo(11.25f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 11.25f, 2.0f, 11.5858f, 2.0f, 12.0f)
                curveTo(2.0f, 12.4142f, 2.3358f, 12.75f, 2.75f, 12.75f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.25f)
                curveTo(4.0f, 18.4926f, 5.0074f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(8.75f)
                curveTo(9.9926f, 19.5f, 11.0f, 18.4926f, 11.0f, 17.25f)
                verticalLineTo(12.75f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.25f)
                curveTo(13.0f, 16.4926f, 14.0074f, 17.5f, 15.25f, 17.5f)
                horizontalLineTo(17.75f)
                curveTo(18.9926f, 17.5f, 20.0f, 16.4926f, 20.0f, 15.25f)
                verticalLineTo(12.75f)
                horizontalLineTo(21.25f)
                close()
                moveTo(18.5f, 8.75f)
                verticalLineTo(15.25f)
                curveTo(18.5f, 15.6642f, 18.1642f, 16.0f, 17.75f, 16.0f)
                horizontalLineTo(15.25f)
                curveTo(14.8358f, 16.0f, 14.5f, 15.6642f, 14.5f, 15.25f)
                verticalLineTo(8.75f)
                curveTo(14.5f, 8.3358f, 14.8358f, 8.0f, 15.25f, 8.0f)
                horizontalLineTo(17.75f)
                curveTo(18.1642f, 8.0f, 18.5f, 8.3358f, 18.5f, 8.75f)
                close()
                moveTo(9.5f, 6.75f)
                lineTo(9.5f, 17.25f)
                curveTo(9.5f, 17.6642f, 9.1642f, 18.0f, 8.75f, 18.0f)
                horizontalLineTo(6.25f)
                curveTo(5.8358f, 18.0f, 5.5f, 17.6642f, 5.5f, 17.25f)
                verticalLineTo(6.75f)
                curveTo(5.5f, 6.3358f, 5.8358f, 6.0f, 6.25f, 6.0f)
                lineTo(8.75f, 6.0f)
                curveTo(9.1642f, 6.0f, 9.5f, 6.3358f, 9.5f, 6.75f)
                close()
            }
        }
        .build()
        return _alignCenterHorizontal!!
    }

private var _alignCenterHorizontal: ImageVector? = null
