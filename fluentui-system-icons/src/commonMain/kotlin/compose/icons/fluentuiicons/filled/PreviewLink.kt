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

public val FilledGroup.PreviewLink: ImageVector
    get() {
        if (_previewLink != null) {
            return _previewLink!!
        }
        _previewLink = Builder(name = "PreviewLink", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0239f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.9797f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.0239f)
                close()
                moveTo(14.9797f, 13.479f)
                verticalLineTo(16.479f)
                horizontalLineTo(17.9797f)
                verticalLineTo(13.479f)
                horizontalLineTo(14.9797f)
                close()
                moveTo(2.0f, 5.75f)
                curveTo(2.0f, 4.2312f, 3.2312f, 3.0f, 4.75f, 3.0f)
                horizontalLineTo(19.25f)
                curveTo(20.7688f, 3.0f, 22.0f, 4.2312f, 22.0f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(22.0f, 19.7688f, 20.7688f, 21.0f, 19.25f, 21.0f)
                horizontalLineTo(4.75f)
                curveTo(3.2312f, 21.0f, 2.0f, 19.7688f, 2.0f, 18.25f)
                verticalLineTo(5.75f)
                close()
                moveTo(4.5239f, 6.25f)
                verticalLineTo(9.75f)
                curveTo(4.5239f, 10.1642f, 4.8597f, 10.5f, 5.2739f, 10.5f)
                horizontalLineTo(18.7297f)
                curveTo(19.1439f, 10.5f, 19.4797f, 10.1642f, 19.4797f, 9.75f)
                verticalLineTo(6.25f)
                curveTo(19.4797f, 5.8358f, 19.1439f, 5.5f, 18.7297f, 5.5f)
                horizontalLineTo(5.2739f)
                curveTo(4.8597f, 5.5f, 4.5239f, 5.8358f, 4.5239f, 6.25f)
                close()
                moveTo(13.4797f, 12.729f)
                verticalLineTo(17.229f)
                curveTo(13.4797f, 17.6432f, 13.8155f, 17.979f, 14.2297f, 17.979f)
                horizontalLineTo(18.7297f)
                curveTo(19.1439f, 17.979f, 19.4797f, 17.6432f, 19.4797f, 17.229f)
                verticalLineTo(12.729f)
                curveTo(19.4797f, 12.3148f, 19.1439f, 11.979f, 18.7297f, 11.979f)
                horizontalLineTo(14.2297f)
                curveTo(13.8155f, 11.979f, 13.4797f, 12.3148f, 13.4797f, 12.729f)
                close()
                moveTo(5.2739f, 12.5f)
                curveTo(4.8597f, 12.5f, 4.5239f, 12.8358f, 4.5239f, 13.25f)
                curveTo(4.5239f, 13.6642f, 4.8597f, 14.0f, 5.2739f, 14.0f)
                horizontalLineTo(11.25f)
                curveTo(11.6642f, 14.0f, 12.0f, 13.6642f, 12.0f, 13.25f)
                curveTo(12.0f, 12.8358f, 11.6642f, 12.5f, 11.25f, 12.5f)
                horizontalLineTo(5.2739f)
                close()
                moveTo(4.5239f, 16.75f)
                curveTo(4.5239f, 17.1642f, 4.8597f, 17.5f, 5.2739f, 17.5f)
                horizontalLineTo(11.25f)
                curveTo(11.6642f, 17.5f, 12.0f, 17.1642f, 12.0f, 16.75f)
                curveTo(12.0f, 16.3358f, 11.6642f, 16.0f, 11.25f, 16.0f)
                horizontalLineTo(5.2739f)
                curveTo(4.8597f, 16.0f, 4.5239f, 16.3358f, 4.5239f, 16.75f)
                close()
            }
        }
        .build()
        return _previewLink!!
    }

private var _previewLink: ImageVector? = null
