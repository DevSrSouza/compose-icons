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

public val SimpleIcons.Bunq: ImageVector
    get() {
        if (_bunq != null) {
            return _bunq!!
        }
        _bunq = Builder(name = "Bunq", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.414f, 14.62f)
                horizontalLineToRelative(1.103f)
                verticalLineToRelative(-2.896f)
                arcToRelative(2.484f, 2.484f, 0.0f, false, false, -2.483f, -2.483f)
                arcToRelative(2.484f, 2.484f, 0.0f, false, false, -2.482f, 2.483f)
                verticalLineToRelative(2.897f)
                horizontalLineToRelative(1.103f)
                verticalLineToRelative(-2.897f)
                curveToRelative(0.0f, -0.837f, 0.618f, -1.517f, 1.38f, -1.517f)
                curveToRelative(0.76f, 0.0f, 1.379f, 0.68f, 1.379f, 1.517f)
                close()
                moveTo(10.344f, 9.38f)
                horizontalLineToRelative(1.104f)
                verticalLineToRelative(2.896f)
                arcToRelative(2.484f, 2.484f, 0.0f, false, true, -2.482f, 2.483f)
                arcToRelative(2.484f, 2.484f, 0.0f, false, true, -2.483f, -2.483f)
                lineTo(6.483f, 9.379f)
                horizontalLineToRelative(1.103f)
                verticalLineToRelative(2.897f)
                curveToRelative(0.0f, 0.837f, 0.618f, 1.517f, 1.38f, 1.517f)
                curveToRelative(0.76f, 0.0f, 1.379f, -0.68f, 1.379f, -1.517f)
                close()
                moveTo(0.0f, 7.034f)
                lineTo(0.0f, 12.0f)
                curveToRelative(0.0f, 0.046f, 0.001f, 0.093f, 0.004f, 0.139f)
                lineTo(0.0f, 12.139f)
                verticalLineToRelative(2.482f)
                horizontalLineToRelative(0.965f)
                lineToRelative(0.055f, -0.48f)
                arcTo(2.76f, 2.76f, 0.0f, false, false, 5.518f, 12.0f)
                arcToRelative(2.76f, 2.76f, 0.0f, false, false, -4.414f, -2.208f)
                lineTo(1.104f, 7.035f)
                close()
                moveTo(2.69f, 10.206f)
                curveToRelative(0.951f, 0.0f, 1.724f, 0.803f, 1.724f, 1.793f)
                curveToRelative(0.0f, 0.99f, -0.773f, 1.793f, -1.725f, 1.793f)
                curveToRelative(-0.951f, 0.0f, -1.724f, -0.803f, -1.724f, -1.793f)
                curveToRelative(0.0f, -0.99f, 0.773f, -1.793f, 1.724f, -1.793f)
                close()
                moveTo(21.242f, 9.241f)
                arcTo(2.76f, 2.76f, 0.0f, false, false, 18.482f, 12.0f)
                arcToRelative(2.76f, 2.76f, 0.0f, false, false, 4.414f, 2.207f)
                verticalLineToRelative(2.758f)
                lineTo(24.0f, 16.965f)
                lineTo(24.0f, 12.0f)
                arcToRelative(2.15f, 2.15f, 0.0f, false, false, -0.004f, -0.139f)
                lineTo(24.0f, 11.861f)
                lineTo(24.0f, 9.38f)
                horizontalLineToRelative(-0.965f)
                lineToRelative(-0.055f, 0.48f)
                arcToRelative(2.741f, 2.741f, 0.0f, false, false, -1.738f, -0.617f)
                close()
                moveTo(21.311f, 10.206f)
                curveToRelative(0.951f, 0.0f, 1.724f, 0.803f, 1.724f, 1.793f)
                curveToRelative(0.0f, 0.99f, -0.773f, 1.793f, -1.724f, 1.793f)
                curveToRelative(-0.952f, 0.0f, -1.725f, -0.803f, -1.725f, -1.793f)
                curveToRelative(0.0f, -0.99f, 0.773f, -1.793f, 1.725f, -1.793f)
                close()
            }
        }
        .build()
        return _bunq!!
    }

private var _bunq: ImageVector? = null
