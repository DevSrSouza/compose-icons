package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.ArrowURightDown: ImageVector
    get() {
        if (_arrowURightDown != null) {
            return _arrowURightDown!!
        }
        _arrowURightDown = Builder(name = "ArrowURightDown", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.2f, 180.2f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -8.4f, 0.0f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, -8.4f)
                lineTo(162.0f, 209.5f)
                verticalLineTo(88.0f)
                arcTo(50.0f, 50.0f, 0.0f, false, false, 62.0f, 88.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineTo(88.0f)
                arcToRelative(62.0f, 62.0f, 0.0f, false, true, 124.0f, 0.0f)
                verticalLineTo(209.5f)
                lineToRelative(37.8f, -37.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, 8.4f)
                close()
            }
        }
        .build()
        return _arrowURightDown!!
    }

private var _arrowURightDown: ImageVector? = null
