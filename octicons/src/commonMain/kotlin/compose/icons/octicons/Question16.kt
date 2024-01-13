package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Question16: ImageVector
    get() {
        if (_question16 != null) {
            return _question16!!
        }
        _question16 = Builder(name = "Question16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
                moveTo(8.0f, 1.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, 0.0f, 13.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 0.0f, -13.0f)
                close()
                moveTo(6.92f, 6.085f)
                horizontalLineToRelative(0.001f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, -1.342f, -0.67f)
                curveToRelative(0.169f, -0.339f, 0.436f, -0.701f, 0.849f, -0.977f)
                curveTo(6.845f, 4.16f, 7.369f, 4.0f, 8.0f, 4.0f)
                arcToRelative(2.756f, 2.756f, 0.0f, false, true, 1.637f, 0.525f)
                curveToRelative(0.503f, 0.377f, 0.863f, 0.965f, 0.863f, 1.725f)
                curveToRelative(0.0f, 0.448f, -0.115f, 0.83f, -0.329f, 1.15f)
                curveToRelative(-0.205f, 0.307f, -0.47f, 0.513f, -0.692f, 0.662f)
                curveToRelative(-0.109f, 0.072f, -0.22f, 0.138f, -0.313f, 0.195f)
                lineToRelative(-0.006f, 0.004f)
                arcToRelative(6.24f, 6.24f, 0.0f, false, false, -0.26f, 0.16f)
                arcToRelative(0.952f, 0.952f, 0.0f, false, false, -0.276f, 0.245f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.248f, -0.832f)
                curveToRelative(0.184f, -0.264f, 0.42f, -0.489f, 0.692f, -0.661f)
                curveToRelative(0.103f, -0.067f, 0.207f, -0.132f, 0.313f, -0.195f)
                lineToRelative(0.007f, -0.004f)
                curveToRelative(0.1f, -0.061f, 0.182f, -0.11f, 0.258f, -0.161f)
                arcToRelative(0.969f, 0.969f, 0.0f, false, false, 0.277f, -0.245f)
                curveTo(8.96f, 6.514f, 9.0f, 6.427f, 9.0f, 6.25f)
                arcToRelative(0.612f, 0.612f, 0.0f, false, false, -0.262f, -0.525f)
                arcTo(1.27f, 1.27f, 0.0f, false, false, 8.0f, 5.5f)
                curveToRelative(-0.369f, 0.0f, -0.595f, 0.09f, -0.74f, 0.187f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, false, -0.34f, 0.398f)
                close()
                moveTo(9.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _question16!!
    }

private var _question16: ImageVector? = null
