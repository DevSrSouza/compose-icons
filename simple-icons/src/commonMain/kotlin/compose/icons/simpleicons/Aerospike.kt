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
                moveTo(14.347f, 15.375f)
                lineTo(7.45f, 12.283f)
                lineToRelative(6.897f, -3.072f)
                verticalLineToRelative(6.164f)
                close()
                moveTo(24.0f, 0.0f)
                verticalLineToRelative(24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(19.295f, 5.386f)
                lineTo(5.672f, 11.548f)
                lineToRelative(-1.607f, 0.743f)
                lineToRelative(1.607f, 0.688f)
                lineToRelative(13.623f, 6.163f)
                verticalLineToRelative(-1.565f)
                lineToRelative(-3.576f, -1.602f)
                lineTo(15.719f, 8.612f)
                lineToRelative(3.576f, -1.586f)
                verticalLineToRelative(-1.64f)
                close()
            }
        }
        .build()
        return _aerospike!!
    }

private var _aerospike: ImageVector? = null
