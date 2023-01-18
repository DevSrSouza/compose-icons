package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.DoubanFill: ImageVector
    get() {
        if (_doubanFill != null) {
            return _doubanFill!!
        }
        _doubanFill = Builder(name = "DoubanFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.314f, 19.138f)
                horizontalLineToRelative(4.065f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, 0.621f, 0.62f)
                verticalLineToRelative(0.621f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, -0.62f, 0.621f)
                horizontalLineTo(3.62f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, -0.62f, -0.62f)
                verticalLineToRelative(-0.621f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, 0.62f, -0.621f)
                horizontalLineToRelative(3.754f)
                lineToRelative(-0.96f, -3.104f)
                horizontalLineToRelative(2.19f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, 0.59f, 0.425f)
                lineToRelative(0.892f, 2.679f)
                horizontalLineTo(13.6f)
                lineToRelative(1.225f, -4.035f)
                horizontalLineTo(5.172f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, -0.62f, -0.62f)
                verticalLineTo(7.345f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, 0.62f, -0.62f)
                horizontalLineToRelative(13.656f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, 0.62f, 0.62f)
                verticalLineToRelative(7.138f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, -0.62f, 0.62f)
                horizontalLineToRelative(-1.289f)
                lineToRelative(-1.225f, 4.035f)
                close()
                moveTo(3.931f, 3.0f)
                horizontalLineToRelative(16.138f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, 0.62f, 0.62f)
                verticalLineToRelative(0.621f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, -0.62f, 0.621f)
                horizontalLineTo(3.931f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, -0.62f, -0.62f)
                verticalLineTo(3.62f)
                arcTo(0.62f, 0.62f, 0.0f, false, true, 3.93f, 3.0f)
                close()
                moveTo(7.19f, 8.586f)
                arcToRelative(0.155f, 0.155f, 0.0f, false, false, -0.156f, 0.155f)
                verticalLineToRelative(4.035f)
                curveToRelative(0.0f, 0.086f, 0.07f, 0.155f, 0.156f, 0.155f)
                horizontalLineToRelative(9.62f)
                curveToRelative(0.086f, 0.0f, 0.156f, -0.07f, 0.156f, -0.155f)
                verticalLineTo(8.74f)
                arcToRelative(0.155f, 0.155f, 0.0f, false, false, -0.156f, -0.155f)
                horizontalLineTo(7.19f)
                close()
            }
        }
        .build()
        return _doubanFill!!
    }

private var _doubanFill: ImageVector? = null
