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

public val SimpleIcons.Loom: ImageVector
    get() {
        if (_loom != null) {
            return _loom!!
        }
        _loom = Builder(name = "Loom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 10.665f)
                horizontalLineToRelative(-7.018f)
                lineToRelative(6.078f, -3.509f)
                lineToRelative(-1.335f, -2.312f)
                lineToRelative(-6.078f, 3.509f)
                lineToRelative(3.508f, -6.077f)
                lineTo(16.843f, 0.94f)
                lineToRelative(-3.508f, 6.077f)
                lineTo(13.335f, 0.0f)
                horizontalLineToRelative(-2.67f)
                verticalLineToRelative(7.018f)
                lineTo(7.156f, 0.94f)
                lineTo(4.844f, 2.275f)
                lineToRelative(3.509f, 6.077f)
                lineToRelative(-6.078f, -3.508f)
                lineTo(0.94f, 7.156f)
                lineToRelative(6.078f, 3.509f)
                lineTo(0.0f, 10.665f)
                verticalLineToRelative(2.67f)
                horizontalLineToRelative(7.017f)
                lineTo(0.94f, 16.844f)
                lineToRelative(1.335f, 2.313f)
                lineToRelative(6.077f, -3.508f)
                lineToRelative(-3.509f, 6.077f)
                lineToRelative(2.312f, 1.335f)
                lineToRelative(3.509f, -6.078f)
                lineTo(10.664f, 24.0f)
                horizontalLineToRelative(2.67f)
                verticalLineToRelative(-7.017f)
                lineToRelative(3.508f, 6.077f)
                lineToRelative(2.312f, -1.335f)
                lineToRelative(-3.509f, -6.078f)
                lineToRelative(6.078f, 3.509f)
                lineToRelative(1.335f, -2.313f)
                lineToRelative(-6.077f, -3.508f)
                horizontalLineToRelative(7.017f)
                verticalLineToRelative(-2.67f)
                lineTo(24.0f, 10.665f)
                close()
                moveTo(12.0f, 15.631f)
                arcToRelative(3.645f, 3.645f, 0.0f, true, true, 0.0f, -7.29f)
                arcToRelative(3.645f, 3.645f, 0.0f, false, true, 0.0f, 7.29f)
                close()
            }
        }
        .build()
        return _loom!!
    }

private var _loom: ImageVector? = null
