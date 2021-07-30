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

public val SimpleIcons.Genius: ImageVector
    get() {
        if (_genius != null) {
            return _genius!!
        }
        _genius = Builder(name = "Genius", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 6.827f)
                curveToRelative(0.0f, 2.164f, 0.79f, 4.133f, 2.167f, 5.51f)
                curveToRelative(0.393f, 0.393f, 0.786f, 0.59f, 1.18f, 0.983f)
                horizontalLineToRelative(0.195f)
                curveToRelative(0.197f, 0.0f, 0.196f, -0.196f, 0.196f, -0.196f)
                curveToRelative(-0.393f, -0.787f, -0.588f, -1.77f, -0.588f, -2.754f)
                curveToRelative(0.0f, -2.164f, 0.982f, -4.329f, 2.36f, -5.706f)
                lineTo(5.51f, 1.518f)
                curveToRelative(0.0f, -0.197f, -0.197f, -0.196f, -0.197f, -0.196f)
                horizontalLineToRelative(-2.95f)
                curveTo(0.789f, 2.896f, 0.0f, 4.664f, 0.0f, 6.827f)
                close()
                moveTo(2.559f, 19.417f)
                curveToRelative(2.36f, 2.164f, 5.31f, 3.343f, 8.851f, 3.343f)
                curveToRelative(7.082f, 0.0f, 12.59f, -5.702f, 12.59f, -12.586f)
                curveToRelative(0.0f, -3.344f, -1.378f, -6.492f, -3.542f, -8.656f)
                horizontalLineToRelative(-0.196f)
                curveToRelative(0.0f, -0.197f, -0.196f, 0.0f, -0.196f, 0.0f)
                curveToRelative(0.59f, 1.574f, 0.983f, 3.147f, 0.983f, 4.918f)
                curveToRelative(0.0f, 7.278f, -5.902f, 13.373f, -13.377f, 13.373f)
                curveToRelative(-1.77f, 0.0f, -3.344f, -0.393f, -4.917f, -0.983f)
                curveToRelative(-0.197f, 0.0f, -0.196f, 0.199f, -0.196f, 0.395f)
                close()
                moveTo(8.459f, 7.419f)
                curveToRelative(0.0f, 0.59f, 0.395f, 1.178f, 0.788f, 1.571f)
                horizontalLineToRelative(0.392f)
                curveToRelative(3.54f, 1.18f, 4.722f, -0.193f, 4.722f, -1.767f)
                lineTo(14.361f, 5.056f)
                curveToRelative(0.0f, -0.196f, 0.196f, -0.196f, 0.196f, -0.196f)
                horizontalLineToRelative(0.787f)
                curveToRelative(0.197f, 0.0f, 0.196f, -0.196f, 0.196f, -0.196f)
                curveToRelative(-0.196f, -1.18f, -0.784f, -2.358f, -1.571f, -3.342f)
                horizontalLineToRelative(-2.363f)
                curveToRelative(0.0f, -0.197f, -0.196f, 0.0f, -0.196f, 0.196f)
                verticalLineToRelative(2.95f)
                curveToRelative(0.0f, 1.574f, -1.18f, 2.754f, -2.754f, 2.951f)
                curveToRelative(0.0f, -0.197f, -0.196f, 0.0f, -0.196f, 0.0f)
                close()
            }
        }
        .build()
        return _genius!!
    }

private var _genius: ImageVector? = null
