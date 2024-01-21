package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Devexpress: ImageVector
    get() {
        if (_devexpress != null) {
            return _devexpress!!
        }
        _devexpress = Builder(name = "Devexpress", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.4f, 0.0f)
                horizontalLineToRelative(21.2f)
                curveToRelative(0.8f, 0.0f, 1.4f, 0.6f, 1.4f, 1.4f)
                verticalLineToRelative(1.1f)
                curveToRelative(0.0f, 0.8f, -0.6f, 1.0f, -0.9f, 1.0f)
                curveTo(11.7f, 4.9f, 4.2f, 9.7f, 0.0f, 14.1f)
                lineTo(0.0f, 1.4f)
                curveTo(0.0f, 0.6f, 0.6f, 0.0f, 1.4f, 0.0f)
                close()
                moveTo(1.422f, 19.567f)
                lineTo(1.7f, 19.2f)
                curveTo(5.3f, 14.6f, 12.4f, 8.3f, 24.0f, 6.3f)
                verticalLineToRelative(16.3f)
                curveToRelative(0.0f, 0.8f, -0.6f, 1.4f, -1.4f, 1.4f)
                lineTo(1.4f, 24.0f)
                curveTo(0.6f, 24.0f, 0.0f, 23.4f, 0.0f, 22.6f)
                verticalLineToRelative(-0.4f)
                curveToRelative(0.0f, -0.3f, 0.2f, -0.8f, 0.3f, -0.9f)
                curveToRelative(0.252f, -0.589f, 0.646f, -1.107f, 1.122f, -1.733f)
                close()
            }
        }
        .build()
        return _devexpress!!
    }

private var _devexpress: ImageVector? = null
