package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.Cookie: ImageVector
    get() {
        if (_cookie != null) {
            return _cookie!!
        }
        _cookie = Builder(name = "Cookie", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 127.4f)
                arcToRelative(95.6f, 95.6f, 0.0f, false, true, -28.2f, 68.5f)
                curveToRelative(-36.9f, 36.9f, -97.3f, 37.3f, -134.7f, 0.9f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 128.6f, 32.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 7.8f, 9.8f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 30.8f, 39.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 39.0f, 30.8f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 224.0f, 127.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.9f, 114.9f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, false, -13.4f, -3.1f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, true, -29.3f, -23.1f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.9f, -15.9f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, true, -23.1f, -29.3f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 128.6f, 24.0f)
                lineTo(128.0f, 24.0f)
                arcTo(104.1f, 104.1f, 0.0f, false, false, 24.0f, 128.7f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, 208.0f, -1.3f)
                horizontalLineToRelative(0.0f)
                arcTo(15.7f, 15.7f, 0.0f, false, false, 225.9f, 114.9f)
                close()
                moveTo(190.2f, 190.3f)
                curveToRelative(-33.9f, 33.8f, -89.3f, 34.1f, -123.5f, 0.8f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 128.0f, 40.0f)
                horizontalLineToRelative(0.6f)
                arcToRelative(39.9f, 39.9f, 0.0f, false, false, 38.6f, 48.8f)
                arcTo(39.9f, 39.9f, 0.0f, false, false, 216.0f, 127.4f)
                horizontalLineToRelative(0.0f)
                arcTo(87.6f, 87.6f, 0.0f, false, true, 190.2f, 190.3f)
                close()
                moveTo(164.5f, 163.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.5f, 163.5f)
                close()
                moveTo(100.5f, 155.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 100.5f, 155.5f)
                close()
                moveTo(75.5f, 116.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 75.5f, 116.5f)
                close()
                moveTo(144.5f, 132.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, -17.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 144.5f, 132.5f)
                close()
            }
        }
        .build()
        return _cookie!!
    }

private var _cookie: ImageVector? = null
