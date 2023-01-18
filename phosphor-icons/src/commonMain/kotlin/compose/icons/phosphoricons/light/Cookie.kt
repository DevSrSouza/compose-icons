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

public val LightGroup.Cookie: ImageVector
    get() {
        if (_cookie != null) {
            return _cookie!!
        }
        _cookie = Builder(name = "Cookie", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.7f, 116.5f)
                arcToRelative(13.5f, 13.5f, 0.0f, false, false, -11.8f, -2.7f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -31.7f, -25.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -13.9f, -13.9f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -25.1f, -31.7f)
                arcToRelative(13.5f, 13.5f, 0.0f, false, false, -2.7f, -11.8f)
                arcTo(13.9f, 13.9f, 0.0f, false, false, 128.6f, 26.0f)
                arcTo(102.1f, 102.1f, 0.0f, false, false, 26.0f, 128.7f)
                arcToRelative(102.0f, 102.0f, 0.0f, false, false, 204.0f, -1.3f)
                arcTo(13.9f, 13.9f, 0.0f, false, false, 224.7f, 116.5f)
                close()
                moveTo(191.6f, 191.7f)
                curveToRelative(-34.6f, 34.5f, -91.3f, 34.9f, -126.3f, 0.8f)
                arcTo(90.0f, 90.0f, 0.0f, false, true, 128.0f, 38.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 1.6f, 0.8f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, 0.4f, 1.7f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 36.7f, 46.3f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 46.3f, 36.7f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, 1.7f, 0.4f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 0.8f, 1.5f)
                arcTo(89.6f, 89.6f, 0.0f, false, true, 191.6f, 191.7f)
                close()
                moveTo(163.1f, 164.9f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -14.2f, 0.0f)
                arcTo(10.1f, 10.1f, 0.0f, false, true, 163.1f, 164.9f)
                close()
                moveTo(99.1f, 156.9f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -14.2f, 0.0f)
                arcTo(10.1f, 10.1f, 0.0f, false, true, 99.1f, 156.9f)
                close()
                moveTo(76.9f, 115.1f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 14.2f, 0.0f)
                arcTo(10.1f, 10.1f, 0.0f, false, true, 76.9f, 115.1f)
                close()
                moveTo(143.1f, 131.1f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 0.0f, -14.2f)
                arcTo(10.1f, 10.1f, 0.0f, false, true, 143.1f, 131.1f)
                close()
            }
        }
        .build()
        return _cookie!!
    }

private var _cookie: ImageVector? = null
