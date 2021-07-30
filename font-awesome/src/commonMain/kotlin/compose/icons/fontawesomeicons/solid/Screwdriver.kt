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
                moveTo(448.0f, 0.0f)
                lineTo(320.0f, 96.0f)
                verticalLineToRelative(62.06f)
                lineToRelative(-83.03f, 83.03f)
                curveToRelative(6.79f, 4.25f, 13.27f, 9.06f, 19.07f, 14.87f)
                curveToRelative(5.8f, 5.8f, 10.62f, 12.28f, 14.87f, 19.07f)
                lineTo(353.94f, 192.0f)
                horizontalLineTo(416.0f)
                lineToRelative(96.0f, -128.0f)
                lineToRelative(-64.0f, -64.0f)
                close()
                moveTo(128.0f, 278.59f)
                lineTo(10.92f, 395.67f)
                curveToRelative(-14.55f, 14.55f, -14.55f, 38.15f, 0.0f, 52.71f)
                lineToRelative(52.7f, 52.7f)
                curveToRelative(14.56f, 14.56f, 38.15f, 14.56f, 52.71f, 0.0f)
                lineTo(233.41f, 384.0f)
                curveToRelative(29.11f, -29.11f, 29.11f, -76.3f, 0.0f, -105.41f)
                reflectiveCurveToRelative(-76.3f, -29.11f, -105.41f, 0.0f)
                close()
            }
        }
        .build()
        return _screwdriver!!
    }

private var _screwdriver: ImageVector? = null
