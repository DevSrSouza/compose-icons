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

public val LightGroup.Shield: ImageVector
    get() {
        if (_shield != null) {
            return _shield!!
        }
        _shield = Builder(name = "Shield", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 237.6f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, true, -4.3f, -0.7f)
                curveTo(108.7f, 232.0f, 34.0f, 202.7f, 34.0f, 114.7f)
                verticalLineTo(56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 48.0f, 42.0f)
                horizontalLineTo(208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, 14.0f)
                verticalLineToRelative(58.7f)
                curveToRelative(0.0f, 88.0f, -74.7f, 117.3f, -89.7f, 122.2f)
                arcTo(12.5f, 12.5f, 0.0f, false, true, 128.0f, 237.6f)
                close()
                moveTo(48.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(58.7f)
                curveToRelative(0.0f, 79.8f, 67.8f, 106.3f, 81.4f, 110.8f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, false, 1.2f, 0.0f)
                curveToRelative(13.6f, -4.5f, 81.4f, -31.0f, 81.4f, -110.8f)
                verticalLineTo(56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _shield!!
    }

private var _shield: ImageVector? = null
