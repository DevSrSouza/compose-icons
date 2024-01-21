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

public val SimpleIcons.Zettlr: ImageVector
    get() {
        if (_zettlr != null) {
            return _zettlr!!
        }
        _zettlr = Builder(name = "Zettlr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.46f, 0.188f)
                curveTo(0.335f, 0.57f, 0.023f, 2.534f, 0.022f, 4.295f)
                lineTo(0.02f, 17.325f)
                curveToRelative(0.0f, 1.545f, -0.224f, 3.96f, 0.723f, 5.28f)
                curveToRelative(1.201f, 1.673f, 3.567f, 1.355f, 5.365f, 1.351f)
                lineToRelative(8.31f, 0.03f)
                curveToRelative(1.61f, -0.003f, 5.626f, 0.104f, 7.2f, -0.23f)
                curveToRelative(2.115f, -0.448f, 2.326f, -2.31f, 2.328f, -4.082f)
                lineToRelative(0.01f, -13.634f)
                curveToRelative(0.001f, -1.532f, 0.311f, -3.425f, -0.68f, -4.71f)
                curveTo(22.021f, -0.296f, 19.557f, 0.025f, 17.744f, 0.026f)
                lineTo(13.24f, 0.043f)
                curveToRelative(-1.614f, 0.0f, -9.195f, -0.14f, -10.782f, 0.145f)
                moveToRelative(14.249f, 3.665f)
                curveToRelative(0.0f, 0.528f, 0.185f, 1.466f, -0.037f, 1.947f)
                curveToRelative(-0.11f, 0.239f, -0.49f, 0.384f, -0.703f, 0.518f)
                curveToRelative(-0.496f, 0.315f, -0.961f, 0.676f, -1.418f, 1.044f)
                curveToRelative(-1.477f, 1.185f, -3.034f, 2.818f, -3.428f, 4.74f)
                curveToRelative(-0.182f, 0.895f, -0.164f, 1.988f, 0.59f, 2.626f)
                curveToRelative(1.21f, 1.023f, 3.035f, -0.024f, 4.317f, 0.987f)
                curveToRelative(1.337f, 1.053f, 1.14f, 3.071f, 0.37f, 4.39f)
                curveToRelative(-0.184f, 0.316f, -0.417f, 0.797f, -0.75f, 0.982f)
                curveToRelative(-0.23f, 0.13f, -0.598f, 0.064f, -0.853f, 0.064f)
                horizontalLineToRelative(-1.85f)
                curveToRelative(0.057f, -0.37f, 0.35f, -0.58f, 0.575f, -0.862f)
                curveToRelative(0.374f, -0.47f, 0.673f, -0.984f, 0.668f, -1.6f)
                curveToRelative(-0.01f, -1.157f, -1.127f, -1.17f, -1.983f, -1.17f)
                curveToRelative(-1.518f, 0.0f, -3.296f, -0.216f, -4.073f, -1.724f)
                curveToRelative(-1.337f, -2.595f, 0.33f, -5.731f, 2.105f, -7.633f)
                curveToRelative(0.695f, -0.746f, 1.684f, -1.333f, 2.276f, -2.154f)
                horizontalLineToRelative(-4.07f)
                verticalLineTo(3.853f)
                close()
            }
        }
        .build()
        return _zettlr!!
    }

private var _zettlr: ImageVector? = null
