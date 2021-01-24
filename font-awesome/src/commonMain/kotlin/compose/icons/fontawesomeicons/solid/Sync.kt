package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Sync: ImageVector
    get() {
        if (_sync != null) {
            return _sync!!
        }
        _sync = Builder(name = "Sync", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(440.65f, 12.57f)
                lineToRelative(4.0f, 82.77f)
                arcTo(247.16f, 247.16f, 0.0f, false, false, 255.83f, 8.0f)
                curveTo(134.73f, 8.0f, 33.91f, 94.92f, 12.29f, 209.82f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 24.09f, 224.0f)
                horizontalLineToRelative(49.05f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.67f, -9.26f)
                arcToRelative(175.91f, 175.91f, 0.0f, false, true, 317.0f, -56.94f)
                lineToRelative(-101.46f, -4.86f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.57f, 12.0f)
                verticalLineToRelative(47.41f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(500.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineToRelative(-47.37f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.98f, 12.57f)
                close()
                moveTo(255.83f, 432.0f)
                arcToRelative(175.61f, 175.61f, 0.0f, false, true, -146.0f, -77.8f)
                lineToRelative(101.8f, 4.87f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.57f, -12.0f)
                verticalLineToRelative(-47.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineTo(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineTo(500.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(47.35f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.6f)
                lineToRelative(-4.15f, -82.57f)
                arcTo(247.17f, 247.17f, 0.0f, false, false, 255.83f, 504.0f)
                curveToRelative(121.11f, 0.0f, 221.93f, -86.92f, 243.55f, -201.82f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.8f, -14.18f)
                horizontalLineToRelative(-49.05f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.67f, 9.26f)
                arcTo(175.86f, 175.86f, 0.0f, false, true, 255.83f, 432.0f)
                close()
            }
        }
        .build()
        return _sync!!
    }

private var _sync: ImageVector? = null
