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

public val SimpleIcons.Zelle: ImageVector
    get() {
        if (_zelle != null) {
            return _zelle!!
        }
        _zelle = Builder(name = "Zelle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.559f, 24.0f)
                horizontalLineToRelative(-2.841f)
                arcToRelative(0.483f, 0.483f, 0.0f, false, true, -0.483f, -0.483f)
                verticalLineToRelative(-2.765f)
                horizontalLineTo(5.638f)
                arcToRelative(0.667f, 0.667f, 0.0f, false, true, -0.666f, -0.666f)
                verticalLineToRelative(-2.234f)
                arcToRelative(0.67f, 0.67f, 0.0f, false, true, 0.142f, -0.412f)
                lineToRelative(8.139f, -10.382f)
                horizontalLineToRelative(-7.25f)
                arcToRelative(0.667f, 0.667f, 0.0f, false, true, -0.667f, -0.667f)
                verticalLineTo(3.914f)
                curveToRelative(0.0f, -0.367f, 0.299f, -0.666f, 0.666f, -0.666f)
                horizontalLineToRelative(4.23f)
                verticalLineTo(0.483f)
                curveToRelative(0.0f, -0.266f, 0.217f, -0.483f, 0.483f, -0.483f)
                horizontalLineToRelative(2.841f)
                curveToRelative(0.266f, 0.0f, 0.483f, 0.217f, 0.483f, 0.483f)
                verticalLineToRelative(2.765f)
                horizontalLineToRelative(4.323f)
                curveToRelative(0.367f, 0.0f, 0.666f, 0.299f, 0.666f, 0.666f)
                verticalLineToRelative(2.137f)
                arcToRelative(0.67f, 0.67f, 0.0f, false, true, -0.141f, 0.41f)
                lineToRelative(-8.19f, 10.481f)
                horizontalLineToRelative(7.665f)
                curveToRelative(0.367f, 0.0f, 0.666f, 0.299f, 0.666f, 0.666f)
                verticalLineToRelative(2.477f)
                arcToRelative(0.667f, 0.667f, 0.0f, false, true, -0.666f, 0.667f)
                horizontalLineToRelative(-4.32f)
                verticalLineToRelative(2.765f)
                arcToRelative(0.483f, 0.483f, 0.0f, false, true, -0.483f, 0.483f)
                close()
            }
        }
        .build()
        return _zelle!!
    }

private var _zelle: ImageVector? = null
