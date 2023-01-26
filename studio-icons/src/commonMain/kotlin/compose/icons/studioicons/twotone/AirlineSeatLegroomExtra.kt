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

public val TwotoneGroup.AirlineSeatLegroomExtra: ImageVector
    get() {
        if (_airlineSeatLegroomExtra != null) {
            return _airlineSeatLegroomExtra!!
        }
        _airlineSeatLegroomExtra = Builder(name = "AirlineSeatLegroomExtra", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 12.0f)
                lineTo(4.0f, 3.0f)
                lineTo(2.0f, 3.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                lineTo(7.0f, 15.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                close()
                moveTo(22.83f, 17.24f)
                curveToRelative(-0.38f, -0.72f, -1.29f, -0.97f, -2.03f, -0.63f)
                lineToRelative(-1.09f, 0.5f)
                lineToRelative(-3.41f, -6.98f)
                curveTo(15.96f, 9.45f, 15.27f, 9.0f, 14.51f, 9.0f)
                lineTo(11.0f, 9.0f)
                lineTo(11.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                lineToRelative(3.41f, 7.0f)
                lineToRelative(3.72f, -1.7f)
                curveToRelative(0.77f, -0.36f, 1.1f, -1.3f, 0.7f, -2.06f)
                close()
            }
        }
        .build()
        return _airlineSeatLegroomExtra!!
    }

private var _airlineSeatLegroomExtra: ImageVector? = null
