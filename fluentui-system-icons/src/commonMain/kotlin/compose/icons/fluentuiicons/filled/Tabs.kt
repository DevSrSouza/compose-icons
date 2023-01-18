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

public val FilledGroup.Tabs: ImageVector
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
                lineTo(10.25f, 4.0f)
                curveTo(6.7982f, 4.0f, 4.0f, 6.7982f, 4.0f, 10.25f)
                verticalLineTo(15.75f)
                curveTo(2.8255f, 15.2602f, 2.0f, 14.102f, 2.0f, 12.75f)
                verticalLineTo(9.25f)
                close()
                moveTo(5.0f, 10.25f)
                curveTo(5.0f, 7.3505f, 7.3505f, 5.0f, 10.25f, 5.0f)
                horizontalLineTo(15.75f)
                curveTo(17.102f, 5.0f, 18.2611f, 5.8255f, 18.7509f, 7.0f)
                lineTo(11.25f, 7.0f)
                curveTo(8.9028f, 7.0f, 7.0f, 8.9028f, 7.0f, 11.25f)
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
            }
        }
        .build()
        return _tabs!!
    }

private var _tabs: ImageVector? = null