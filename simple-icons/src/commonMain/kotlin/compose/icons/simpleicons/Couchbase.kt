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

public val SimpleIcons.Couchbase: ImageVector
    get() {
        if (_couchbase != null) {
            return _couchbase!!
        }
        _couchbase = Builder(name = "Couchbase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.111f, 14.104f)
                arcToRelative(1.467f, 1.458f, 0.0f, false, true, -1.235f, 1.503f)
                curveToRelative(-1.422f, 0.244f, -4.385f, 0.398f, -6.875f, 0.398f)
                reflectiveCurveToRelative(-5.454f, -0.15f, -6.877f, -0.398f)
                curveToRelative(-0.814f, -0.14f, -1.235f, -0.787f, -1.235f, -1.503f)
                verticalLineTo(9.417f)
                arcToRelative(1.57f, 1.56f, 0.0f, false, true, 1.235f, -1.505f)
                arcToRelative(15.72f, 15.619f, 0.0f, false, true, 2.156f, -0.14f)
                arcToRelative(0.537f, 0.533f, 0.0f, false, true, 0.523f, 0.543f)
                verticalLineToRelative(3.303f)
                curveToRelative(1.463f, 0.0f, 2.727f, -0.086f, 4.201f, -0.086f)
                curveToRelative(1.474f, 0.0f, 2.727f, 0.086f, 4.196f, 0.086f)
                verticalLineTo(8.342f)
                arcToRelative(0.535f, 0.532f, 0.0f, false, true, 0.494f, -0.569f)
                horizontalLineToRelative(0.027f)
                arcToRelative(15.995f, 15.891f, 0.0f, false, true, 2.156f, 0.14f)
                arcToRelative(1.57f, 1.56f, 0.0f, false, true, 1.234f, 1.504f)
                close()
                moveTo(12.001f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.374f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.628f, 5.373f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.628f, 0.0f, 12.0f, -5.372f, 12.0f, -12.0f)
                curveToRelative(0.0f, -6.626f, -5.373f, -12.0f, -12.0f, -12.0f)
                close()
            }
        }
        .build()
        return _couchbase!!
    }

private var _couchbase: ImageVector? = null
