package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.PermScanWifi: ImageVector
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
                curveTo(6.95f, 3.0f, 3.15f, 4.85f, 0.0f, 7.23f)
                lineTo(12.0f, 22.0f)
                lineTo(24.0f, 7.25f)
                curveTo(20.85f, 4.87f, 17.05f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(2.92f, 7.65f)
                curveTo(5.8f, 5.85f, 8.74f, 5.0f, 12.0f, 5.0f)
                curveToRelative(3.25f, 0.0f, 6.18f, 0.85f, 9.08f, 2.67f)
                lineTo(12.0f, 18.83f)
                lineTo(2.92f, 7.65f)
                close()
                moveTo(11.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(11.0f, 6.0f)
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
