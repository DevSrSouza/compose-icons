package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.CircleHalfTilt: ImageVector
    get() {
        if (_circleHalfTilt != null) {
            return _circleHalfTilt!!
        }
        _circleHalfTilt = Builder(name = "CircleHalfTilt", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.5f, 54.5f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, -147.0f, 0.0f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, 0.0f, 147.0f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, 147.0f, 0.0f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, 0.0f, -147.0f)
                close()
                moveTo(184.0f, 195.9f)
                arcToRelative(91.9f, 91.9f, 0.0f, false, true, -16.0f, 10.5f)
                lineTo(168.0f, 99.3f)
                lineToRelative(16.0f, -16.0f)
                close()
                moveTo(104.0f, 163.3f)
                lineTo(120.0f, 147.3f)
                verticalLineToRelative(68.3f)
                arcToRelative(86.8f, 86.8f, 0.0f, false, true, -16.0f, -3.0f)
                close()
                moveTo(88.0f, 206.4f)
                arcToRelative(90.3f, 90.3f, 0.0f, false, true, -16.3f, -10.8f)
                lineTo(88.0f, 179.3f)
                close()
                moveTo(136.0f, 131.3f)
                lineTo(152.0f, 115.3f)
                verticalLineToRelative(97.3f)
                arcToRelative(86.8f, 86.8f, 0.0f, false, true, -16.0f, 3.0f)
                close()
                moveTo(40.0f, 128.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 184.3f, 60.4f)
                lineTo(60.4f, 184.3f)
                arcTo(87.3f, 87.3f, 0.0f, false, true, 40.0f, 128.0f)
                close()
                moveTo(200.0f, 178.6f)
                lineTo(200.0f, 77.4f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, 0.0f, 101.2f)
                close()
            }
        }
        .build()
        return _circleHalfTilt!!
    }

private var _circleHalfTilt: ImageVector? = null
