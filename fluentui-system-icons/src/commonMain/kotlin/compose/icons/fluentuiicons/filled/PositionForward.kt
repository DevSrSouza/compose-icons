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

public val FilledGroup.PositionForward: ImageVector
    get() {
        if (_positionForward != null) {
            return _positionForward!!
        }
        _positionForward = Builder(name = "PositionForward", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.25f, 16.5f)
                curveTo(15.0449f, 16.5f, 16.5f, 15.0449f, 16.5f, 13.25f)
                lineTo(16.5f, 5.25f)
                curveTo(16.5f, 3.4551f, 15.0449f, 2.0f, 13.25f, 2.0f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 2.0f, 2.0f, 3.4551f, 2.0f, 5.25f)
                verticalLineTo(13.25f)
                curveTo(2.0f, 15.0449f, 3.4551f, 16.5f, 5.25f, 16.5f)
                lineTo(13.25f, 16.5f)
                close()
                moveTo(7.5f, 17.5f)
                horizontalLineTo(9.0f)
                lineTo(9.0f, 18.75f)
                curveTo(9.0f, 19.7165f, 9.7835f, 20.5f, 10.75f, 20.5f)
                horizontalLineTo(18.75f)
                curveTo(19.7165f, 20.5f, 20.5f, 19.7165f, 20.5f, 18.75f)
                verticalLineTo(10.75f)
                curveTo(20.5f, 9.7835f, 19.7165f, 9.0f, 18.75f, 9.0f)
                lineTo(17.5f, 9.0f)
                verticalLineTo(7.5f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 7.5f, 22.0f, 8.9551f, 22.0f, 10.75f)
                verticalLineTo(18.75f)
                curveTo(22.0f, 20.5449f, 20.5449f, 22.0f, 18.75f, 22.0f)
                horizontalLineTo(10.75f)
                curveTo(8.9551f, 22.0f, 7.5f, 20.5449f, 7.5f, 18.75f)
                verticalLineTo(17.5f)
                close()
            }
        }
        .build()
        return _positionForward!!
    }

private var _positionForward: ImageVector? = null
