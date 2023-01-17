package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Question24: ImageVector
    get() {
        if (_question24 != null) {
            return _question24!!
        }
        _question24 = Builder(name = "Question24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.97f, 8.265f)
                arcToRelative(1.45f, 1.45f, 0.0f, false, false, -0.487f, 0.57f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.341f, -0.67f)
                curveToRelative(0.2f, -0.402f, 0.513f, -0.826f, 0.997f, -1.148f)
                curveTo(10.627f, 6.69f, 11.244f, 6.5f, 12.0f, 6.5f)
                curveToRelative(0.658f, 0.0f, 1.369f, 0.195f, 1.934f, 0.619f)
                arcToRelative(2.45f, 2.45f, 0.0f, false, true, 1.004f, 2.006f)
                curveToRelative(0.0f, 1.033f, -0.513f, 1.72f, -1.027f, 2.215f)
                curveToRelative(-0.19f, 0.183f, -0.399f, 0.358f, -0.579f, 0.508f)
                lineToRelative(-0.147f, 0.123f)
                arcToRelative(4.329f, 4.329f, 0.0f, false, false, -0.435f, 0.409f)
                verticalLineToRelative(1.37f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, 0.0f)
                verticalLineToRelative(-1.473f)
                curveToRelative(0.0f, -0.237f, 0.067f, -0.504f, 0.247f, -0.736f)
                curveToRelative(0.22f, -0.28f, 0.486f, -0.517f, 0.718f, -0.714f)
                lineToRelative(0.183f, -0.153f)
                lineToRelative(0.001f, -0.001f)
                curveToRelative(0.172f, -0.143f, 0.324f, -0.27f, 0.47f, -0.412f)
                curveToRelative(0.368f, -0.355f, 0.569f, -0.676f, 0.569f, -1.136f)
                arcToRelative(0.953f, 0.953f, 0.0f, false, false, -0.404f, -0.806f)
                curveTo(12.766f, 8.118f, 12.384f, 8.0f, 12.0f, 8.0f)
                curveToRelative(-0.494f, 0.0f, -0.814f, 0.121f, -1.03f, 0.265f)
                close()
                moveTo(13.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveToRelative(6.075f, 0.0f, 11.0f, 4.925f, 11.0f, 11.0f)
                reflectiveCurveToRelative(-4.925f, 11.0f, -11.0f, 11.0f)
                reflectiveCurveTo(1.0f, 18.075f, 1.0f, 12.0f)
                reflectiveCurveTo(5.925f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(2.5f, 12.0f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 9.5f, 9.5f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 9.5f, -9.5f)
                arcTo(9.5f, 9.5f, 0.0f, false, false, 12.0f, 2.5f)
                arcTo(9.5f, 9.5f, 0.0f, false, false, 2.5f, 12.0f)
                close()
            }
        }
        .build()
        return _question24!!
    }

private var _question24: ImageVector? = null
