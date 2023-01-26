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

public val RoundGroup.AirlineSeatLegroomReduced: ImageVector
    get() {
        if (_airlineSeatLegroomReduced != null) {
            return _airlineSeatLegroomReduced!!
        }
        _airlineSeatLegroomReduced = Builder(name = "AirlineSeatLegroomReduced", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.97f, 19.2f)
                curveToRelative(0.18f, 0.96f, -0.55f, 1.8f, -1.47f, 1.8f)
                horizontalLineToRelative(-2.69f)
                curveToRelative(-1.3f, 0.0f, -2.26f, -1.22f, -1.94f, -2.49f)
                lineTo(15.0f, 14.0f)
                horizontalLineTo(9.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                lineToRelative(-2.0f, 7.0f)
                horizontalLineToRelative(1.44f)
                curveToRelative(0.73f, 0.0f, 1.39f, 0.49f, 1.53f, 1.2f)
                close()
                moveTo(5.0f, 12.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(8.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _airlineSeatLegroomReduced!!
    }

private var _airlineSeatLegroomReduced: ImageVector? = null
