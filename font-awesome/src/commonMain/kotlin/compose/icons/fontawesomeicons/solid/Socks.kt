package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Socks: ImageVector
    get() {
        if (_socks != null) {
            return _socks!!
        }
        _socks = Builder(name = "Socks", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(175.2f, 476.6f)
                curveToRelative(-9.7f, -18.0f, -15.2f, -38.7f, -15.2f, -60.6f)
                curveToRelative(0.0f, -40.3f, 19.0f, -78.2f, 51.2f, -102.4f)
                lineToRelative(64.0f, -48.0f)
                curveToRelative(8.1f, -6.0f, 12.8f, -15.5f, 12.8f, -25.6f)
                verticalLineTo(96.0f)
                horizontalLineTo(128.0f)
                verticalLineTo(240.0f)
                curveToRelative(0.0f, 20.1f, -9.5f, 39.1f, -25.6f, 51.2f)
                lineToRelative(-64.0f, 48.0f)
                curveTo(14.2f, 357.3f, 0.0f, 385.8f, 0.0f, 416.0f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                curveToRelative(20.8f, 0.0f, 41.0f, -6.7f, 57.6f, -19.2f)
                lineToRelative(21.6f, -16.2f)
                close()
                moveTo(128.0f, 64.0f)
                horizontalLineTo(288.0f)
                verticalLineTo(48.0f)
                curveToRelative(0.0f, -14.5f, 3.9f, -28.2f, 10.7f, -39.9f)
                curveTo(291.0f, 3.0f, 281.9f, 0.0f, 272.0f, 0.0f)
                horizontalLineTo(176.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                verticalLineTo(64.0f)
                close()
                moveTo(320.0f, 96.0f)
                verticalLineTo(240.0f)
                curveToRelative(0.0f, 20.1f, -9.5f, 39.1f, -25.6f, 51.2f)
                lineToRelative(-64.0f, 48.0f)
                curveTo(206.2f, 357.3f, 192.0f, 385.8f, 192.0f, 416.0f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                curveToRelative(20.8f, 0.0f, 41.0f, -6.7f, 57.6f, -19.2f)
                lineToRelative(115.2f, -86.4f)
                curveTo(493.0f, 382.2f, 512.0f, 344.3f, 512.0f, 304.0f)
                verticalLineTo(96.0f)
                horizontalLineTo(320.0f)
                close()
                moveTo(512.0f, 64.0f)
                verticalLineTo(48.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                horizontalLineTo(368.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(512.0f)
                close()
            }
        }
        .build()
        return _socks!!
    }

private var _socks: ImageVector? = null
