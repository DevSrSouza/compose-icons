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

public val SimpleIcons.Hostinger: ImageVector
    get() {
        if (_hostinger != null) {
            return _hostinger!!
        }
        _hostinger = Builder(name = "Hostinger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.415f, 0.0f)
                verticalLineToRelative(7.16f)
                lineToRelative(5.785f, 3.384f)
                lineTo(22.2f, 2.949f)
                lineTo(16.415f, 0.0f)
                close()
                moveTo(1.8f, 0.0f)
                verticalLineToRelative(11.237f)
                horizontalLineToRelative(18.815f)
                lineTo(14.89f, 8.09f)
                lineToRelative(-7.457f, -0.003f)
                lineTo(7.433f, 3.024f)
                lineTo(1.8f, 0.0f)
                close()
                moveTo(16.415f, 20.894f)
                verticalLineToRelative(-5.019f)
                lineToRelative(-7.514f, -0.005f)
                curveToRelative(0.007f, 0.033f, -5.82f, -3.197f, -5.82f, -3.197f)
                lineToRelative(19.119f, 0.091f)
                lineTo(22.2f, 24.0f)
                lineToRelative(-5.785f, -3.106f)
                close()
                moveTo(1.8f, 13.551f)
                verticalLineToRelative(7.343f)
                lineToRelative(5.633f, 2.949f)
                verticalLineToRelative(-6.988f)
                lineTo(1.8f, 13.551f)
                close()
            }
        }
        .build()
        return _hostinger!!
    }

private var _hostinger: ImageVector? = null
