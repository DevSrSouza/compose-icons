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

public val FilledGroup.LinkSquare: ImageVector
    get() {
        if (_linkSquare != null) {
            return _linkSquare!!
        }
        _linkSquare = Builder(name = "LinkSquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5024f, 3.0029f)
                curveTo(4.5694f, 3.0029f, 3.0024f, 4.5699f, 3.0024f, 6.5029f)
                verticalLineTo(12.5029f)
                curveTo(3.0024f, 14.4359f, 4.5694f, 16.0029f, 6.5024f, 16.0029f)
                horizontalLineTo(6.9985f)
                verticalLineTo(14.0029f)
                horizontalLineTo(6.5024f)
                curveTo(5.674f, 14.0029f, 5.0024f, 13.3314f, 5.0024f, 12.5029f)
                verticalLineTo(6.5029f)
                curveTo(5.0024f, 5.6745f, 5.674f, 5.0029f, 6.5024f, 5.0029f)
                horizontalLineTo(12.5024f)
                curveTo(13.3309f, 5.0029f, 14.0024f, 5.6745f, 14.0024f, 6.5029f)
                verticalLineTo(12.5029f)
                curveTo(14.0024f, 13.3314f, 13.3309f, 14.0029f, 12.5024f, 14.0029f)
                horizontalLineTo(10.9957f)
                verticalLineTo(16.0029f)
                horizontalLineTo(12.5024f)
                curveTo(14.4354f, 16.0029f, 16.0024f, 14.4359f, 16.0024f, 12.5029f)
                verticalLineTo(6.5029f)
                curveTo(16.0024f, 4.5699f, 14.4354f, 3.0029f, 12.5024f, 3.0029f)
                horizontalLineTo(6.5024f)
                close()
                moveTo(10.0f, 11.5004f)
                curveTo(10.0f, 10.672f, 10.6716f, 10.0004f, 11.5f, 10.0004f)
                horizontalLineTo(12.9988f)
                verticalLineTo(8.0004f)
                horizontalLineTo(11.5f)
                curveTo(9.567f, 8.0004f, 8.0f, 9.5674f, 8.0f, 11.5004f)
                verticalLineTo(17.5004f)
                curveTo(8.0f, 19.4334f, 9.567f, 21.0004f, 11.5f, 21.0004f)
                horizontalLineTo(17.5f)
                curveTo(19.433f, 21.0004f, 21.0f, 19.4334f, 21.0f, 17.5004f)
                verticalLineTo(11.5004f)
                curveTo(21.0f, 9.5674f, 19.433f, 8.0004f, 17.5f, 8.0004f)
                horizontalLineTo(17.0049f)
                verticalLineTo(10.0004f)
                horizontalLineTo(17.5f)
                curveTo(18.3284f, 10.0004f, 19.0f, 10.672f, 19.0f, 11.5004f)
                verticalLineTo(17.5004f)
                curveTo(19.0f, 18.3289f, 18.3284f, 19.0004f, 17.5f, 19.0004f)
                horizontalLineTo(11.5f)
                curveTo(10.6716f, 19.0004f, 10.0f, 18.3289f, 10.0f, 17.5004f)
                verticalLineTo(11.5004f)
                close()
            }
        }
        .build()
        return _linkSquare!!
    }

private var _linkSquare: ImageVector? = null
