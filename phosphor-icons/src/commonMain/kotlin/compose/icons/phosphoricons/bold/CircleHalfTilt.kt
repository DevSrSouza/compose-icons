package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.CircleHalfTilt: ImageVector
    get() {
        if (_circleHalfTilt != null) {
            return _circleHalfTilt!!
        }
        _circleHalfTilt = Builder(name = "CircleHalfTilt", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.4f, 51.6f)
                arcTo(108.2f, 108.2f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.2f, 108.2f, 0.0f, false, false, 204.4f, 51.6f)
                close()
                moveTo(176.0f, 196.9f)
                arcToRelative(86.2f, 86.2f, 0.0f, false, true, -16.0f, 8.8f)
                lineTo(160.0f, 113.0f)
                lineToRelative(16.0f, -16.0f)
                close()
                moveTo(44.0f, 128.0f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 178.3f, 60.7f)
                lineTo(60.7f, 178.3f)
                arcTo(83.5f, 83.5f, 0.0f, false, true, 44.0f, 128.0f)
                close()
                moveTo(96.0f, 177.0f)
                verticalLineToRelative(28.7f)
                arcToRelative(89.8f, 89.8f, 0.0f, false, true, -18.3f, -10.4f)
                close()
                moveTo(120.0f, 211.6f)
                lineTo(120.0f, 153.0f)
                lineToRelative(16.0f, -16.0f)
                verticalLineToRelative(74.6f)
                arcTo(85.5f, 85.5f, 0.0f, false, true, 120.0f, 211.6f)
                close()
                moveTo(200.0f, 171.3f)
                lineTo(200.0f, 84.7f)
                arcToRelative(84.1f, 84.1f, 0.0f, false, true, 0.0f, 86.6f)
                close()
            }
        }
        .build()
        return _circleHalfTilt!!
    }

private var _circleHalfTilt: ImageVector? = null
