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

public val SimpleIcons.Strapi: ImageVector
    get() {
        if (_strapi != null) {
            return _strapi!!
        }
        _strapi = Builder(name = "Strapi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.684f, 0.0f)
                verticalLineToRelative(8.035f)
                horizontalLineToRelative(7.775f)
                curveToRelative(0.28f, 0.0f, 0.502f, 0.236f, 0.502f, 0.483f)
                verticalLineToRelative(7.802f)
                horizontalLineToRelative(8.025f)
                lineTo(23.986f, 0.502f)
                arcTo(0.502f, 0.502f, 0.0f, false, false, 23.484f, 0.0f)
                close()
                moveTo(7.184f, 0.5f)
                lineTo(0.086f, 7.607f)
                arcToRelative(0.251f, 0.251f, 0.0f, false, false, 0.178f, 0.428f)
                horizontalLineToRelative(6.92f)
                close()
                moveTo(7.684f, 8.535f)
                verticalLineToRelative(7.283f)
                curveToRelative(0.0f, 0.278f, 0.224f, 0.502f, 0.502f, 0.502f)
                horizontalLineToRelative(7.275f)
                lineTo(15.461f, 9.018f)
                curveToRelative(0.0f, -0.278f, -0.224f, -0.482f, -0.502f, -0.483f)
                close()
                moveTo(15.961f, 16.82f)
                verticalLineToRelative(6.928f)
                curveToRelative(0.0f, 0.224f, 0.271f, 0.336f, 0.43f, 0.178f)
                lineToRelative(7.095f, -7.106f)
                close()
            }
        }
        .build()
        return _strapi!!
    }

private var _strapi: ImageVector? = null
