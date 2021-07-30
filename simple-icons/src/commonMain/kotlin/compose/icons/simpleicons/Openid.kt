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

public val SimpleIcons.Openid: ImageVector
    get() {
        if (_openid != null) {
            return _openid!!
        }
        _openid = Builder(name = "Openid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.54f, 0.889f)
                lineToRelative(-3.63f, 1.773f)
                verticalLineToRelative(18.17f)
                curveToRelative(-4.15f, -0.52f, -7.27f, -2.78f, -7.27f, -5.5f)
                curveToRelative(0.0f, -2.58f, 2.8f, -4.75f, 6.63f, -5.41f)
                verticalLineToRelative(-2.31f)
                curveTo(4.42f, 8.322f, 0.0f, 11.502f, 0.0f, 15.332f)
                curveToRelative(0.0f, 3.96f, 4.74f, 7.24f, 10.91f, 7.78f)
                lineToRelative(3.63f, -1.71f)
                verticalLineTo(0.888f)
                moveToRelative(0.64f, 6.724f)
                verticalLineToRelative(2.31f)
                curveToRelative(1.43f, 0.25f, 2.71f, 0.7f, 3.76f, 1.31f)
                lineToRelative(-1.97f, 1.11f)
                lineToRelative(7.03f, 1.53f)
                lineToRelative(-0.5f, -5.21f)
                lineToRelative(-1.87f, 1.06f)
                curveToRelative(-1.74f, -1.06f, -3.96f, -1.81f, -6.45f, -2.11f)
                close()
            }
        }
        .build()
        return _openid!!
    }

private var _openid: ImageVector? = null
