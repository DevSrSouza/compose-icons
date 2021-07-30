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

public val SimpleIcons.Kibana: ImageVector
    get() {
        if (_kibana != null) {
            return _kibana!!
        }
        _kibana = Builder(name = "Kibana", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.625f, 0.0f)
                verticalLineToRelative(21.591f)
                lineTo(21.375f, 0.0f)
                close()
                moveTo(13.489f, 12.47f)
                lineTo(3.477f, 24.0f)
                horizontalLineToRelative(17.522f)
                arcToRelative(18.755f, 18.755f, 0.0f, false, false, -7.51f, -11.53f)
                close()
            }
        }
        .build()
        return _kibana!!
    }

private var _kibana: ImageVector? = null
