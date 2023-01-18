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

public val LightGroup.ArrowElbowRightUp: ImageVector
    get() {
        if (_arrowElbowRightUp != null) {
            return _arrowElbowRightUp!!
        }
        _arrowElbowRightUp = Builder(name = "ArrowElbowRightUp", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.2f, 100.2f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -8.4f, 0.0f)
                lineTo(182.0f, 62.5f)
                verticalLineTo(192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(170.0f)
                verticalLineTo(62.5f)
                lineToRelative(-37.8f, 37.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.4f, -8.4f)
                lineToRelative(48.0f, -48.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 8.4f, 0.0f)
                lineToRelative(48.0f, 48.0f)
                arcTo(5.8f, 5.8f, 0.0f, false, true, 228.2f, 100.2f)
                close()
            }
        }
        .build()
        return _arrowElbowRightUp!!
    }

private var _arrowElbowRightUp: ImageVector? = null
