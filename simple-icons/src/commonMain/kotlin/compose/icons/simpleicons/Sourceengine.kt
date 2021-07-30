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

public val SimpleIcons.Sourceengine: ImageVector
    get() {
        if (_sourceengine != null) {
            return _sourceengine!!
        }
        _sourceengine = Builder(name = "Sourceengine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.865f, 0.716f)
                horizontalLineToRelative(-0.26f)
                lineTo(7.64f, 0.784f)
                arcToRelative(12.76f, 12.76f, 0.0f, false, false, -7.01f, 1.69f)
                lineToRelative(0.002f, 0.001f)
                arcTo(1.211f, 1.211f, 0.0f, false, false, 1.21f, 4.75f)
                curveToRelative(0.35f, 0.0f, 0.662f, -0.148f, 0.883f, -0.383f)
                arcToRelative(10.321f, 10.321f, 0.0f, false, true, 8.818f, -0.462f)
                curveToRelative(5.275f, 2.165f, 7.805f, 8.22f, 5.64f, 13.495f)
                arcToRelative(10.283f, 10.283f, 0.0f, false, true, -2.495f, 3.613f)
                lineToRelative(0.01f, 0.013f)
                arcToRelative(1.21f, 1.21f, 0.0f, true, false, 1.63f, 1.69f)
                arcToRelative(12.638f, 12.638f, 0.0f, false, false, 3.04f, -4.419f)
                curveToRelative(0.05f, -0.118f, 4.952f, -12.06f, 4.964f, -12.093f)
                arcTo(3.992f, 3.992f, 0.0f, false, false, 21.522f, 0.996f)
                curveToRelative(-0.55f, -0.226f, -1.064f, -0.278f, -1.657f, -0.28f)
                close()
                moveTo(6.067f, 6.851f)
                curveToRelative(-2.635f, 0.0f, -5.342f, 0.807f, -5.342f, 3.941f)
                curveToRelative(0.0f, 2.16f, 1.946f, 2.85f, 3.893f, 3.277f)
                curveToRelative(2.422f, 0.522f, 3.823f, 0.878f, 3.823f, 1.9f)
                curveToRelative(0.0f, 1.187f, -1.235f, 1.567f, -2.208f, 1.567f)
                curveToRelative(-1.33f, 0.0f, -2.564f, -0.594f, -2.588f, -2.066f)
                horizontalLineTo(0.44f)
                curveToRelative(0.143f, 3.252f, 2.92f, 4.32f, 5.77f, 4.32f)
                curveToRelative(2.801f, 0.0f, 5.603f, -1.044f, 5.603f, -4.273f)
                curveToRelative(0.0f, -2.28f, -1.923f, -2.992f, -3.894f, -3.443f)
                curveToRelative(-1.923f, -0.45f, -3.823f, -0.617f, -3.823f, -1.828f)
                curveToRelative(0.0f, -0.997f, 1.116f, -1.14f, 1.877f, -1.14f)
                curveToRelative(1.21f, 0.0f, 2.207f, 0.357f, 2.302f, 1.662f)
                horizontalLineToRelative(3.205f)
                curveToRelative(-0.26f, -3.015f, -2.73f, -3.917f, -5.413f, -3.917f)
                close()
            }
        }
        .build()
        return _sourceengine!!
    }

private var _sourceengine: ImageVector? = null
