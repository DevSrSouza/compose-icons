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

public val SolidGroup.Scroll: ImageVector
    get() {
        if (_scroll != null) {
            return _scroll!!
        }
        _scroll = Builder(name = "Scroll", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 0.0f)
                curveTo(21.53f, 0.0f, 0.0f, 21.53f, 0.0f, 48.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(80.0f)
                lineTo(96.0f, 48.0f)
                curveTo(96.0f, 21.53f, 74.47f, 0.0f, 48.0f, 0.0f)
                close()
                moveTo(256.0f, 412.57f)
                lineTo(256.0f, 352.0f)
                horizontalLineToRelative(288.0f)
                lineTo(544.0f, 96.0f)
                curveToRelative(0.0f, -52.94f, -43.06f, -96.0f, -96.0f, -96.0f)
                lineTo(111.59f, 0.0f)
                curveTo(121.74f, 13.41f, 128.0f, 29.92f, 128.0f, 48.0f)
                verticalLineToRelative(368.0f)
                curveToRelative(0.0f, 38.87f, 34.65f, 69.65f, 74.75f, 63.12f)
                curveTo(234.22f, 474.0f, 256.0f, 444.46f, 256.0f, 412.57f)
                close()
                moveTo(288.0f, 384.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 52.93f, -43.06f, 96.0f, -96.0f, 96.0f)
                horizontalLineToRelative(336.0f)
                curveToRelative(61.86f, 0.0f, 112.0f, -50.14f, 112.0f, -112.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                lineTo(288.0f, 384.0f)
                close()
            }
        }
        .build()
        return _scroll!!
    }

private var _scroll: ImageVector? = null
