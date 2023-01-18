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

public val FilledGroup.BreakoutRoom: ImageVector
    get() {
        if (_breakoutRoom != null) {
            return _breakoutRoom!!
        }
        _breakoutRoom = Builder(name = "BreakoutRoom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.5449f, 19.5449f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(12.7141f)
                curveTo(13.5116f, 20.1503f, 14.0f, 19.0072f, 14.0f, 17.75f)
                verticalLineTo(14.75f)
                curveTo(14.0f, 12.1266f, 11.8734f, 10.0f, 9.25f, 10.0f)
                horizontalLineTo(6.25f)
                curveTo(4.9928f, 10.0f, 3.8496f, 10.4884f, 3.0f, 11.2859f)
                verticalLineTo(6.25f)
                close()
                moveTo(3.0f, 14.75f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(9.25f)
                curveTo(11.0449f, 21.0f, 12.5f, 19.5449f, 12.5f, 17.75f)
                verticalLineTo(14.75f)
                curveTo(12.5f, 12.9551f, 11.0449f, 11.5f, 9.25f, 11.5f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 11.5f, 3.0f, 12.9551f, 3.0f, 14.75f)
                close()
            }
        }
        .build()
        return _breakoutRoom!!
    }

private var _breakoutRoom: ImageVector? = null
