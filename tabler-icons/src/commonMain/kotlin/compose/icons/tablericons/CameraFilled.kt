package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.CameraFilled: ImageVector
    get() {
        if (_cameraFilled != null) {
            return _cameraFilled!!
        }
        _cameraFilled = Builder(name = "CameraFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.995f, 1.85f)
                lineToRelative(0.005f, 0.15f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.883f, 0.993f)
                lineToRelative(0.117f, 0.007f)
                horizontalLineToRelative(1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.995f, 2.824f)
                lineToRelative(0.005f, 0.176f)
                verticalLineToRelative(9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.824f, 2.995f)
                lineToRelative(-0.176f, 0.005f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.995f, -2.824f)
                lineToRelative(-0.005f, -0.176f)
                verticalLineToRelative(-9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.824f, -2.995f)
                lineToRelative(0.176f, -0.005f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.85f, -1.995f)
                lineToRelative(0.15f, -0.005f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(12.0f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.985f, 2.698f)
                lineToRelative(-0.011f, 0.152f)
                lineToRelative(-0.004f, 0.15f)
                lineToRelative(0.004f, 0.15f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 2.996f, -3.15f)
                close()
            }
        }
        .build()
        return _cameraFilled!!
    }

private var _cameraFilled: ImageVector? = null
