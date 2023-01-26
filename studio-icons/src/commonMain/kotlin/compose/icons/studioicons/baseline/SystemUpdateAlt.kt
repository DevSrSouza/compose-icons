package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.SystemUpdateAlt: ImageVector
    get() {
        if (_systemUpdateAlt != null) {
            return _systemUpdateAlt!!
        }
        _systemUpdateAlt = Builder(name = "SystemUpdateAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.5f)
                lineToRelative(4.0f, -4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(9.0f)
                lineTo(8.0f, 12.5f)
                lineToRelative(4.0f, 4.0f)
                close()
                moveTo(21.0f, 3.5f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(1.99f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(14.03f)
                lineTo(3.0f, 19.52f)
                lineTo(3.0f, 5.49f)
                horizontalLineToRelative(6.0f)
                lineTo(9.0f, 3.5f)
                lineTo(3.0f, 3.5f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-14.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _systemUpdateAlt!!
    }

private var _systemUpdateAlt: ImageVector? = null
