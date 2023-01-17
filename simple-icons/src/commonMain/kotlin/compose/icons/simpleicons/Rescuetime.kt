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

public val SimpleIcons.Rescuetime: ImageVector
    get() {
        if (_rescuetime != null) {
            return _rescuetime!!
        }
        _rescuetime = Builder(name = "Rescuetime", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 7.626f)
                verticalLineToRelative(8.749f)
                curveToRelative(0.0f, 0.597f, -0.485f, 1.092f, -1.091f, 1.092f)
                horizontalLineToRelative(-5.447f)
                verticalLineToRelative(5.452f)
                curveToRelative(0.0f, 0.596f, -0.485f, 1.092f, -1.091f, 1.092f)
                horizontalLineToRelative(-8.742f)
                curveToRelative(-0.596f, 0.0f, -1.091f, -0.486f, -1.091f, -1.092f)
                verticalLineToRelative(-5.452f)
                horizontalLineToRelative(-5.447f)
                curveToRelative(-0.596f, 0.0f, -1.091f, -0.485f, -1.091f, -1.092f)
                verticalLineToRelative(-8.749f)
                curveToRelative(0.0f, -0.597f, 0.485f, -1.092f, 1.091f, -1.092f)
                horizontalLineToRelative(5.447f)
                verticalLineToRelative(-5.452f)
                curveToRelative(0.0f, -0.596f, 0.485f, -1.092f, 1.091f, -1.092f)
                horizontalLineToRelative(8.742f)
                curveToRelative(0.596f, 0.0f, 1.091f, 0.485f, 1.091f, 1.092f)
                verticalLineToRelative(5.452f)
                horizontalLineToRelative(5.447f)
                curveToRelative(0.596f, 0.0f, 1.091f, 0.495f, 1.091f, 1.092f)
                close()
                moveTo(20.675f, 11.965f)
                lineTo(18.483f, 10.316f)
                lineTo(18.816f, 11.358f)
                lineTo(13.925f, 11.014f)
                curveToRelative(0.152f, 0.304f, 0.243f, 0.638f, 0.243f, 0.992f)
                curveToRelative(0.0f, 0.343f, -0.081f, 0.667f, -0.213f, 0.95f)
                lineToRelative(4.871f, -0.364f)
                lineToRelative(-0.323f, 1.022f)
                close()
                moveTo(13.096f, 11.995f)
                lineTo(12.601f, 3.995f)
                lineTo(13.622f, 4.319f)
                lineTo(11.975f, 2.134f)
                lineTo(10.328f, 4.329f)
                lineTo(11.368f, 3.995f)
                lineTo(10.914f, 11.995f)
                curveToRelative(0.0f, 0.597f, 0.485f, 1.093f, 1.091f, 1.093f)
                curveToRelative(0.596f, 0.0f, 1.091f, -0.486f, 1.091f, -1.093f)
                close()
            }
        }
        .build()
        return _rescuetime!!
    }

private var _rescuetime: ImageVector? = null
