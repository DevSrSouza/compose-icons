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

public val SolidGroup.ShuttleVan: ImageVector
    get() {
        if (_shuttleVan != null) {
            return _shuttleVan!!
        }
        _shuttleVan = Builder(name = "ShuttleVan", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(628.88f, 210.65f)
                lineTo(494.39f, 49.27f)
                arcTo(48.01f, 48.01f, 0.0f, false, false, 457.52f, 32.0f)
                lineTo(32.0f, 32.0f)
                curveTo(14.33f, 32.0f, 0.0f, 46.33f, 0.0f, 64.0f)
                verticalLineToRelative(288.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(0.0f, 53.02f, 42.98f, 96.0f, 96.0f, 96.0f)
                reflectiveCurveToRelative(96.0f, -42.98f, 96.0f, -96.0f)
                horizontalLineToRelative(128.0f)
                curveToRelative(0.0f, 53.02f, 42.98f, 96.0f, 96.0f, 96.0f)
                reflectiveCurveToRelative(96.0f, -42.98f, 96.0f, -96.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                lineTo(640.0f, 241.38f)
                curveToRelative(0.0f, -11.23f, -3.94f, -22.1f, -11.12f, -30.73f)
                close()
                moveTo(64.0f, 192.0f)
                lineTo(64.0f, 96.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(96.0f)
                lineTo(64.0f, 192.0f)
                close()
                moveTo(160.0f, 432.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, -21.49f, -48.0f, -48.0f)
                reflectiveCurveToRelative(21.49f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.49f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.49f, 48.0f, -48.0f, 48.0f)
                close()
                moveTo(320.0f, 192.0f)
                horizontalLineToRelative(-96.0f)
                lineTo(224.0f, 96.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(96.0f)
                close()
                moveTo(480.0f, 432.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, -21.49f, -48.0f, -48.0f)
                reflectiveCurveToRelative(21.49f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.49f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.49f, 48.0f, -48.0f, 48.0f)
                close()
                moveTo(384.0f, 192.0f)
                lineTo(384.0f, 96.0f)
                horizontalLineToRelative(66.02f)
                lineToRelative(80.0f, 96.0f)
                lineTo(384.0f, 192.0f)
                close()
            }
        }
        .build()
        return _shuttleVan!!
    }

private var _shuttleVan: ImageVector? = null
