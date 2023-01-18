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

public val RegularGroup.SquareMultiple: ImageVector
    get() {
        if (_squareMultiple != null) {
            return _squareMultiple!!
        }
        _squareMultiple = Builder(name = "SquareMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5176f, 5.0f)
                horizontalLineTo(6.0093f)
                curveTo(6.137f, 3.3219f, 7.5391f, 2.0f, 9.2499f, 2.0f)
                horizontalLineTo(17.25f)
                curveTo(19.8733f, 2.0f, 22.0f, 4.1266f, 22.0f, 6.75f)
                verticalLineTo(14.75f)
                curveTo(22.0f, 16.4608f, 20.6781f, 17.8629f, 19.0f, 17.9905f)
                verticalLineTo(16.4823f)
                curveTo(19.8481f, 16.361f, 20.5f, 15.6316f, 20.5f, 14.75f)
                verticalLineTo(6.75f)
                curveTo(20.5f, 4.9551f, 19.0449f, 3.5f, 17.25f, 3.5f)
                horizontalLineTo(9.2499f)
                curveTo(8.3682f, 3.5f, 7.6389f, 4.1519f, 7.5176f, 5.0f)
                close()
                moveTo(5.25f, 6.0f)
                curveTo(3.4551f, 6.0f, 2.0f, 7.4551f, 2.0f, 9.25f)
                verticalLineTo(18.75f)
                curveTo(2.0f, 20.5449f, 3.4551f, 22.0f, 5.25f, 22.0f)
                horizontalLineTo(14.7501f)
                curveTo(16.5451f, 22.0f, 18.0002f, 20.5449f, 18.0002f, 18.75f)
                verticalLineTo(9.25f)
                curveTo(18.0002f, 7.4551f, 16.5451f, 6.0f, 14.7501f, 6.0f)
                horizontalLineTo(5.25f)
                close()
                moveTo(3.5f, 9.25f)
                curveTo(3.5f, 8.2835f, 4.2835f, 7.5f, 5.25f, 7.5f)
                horizontalLineTo(14.7501f)
                curveTo(15.7166f, 7.5f, 16.5001f, 8.2835f, 16.5001f, 9.25f)
                verticalLineTo(18.75f)
                curveTo(16.5001f, 19.7165f, 15.7166f, 20.5f, 14.7501f, 20.5f)
                horizontalLineTo(5.25f)
                curveTo(4.2835f, 20.5f, 3.5f, 19.7165f, 3.5f, 18.75f)
                verticalLineTo(9.25f)
                close()
            }
        }
        .build()
        return _squareMultiple!!
    }

private var _squareMultiple: ImageVector? = null
