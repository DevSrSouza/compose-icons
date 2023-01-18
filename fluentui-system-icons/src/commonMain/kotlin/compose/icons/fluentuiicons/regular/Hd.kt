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

public val RegularGroup.Hd: ImageVector
    get() {
        if (_hd != null) {
            return _hd!!
        }
        _hd = Builder(name = "Hd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.25f, 8.0f)
                curveTo(7.6642f, 8.0f, 8.0f, 8.3358f, 8.0f, 8.75f)
                verticalLineTo(11.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.75f)
                curveTo(10.0f, 8.3358f, 10.3358f, 8.0f, 10.75f, 8.0f)
                curveTo(11.1642f, 8.0f, 11.5f, 8.3358f, 11.5f, 8.75f)
                verticalLineTo(15.25f)
                curveTo(11.5f, 15.6642f, 11.1642f, 16.0f, 10.75f, 16.0f)
                curveTo(10.3358f, 16.0f, 10.0f, 15.6642f, 10.0f, 15.25f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.25f)
                curveTo(8.0f, 15.6642f, 7.6642f, 16.0f, 7.25f, 16.0f)
                curveTo(6.8358f, 16.0f, 6.5f, 15.6642f, 6.5f, 15.25f)
                verticalLineTo(8.75f)
                curveTo(6.5f, 8.3358f, 6.8358f, 8.0f, 7.25f, 8.0f)
                close()
                moveTo(13.75f, 8.0f)
                curveTo(13.3358f, 8.0f, 13.0f, 8.3358f, 13.0f, 8.75f)
                verticalLineTo(15.25f)
                curveTo(13.0f, 15.6642f, 13.3358f, 16.0f, 13.75f, 16.0f)
                horizontalLineTo(14.75f)
                curveTo(16.5449f, 16.0f, 18.0f, 14.5449f, 18.0f, 12.75f)
                verticalLineTo(11.25f)
                curveTo(18.0f, 9.4551f, 16.5449f, 8.0f, 14.75f, 8.0f)
                horizontalLineTo(13.75f)
                close()
                moveTo(14.5f, 14.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(14.75f)
                curveTo(15.7165f, 9.5f, 16.5f, 10.2835f, 16.5f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(16.5f, 13.7165f, 15.7165f, 14.5f, 14.75f, 14.5f)
                horizontalLineTo(14.5f)
                close()
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.5449f, 19.5449f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(6.25f, 4.5f)
                curveTo(5.2835f, 4.5f, 4.5f, 5.2835f, 4.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.7165f, 5.2835f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(17.75f)
                curveTo(18.7165f, 19.5f, 19.5f, 18.7165f, 19.5f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.2835f, 18.7165f, 4.5f, 17.75f, 4.5f)
                horizontalLineTo(6.25f)
                close()
            }
        }
        .build()
        return _hd!!
    }

private var _hd: ImageVector? = null
