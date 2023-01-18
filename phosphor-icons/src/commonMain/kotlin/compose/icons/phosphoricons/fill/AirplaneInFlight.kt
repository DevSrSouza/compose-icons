package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.AirplaneInFlight: ImageVector
    get() {
        if (_airplaneInFlight != null) {
            return _airplaneInFlight!!
        }
        _airplaneInFlight = Builder(name = "AirplaneInFlight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 216.0f)
                close()
                moveTo(208.0f, 100.0f)
                horizontalLineTo(153.8f)
                lineTo(110.9f, 53.3f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 108.0f, 52.0f)
                horizontalLineTo(91.1f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, -9.7f, 5.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -1.7f, 10.8f)
                lineTo(90.5f, 100.0f)
                horizontalLineTo(65.9f)
                lineTo(47.1f, 77.4f)
                arcTo(4.1f, 4.1f, 0.0f, false, false, 44.0f, 76.0f)
                horizontalLineTo(26.8f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -9.7f, 4.8f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -1.8f, 10.6f)
                lineToRelative(14.0f, 46.9f)
                arcTo(35.8f, 35.8f, 0.0f, false, false, 63.8f, 164.0f)
                horizontalLineTo(240.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(136.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 208.0f, 100.0f)
                close()
            }
        }
        .build()
        return _airplaneInFlight!!
    }

private var _airplaneInFlight: ImageVector? = null
