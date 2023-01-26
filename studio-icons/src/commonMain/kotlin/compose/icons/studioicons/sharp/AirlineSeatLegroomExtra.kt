package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.AirlineSeatLegroomExtra: ImageVector
    get() {
        if (_airlineSeatLegroomExtra != null) {
            return _airlineSeatLegroomExtra!!
        }
        _airlineSeatLegroomExtra = Builder(name = "AirlineSeatLegroomExtra", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                lineTo(2.0f, 3.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-2.0f)
                lineTo(4.0f, 15.0f)
                close()
                moveTo(22.24f, 15.96f)
                lineToRelative(-2.53f, 1.15f)
                lineToRelative(-3.41f, -6.98f)
                curveTo(15.96f, 9.45f, 15.27f, 9.0f, 14.51f, 9.0f)
                lineTo(11.0f, 9.0f)
                lineTo(11.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(10.0f)
                lineToRelative(3.41f, 7.0f)
                lineToRelative(5.07f, -2.32f)
                lineToRelative(-1.24f, -2.72f)
                close()
            }
        }
        .build()
        return _airlineSeatLegroomExtra!!
    }

private var _airlineSeatLegroomExtra: ImageVector? = null
