package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Aerospike: ImageVector
    get() {
        if (_aerospike != null) {
            return _aerospike!!
        }
        _aerospike = Builder(name = "Aerospike", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(19.295f, 5.386f)
                verticalLineToRelative(1.64f)
                lineToRelative(-3.576f, 1.586f)
                verticalLineToRelative(7.363f)
                lineToRelative(3.576f, 1.602f)
                verticalLineToRelative(1.565f)
                lineTo(5.672f, 12.98f)
                lineToRelative(-1.607f, -0.688f)
                lineToRelative(1.607f, -0.743f)
                close()
                moveTo(14.347f, 9.211f)
                lineTo(7.45f, 12.283f)
                lineToRelative(6.897f, 3.092f)
                close()
            }
        }
        .build()
        return _aerospike!!
    }

private var _aerospike: ImageVector? = null
