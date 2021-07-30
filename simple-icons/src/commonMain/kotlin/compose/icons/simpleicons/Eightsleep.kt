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

public val SimpleIcons.Eightsleep: ImageVector
    get() {
        if (_eightsleep != null) {
            return _eightsleep!!
        }
        _eightsleep = Builder(name = "Eightsleep", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.847f, 7.28f)
                lineTo(19.847f, 4.105f)
                arcTo(4.104f, 4.104f, 0.0f, false, false, 15.745f, 0.0f)
                lineTo(8.258f, 0.0f)
                arcToRelative(4.104f, 4.104f, 0.0f, false, false, -4.105f, 4.102f)
                verticalLineToRelative(3.183f)
                arcToRelative(4.092f, 4.092f, 0.0f, false, false, 2.415f, 3.738f)
                verticalLineToRelative(0.588f)
                arcToRelative(4.102f, 4.102f, 0.0f, false, false, -2.415f, 3.738f)
                verticalLineToRelative(4.546f)
                arcTo(4.104f, 4.104f, 0.0f, false, false, 8.255f, 24.0f)
                horizontalLineToRelative(7.488f)
                arcToRelative(4.104f, 4.104f, 0.0f, false, false, 4.104f, -4.104f)
                verticalLineToRelative(-4.553f)
                arcToRelative(4.102f, 4.102f, 0.0f, false, false, -2.415f, -3.738f)
                verticalLineToRelative(-0.587f)
                arcToRelative(4.102f, 4.102f, 0.0f, false, false, 2.415f, -3.738f)
                close()
                moveTo(8.451f, 5.126f)
                curveToRelative(0.0f, -0.818f, 0.662f, -1.482f, 1.48f, -1.483f)
                horizontalLineToRelative(4.133f)
                curveToRelative(0.819f, 0.0f, 1.483f, 0.663f, 1.483f, 1.482f)
                verticalLineToRelative(1.991f)
                curveToRelative(0.0f, 0.819f, -0.664f, 1.482f, -1.483f, 1.482f)
                lineTo(9.93f, 8.598f)
                arcToRelative(1.482f, 1.482f, 0.0f, false, true, -1.482f, -1.482f)
                lineToRelative(0.003f, -1.99f)
                close()
                moveTo(15.551f, 18.858f)
                curveToRelative(0.0f, 0.818f, -0.664f, 1.482f, -1.483f, 1.482f)
                lineTo(9.93f, 20.34f)
                arcToRelative(1.482f, 1.482f, 0.0f, false, true, -1.482f, -1.482f)
                verticalLineToRelative(-2.752f)
                curveToRelative(0.0f, -0.819f, 0.664f, -1.483f, 1.482f, -1.483f)
                horizontalLineToRelative(4.134f)
                curveToRelative(0.819f, 0.0f, 1.483f, 0.664f, 1.483f, 1.483f)
                lineToRelative(0.003f, 2.752f)
                close()
            }
        }
        .build()
        return _eightsleep!!
    }

private var _eightsleep: ImageVector? = null
