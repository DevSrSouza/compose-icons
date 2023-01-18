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

public val RegularGroup.SearchSquare: ImageVector
    get() {
        if (_searchSquare != null) {
            return _searchSquare!!
        }
        _searchSquare = Builder(name = "SearchSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 15.5f)
                curveTo(11.9719f, 15.5f, 12.8718f, 15.1919f, 13.6074f, 14.6681f)
                lineTo(16.2197f, 17.2803f)
                curveTo(16.5126f, 17.5732f, 16.9874f, 17.5732f, 17.2803f, 17.2803f)
                curveTo(17.5732f, 16.9874f, 17.5732f, 16.5126f, 17.2803f, 16.2197f)
                lineTo(14.6681f, 13.6074f)
                curveTo(15.1919f, 12.8718f, 15.5f, 11.9719f, 15.5f, 11.0f)
                curveTo(15.5f, 8.5147f, 13.4853f, 6.5f, 11.0f, 6.5f)
                curveTo(8.5147f, 6.5f, 6.5f, 8.5147f, 6.5f, 11.0f)
                curveTo(6.5f, 13.4853f, 8.5147f, 15.5f, 11.0f, 15.5f)
                close()
                moveTo(11.0f, 14.0f)
                curveTo(9.3432f, 14.0f, 8.0f, 12.6569f, 8.0f, 11.0f)
                curveTo(8.0f, 9.3432f, 9.3432f, 8.0f, 11.0f, 8.0f)
                curveTo(12.6569f, 8.0f, 14.0f, 9.3432f, 14.0f, 11.0f)
                curveTo(14.0f, 12.6569f, 12.6569f, 14.0f, 11.0f, 14.0f)
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
        return _searchSquare!!
    }

private var _searchSquare: ImageVector? = null
