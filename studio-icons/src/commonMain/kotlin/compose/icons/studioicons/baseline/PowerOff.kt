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

public val BaselineGroup.PowerOff: ImageVector
    get() {
        if (_powerOff != null) {
            return _powerOff!!
        }
        _powerOff = Builder(name = "PowerOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 14.49f)
                lineTo(18.0f, 9.0f)
                curveToRelative(0.0f, -1.0f, -1.01f, -2.01f, -2.0f, -2.0f)
                lineTo(16.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(10.0f, 3.0f)
                lineTo(8.0f, 3.0f)
                verticalLineToRelative(2.48f)
                lineToRelative(9.51f, 9.5f)
                lineToRelative(0.49f, -0.49f)
                close()
                moveTo(16.24f, 16.26f)
                lineTo(7.2f, 7.2f)
                lineToRelative(-0.01f, 0.01f)
                lineTo(3.98f, 4.0f)
                lineTo(2.71f, 5.25f)
                lineToRelative(3.36f, 3.36f)
                curveTo(6.04f, 8.74f, 6.0f, 8.87f, 6.0f, 9.0f)
                verticalLineToRelative(5.48f)
                lineTo(9.5f, 18.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                lineToRelative(0.48f, -0.48f)
                lineTo(19.45f, 22.0f)
                lineToRelative(1.26f, -1.28f)
                lineToRelative(-4.47f, -4.46f)
                close()
            }
        }
        .build()
        return _powerOff!!
    }

private var _powerOff: ImageVector? = null
