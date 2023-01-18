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

public val FilledGroup.DocumentFlowchart: ImageVector
    get() {
        if (_documentFlowchart != null) {
            return _documentFlowchart!!
        }
        _documentFlowchart = Builder(name = "DocumentFlowchart", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.8954f, 2.0f, 4.0f, 2.8954f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.1046f, 4.8954f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(19.1046f, 22.0f, 20.0f, 21.1046f, 20.0f, 20.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                curveTo(12.8954f, 10.0f, 12.0f, 9.1046f, 12.0f, 8.0f)
                close()
                moveTo(6.5f, 8.25f)
                curveTo(6.5f, 7.8358f, 6.8358f, 7.5f, 7.25f, 7.5f)
                horizontalLineTo(9.75f)
                curveTo(10.1642f, 7.5f, 10.5f, 7.8358f, 10.5f, 8.25f)
                verticalLineTo(10.75f)
                curveTo(10.5f, 11.1642f, 10.1642f, 11.5f, 9.75f, 11.5f)
                horizontalLineTo(9.25f)
                verticalLineTo(14.1893f)
                lineTo(10.8107f, 15.75f)
                horizontalLineTo(13.5f)
                verticalLineTo(15.25f)
                curveTo(13.5f, 14.8358f, 13.8358f, 14.5f, 14.25f, 14.5f)
                horizontalLineTo(16.75f)
                curveTo(17.1642f, 14.5f, 17.5f, 14.8358f, 17.5f, 15.25f)
                verticalLineTo(17.75f)
                curveTo(17.5f, 18.1642f, 17.1642f, 18.5f, 16.75f, 18.5f)
                horizontalLineTo(14.25f)
                curveTo(13.8358f, 18.5f, 13.5f, 18.1642f, 13.5f, 17.75f)
                verticalLineTo(17.25f)
                horizontalLineTo(10.8107f)
                lineTo(9.0303f, 19.0303f)
                curveTo(8.7374f, 19.3232f, 8.2626f, 19.3232f, 7.9697f, 19.0303f)
                lineTo(5.9697f, 17.0303f)
                curveTo(5.6768f, 16.7374f, 5.6768f, 16.2626f, 5.9697f, 15.9697f)
                lineTo(7.75f, 14.1893f)
                verticalLineTo(11.5f)
                horizontalLineTo(7.25f)
                curveTo(6.8358f, 11.5f, 6.5f, 11.1642f, 6.5f, 10.75f)
                verticalLineTo(8.25f)
                close()
                moveTo(13.5f, 8.0f)
                verticalLineTo(2.5f)
                lineTo(19.5f, 8.5f)
                horizontalLineTo(14.0f)
                curveTo(13.7239f, 8.5f, 13.5f, 8.2761f, 13.5f, 8.0f)
                close()
            }
        }
        .build()
        return _documentFlowchart!!
    }

private var _documentFlowchart: ImageVector? = null
