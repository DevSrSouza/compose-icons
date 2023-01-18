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

public val FilledGroup.Sim: ImageVector
    get() {
        if (_sim != null) {
            return _sim!!
        }
        _sim = Builder(name = "Sim", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 5.25f)
                curveTo(4.0f, 3.4551f, 5.4551f, 2.0f, 7.25f, 2.0f)
                horizontalLineTo(12.7145f)
                curveTo(13.5764f, 2.0f, 14.4031f, 2.3424f, 15.0126f, 2.9519f)
                lineTo(19.0481f, 6.9874f)
                curveTo(19.6576f, 7.5969f, 20.0f, 8.4236f, 20.0f, 9.2855f)
                verticalLineTo(18.75f)
                curveTo(20.0f, 20.5449f, 18.5449f, 22.0f, 16.75f, 22.0f)
                horizontalLineTo(7.25f)
                curveTo(5.4551f, 22.0f, 4.0f, 20.5449f, 4.0f, 18.75f)
                verticalLineTo(5.25f)
                close()
                moveTo(7.75f, 14.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(10.75f)
                horizontalLineTo(9.25f)
                curveTo(8.4216f, 10.75f, 7.75f, 11.4216f, 7.75f, 12.25f)
                verticalLineTo(14.0f)
                close()
                moveTo(7.75f, 15.5f)
                verticalLineTo(16.75f)
                curveTo(7.75f, 17.5784f, 8.4216f, 18.25f, 9.25f, 18.25f)
                horizontalLineTo(12.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(7.75f)
                close()
                moveTo(13.5f, 18.25f)
                horizontalLineTo(14.75f)
                curveTo(15.5784f, 18.25f, 16.25f, 17.5784f, 16.25f, 16.75f)
                verticalLineTo(12.25f)
                curveTo(16.25f, 11.4216f, 15.5784f, 10.75f, 14.75f, 10.75f)
                horizontalLineTo(13.5f)
                verticalLineTo(18.25f)
                close()
            }
        }
        .build()
        return _sim!!
    }

private var _sim: ImageVector? = null
