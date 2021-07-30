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

public val SimpleIcons.Elasticsearch: ImageVector
    get() {
        if (_elasticsearch != null) {
            return _elasticsearch!!
        }
        _elasticsearch = Builder(name = "Elasticsearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.394f, 0.0f)
                curveTo(8.683f, 0.0f, 4.609f, 2.716f, 2.644f, 6.667f)
                horizontalLineToRelative(15.641f)
                arcToRelative(4.77f, 4.77f, 0.0f, false, false, 3.073f, -1.11f)
                curveToRelative(0.446f, -0.375f, 0.864f, -0.785f, 1.247f, -1.243f)
                lineToRelative(0.001f, -0.002f)
                arcTo(11.974f, 11.974f, 0.0f, false, false, 13.394f, 0.0f)
                close()
                moveTo(1.804f, 8.889f)
                arcToRelative(12.009f, 12.009f, 0.0f, false, false, 0.0f, 6.222f)
                horizontalLineToRelative(14.7f)
                arcToRelative(3.111f, 3.111f, 0.0f, true, false, 0.0f, -6.222f)
                close()
                moveTo(2.644f, 17.333f)
                curveTo(4.61f, 21.283f, 8.684f, 24.0f, 13.395f, 24.0f)
                curveToRelative(3.701f, 0.0f, 7.011f, -1.677f, 9.212f, -4.312f)
                lineToRelative(-0.001f, -0.002f)
                arcToRelative(9.958f, 9.958f, 0.0f, false, false, -1.247f, -1.243f)
                arcToRelative(4.77f, 4.77f, 0.0f, false, false, -3.073f, -1.11f)
                close()
            }
        }
        .build()
        return _elasticsearch!!
    }

private var _elasticsearch: ImageVector? = null
