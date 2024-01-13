package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.PlaneUp: ImageVector
    get() {
        if (_planeUp != null) {
            return _planeUp!!
        }
        _planeUp = Builder(name = "PlaneUp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 93.7f)
                curveTo(192.0f, 59.5f, 221.0f, 0.0f, 256.0f, 0.0f)
                curveToRelative(36.0f, 0.0f, 64.0f, 59.5f, 64.0f, 93.7f)
                lineToRelative(0.0f, 66.3f)
                lineTo(497.8f, 278.5f)
                curveToRelative(8.9f, 5.9f, 14.2f, 15.9f, 14.2f, 26.6f)
                verticalLineToRelative(56.7f)
                curveToRelative(0.0f, 10.9f, -10.7f, 18.6f, -21.1f, 15.2f)
                lineTo(320.0f, 320.0f)
                verticalLineToRelative(80.0f)
                lineToRelative(57.6f, 43.2f)
                curveToRelative(4.0f, 3.0f, 6.4f, 7.8f, 6.4f, 12.8f)
                verticalLineToRelative(42.0f)
                curveToRelative(0.0f, 7.8f, -6.3f, 14.0f, -14.0f, 14.0f)
                curveToRelative(-1.3f, 0.0f, -2.6f, -0.2f, -3.9f, -0.5f)
                lineTo(256.0f, 480.0f)
                lineTo(145.9f, 511.5f)
                curveToRelative(-1.3f, 0.4f, -2.6f, 0.5f, -3.9f, 0.5f)
                curveToRelative(-7.8f, 0.0f, -14.0f, -6.3f, -14.0f, -14.0f)
                verticalLineTo(456.0f)
                curveToRelative(0.0f, -5.0f, 2.4f, -9.8f, 6.4f, -12.8f)
                lineTo(192.0f, 400.0f)
                verticalLineTo(320.0f)
                lineTo(21.1f, 377.0f)
                curveTo(10.7f, 380.4f, 0.0f, 372.7f, 0.0f, 361.8f)
                verticalLineTo(305.1f)
                curveToRelative(0.0f, -10.7f, 5.3f, -20.7f, 14.2f, -26.6f)
                lineTo(192.0f, 160.0f)
                verticalLineTo(93.7f)
                close()
            }
        }
        .build()
        return _planeUp!!
    }

private var _planeUp: ImageVector? = null
