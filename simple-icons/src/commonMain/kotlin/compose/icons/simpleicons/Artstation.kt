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

public val SimpleIcons.Artstation: ImageVector
    get() {
        if (_artstation != null) {
            return _artstation!!
        }
        _artstation = Builder(name = "Artstation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 17.723f)
                lineToRelative(2.027f, 3.505f)
                horizontalLineToRelative(0.001f)
                arcToRelative(2.424f, 2.424f, 0.0f, false, false, 2.164f, 1.333f)
                horizontalLineToRelative(13.457f)
                lineToRelative(-2.792f, -4.838f)
                lineTo(0.0f, 17.723f)
                close()
                moveTo(24.0f, 17.748f)
                curveToRelative(0.0f, -0.484f, -0.143f, -0.935f, -0.388f, -1.314f)
                lineTo(15.728f, 2.728f)
                arcToRelative(2.424f, 2.424f, 0.0f, false, false, -2.142f, -1.289f)
                lineTo(9.419f, 1.439f)
                lineTo(21.598f, 22.54f)
                lineToRelative(1.92f, -3.325f)
                curveToRelative(0.378f, -0.637f, 0.482f, -0.919f, 0.482f, -1.467f)
                close()
                moveTo(12.871f, 14.286f)
                lineTo(7.428f, 4.858f)
                lineToRelative(-5.444f, 9.428f)
                horizontalLineToRelative(10.887f)
                close()
            }
        }
        .build()
        return _artstation!!
    }

private var _artstation: ImageVector? = null
