package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.PowerOff: ImageVector
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
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                lineTo(16.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.88f)
                lineToRelative(7.69f, 7.69f)
                lineToRelative(0.19f, -0.2f)
                close()
                moveTo(10.0f, 3.0f)
                lineTo(8.0f, 3.0f)
                verticalLineToRelative(1.88f)
                lineToRelative(2.0f, 2.0f)
                close()
                moveTo(4.12f, 3.84f)
                lineTo(2.71f, 5.25f)
                lineToRelative(3.34f, 3.34f)
                curveToRelative(-0.03f, 0.13f, -0.05f, 0.27f, -0.05f, 0.4f)
                verticalLineToRelative(5.51f)
                lineTo(9.5f, 18.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                lineToRelative(0.48f, -0.48f)
                lineToRelative(4.47f, 4.47f)
                lineToRelative(1.41f, -1.41f)
                lineTo(4.12f, 3.84f)
                close()
            }
        }
        .build()
        return _powerOff!!
    }

private var _powerOff: ImageVector? = null
