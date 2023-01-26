package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.PermScanWifi: ImageVector
    get() {
        if (_permScanWifi != null) {
            return _permScanWifi!!
        }
        _permScanWifi = Builder(name = "PermScanWifi", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(7.41f, 3.0f, 3.86f, 4.53f, 0.89f, 6.59f)
                curveToRelative(-0.49f, 0.33f, -0.59f, 1.0f, -0.22f, 1.46f)
                lineToRelative(9.78f, 12.04f)
                curveToRelative(0.8f, 0.98f, 2.3f, 0.99f, 3.1f, 0.0f)
                lineToRelative(9.78f, -12.02f)
                curveToRelative(0.37f, -0.46f, 0.27f, -1.13f, -0.22f, -1.46f)
                curveTo(20.14f, 4.54f, 16.59f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(11.0f, 8.0f)
                lineTo(11.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _permScanWifi!!
    }

private var _permScanWifi: ImageVector? = null
