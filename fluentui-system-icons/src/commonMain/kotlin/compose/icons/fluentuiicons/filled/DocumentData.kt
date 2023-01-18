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

public val FilledGroup.DocumentData: ImageVector
    get() {
        if (_documentData != null) {
            return _documentData!!
        }
        _documentData = Builder(name = "DocumentData", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(12.0f, 12.0f)
                curveTo(12.4142f, 12.0f, 12.75f, 12.3358f, 12.75f, 12.75f)
                verticalLineTo(18.25f)
                curveTo(12.75f, 18.6642f, 12.4142f, 19.0f, 12.0f, 19.0f)
                curveTo(11.5858f, 19.0f, 11.25f, 18.6642f, 11.25f, 18.25f)
                verticalLineTo(12.75f)
                curveTo(11.25f, 12.3358f, 11.5858f, 12.0f, 12.0f, 12.0f)
                close()
                moveTo(8.75f, 16.0f)
                curveTo(9.1642f, 16.0f, 9.5f, 16.3358f, 9.5f, 16.75f)
                verticalLineTo(18.25f)
                curveTo(9.5f, 18.6642f, 9.1642f, 19.0f, 8.75f, 19.0f)
                curveTo(8.3358f, 19.0f, 8.0f, 18.6642f, 8.0f, 18.25f)
                verticalLineTo(16.75f)
                curveTo(8.0f, 16.3358f, 8.3358f, 16.0f, 8.75f, 16.0f)
                close()
                moveTo(15.25f, 14.0f)
                curveTo(15.6642f, 14.0f, 16.0f, 14.3358f, 16.0f, 14.75f)
                verticalLineTo(18.25f)
                curveTo(16.0f, 18.6642f, 15.6642f, 19.0f, 15.25f, 19.0f)
                curveTo(14.8358f, 19.0f, 14.5f, 18.6642f, 14.5f, 18.25f)
                verticalLineTo(14.75f)
                curveTo(14.5f, 14.3358f, 14.8358f, 14.0f, 15.25f, 14.0f)
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
        return _documentData!!
    }

private var _documentData: ImageVector? = null
