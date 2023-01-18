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

public val RegularGroup.DismissSquare: ImageVector
    get() {
        if (_dismissSquare != null) {
            return _dismissSquare!!
        }
        _dismissSquare = Builder(name = "DismissSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.2197f, 8.2197f)
                curveTo(8.5126f, 7.9268f, 8.9874f, 7.9268f, 9.2803f, 8.2197f)
                lineTo(12.0f, 10.9393f)
                lineTo(14.7197f, 8.2197f)
                curveTo(15.0126f, 7.9268f, 15.4874f, 7.9268f, 15.7803f, 8.2197f)
                curveTo(16.0732f, 8.5126f, 16.0732f, 8.9874f, 15.7803f, 9.2803f)
                lineTo(13.0607f, 12.0f)
                lineTo(15.7803f, 14.7197f)
                curveTo(16.0732f, 15.0126f, 16.0732f, 15.4874f, 15.7803f, 15.7803f)
                curveTo(15.4874f, 16.0732f, 15.0126f, 16.0732f, 14.7197f, 15.7803f)
                lineTo(12.0f, 13.0607f)
                lineTo(9.2803f, 15.7803f)
                curveTo(8.9874f, 16.0732f, 8.5126f, 16.0732f, 8.2197f, 15.7803f)
                curveTo(7.9268f, 15.4874f, 7.9268f, 15.0126f, 8.2197f, 14.7197f)
                lineTo(10.9393f, 12.0f)
                lineTo(8.2197f, 9.2803f)
                curveTo(7.9268f, 8.9874f, 7.9268f, 8.5126f, 8.2197f, 8.2197f)
                close()
                moveTo(6.25f, 3.0f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 21.0f, 21.0f, 19.5449f, 21.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.4551f, 19.5449f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(4.5f, 6.25f)
                curveTo(4.5f, 5.2835f, 5.2835f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.7165f, 4.5f, 19.5f, 5.2835f, 19.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.7165f, 18.7165f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 19.5f, 4.5f, 18.7165f, 4.5f, 17.75f)
                verticalLineTo(6.25f)
                close()
            }
        }
        .build()
        return _dismissSquare!!
    }

private var _dismissSquare: ImageVector? = null
