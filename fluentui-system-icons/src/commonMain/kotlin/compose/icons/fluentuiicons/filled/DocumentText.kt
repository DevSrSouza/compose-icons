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

public val FilledGroup.DocumentText: ImageVector
    get() {
        if (_documentText != null) {
            return _documentText!!
        }
        _documentText = Builder(name = "DocumentText", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(8.25f, 11.5f)
                horizontalLineTo(15.75f)
                curveTo(16.1642f, 11.5f, 16.5f, 11.8358f, 16.5f, 12.25f)
                curveTo(16.5f, 12.6642f, 16.1642f, 13.0f, 15.75f, 13.0f)
                horizontalLineTo(8.25f)
                curveTo(7.8358f, 13.0f, 7.5f, 12.6642f, 7.5f, 12.25f)
                curveTo(7.5f, 11.8358f, 7.8358f, 11.5f, 8.25f, 11.5f)
                close()
                moveTo(8.25f, 14.25f)
                horizontalLineTo(15.75f)
                curveTo(16.1642f, 14.25f, 16.5f, 14.5858f, 16.5f, 15.0f)
                curveTo(16.5f, 15.4142f, 16.1642f, 15.75f, 15.75f, 15.75f)
                horizontalLineTo(8.25f)
                curveTo(7.8358f, 15.75f, 7.5f, 15.4142f, 7.5f, 15.0f)
                curveTo(7.5f, 14.5858f, 7.8358f, 14.25f, 8.25f, 14.25f)
                close()
                moveTo(8.25f, 17.0f)
                horizontalLineTo(15.75f)
                curveTo(16.1642f, 17.0f, 16.5f, 17.3358f, 16.5f, 17.75f)
                curveTo(16.5f, 18.1642f, 16.1642f, 18.5f, 15.75f, 18.5f)
                horizontalLineTo(8.25f)
                curveTo(7.8358f, 18.5f, 7.5f, 18.1642f, 7.5f, 17.75f)
                curveTo(7.5f, 17.3358f, 7.8358f, 17.0f, 8.25f, 17.0f)
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
        return _documentText!!
    }

private var _documentText: ImageVector? = null
