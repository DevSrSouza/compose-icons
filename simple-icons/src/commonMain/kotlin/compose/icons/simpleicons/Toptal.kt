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

public val SimpleIcons.Toptal: ImageVector
    get() {
        if (_toptal != null) {
            return _toptal!!
        }
        _toptal = Builder(name = "Toptal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.227f, 10.038f)
                lineTo(10.188f, 0.0f)
                lineToRelative(-2.04f, 2.04f)
                lineToRelative(3.773f, 3.769f)
                lineToRelative(-8.155f, 8.153f)
                lineTo(13.807f, 24.0f)
                lineToRelative(2.039f, -2.039f)
                lineToRelative(-3.772f, -3.771f)
                lineToRelative(8.16f, -8.152f)
                horizontalLineToRelative(-0.007f)
                close()
                moveTo(8.301f, 14.269f)
                lineToRelative(6.066f, -6.063f)
                lineToRelative(1.223f, 1.223f)
                lineToRelative(-6.064f, 6.113f)
                lineToRelative(-1.223f, -1.26f)
                lineToRelative(-0.002f, -0.013f)
                close()
            }
        }
        .build()
        return _toptal!!
    }

private var _toptal: ImageVector? = null
