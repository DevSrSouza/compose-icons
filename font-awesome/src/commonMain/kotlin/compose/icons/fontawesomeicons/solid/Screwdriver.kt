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

public val SolidGroup.Screwdriver: ImageVector
    get() {
        if (_screwdriver != null) {
            return _screwdriver!!
        }
        _screwdriver = Builder(name = "Screwdriver", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(465.0f, 7.0f)
                curveToRelative(-8.5f, -8.5f, -22.0f, -9.4f, -31.6f, -2.1f)
                lineToRelative(-104.0f, 80.0f)
                curveToRelative(-5.9f, 4.5f, -9.4f, 11.6f, -9.4f, 19.0f)
                verticalLineToRelative(54.1f)
                lineToRelative(-85.6f, 85.6f)
                curveToRelative(6.7f, 4.2f, 13.0f, 9.3f, 18.8f, 15.1f)
                reflectiveCurveToRelative(10.9f, 12.2f, 15.1f, 18.8f)
                lineTo(353.9f, 192.0f)
                horizontalLineTo(408.0f)
                curveToRelative(7.5f, 0.0f, 14.5f, -3.5f, 19.0f, -9.4f)
                lineToRelative(80.0f, -104.0f)
                curveToRelative(7.4f, -9.6f, 6.5f, -23.1f, -2.1f, -31.6f)
                lineTo(465.0f, 7.0f)
                close()
                moveTo(121.4f, 281.4f)
                lineToRelative(-112.0f, 112.0f)
                curveToRelative(-12.5f, 12.5f, -12.5f, 32.8f, 0.0f, 45.3f)
                lineToRelative(64.0f, 64.0f)
                curveToRelative(12.5f, 12.5f, 32.8f, 12.5f, 45.3f, 0.0f)
                lineToRelative(112.0f, -112.0f)
                curveToRelative(30.2f, -30.2f, 30.2f, -79.1f, 0.0f, -109.3f)
                reflectiveCurveToRelative(-79.1f, -30.2f, -109.3f, 0.0f)
                close()
            }
        }
        .build()
        return _screwdriver!!
    }

private var _screwdriver: ImageVector? = null
