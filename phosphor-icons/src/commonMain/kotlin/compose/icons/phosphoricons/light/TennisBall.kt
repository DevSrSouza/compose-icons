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

public val LightGroup.TennisBall: ImageVector
    get() {
        if (_tennisBall != null) {
            return _tennisBall!!
        }
        _tennisBall = Builder(name = "TennisBall", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.9f, 129.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.1f, -0.8f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -0.1f, -0.8f)
                arcTo(101.9f, 101.9f, 0.0f, false, false, 128.0f, 26.0f)
                horizontalLineToRelative(-0.2f)
                arcTo(101.9f, 101.9f, 0.0f, false, false, 26.1f, 127.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -0.1f, 0.8f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, 0.1f, 0.8f)
                arcTo(101.9f, 101.9f, 0.0f, false, false, 128.0f, 230.0f)
                horizontalLineToRelative(0.2f)
                arcTo(101.9f, 101.9f, 0.0f, false, false, 229.9f, 129.0f)
                close()
                moveTo(64.4f, 64.4f)
                arcToRelative(89.1f, 89.1f, 0.0f, false, true, 57.2f, -26.1f)
                arcToRelative(89.9f, 89.9f, 0.0f, false, true, -83.3f, 83.3f)
                arcTo(89.1f, 89.1f, 0.0f, false, true, 64.4f, 64.4f)
                close()
                moveTo(38.2f, 133.6f)
                arcToRelative(101.7f, 101.7f, 0.0f, false, false, 95.4f, -95.4f)
                arcToRelative(90.1f, 90.1f, 0.0f, false, true, 84.2f, 84.2f)
                arcToRelative(101.7f, 101.7f, 0.0f, false, false, -95.4f, 95.4f)
                arcToRelative(90.1f, 90.1f, 0.0f, false, true, -84.2f, -84.2f)
                close()
                moveTo(134.4f, 217.7f)
                arcToRelative(89.9f, 89.9f, 0.0f, false, true, 83.3f, -83.3f)
                arcToRelative(89.9f, 89.9f, 0.0f, false, true, -83.3f, 83.3f)
                close()
            }
        }
        .build()
        return _tennisBall!!
    }

private var _tennisBall: ImageVector? = null
