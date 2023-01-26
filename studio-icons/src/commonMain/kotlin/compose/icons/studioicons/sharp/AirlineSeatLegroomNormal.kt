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

public val SharpGroup.AirlineSeatLegroomNormal: ImageVector
    get() {
        if (_airlineSeatLegroomNormal != null) {
            return _airlineSeatLegroomNormal!!
        }
        _airlineSeatLegroomNormal = Builder(name = "AirlineSeatLegroomNormal", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 15.0f)
                lineTo(5.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-2.0f)
                lineTo(5.0f, 15.0f)
                close()
                moveTo(22.0f, 18.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(12.0f, 3.0f)
                lineTo(6.0f, 3.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _airlineSeatLegroomNormal!!
    }

private var _airlineSeatLegroomNormal: ImageVector? = null
