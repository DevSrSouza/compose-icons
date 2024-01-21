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

public val SolidGroup.ShuttleSpace: ImageVector
    get() {
        if (_shuttleSpace != null) {
            return _shuttleSpace!!
        }
        _shuttleSpace = Builder(name = "ShuttleSpace", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(130.0f, 480.0f)
                curveToRelative(40.6f, 0.0f, 80.4f, -11.0f, 115.2f, -31.9f)
                lineTo(352.0f, 384.0f)
                lineToRelative(-224.0f, 0.0f)
                lineToRelative(0.0f, 96.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(352.0f, 128.0f)
                lineTo(245.2f, 63.9f)
                curveTo(210.4f, 43.0f, 170.6f, 32.0f, 130.0f, 32.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(96.0f)
                lineToRelative(224.0f, 0.0f)
                close()
                moveTo(96.0f, 128.0f)
                lineToRelative(0.0f, -96.0f)
                horizontalLineTo(80.0f)
                curveTo(53.5f, 32.0f, 32.0f, 53.5f, 32.0f, 80.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(-22.1f, 0.0f, -40.0f, 17.9f, -40.0f, 40.0f)
                verticalLineToRelative(16.0f)
                verticalLineTo(328.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 22.1f, 17.9f, 40.0f, 40.0f, 40.0f)
                horizontalLineTo(32.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineTo(96.0f)
                lineToRelative(0.0f, -96.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(26.2f, 0.0f, 49.4f, -12.6f, 64.0f, -32.0f)
                horizontalLineTo(456.0f)
                curveToRelative(69.3f, 0.0f, 135.0f, -22.7f, 179.2f, -81.6f)
                curveToRelative(6.4f, -8.5f, 6.4f, -20.3f, 0.0f, -28.8f)
                curveTo(591.0f, 182.7f, 525.3f, 160.0f, 456.0f, 160.0f)
                horizontalLineTo(168.0f)
                curveToRelative(-14.6f, -19.4f, -37.8f, -32.0f, -64.0f, -32.0f)
                lineToRelative(-8.0f, 0.0f)
                close()
                moveTo(512.0f, 243.6f)
                verticalLineToRelative(24.9f)
                curveToRelative(0.0f, 19.6f, -15.9f, 35.6f, -35.6f, 35.6f)
                curveToRelative(-2.5f, 0.0f, -4.4f, -2.0f, -4.4f, -4.4f)
                verticalLineTo(212.4f)
                curveToRelative(0.0f, -2.5f, 2.0f, -4.4f, 4.4f, -4.4f)
                curveToRelative(19.6f, 0.0f, 35.6f, 15.9f, 35.6f, 35.6f)
                close()
            }
        }
        .build()
        return _shuttleSpace!!
    }

private var _shuttleSpace: ImageVector? = null
