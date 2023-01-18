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

public val FilledGroup.Subtitles: ImageVector
    get() {
        if (_subtitles != null) {
            return _subtitles!!
        }
        _subtitles = Builder(name = "Subtitles", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.25f)
                curveTo(2.0f, 5.4551f, 3.4551f, 4.0f, 5.25f, 4.0f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 4.0f, 22.0f, 5.4551f, 22.0f, 7.25f)
                verticalLineTo(16.75f)
                curveTo(22.0f, 18.5449f, 20.5449f, 20.0f, 18.75f, 20.0f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 20.0f, 2.0f, 18.5449f, 2.0f, 16.75f)
                verticalLineTo(7.25f)
                close()
                moveTo(5.0f, 13.25f)
                curveTo(5.0f, 13.6642f, 5.3358f, 14.0f, 5.75f, 14.0f)
                horizontalLineTo(13.25f)
                curveTo(13.6642f, 14.0f, 14.0f, 13.6642f, 14.0f, 13.25f)
                curveTo(14.0f, 12.8358f, 13.6642f, 12.5f, 13.25f, 12.5f)
                horizontalLineTo(5.75f)
                curveTo(5.3358f, 12.5f, 5.0f, 12.8358f, 5.0f, 13.25f)
                close()
                moveTo(15.75f, 12.5f)
                curveTo(15.3358f, 12.5f, 15.0f, 12.8358f, 15.0f, 13.25f)
                curveTo(15.0f, 13.6642f, 15.3358f, 14.0f, 15.75f, 14.0f)
                horizontalLineTo(18.25f)
                curveTo(18.6642f, 14.0f, 19.0f, 13.6642f, 19.0f, 13.25f)
                curveTo(19.0f, 12.8358f, 18.6642f, 12.5f, 18.25f, 12.5f)
                horizontalLineTo(15.75f)
                close()
                moveTo(5.0f, 16.25f)
                curveTo(5.0f, 16.6642f, 5.3358f, 17.0f, 5.75f, 17.0f)
                horizontalLineTo(9.25f)
                curveTo(9.6642f, 17.0f, 10.0f, 16.6642f, 10.0f, 16.25f)
                curveTo(10.0f, 15.8358f, 9.6642f, 15.5f, 9.25f, 15.5f)
                horizontalLineTo(5.75f)
                curveTo(5.3358f, 15.5f, 5.0f, 15.8358f, 5.0f, 16.25f)
                close()
                moveTo(11.75f, 15.5f)
                curveTo(11.3358f, 15.5f, 11.0f, 15.8358f, 11.0f, 16.25f)
                curveTo(11.0f, 16.6642f, 11.3358f, 17.0f, 11.75f, 17.0f)
                horizontalLineTo(18.25f)
                curveTo(18.6642f, 17.0f, 19.0f, 16.6642f, 19.0f, 16.25f)
                curveTo(19.0f, 15.8358f, 18.6642f, 15.5f, 18.25f, 15.5f)
                horizontalLineTo(11.75f)
                close()
            }
        }
        .build()
        return _subtitles!!
    }

private var _subtitles: ImageVector? = null
