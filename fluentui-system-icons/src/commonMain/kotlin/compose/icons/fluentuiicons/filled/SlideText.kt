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

public val FilledGroup.SlideText: ImageVector
    get() {
        if (_slideText != null) {
            return _slideText!!
        }
        _slideText = Builder(name = "SlideText", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.75f)
                curveTo(2.0f, 5.2312f, 3.2312f, 4.0f, 4.75f, 4.0f)
                horizontalLineTo(19.25f)
                curveTo(20.7688f, 4.0f, 22.0f, 5.2312f, 22.0f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(22.0f, 18.7688f, 20.7688f, 20.0f, 19.25f, 20.0f)
                horizontalLineTo(4.75f)
                curveTo(3.2312f, 20.0f, 2.0f, 18.7688f, 2.0f, 17.25f)
                verticalLineTo(6.75f)
                close()
                moveTo(6.75f, 8.0f)
                curveTo(6.3358f, 8.0f, 6.0f, 8.3358f, 6.0f, 8.75f)
                curveTo(6.0f, 9.1642f, 6.3358f, 9.5f, 6.75f, 9.5f)
                horizontalLineTo(11.25f)
                curveTo(11.6642f, 9.5f, 12.0f, 9.1642f, 12.0f, 8.75f)
                curveTo(12.0f, 8.3358f, 11.6642f, 8.0f, 11.25f, 8.0f)
                horizontalLineTo(6.75f)
                close()
                moveTo(6.75f, 11.0f)
                curveTo(6.3358f, 11.0f, 6.0f, 11.3358f, 6.0f, 11.75f)
                curveTo(6.0f, 12.1642f, 6.3358f, 12.5f, 6.75f, 12.5f)
                horizontalLineTo(15.25f)
                curveTo(15.6642f, 12.5f, 16.0f, 12.1642f, 16.0f, 11.75f)
                curveTo(16.0f, 11.3358f, 15.6642f, 11.0f, 15.25f, 11.0f)
                horizontalLineTo(6.75f)
                close()
                moveTo(6.0f, 14.75f)
                curveTo(6.0f, 15.1642f, 6.3358f, 15.5f, 6.75f, 15.5f)
                horizontalLineTo(13.25f)
                curveTo(13.6642f, 15.5f, 14.0f, 15.1642f, 14.0f, 14.75f)
                curveTo(14.0f, 14.3358f, 13.6642f, 14.0f, 13.25f, 14.0f)
                horizontalLineTo(6.75f)
                curveTo(6.3358f, 14.0f, 6.0f, 14.3358f, 6.0f, 14.75f)
                close()
            }
        }
        .build()
        return _slideText!!
    }

private var _slideText: ImageVector? = null
