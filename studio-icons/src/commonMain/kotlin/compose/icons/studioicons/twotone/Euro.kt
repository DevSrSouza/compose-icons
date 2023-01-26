package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.Euro: ImageVector
    get() {
        if (_euro != null) {
            return _euro!!
        }
        _euro = Builder(name = "Euro", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 18.5f)
                curveToRelative(-2.51f, 0.0f, -4.68f, -1.42f, -5.76f, -3.5f)
                horizontalLineTo(15.0f)
                lineToRelative(1.0f, -2.0f)
                horizontalLineTo(8.58f)
                curveToRelative(-0.05f, -0.33f, -0.08f, -0.66f, -0.08f, -1.0f)
                reflectiveCurveToRelative(0.03f, -0.67f, 0.08f, -1.0f)
                horizontalLineTo(15.0f)
                lineToRelative(1.0f, -2.0f)
                horizontalLineTo(9.24f)
                curveTo(10.32f, 6.92f, 12.5f, 5.5f, 15.0f, 5.5f)
                curveToRelative(1.61f, 0.0f, 3.09f, 0.59f, 4.23f, 1.57f)
                lineTo(21.0f, 5.3f)
                curveTo(19.41f, 3.87f, 17.3f, 3.0f, 15.0f, 3.0f)
                curveToRelative(-3.92f, 0.0f, -7.24f, 2.51f, -8.48f, 6.0f)
                horizontalLineTo(3.0f)
                lineToRelative(-1.0f, 2.0f)
                horizontalLineToRelative(4.06f)
                curveTo(6.02f, 11.33f, 6.0f, 11.66f, 6.0f, 12.0f)
                reflectiveCurveToRelative(0.02f, 0.67f, 0.06f, 1.0f)
                horizontalLineTo(3.0f)
                lineToRelative(-1.0f, 2.0f)
                horizontalLineToRelative(4.52f)
                curveToRelative(1.24f, 3.49f, 4.56f, 6.0f, 8.48f, 6.0f)
                curveToRelative(2.31f, 0.0f, 4.41f, -0.87f, 6.0f, -2.3f)
                lineToRelative(-1.78f, -1.77f)
                curveTo(18.09f, 17.91f, 16.62f, 18.5f, 15.0f, 18.5f)
                close()
            }
        }
        .build()
        return _euro!!
    }

private var _euro: ImageVector? = null
