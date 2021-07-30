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

public val SimpleIcons.Hackerearth: ImageVector
    get() {
        if (_hackerearth != null) {
            return _hackerearth!!
        }
        _hackerearth = Builder(name = "Hackerearth", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.447f, 20.936f)
                horizontalLineTo(5.553f)
                verticalLineTo(19.66f)
                horizontalLineToRelative(12.894f)
                close()
                moveTo(20.973f, 0.0f)
                horizontalLineTo(9.511f)
                verticalLineToRelative(6.51f)
                horizontalLineToRelative(0.104f)
                curveToRelative(0.986f, -1.276f, 2.206f, -1.4f, 3.538f, -1.306f)
                curveToRelative(1.967f, 0.117f, 3.89f, 1.346f, 4.017f, 5.169f)
                verticalLineToRelative(7.322f)
                curveToRelative(0.0f, 0.089f, -0.05f, 0.177f, -0.138f, 0.177f)
                horizontalLineToRelative(-2.29f)
                curveToRelative(-0.09f, 0.0f, -0.253f, -0.082f, -0.253f, -0.177f)
                verticalLineTo(10.6f)
                curveToRelative(0.0f, -1.783f, -0.58f, -3.115f, -2.341f, -3.115f)
                curveToRelative(-1.282f, 0.0f, -2.637f, 0.892f, -2.637f, 2.77f)
                verticalLineToRelative(7.417f)
                curveToRelative(0.0f, 0.089f, -0.008f, 0.072f, -0.102f, 0.072f)
                horizontalLineToRelative(-2.29f)
                curveToRelative(-0.09f, 0.0f, -0.29f, 0.022f, -0.29f, -0.072f)
                verticalLineTo(0.0f)
                horizontalLineTo(3.178f)
                curveToRelative(-0.843f, 0.0f, -1.581f, 0.673f, -1.581f, 1.515f)
                verticalLineToRelative(20.996f)
                curveToRelative(0.0f, 0.843f, 0.738f, 1.489f, 1.58f, 1.489f)
                horizontalLineToRelative(17.797f)
                curveToRelative(0.843f, 0.0f, 1.431f, -0.646f, 1.431f, -1.489f)
                verticalLineTo(1.515f)
                curveToRelative(0.0f, -0.842f, -0.588f, -1.515f, -1.43f, -1.515f)
            }
        }
        .build()
        return _hackerearth!!
    }

private var _hackerearth: ImageVector? = null
