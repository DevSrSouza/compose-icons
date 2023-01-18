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

public val FilledGroup.Smartwatch: ImageVector
    get() {
        if (_smartwatch != null) {
            return _smartwatch!!
        }
        _smartwatch = Builder(name = "Smartwatch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 2.0f)
                curveTo(8.3954f, 2.0f, 7.5f, 2.8954f, 7.5f, 4.0f)
                verticalLineTo(5.2908f)
                curveTo(7.9632f, 5.1033f, 8.4696f, 5.0f, 9.0f, 5.0f)
                horizontalLineTo(15.0f)
                curveTo(15.5304f, 5.0f, 16.0368f, 5.1033f, 16.5f, 5.2908f)
                verticalLineTo(4.0f)
                curveTo(16.5f, 2.8954f, 15.6046f, 2.0f, 14.5f, 2.0f)
                horizontalLineTo(9.5f)
                close()
                moveTo(9.0f, 6.0f)
                curveTo(7.3432f, 6.0f, 6.0f, 7.3432f, 6.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(6.0f, 16.6569f, 7.3432f, 18.0f, 9.0f, 18.0f)
                horizontalLineTo(15.0f)
                curveTo(16.6569f, 18.0f, 18.0f, 16.6569f, 18.0f, 15.0f)
                verticalLineTo(13.0f)
                curveTo(18.5523f, 13.0f, 19.0f, 12.5523f, 19.0f, 12.0f)
                verticalLineTo(11.0f)
                curveTo(19.0f, 10.4477f, 18.5523f, 10.0f, 18.0f, 10.0f)
                verticalLineTo(9.0f)
                curveTo(18.0f, 7.3432f, 16.6569f, 6.0f, 15.0f, 6.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(9.0f, 19.0f)
                curveTo(8.4696f, 19.0f, 7.9632f, 18.8967f, 7.5f, 18.7092f)
                verticalLineTo(20.0f)
                curveTo(7.5f, 21.1046f, 8.3954f, 22.0f, 9.5f, 22.0f)
                horizontalLineTo(14.5f)
                curveTo(15.6046f, 22.0f, 16.5f, 21.1046f, 16.5f, 20.0f)
                verticalLineTo(18.7092f)
                curveTo(16.0368f, 18.8967f, 15.5305f, 19.0f, 15.0f, 19.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _smartwatch!!
    }

private var _smartwatch: ImageVector? = null
