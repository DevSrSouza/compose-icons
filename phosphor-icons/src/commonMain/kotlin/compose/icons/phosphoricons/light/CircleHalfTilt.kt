package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.CircleHalfTilt: ImageVector
    get() {
        if (_circleHalfTilt != null) {
            return _circleHalfTilt!!
        }
        _circleHalfTilt = Builder(name = "CircleHalfTilt", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 128.0f)
                arcTo(102.1f, 102.1f, 0.0f, false, false, 128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, false, false, 55.9f, 200.1f)
                arcTo(101.2f, 101.2f, 0.0f, false, false, 127.8f, 230.0f)
                horizontalLineToRelative(0.2f)
                arcTo(102.1f, 102.1f, 0.0f, false, false, 230.0f, 128.0f)
                close()
                moveTo(218.0f, 128.0f)
                arcToRelative(89.3f, 89.3f, 0.0f, false, true, -20.0f, 56.6f)
                lineTo(198.0f, 71.4f)
                arcTo(89.3f, 89.3f, 0.0f, false, true, 218.0f, 128.0f)
                close()
                moveTo(102.0f, 162.5f)
                lineToRelative(20.0f, -20.0f)
                verticalLineToRelative(75.3f)
                arcToRelative(96.5f, 96.5f, 0.0f, false, true, -20.0f, -3.6f)
                close()
                moveTo(90.0f, 209.6f)
                arcToRelative(86.2f, 86.2f, 0.0f, false, true, -21.2f, -13.9f)
                lineTo(90.0f, 174.5f)
                close()
                moveTo(134.0f, 130.5f)
                lineTo(154.0f, 110.5f)
                lineTo(154.0f, 214.2f)
                arcToRelative(96.5f, 96.5f, 0.0f, false, true, -20.0f, 3.6f)
                close()
                moveTo(166.0f, 98.5f)
                lineTo(186.0f, 78.5f)
                lineTo(186.0f, 196.8f)
                arcToRelative(86.1f, 86.1f, 0.0f, false, true, -20.0f, 12.8f)
                close()
                moveTo(38.0f, 128.0f)
                arcTo(89.9f, 89.9f, 0.0f, false, true, 187.2f, 60.3f)
                lineTo(60.3f, 187.2f)
                arcTo(89.2f, 89.2f, 0.0f, false, true, 38.0f, 128.0f)
                close()
            }
        }
        .build()
        return _circleHalfTilt!!
    }

private var _circleHalfTilt: ImageVector? = null
