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

public val RegularGroup.Tabs: ImageVector
    get() {
        if (_tabs != null) {
            return _tabs!!
        }
        _tabs = Builder(name = "Tabs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 9.25f)
                curveTo(2.0f, 5.2459f, 5.2459f, 2.0f, 9.25f, 2.0f)
                horizontalLineTo(12.75f)
                curveTo(14.102f, 2.0f, 15.2611f, 2.8255f, 15.7509f, 4.0f)
                lineTo(13.9747f, 4.0f)
                curveTo(13.6591f, 3.6907f, 13.2268f, 3.5f, 12.75f, 3.5f)
                horizontalLineTo(9.25f)
                curveTo(6.0744f, 3.5f, 3.5f, 6.0744f, 3.5f, 9.25f)
                verticalLineTo(12.75f)
                curveTo(3.5f, 13.2268f, 3.6907f, 13.6591f, 4.0f, 13.9747f)
                verticalLineTo(15.75f)
                curveTo(2.8255f, 15.2602f, 2.0f, 14.102f, 2.0f, 12.75f)
                verticalLineTo(9.25f)
                close()
                moveTo(5.0f, 10.25f)
                curveTo(5.0f, 7.3505f, 7.3505f, 5.0f, 10.25f, 5.0f)
                horizontalLineTo(15.75f)
                curveTo(17.102f, 5.0f, 18.2611f, 5.8255f, 18.7509f, 7.0f)
                lineTo(16.9747f, 7.0f)
                curveTo(16.6591f, 6.6907f, 16.2268f, 6.5f, 15.75f, 6.5f)
                horizontalLineTo(10.25f)
                curveTo(8.1789f, 6.5f, 6.5f, 8.1789f, 6.5f, 10.25f)
                verticalLineTo(15.75f)
                curveTo(6.5f, 16.2268f, 6.6907f, 16.6591f, 7.0f, 16.9747f)
                verticalLineTo(18.75f)
                curveTo(5.8255f, 18.2602f, 5.0f, 17.102f, 5.0f, 15.75f)
                verticalLineTo(10.25f)
                close()
                moveTo(11.25f, 8.0f)
                curveTo(9.4551f, 8.0f, 8.0f, 9.4551f, 8.0f, 11.25f)
                verticalLineTo(18.75f)
                curveTo(8.0f, 20.5449f, 9.4551f, 22.0f, 11.25f, 22.0f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 22.0f, 22.0f, 20.5449f, 22.0f, 18.75f)
                verticalLineTo(11.25f)
                curveTo(22.0f, 9.4551f, 20.5449f, 8.0f, 18.75f, 8.0f)
                horizontalLineTo(11.25f)
                close()
                moveTo(9.5f, 11.25f)
                curveTo(9.5f, 10.2835f, 10.2835f, 9.5f, 11.25f, 9.5f)
                horizontalLineTo(18.75f)
                curveTo(19.7165f, 9.5f, 20.5f, 10.2835f, 20.5f, 11.25f)
                verticalLineTo(18.75f)
                curveTo(20.5f, 19.7165f, 19.7165f, 20.5f, 18.75f, 20.5f)
                horizontalLineTo(11.25f)
                curveTo(10.2835f, 20.5f, 9.5f, 19.7165f, 9.5f, 18.75f)
                verticalLineTo(11.25f)
                close()
            }
        }
        .build()
        return _tabs!!
    }

private var _tabs: ImageVector? = null
