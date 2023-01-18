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

public val FilledGroup.Resize: ImageVector
    get() {
        if (_resize != null) {
            return _resize!!
        }
        _resize = Builder(name = "Resize", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 3.0f)
                curveTo(11.0f, 2.4477f, 10.5523f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 2.0f, 2.0f, 3.4551f, 2.0f, 5.25f)
                verticalLineTo(10.0f)
                curveTo(2.0f, 10.5523f, 2.4477f, 11.0f, 3.0f, 11.0f)
                curveTo(3.5523f, 11.0f, 4.0f, 10.5523f, 4.0f, 10.0f)
                verticalLineTo(5.25f)
                curveTo(4.0f, 4.5596f, 4.5596f, 4.0f, 5.25f, 4.0f)
                horizontalLineTo(10.0f)
                curveTo(10.5523f, 4.0f, 11.0f, 3.5523f, 11.0f, 3.0f)
                close()
                moveTo(14.0f, 2.0f)
                curveTo(13.4477f, 2.0f, 13.0f, 2.4477f, 13.0f, 3.0f)
                curveTo(13.0f, 3.5523f, 13.4477f, 4.0f, 14.0f, 4.0f)
                horizontalLineTo(18.75f)
                curveTo(19.4404f, 4.0f, 20.0f, 4.5596f, 20.0f, 5.25f)
                verticalLineTo(10.0f)
                curveTo(20.0f, 10.5523f, 20.4477f, 11.0f, 21.0f, 11.0f)
                curveTo(21.5523f, 11.0f, 22.0f, 10.5523f, 22.0f, 10.0f)
                verticalLineTo(5.25f)
                curveTo(22.0f, 3.4551f, 20.5449f, 2.0f, 18.75f, 2.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(14.0f, 22.0f)
                curveTo(13.4477f, 22.0f, 13.0f, 21.5523f, 13.0f, 21.0f)
                curveTo(13.0f, 20.4477f, 13.4477f, 20.0f, 14.0f, 20.0f)
                horizontalLineTo(18.75f)
                curveTo(19.4404f, 20.0f, 20.0f, 19.4404f, 20.0f, 18.75f)
                verticalLineTo(14.0f)
                curveTo(20.0f, 13.4477f, 20.4477f, 13.0f, 21.0f, 13.0f)
                curveTo(21.5523f, 13.0f, 22.0f, 13.4477f, 22.0f, 14.0f)
                verticalLineTo(18.75f)
                curveTo(22.0f, 20.5449f, 20.5449f, 22.0f, 18.75f, 22.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(10.0f, 22.0f)
                curveTo(10.5523f, 22.0f, 11.0f, 21.5523f, 11.0f, 21.0f)
                curveTo(11.0f, 20.4477f, 10.5523f, 20.0f, 10.0f, 20.0f)
                horizontalLineTo(5.25f)
                curveTo(4.5596f, 20.0f, 4.0f, 19.4404f, 4.0f, 18.75f)
                verticalLineTo(14.0f)
                curveTo(4.0f, 13.4477f, 3.5523f, 13.0f, 3.0f, 13.0f)
                curveTo(2.4477f, 13.0f, 2.0f, 13.4477f, 2.0f, 14.0f)
                verticalLineTo(18.75f)
                curveTo(2.0f, 20.5449f, 3.4551f, 22.0f, 5.25f, 22.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _resize!!
    }

private var _resize: ImageVector? = null
