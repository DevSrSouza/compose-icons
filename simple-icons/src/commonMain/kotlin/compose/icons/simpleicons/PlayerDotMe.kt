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

public val SimpleIcons.Playerdotme: ImageVector
    get() {
        if (_playerdotme != null) {
            return _playerdotme!!
        }
        _playerdotme = Builder(name = "Playerdotme", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.981f, 0.0f)
                arcToRelative(8.957f, 8.957f, 0.0f, false, false, -8.956f, 8.957f)
                verticalLineToRelative(0.363f)
                curveTo(3.283f, 15.828f, 10.082f, 24.0f, 10.082f, 24.0f)
                verticalLineTo(13.205f)
                curveToRelative(-1.638f, -0.747f, -2.756f, -2.369f, -2.756f, -4.253f)
                arcToRelative(4.66f, 4.66f, 0.0f, true, true, 6.152f, 4.416f)
                lineToRelative(-0.033f, 0.01f)
                verticalLineToRelative(4.427f)
                curveToRelative(4.296f, -0.713f, 7.531f, -4.401f, 7.531f, -8.845f)
                arcTo(8.959f, 8.959f, 0.0f, false, false, 12.017f, 0.001f)
                horizontalLineToRelative(-0.038f)
                horizontalLineToRelative(0.002f)
                close()
            }
        }
        .build()
        return _playerdotme!!
    }

private var _playerdotme: ImageVector? = null
