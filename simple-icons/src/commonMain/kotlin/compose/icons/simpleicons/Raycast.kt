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

public val SimpleIcons.Raycast: ImageVector
    get() {
        if (_raycast != null) {
            return _raycast!!
        }
        _raycast = Builder(name = "Raycast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.004f, 15.492f)
                verticalLineToRelative(2.504f)
                lineTo(0.0f, 11.992f)
                lineToRelative(1.258f, -1.249f)
                close()
                moveTo(8.508f, 17.996f)
                lineTo(6.004f, 17.996f)
                lineTo(12.008f, 24.0f)
                lineToRelative(1.253f, -1.253f)
                close()
                moveTo(22.748f, 13.249f)
                lineTo(24.0f, 11.997f)
                lineTo(12.003f, 0.0f)
                lineTo(10.75f, 1.251f)
                lineTo(15.491f, 6.0f)
                horizontalLineToRelative(-2.865f)
                lineTo(9.317f, 2.692f)
                lineTo(8.065f, 3.944f)
                lineToRelative(2.06f, 2.06f)
                lineTo(8.691f, 6.004f)
                verticalLineToRelative(9.31f)
                lineTo(18.0f, 15.314f)
                verticalLineToRelative(-1.432f)
                lineToRelative(2.06f, 2.06f)
                lineToRelative(1.252f, -1.252f)
                lineToRelative(-3.312f, -3.32f)
                lineTo(18.0f, 8.506f)
                close()
                moveTo(6.63f, 5.372f)
                lineTo(5.38f, 6.625f)
                lineToRelative(1.342f, 1.343f)
                lineToRelative(1.251f, -1.253f)
                close()
                moveTo(17.285f, 16.027f)
                lineTo(16.038f, 17.278f)
                lineTo(17.38f, 18.621f)
                lineTo(18.633f, 17.37f)
                close()
                moveTo(3.944f, 8.059f)
                lineTo(2.692f, 9.31f)
                lineToRelative(3.312f, 3.314f)
                verticalLineToRelative(-2.506f)
                close()
                moveTo(13.88f, 17.996f)
                horizontalLineToRelative(-2.504f)
                lineToRelative(3.314f, 3.312f)
                lineToRelative(1.25f, -1.252f)
                close()
            }
        }
        .build()
        return _raycast!!
    }

private var _raycast: ImageVector? = null
