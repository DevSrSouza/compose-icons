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

public val TwotoneGroup.ConnectingAirports: ImageVector
    get() {
        if (_connectingAirports != null) {
            return _connectingAirports!!
        }
        _connectingAirports = Builder(name = "ConnectingAirports", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.4f, 17.0f)
                lineToRelative(1.3f, 4.4f)
                horizontalLineToRelative(-1.1f)
                lineTo(13.0f, 17.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(2.6f, -4.4f)
                horizontalLineToRelative(1.1f)
                lineTo(15.4f, 15.0f)
                horizontalLineToRelative(2.85f)
                lineTo(19.0f, 14.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(-0.6f, 2.0f)
                lineToRelative(0.6f, 2.0f)
                horizontalLineToRelative(-1.0f)
                lineToRelative(-0.75f, -1.0f)
                horizontalLineTo(15.4f)
                close()
                moveTo(5.75f, 7.0f)
                lineTo(5.0f, 6.0f)
                horizontalLineTo(4.0f)
                lineToRelative(0.6f, 2.0f)
                lineTo(4.0f, 10.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(0.75f, -1.0f)
                horizontalLineTo(8.6f)
                lineToRelative(-1.3f, 4.4f)
                horizontalLineToRelative(1.1f)
                lineTo(11.0f, 9.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(8.4f, 2.6f)
                horizontalLineTo(7.3f)
                lineTo(8.6f, 7.0f)
                horizontalLineTo(5.75f)
                close()
            }
        }
        .build()
        return _connectingAirports!!
    }

private var _connectingAirports: ImageVector? = null
