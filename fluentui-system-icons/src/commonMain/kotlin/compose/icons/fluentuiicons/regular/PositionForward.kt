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

public val RegularGroup.PositionForward: ImageVector
    get() {
        if (_positionForward != null) {
            return _positionForward!!
        }
        _positionForward = Builder(name = "PositionForward", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.75f, 22.0f)
                curveTo(20.5449f, 22.0f, 22.0f, 20.5449f, 22.0f, 18.75f)
                lineTo(22.0f, 10.75f)
                curveTo(22.0f, 8.9551f, 20.5449f, 7.5f, 18.75f, 7.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.75f)
                curveTo(19.7165f, 9.0f, 20.5f, 9.7835f, 20.5f, 10.75f)
                lineTo(20.5f, 18.75f)
                curveTo(20.5f, 19.7165f, 19.7165f, 20.5f, 18.75f, 20.5f)
                lineTo(10.75f, 20.5f)
                curveTo(9.7835f, 20.5f, 9.0f, 19.7165f, 9.0f, 18.75f)
                verticalLineTo(17.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(18.75f)
                curveTo(7.5f, 20.5449f, 8.9551f, 22.0f, 10.75f, 22.0f)
                lineTo(18.75f, 22.0f)
                close()
                moveTo(13.25f, 16.5f)
                curveTo(15.0449f, 16.5f, 16.5f, 15.0449f, 16.5f, 13.25f)
                lineTo(16.5f, 5.25f)
                curveTo(16.5f, 3.4551f, 15.0449f, 2.0f, 13.25f, 2.0f)
                lineTo(5.25f, 2.0f)
                curveTo(3.4551f, 2.0f, 2.0f, 3.4551f, 2.0f, 5.25f)
                lineTo(2.0f, 13.25f)
                curveTo(2.0f, 15.0449f, 3.4551f, 16.5f, 5.25f, 16.5f)
                lineTo(13.25f, 16.5f)
                close()
                moveTo(15.0f, 13.25f)
                curveTo(15.0f, 14.2165f, 14.2165f, 15.0f, 13.25f, 15.0f)
                lineTo(12.4692f, 15.0f)
                lineTo(15.0f, 12.4692f)
                verticalLineTo(13.25f)
                close()
                moveTo(15.0f, 10.469f)
                lineTo(10.469f, 15.0f)
                lineTo(8.469f, 15.0f)
                lineTo(15.0f, 8.469f)
                lineTo(15.0f, 10.469f)
                close()
                moveTo(6.3477f, 15.0f)
                lineTo(5.25f, 15.0f)
                curveTo(5.0185f, 15.0f, 4.7976f, 14.9551f, 4.5953f, 14.8734f)
                lineTo(14.8734f, 4.5953f)
                curveTo(14.9551f, 4.7976f, 15.0f, 5.0185f, 15.0f, 5.25f)
                verticalLineTo(6.3477f)
                lineTo(6.3477f, 15.0f)
                close()
                moveTo(3.5783f, 13.7692f)
                curveTo(3.5274f, 13.6051f, 3.5f, 13.4308f, 3.5f, 13.25f)
                lineTo(3.5f, 11.969f)
                lineTo(11.969f, 3.5f)
                lineTo(13.25f, 3.5f)
                curveTo(13.4308f, 3.5f, 13.6051f, 3.5274f, 13.7692f, 3.5783f)
                lineTo(3.5783f, 13.7692f)
                close()
                moveTo(3.5f, 9.8477f)
                lineTo(3.5f, 7.969f)
                lineTo(7.969f, 3.5f)
                lineTo(9.8477f, 3.5f)
                lineTo(3.5f, 9.8477f)
                close()
                moveTo(3.5f, 5.8477f)
                lineTo(3.5f, 5.25f)
                curveTo(3.5f, 4.2835f, 4.2835f, 3.5f, 5.25f, 3.5f)
                horizontalLineTo(5.8477f)
                lineTo(3.5f, 5.8477f)
                close()
            }
        }
        .build()
        return _positionForward!!
    }

private var _positionForward: ImageVector? = null
