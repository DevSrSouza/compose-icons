package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.HotelClass: ImageVector
    get() {
        if (_hotelClass != null) {
            return _hotelClass!!
        }
        _hotelClass = Builder(name = "HotelClass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 8.89f)
                lineTo(11.94f, 12.0f)
                horizontalLineToRelative(2.82f)
                lineToRelative(-2.27f, 1.62f)
                lineToRelative(0.93f, 3.01f)
                lineTo(11.0f, 14.79f)
                lineToRelative(-2.42f, 1.84f)
                lineToRelative(0.93f, -3.01f)
                lineTo(7.24f, 12.0f)
                horizontalLineToRelative(2.82f)
                lineTo(11.0f, 8.89f)
                close()
                moveTo(8.58f, 10.0f)
                horizontalLineTo(1.0f)
                lineToRelative(6.17f, 4.41f)
                lineTo(4.83f, 22.0f)
                lineTo(11.0f, 17.31f)
                lineTo(17.18f, 22.0f)
                lineToRelative(-2.35f, -7.59f)
                lineTo(21.0f, 10.0f)
                horizontalLineToRelative(-7.58f)
                lineTo(11.0f, 2.0f)
                lineTo(8.58f, 10.0f)
                close()
                moveTo(21.36f, 22.0f)
                lineToRelative(-1.86f, -6.01f)
                lineTo(23.68f, 13.0f)
                horizontalLineToRelative(-3.44f)
                lineToRelative(-3.08f, 2.2f)
                lineToRelative(1.46f, 4.72f)
                lineTo(21.36f, 22.0f)
                close()
                moveTo(17.0f, 8.0f)
                lineToRelative(-1.82f, -6.0f)
                lineToRelative(-1.04f, 3.45f)
                lineTo(14.91f, 8.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _hotelClass!!
    }

private var _hotelClass: ImageVector? = null
