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

public val RemixIcons.FootprintFill: ImageVector
    get() {
        if (_footprintFill != null) {
            return _footprintFill!!
        }
        _footprintFill = Builder(name = "FootprintFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 18.0f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(1.25f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -5.5f, 0.0f)
                lineTo(4.0f, 18.0f)
                close()
                moveTo(8.0f, 6.12f)
                curveToRelative(2.0f, 0.0f, 3.0f, 2.88f, 3.0f, 4.88f)
                curveToRelative(0.0f, 1.0f, -0.5f, 2.0f, -1.0f, 3.5f)
                lineTo(9.5f, 16.0f)
                lineTo(4.0f, 16.0f)
                curveToRelative(0.0f, -1.0f, -0.5f, -2.5f, -0.5f, -5.0f)
                reflectiveCurveTo(5.498f, 6.12f, 8.0f, 6.12f)
                close()
                moveTo(20.054f, 14.098f)
                lineToRelative(-0.217f, 1.231f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -5.417f, -0.955f)
                lineToRelative(0.218f, -1.23f)
                lineToRelative(5.416f, 0.954f)
                close()
                moveTo(18.178f, 1.705f)
                curveToRelative(2.464f, 0.434f, 4.018f, 3.124f, 3.584f, 5.586f)
                curveToRelative(-0.434f, 2.463f, -1.187f, 3.853f, -1.36f, 4.838f)
                lineToRelative(-5.417f, -0.955f)
                lineToRelative(-0.232f, -1.564f)
                curveToRelative(-0.232f, -1.564f, -0.55f, -2.636f, -0.377f, -3.62f)
                curveToRelative(0.347f, -1.97f, 1.832f, -4.632f, 3.802f, -4.285f)
                close()
            }
        }
        .build()
        return _footprintFill!!
    }

private var _footprintFill: ImageVector? = null
