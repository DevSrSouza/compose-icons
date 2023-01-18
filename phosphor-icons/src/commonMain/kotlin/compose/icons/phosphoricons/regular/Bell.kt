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

public val RegularGroup.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.8f, 175.9f)
                curveToRelative(-5.9f, -10.2f, -13.0f, -29.6f, -13.0f, -63.9f)
                verticalLineToRelative(-7.1f)
                curveToRelative(0.0f, -44.3f, -35.5f, -80.6f, -79.2f, -80.9f)
                horizontalLineTo(128.0f)
                arcToRelative(79.9f, 79.9f, 0.0f, false, false, -79.8f, 80.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 34.3f, -7.1f, 53.7f, -13.0f, 63.9f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 49.0f, 200.0f)
                horizontalLineTo(88.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 80.0f, 0.0f)
                horizontalLineToRelative(39.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 13.9f, -8.0f)
                arcTo(16.2f, 16.2f, 0.0f, false, false, 220.8f, 175.9f)
                close()
                moveTo(128.0f, 224.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, true, -24.0f, -24.0f)
                horizontalLineToRelative(48.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 128.0f, 224.0f)
                close()
                moveTo(49.0f, 184.0f)
                curveToRelative(6.9f, -12.0f, 15.2f, -34.1f, 15.2f, -72.0f)
                verticalLineToRelative(-8.0f)
                arcTo(63.8f, 63.8f, 0.0f, false, true, 128.0f, 40.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(34.9f, 0.2f, 63.3f, 29.4f, 63.3f, 64.9f)
                verticalLineTo(112.0f)
                curveToRelative(0.0f, 37.9f, 8.3f, 60.0f, 15.2f, 72.0f)
                close()
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
