package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Truenas: ImageVector
    get() {
        if (_truenas != null) {
            return _truenas!!
        }
        _truenas = Builder(name = "Truenas", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 10.049f)
                verticalLineToRelative(5.114f)
                lineToRelative(-10.949f, 6.324f)
                verticalLineToRelative(-5.114f)
                lineTo(24.0f, 10.049f)
                close()
                moveTo(0.0f, 10.049f)
                verticalLineToRelative(5.114f)
                lineToRelative(10.956f, 6.324f)
                verticalLineToRelative(-5.114f)
                lineTo(0.0f, 10.049f)
                close()
                moveTo(12.004f, 9.444f)
                lineToRelative(-4.433f, 2.559f)
                lineToRelative(4.433f, 2.559f)
                lineToRelative(4.429f, -2.559f)
                lineToRelative(-4.429f, -2.559f)
                close()
                moveTo(22.956f, 8.237f)
                lineToRelative(-9.905f, -5.723f)
                verticalLineToRelative(5.118f)
                lineToRelative(5.473f, 3.164f)
                lineToRelative(4.432f, -2.559f)
                close()
                moveTo(10.956f, 7.632f)
                lineTo(10.956f, 2.513f)
                lineTo(1.044f, 8.236f)
                lineToRelative(4.432f, 2.555f)
                lineToRelative(5.48f, -3.159f)
                close()
            }
        }
        .build()
        return _truenas!!
    }

private var _truenas: ImageVector? = null
