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

public val FilledGroup.DocumentTextExtract: ImageVector
    get() {
        if (_documentTextExtract != null) {
            return _documentTextExtract!!
        }
        _documentTextExtract = Builder(name = "DocumentTextExtract", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.8954f, 2.0f, 4.0f, 2.8954f, 4.0f, 4.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(10.5f)
                curveTo(11.6046f, 13.5f, 12.5f, 14.3954f, 12.5f, 15.5f)
                curveTo(12.5f, 16.6046f, 11.6046f, 17.5f, 10.5f, 17.5f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.1046f, 4.8954f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(19.1046f, 22.0f, 20.0f, 21.1046f, 20.0f, 20.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                curveTo(12.8954f, 10.0f, 12.0f, 9.1046f, 12.0f, 8.0f)
                close()
                moveTo(7.5f, 11.75f)
                curveTo(7.5f, 11.3358f, 7.8358f, 11.0f, 8.25f, 11.0f)
                horizontalLineTo(15.75f)
                curveTo(16.1642f, 11.0f, 16.5f, 11.3358f, 16.5f, 11.75f)
                curveTo(16.5f, 12.1642f, 16.1642f, 12.5f, 15.75f, 12.5f)
                horizontalLineTo(8.25f)
                curveTo(7.8358f, 12.5f, 7.5f, 12.1642f, 7.5f, 11.75f)
                close()
                moveTo(7.5f, 19.25f)
                curveTo(7.5f, 18.8358f, 7.8358f, 18.5f, 8.25f, 18.5f)
                horizontalLineTo(15.75f)
                curveTo(16.1642f, 18.5f, 16.5f, 18.8358f, 16.5f, 19.25f)
                curveTo(16.5f, 19.6642f, 16.1642f, 20.0f, 15.75f, 20.0f)
                horizontalLineTo(8.25f)
                curveTo(7.8358f, 20.0f, 7.5f, 19.6642f, 7.5f, 19.25f)
                close()
                moveTo(13.5f, 8.0f)
                verticalLineTo(2.5f)
                lineTo(19.5f, 8.5f)
                horizontalLineTo(14.0f)
                curveTo(13.7239f, 8.5f, 13.5f, 8.2761f, 13.5f, 8.0f)
                close()
                moveTo(2.75f, 14.75f)
                curveTo(2.3358f, 14.75f, 2.0f, 15.0858f, 2.0f, 15.5f)
                curveTo(2.0f, 15.9142f, 2.3358f, 16.25f, 2.75f, 16.25f)
                horizontalLineTo(10.25f)
                curveTo(10.6642f, 16.25f, 11.0f, 15.9142f, 11.0f, 15.5f)
                curveTo(11.0f, 15.0858f, 10.6642f, 14.75f, 10.25f, 14.75f)
                horizontalLineTo(2.75f)
                close()
            }
        }
        .build()
        return _documentTextExtract!!
    }

private var _documentTextExtract: ImageVector? = null
