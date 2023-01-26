package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.HotelClass: ImageVector
    get() {
        if (_hotelClass != null) {
            return _hotelClass!!
        }
        _hotelClass = Builder(name = "HotelClass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.58f, 10.0f)
                horizontalLineTo(2.56f)
                curveToRelative(-0.49f, 0.0f, -0.69f, 0.62f, -0.29f, 0.91f)
                lineToRelative(4.91f, 3.51f)
                lineToRelative(-1.89f, 6.1f)
                curveToRelative(-0.14f, 0.46f, 0.39f, 0.84f, 0.78f, 0.55f)
                lineTo(11.0f, 17.31f)
                lineToRelative(4.93f, 3.75f)
                curveToRelative(0.39f, 0.29f, 0.92f, -0.08f, 0.78f, -0.55f)
                lineToRelative(-1.89f, -6.1f)
                lineToRelative(4.91f, -3.51f)
                curveToRelative(0.4f, -0.28f, 0.2f, -0.91f, -0.29f, -0.91f)
                horizontalLineToRelative(-6.02f)
                lineToRelative(-1.95f, -6.42f)
                curveToRelative(-0.14f, -0.47f, -0.81f, -0.47f, -0.96f, 0.0f)
                lineTo(8.58f, 10.0f)
                close()
                moveTo(20.9f, 20.51f)
                lineToRelative(-1.4f, -4.52f)
                lineToRelative(2.91f, -2.08f)
                curveToRelative(0.4f, -0.28f, 0.2f, -0.91f, -0.29f, -0.91f)
                horizontalLineToRelative(-1.88f)
                lineToRelative(-3.08f, 2.2f)
                lineToRelative(1.46f, 4.72f)
                lineToRelative(1.5f, 1.14f)
                curveTo(20.51f, 21.35f, 21.04f, 20.97f, 20.9f, 20.51f)
                close()
                moveTo(17.0f, 8.0f)
                lineToRelative(-1.34f, -4.42f)
                curveToRelative(-0.14f, -0.47f, -0.81f, -0.47f, -0.96f, 0.0f)
                lineToRelative(-0.57f, 1.87f)
                lineTo(14.91f, 8.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _hotelClass!!
    }

private var _hotelClass: ImageVector? = null
