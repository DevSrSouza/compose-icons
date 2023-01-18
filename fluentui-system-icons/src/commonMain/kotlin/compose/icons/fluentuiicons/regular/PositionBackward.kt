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

public val RegularGroup.PositionBackward: ImageVector
    get() {
        if (_positionBackward != null) {
            return _positionBackward!!
        }
        _positionBackward = Builder(name = "PositionBackward", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 16.5f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 16.5f, 2.0f, 15.0449f, 2.0f, 13.25f)
                verticalLineTo(5.25f)
                curveTo(2.0f, 3.4551f, 3.4551f, 2.0f, 5.25f, 2.0f)
                lineTo(13.25f, 2.0f)
                curveTo(15.0449f, 2.0f, 16.5f, 3.4551f, 16.5f, 5.25f)
                verticalLineTo(6.5f)
                lineTo(14.8477f, 6.5f)
                lineTo(15.0f, 6.3477f)
                verticalLineTo(5.25f)
                curveTo(15.0f, 5.0186f, 14.9551f, 4.7977f, 14.8735f, 4.5955f)
                lineTo(12.969f, 6.5f)
                lineTo(10.8477f, 6.5f)
                lineTo(13.7693f, 3.5783f)
                curveTo(13.6052f, 3.5274f, 13.4308f, 3.5f, 13.25f, 3.5f)
                lineTo(11.969f, 3.5f)
                lineTo(3.5f, 11.969f)
                lineTo(3.5f, 13.25f)
                curveTo(3.5f, 13.4308f, 3.5274f, 13.6052f, 3.5783f, 13.7693f)
                lineTo(6.5f, 10.8477f)
                lineTo(6.5f, 12.969f)
                lineTo(4.5955f, 14.8735f)
                curveTo(4.7977f, 14.9551f, 5.0186f, 15.0f, 5.25f, 15.0f)
                lineTo(6.3477f, 15.0f)
                lineTo(6.5f, 14.8477f)
                lineTo(6.5f, 16.5f)
                close()
                moveTo(9.8477f, 3.5f)
                lineTo(7.969f, 3.5f)
                lineTo(3.5f, 7.969f)
                lineTo(3.5f, 9.8477f)
                lineTo(9.8477f, 3.5f)
                close()
                moveTo(5.8477f, 3.5f)
                horizontalLineTo(5.25f)
                curveTo(4.2835f, 3.5f, 3.5f, 4.2835f, 3.5f, 5.25f)
                verticalLineTo(5.8477f)
                lineTo(5.8477f, 3.5f)
                close()
                moveTo(22.0f, 18.75f)
                curveTo(22.0f, 20.5449f, 20.5449f, 22.0f, 18.75f, 22.0f)
                lineTo(10.75f, 22.0f)
                curveTo(8.9551f, 22.0f, 7.5f, 20.5449f, 7.5f, 18.75f)
                lineTo(7.5f, 10.75f)
                curveTo(7.5f, 8.9551f, 8.9551f, 7.5f, 10.75f, 7.5f)
                lineTo(18.75f, 7.5f)
                curveTo(20.5449f, 7.5f, 22.0f, 8.9551f, 22.0f, 10.75f)
                lineTo(22.0f, 18.75f)
                close()
                moveTo(18.75f, 20.5f)
                curveTo(19.7165f, 20.5f, 20.5f, 19.7165f, 20.5f, 18.75f)
                lineTo(20.5f, 10.75f)
                curveTo(20.5f, 9.7835f, 19.7165f, 9.0f, 18.75f, 9.0f)
                lineTo(10.75f, 9.0f)
                curveTo(9.7835f, 9.0f, 9.0f, 9.7835f, 9.0f, 10.75f)
                lineTo(9.0f, 18.75f)
                curveTo(9.0f, 19.7165f, 9.7835f, 20.5f, 10.75f, 20.5f)
                lineTo(18.75f, 20.5f)
                close()
            }
        }
        .build()
        return _positionBackward!!
    }

private var _positionBackward: ImageVector? = null
