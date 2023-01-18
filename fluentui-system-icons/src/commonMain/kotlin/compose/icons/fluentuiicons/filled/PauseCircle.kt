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

public val FilledGroup.PauseCircle: ImageVector
    get() {
        if (_pauseCircle != null) {
            return _pauseCircle!!
        }
        _pauseCircle = Builder(name = "PauseCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(10.5f, 8.25f)
                verticalLineTo(15.75f)
                curveTo(10.5f, 16.1642f, 10.1642f, 16.5f, 9.75f, 16.5f)
                curveTo(9.3358f, 16.5f, 9.0f, 16.1642f, 9.0f, 15.75f)
                verticalLineTo(8.25f)
                curveTo(9.0f, 7.8358f, 9.3358f, 7.5f, 9.75f, 7.5f)
                curveTo(10.1642f, 7.5f, 10.5f, 7.8358f, 10.5f, 8.25f)
                close()
                moveTo(15.0f, 8.25f)
                verticalLineTo(15.75f)
                curveTo(15.0f, 16.1642f, 14.6642f, 16.5f, 14.25f, 16.5f)
                curveTo(13.8358f, 16.5f, 13.5f, 16.1642f, 13.5f, 15.75f)
                verticalLineTo(8.25f)
                curveTo(13.5f, 7.8358f, 13.8358f, 7.5f, 14.25f, 7.5f)
                curveTo(14.6642f, 7.5f, 15.0f, 7.8358f, 15.0f, 8.25f)
                close()
            }
        }
        .build()
        return _pauseCircle!!
    }

private var _pauseCircle: ImageVector? = null
