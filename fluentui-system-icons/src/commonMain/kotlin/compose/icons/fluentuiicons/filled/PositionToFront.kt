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

public val FilledGroup.PositionToFront: ImageVector
    get() {
        if (_positionToFront != null) {
            return _positionToFront!!
        }
        _positionToFront = Builder(name = "PositionToFront", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 3.75f)
                curveTo(1.0f, 2.2312f, 2.2312f, 1.0f, 3.75f, 1.0f)
                horizontalLineTo(7.25f)
                curveTo(8.7688f, 1.0f, 10.0f, 2.2312f, 10.0f, 3.75f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.25f)
                curveTo(8.9941f, 5.0f, 8.7435f, 5.0226f, 8.5f, 5.066f)
                verticalLineTo(3.75f)
                curveTo(8.5f, 3.0596f, 7.9404f, 2.5f, 7.25f, 2.5f)
                horizontalLineTo(3.75f)
                curveTo(3.0596f, 2.5f, 2.5f, 3.0596f, 2.5f, 3.75f)
                verticalLineTo(7.25f)
                curveTo(2.5f, 7.9404f, 3.0596f, 8.5f, 3.75f, 8.5f)
                horizontalLineTo(5.066f)
                curveTo(5.0226f, 8.7435f, 5.0f, 8.9941f, 5.0f, 9.25f)
                verticalLineTo(10.0f)
                horizontalLineTo(3.75f)
                curveTo(2.2312f, 10.0f, 1.0f, 8.7688f, 1.0f, 7.25f)
                verticalLineTo(3.75f)
                close()
                moveTo(14.0f, 19.0f)
                verticalLineTo(20.25f)
                curveTo(14.0f, 21.7688f, 15.2312f, 23.0f, 16.75f, 23.0f)
                horizontalLineTo(20.25f)
                curveTo(21.7688f, 23.0f, 23.0f, 21.7688f, 23.0f, 20.25f)
                verticalLineTo(16.75f)
                curveTo(23.0f, 15.2312f, 21.7688f, 14.0f, 20.25f, 14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.75f)
                curveTo(19.0f, 15.0059f, 18.9774f, 15.2565f, 18.934f, 15.5f)
                horizontalLineTo(20.25f)
                curveTo(20.9404f, 15.5f, 21.5f, 16.0596f, 21.5f, 16.75f)
                verticalLineTo(20.25f)
                curveTo(21.5f, 20.9404f, 20.9404f, 21.5f, 20.25f, 21.5f)
                horizontalLineTo(16.75f)
                curveTo(16.0596f, 21.5f, 15.5f, 20.9404f, 15.5f, 20.25f)
                verticalLineTo(18.934f)
                curveTo(15.2565f, 18.9774f, 15.0059f, 19.0f, 14.75f, 19.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(6.0f, 9.25f)
                curveTo(6.0f, 7.4551f, 7.4551f, 6.0f, 9.25f, 6.0f)
                horizontalLineTo(14.75f)
                curveTo(16.5449f, 6.0f, 18.0f, 7.4551f, 18.0f, 9.25f)
                verticalLineTo(14.75f)
                curveTo(18.0f, 16.5449f, 16.5449f, 18.0f, 14.75f, 18.0f)
                horizontalLineTo(9.25f)
                curveTo(7.4551f, 18.0f, 6.0f, 16.5449f, 6.0f, 14.75f)
                verticalLineTo(9.25f)
                close()
            }
        }
        .build()
        return _positionToFront!!
    }

private var _positionToFront: ImageVector? = null
