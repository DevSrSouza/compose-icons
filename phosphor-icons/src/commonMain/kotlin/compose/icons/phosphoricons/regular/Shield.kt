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

public val RegularGroup.Shield: ImageVector
    get() {
        if (_shield != null) {
            return _shield!!
        }
        _shield = Builder(name = "Shield", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 239.6f)
                arcToRelative(14.5f, 14.5f, 0.0f, false, true, -5.0f, -0.8f)
                curveToRelative(-15.2f, -5.0f, -91.0f, -34.7f, -91.0f, -124.1f)
                verticalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 40.0f)
                horizontalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(58.7f)
                curveToRelative(0.0f, 89.4f, -75.8f, 119.1f, -91.0f, 124.1f)
                arcTo(14.5f, 14.5f, 0.0f, false, true, 128.0f, 239.6f)
                close()
                moveTo(48.0f, 56.0f)
                verticalLineToRelative(58.7f)
                curveToRelative(0.0f, 78.3f, 66.5f, 104.4f, 80.0f, 108.9f)
                curveToRelative(13.6f, -4.5f, 80.0f, -30.7f, 80.0f, -108.9f)
                verticalLineTo(56.0f)
                close()
            }
        }
        .build()
        return _shield!!
    }

private var _shield: ImageVector? = null
