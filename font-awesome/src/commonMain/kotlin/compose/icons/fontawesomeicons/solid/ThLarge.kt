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

public val SolidGroup.ThLarge: ImageVector
    get() {
        if (_thLarge != null) {
            return _thLarge!!
        }
        _thLarge = Builder(name = "ThLarge", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(296.0f, 32.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, 10.745f, 24.0f, 24.0f)
                verticalLineToRelative(160.0f)
                curveToRelative(0.0f, 13.255f, -10.745f, 24.0f, -24.0f, 24.0f)
                lineTo(296.0f, 240.0f)
                curveToRelative(-13.255f, 0.0f, -24.0f, -10.745f, -24.0f, -24.0f)
                lineTo(272.0f, 56.0f)
                curveToRelative(0.0f, -13.255f, 10.745f, -24.0f, 24.0f, -24.0f)
                close()
                moveTo(216.0f, 32.0f)
                lineTo(24.0f, 32.0f)
                curveTo(10.745f, 32.0f, 0.0f, 42.745f, 0.0f, 56.0f)
                verticalLineToRelative(160.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, -10.745f, 24.0f, -24.0f)
                lineTo(240.0f, 56.0f)
                curveToRelative(0.0f, -13.255f, -10.745f, -24.0f, -24.0f, -24.0f)
                close()
                moveTo(0.0f, 296.0f)
                verticalLineToRelative(160.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, -10.745f, 24.0f, -24.0f)
                lineTo(240.0f, 296.0f)
                curveToRelative(0.0f, -13.255f, -10.745f, -24.0f, -24.0f, -24.0f)
                lineTo(24.0f, 272.0f)
                curveToRelative(-13.255f, 0.0f, -24.0f, 10.745f, -24.0f, 24.0f)
                close()
                moveTo(296.0f, 480.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, -10.745f, 24.0f, -24.0f)
                lineTo(512.0f, 296.0f)
                curveToRelative(0.0f, -13.255f, -10.745f, -24.0f, -24.0f, -24.0f)
                lineTo(296.0f, 272.0f)
                curveToRelative(-13.255f, 0.0f, -24.0f, 10.745f, -24.0f, 24.0f)
                verticalLineToRelative(160.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                close()
            }
        }
        .build()
        return _thLarge!!
    }

private var _thLarge: ImageVector? = null
