package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.CameraOff: ImageVector
    get() {
        if (_cameraOff != null) {
            return _cameraOff!!
        }
        _cameraOff = Builder(name = "CameraOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.2197f, 2.2197f)
                curveTo(2.5126f, 1.9268f, 2.9874f, 1.9268f, 3.2803f, 2.2197f)
                lineTo(21.7801f, 20.7198f)
                curveTo(22.073f, 21.0127f, 22.073f, 21.4876f, 21.7801f, 21.7805f)
                curveTo(21.4872f, 22.0734f, 21.0123f, 22.0734f, 20.7194f, 21.7805f)
                lineTo(19.7743f, 20.8353f)
                curveTo(19.4523f, 20.9422f, 19.1079f, 21.0f, 18.75f, 21.0f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 21.0f, 2.0f, 19.5449f, 2.0f, 17.75f)
                verticalLineTo(8.25f)
                curveTo(2.0f, 6.8466f, 2.8895f, 5.651f, 4.1354f, 5.1961f)
                lineTo(2.2197f, 3.2803f)
                curveTo(1.9268f, 2.9874f, 1.9268f, 2.5126f, 2.2197f, 2.2197f)
                close()
                moveTo(13.8224f, 14.8833f)
                curveTo(13.3172f, 15.2701f, 12.6854f, 15.5f, 12.0f, 15.5f)
                curveTo(10.3431f, 15.5f, 9.0f, 14.1569f, 9.0f, 12.5f)
                curveTo(9.0f, 11.8145f, 9.2299f, 11.1828f, 9.6168f, 10.6776f)
                lineTo(8.5499f, 9.6107f)
                curveTo(7.8946f, 10.3924f, 7.5f, 11.4001f, 7.5f, 12.5f)
                curveTo(7.5f, 14.9853f, 9.5147f, 17.0f, 12.0f, 17.0f)
                curveTo(13.0998f, 17.0f, 14.1075f, 16.6054f, 14.8892f, 15.9501f)
                lineTo(13.8224f, 14.8833f)
                close()
                moveTo(16.4369f, 13.2552f)
                curveTo(16.4784f, 13.0096f, 16.5f, 12.7573f, 16.5f, 12.5f)
                curveTo(16.5f, 10.0147f, 14.4853f, 8.0f, 12.0f, 8.0f)
                curveTo(11.7427f, 8.0f, 11.4904f, 8.0216f, 11.2449f, 8.0631f)
                lineTo(7.6544f, 4.4724f)
                lineTo(8.205f, 3.5757f)
                curveTo(8.6143f, 2.9092f, 9.3403f, 2.5031f, 10.1224f, 2.5031f)
                horizontalLineTo(13.9247f)
                curveTo(14.7225f, 2.5031f, 15.4607f, 2.9255f, 15.8647f, 3.6134f)
                lineTo(16.6793f, 5.0f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 5.0f, 22.0f, 6.4551f, 22.0f, 8.25f)
                verticalLineTo(17.75f)
                curveTo(22.0f, 18.0741f, 21.9526f, 18.3872f, 21.8642f, 18.6826f)
                lineTo(16.4369f, 13.2552f)
                close()
            }
        }
        .build()
        return _cameraOff!!
    }

private var _cameraOff: ImageVector? = null
