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

public val SolidGroup.Skull: ImageVector
    get() {
        if (_skull != null) {
            return _skull!!
        }
        _skull = Builder(name = "Skull", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 0.0f)
                curveTo(114.6f, 0.0f, 0.0f, 100.3f, 0.0f, 224.0f)
                curveToRelative(0.0f, 70.1f, 36.9f, 132.6f, 94.5f, 173.7f)
                curveToRelative(9.6f, 6.9f, 15.2f, 18.1f, 13.5f, 29.9f)
                lineToRelative(-9.4f, 66.2f)
                curveToRelative(-1.4f, 9.6f, 6.0f, 18.2f, 15.7f, 18.2f)
                lineTo(192.0f, 512.0f)
                verticalLineToRelative(-56.0f)
                curveToRelative(0.0f, -4.4f, 3.6f, -8.0f, 8.0f, -8.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, 3.6f, 8.0f, 8.0f)
                verticalLineToRelative(56.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(-56.0f)
                curveToRelative(0.0f, -4.4f, 3.6f, -8.0f, 8.0f, -8.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, 3.6f, 8.0f, 8.0f)
                verticalLineToRelative(56.0f)
                horizontalLineToRelative(77.7f)
                curveToRelative(9.7f, 0.0f, 17.1f, -8.6f, 15.7f, -18.2f)
                lineToRelative(-9.4f, -66.2f)
                curveToRelative(-1.7f, -11.7f, 3.8f, -23.0f, 13.5f, -29.9f)
                curveTo(475.1f, 356.6f, 512.0f, 294.1f, 512.0f, 224.0f)
                curveTo(512.0f, 100.3f, 397.4f, 0.0f, 256.0f, 0.0f)
                close()
                moveTo(160.0f, 320.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                reflectiveCurveToRelative(28.7f, -64.0f, 64.0f, -64.0f)
                reflectiveCurveToRelative(64.0f, 28.7f, 64.0f, 64.0f)
                reflectiveCurveToRelative(-28.7f, 64.0f, -64.0f, 64.0f)
                close()
                moveTo(352.0f, 320.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                reflectiveCurveToRelative(28.7f, -64.0f, 64.0f, -64.0f)
                reflectiveCurveToRelative(64.0f, 28.7f, 64.0f, 64.0f)
                reflectiveCurveToRelative(-28.7f, 64.0f, -64.0f, 64.0f)
                close()
            }
        }
        .build()
        return _skull!!
    }

private var _skull: ImageVector? = null
