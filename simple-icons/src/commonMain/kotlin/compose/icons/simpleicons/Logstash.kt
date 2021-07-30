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

public val SimpleIcons.Logstash: ImageVector
    get() {
        if (_logstash != null) {
            return _logstash!!
        }
        _logstash = Builder(name = "Logstash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.745f, 24.0f)
                horizontalLineToRelative(8.291f)
                verticalLineToRelative(-9.164f)
                horizontalLineToRelative(-8.29f)
                close()
                moveTo(11.127f, 24.0f)
                horizontalLineToRelative(0.437f)
                verticalLineToRelative(-9.164f)
                horizontalLineToRelative(-9.6f)
                arcTo(9.163f, 9.163f, 0.0f, false, false, 11.127f, 24.0f)
                moveToRelative(0.438f, -9.164f)
                horizontalLineToRelative(-9.6f)
                lineTo(1.965f, 0.0f)
                horizontalLineToRelative(0.873f)
                arcToRelative(8.727f, 8.727f, 0.0f, false, true, 8.727f, 8.727f)
                close()
            }
        }
        .build()
        return _logstash!!
    }

private var _logstash: ImageVector? = null
