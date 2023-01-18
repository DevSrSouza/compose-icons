package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.EarthquakeFill: ImageVector
    get() {
        if (_earthquakeFill != null) {
            return _earthquakeFill!!
        }
        _earthquakeFill = Builder(name = "EarthquakeFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.327f, 1.612f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.246f, -0.08f)
                lineToRelative(0.1f, 0.08f)
                lineTo(23.0f, 11.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.883f, 0.993f)
                lineTo(19.0f, 21.0f)
                horizontalLineToRelative(-6.5f)
                lineToRelative(2.5f, -4.0f)
                lineToRelative(-3.5f, -3.0f)
                lineToRelative(4.0f, -3.0f)
                lineTo(13.0f, 9.0f)
                lineToRelative(0.5f, -3.0f)
                lineToRelative(-3.0f, 3.0f)
                lineToRelative(2.5f, 2.0f)
                lineToRelative(-5.0f, 3.0f)
                lineToRelative(3.75f, 3.5f)
                lineTo(8.5f, 21.0f)
                horizontalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.993f, -0.883f)
                lineTo(4.0f, 20.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineTo(1.0f)
                lineToRelative(10.327f, -9.388f)
                close()
            }
        }
        .build()
        return _earthquakeFill!!
    }

private var _earthquakeFill: ImageVector? = null
