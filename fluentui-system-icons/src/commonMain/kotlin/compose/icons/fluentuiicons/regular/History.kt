package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.History: ImageVector
    get() {
        if (_history != null) {
            return _history!!
        }
        _history = Builder(name = "History", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 12.0f)
                curveTo(19.5f, 7.8579f, 16.1421f, 4.5f, 12.0f, 4.5f)
                curveTo(10.0309f, 4.5f, 8.2391f, 5.2588f, 6.9009f, 6.5f)
                horizontalLineTo(8.25f)
                curveTo(8.6642f, 6.5f, 9.0f, 6.8358f, 9.0f, 7.25f)
                curveTo(9.0f, 7.6642f, 8.6642f, 8.0f, 8.25f, 8.0f)
                horizontalLineTo(5.25f)
                curveTo(4.8358f, 8.0f, 4.5f, 7.6642f, 4.5f, 7.25f)
                verticalLineTo(4.25f)
                curveTo(4.5f, 3.8358f, 4.8358f, 3.5f, 5.25f, 3.5f)
                curveTo(5.6642f, 3.5f, 6.0f, 3.8358f, 6.0f, 4.25f)
                verticalLineTo(5.2917f)
                curveTo(7.5923f, 3.8666f, 9.6949f, 3.0f, 12.0f, 3.0f)
                curveTo(16.9706f, 3.0f, 21.0f, 7.0294f, 21.0f, 12.0f)
                curveTo(21.0f, 16.9706f, 16.9706f, 21.0f, 12.0f, 21.0f)
                curveTo(7.0294f, 21.0f, 3.0f, 16.9706f, 3.0f, 12.0f)
                curveTo(3.0f, 11.5317f, 3.0358f, 11.0718f, 3.1047f, 10.6228f)
                curveTo(3.161f, 10.2562f, 3.4862f, 10.0f, 3.8571f, 10.0f)
                curveTo(4.3161f, 10.0f, 4.6484f, 10.4382f, 4.5812f, 10.8923f)
                curveTo(4.5277f, 11.2538f, 4.5f, 11.6236f, 4.5f, 12.0f)
                curveTo(4.5f, 16.1421f, 7.8579f, 19.5f, 12.0f, 19.5f)
                curveTo(16.1421f, 19.5f, 19.5f, 16.1421f, 19.5f, 12.0f)
                close()
                moveTo(12.5f, 7.75f)
                curveTo(12.5f, 7.3358f, 12.1642f, 7.0f, 11.75f, 7.0f)
                curveTo(11.3358f, 7.0f, 11.0f, 7.3358f, 11.0f, 7.75f)
                verticalLineTo(12.25f)
                curveTo(11.0f, 12.6642f, 11.3358f, 13.0f, 11.75f, 13.0f)
                horizontalLineTo(14.25f)
                curveTo(14.6642f, 13.0f, 15.0f, 12.6642f, 15.0f, 12.25f)
                curveTo(15.0f, 11.8358f, 14.6642f, 11.5f, 14.25f, 11.5f)
                horizontalLineTo(12.5f)
                verticalLineTo(7.75f)
                close()
            }
        }
        .build()
        return _history!!
    }

private var _history: ImageVector? = null
