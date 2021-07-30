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

public val SimpleIcons.Express: ImageVector
    get() {
        if (_express != null) {
            return _express!!
        }
        _express = Builder(name = "Express", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 18.588f)
                arcToRelative(1.529f, 1.529f, 0.0f, false, true, -1.895f, -0.72f)
                lineToRelative(-3.45f, -4.771f)
                lineToRelative(-0.5f, -0.667f)
                lineToRelative(-4.003f, 5.444f)
                arcToRelative(1.466f, 1.466f, 0.0f, false, true, -1.802f, 0.708f)
                lineToRelative(5.158f, -6.92f)
                lineToRelative(-4.798f, -6.251f)
                arcToRelative(1.595f, 1.595f, 0.0f, false, true, 1.9f, 0.666f)
                lineToRelative(3.576f, 4.83f)
                lineToRelative(3.596f, -4.81f)
                arcToRelative(1.435f, 1.435f, 0.0f, false, true, 1.788f, -0.668f)
                lineTo(21.708f, 7.9f)
                lineToRelative(-2.522f, 3.283f)
                arcToRelative(0.666f, 0.666f, 0.0f, false, false, 0.0f, 0.994f)
                lineToRelative(4.804f, 6.412f)
                close()
                moveTo(0.002f, 11.576f)
                lineToRelative(0.42f, -2.075f)
                curveToRelative(1.154f, -4.103f, 5.858f, -5.81f, 9.094f, -3.27f)
                curveToRelative(1.895f, 1.489f, 2.368f, 3.597f, 2.275f, 5.973f)
                lineTo(1.116f, 12.204f)
                curveTo(0.943f, 16.447f, 4.005f, 19.009f, 7.92f, 17.7f)
                arcToRelative(4.078f, 4.078f, 0.0f, false, false, 2.582f, -2.876f)
                curveToRelative(0.207f, -0.666f, 0.548f, -0.78f, 1.174f, -0.588f)
                arcToRelative(5.417f, 5.417f, 0.0f, false, true, -2.589f, 3.957f)
                arcToRelative(6.272f, 6.272f, 0.0f, false, true, -7.306f, -0.933f)
                arcToRelative(6.575f, 6.575f, 0.0f, false, true, -1.64f, -3.858f)
                curveToRelative(0.0f, -0.235f, -0.08f, -0.455f, -0.134f, -0.666f)
                arcTo(88.33f, 88.33f, 0.0f, false, true, 0.0f, 11.577f)
                close()
                moveTo(1.129f, 11.29f)
                horizontalLineToRelative(9.654f)
                curveToRelative(-0.06f, -3.076f, -2.001f, -5.258f, -4.59f, -5.278f)
                curveToRelative(-2.882f, -0.04f, -4.944f, 2.094f, -5.071f, 5.264f)
                close()
            }
        }
        .build()
        return _express!!
    }

private var _express: ImageVector? = null
