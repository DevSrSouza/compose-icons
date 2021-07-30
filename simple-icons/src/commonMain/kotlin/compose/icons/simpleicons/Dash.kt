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

public val SimpleIcons.Dash: ImageVector
    get() {
        if (_dash != null) {
            return _dash!!
        }
        _dash = Builder(name = "Dash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.21f, 9.967f)
                curveTo(0.922f, 9.967f, 0.595f, 11.457f, 0.38f, 12.36f)
                curveTo(0.093f, 13.538f, 0.0f, 14.02f, 0.0f, 14.02f)
                horizontalLineToRelative(8.947f)
                curveToRelative(2.29f, 0.0f, 2.617f, -1.492f, 2.832f, -2.394f)
                curveToRelative(0.285f, -1.178f, 0.379f, -1.66f, 0.379f, -1.66f)
                close()
                moveTo(15.72f, 2.26f)
                horizontalLineTo(6.982f)
                lineTo(6.26f, 6.307f)
                lineToRelative(7.884f, 0.01f)
                curveToRelative(3.885f, 0.0f, 5.03f, 1.41f, 4.997f, 3.748f)
                curveToRelative(-0.019f, 1.196f, -0.537f, 3.225f, -0.762f, 3.884f)
                curveToRelative(-0.598f, 1.753f, -1.827f, 3.749f, -6.435f, 3.744f)
                lineToRelative(-7.666f, -0.004f)
                lineToRelative(-0.725f, 4.052f)
                horizontalLineToRelative(8.718f)
                curveToRelative(3.075f, 0.0f, 4.38f, -0.36f, 5.767f, -0.995f)
                curveToRelative(3.071f, -1.426f, 4.9f, -4.455f, 5.633f, -8.41f)
                curveTo(24.76f, 6.448f, 23.403f, 2.26f, 15.72f, 2.26f)
                close()
            }
        }
        .build()
        return _dash!!
    }

private var _dash: ImageVector? = null
