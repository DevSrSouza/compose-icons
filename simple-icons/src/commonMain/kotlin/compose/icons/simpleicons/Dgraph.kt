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

public val SimpleIcons.Dgraph: ImageVector
    get() {
        if (_dgraph != null) {
            return _dgraph!!
        }
        _dgraph = Builder(name = "Dgraph", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.22f, 4.319f)
                curveToRelative(0.226f, -0.414f, 0.349f, -0.892f, 0.349f, -1.403f)
                arcTo(2.917f, 2.917f, 0.0f, false, false, 15.653f, 0.0f)
                curveToRelative(-1.37f, 0.0f, -2.522f, 0.944f, -2.838f, 2.218f)
                curveToRelative(-0.272f, -0.013f, -0.544f, -0.033f, -0.815f, -0.033f)
                curveToRelative(-5.58f, 0.0f, -10.1f, 4.513f, -10.1f, 10.1f)
                curveToRelative(0.0f, 2.74f, 1.1f, 5.23f, 2.871f, 7.047f)
                arcToRelative(2.916f, 2.916f, 0.0f, false, false, -0.588f, 1.752f)
                arcTo(2.917f, 2.917f, 0.0f, false, false, 7.1f, 24.0f)
                curveToRelative(1.241f, 0.0f, 2.295f, -0.782f, 2.728f, -1.869f)
                arcToRelative(10.092f, 10.092f, 0.0f, false, false, 12.272f, -9.86f)
                arcToRelative(9.982f, 9.982f, 0.0f, false, false, -3.88f, -7.952f)
                close()
                moveTo(15.666f, 4.7f)
                curveToRelative(-0.162f, 0.0f, -0.304f, -0.013f, -0.446f, -0.064f)
                lineToRelative(-1.21f, 3.523f)
                lineToRelative(1.772f, -0.284f)
                lineToRelative(-2.489f, 4.067f)
                lineToRelative(2.075f, -0.511f)
                lineToRelative(-7.002f, 8.34f)
                curveToRelative(0.35f, 0.317f, 0.556f, 0.783f, 0.556f, 1.307f)
                arcToRelative(1.78f, 1.78f, 0.0f, false, true, -1.784f, 1.784f)
                curveToRelative(-0.99f, 0.0f, -1.785f, -0.795f, -1.785f, -1.784f)
                reflectiveCurveToRelative(0.796f, -1.785f, 1.785f, -1.785f)
                curveToRelative(0.226f, 0.0f, 0.446f, 0.045f, 0.653f, 0.13f)
                lineToRelative(1.978f, -4.326f)
                lineToRelative(-1.933f, 0.524f)
                lineToRelative(3.142f, -4.5f)
                lineToRelative(-1.933f, 0.465f)
                lineTo(14.521f, 4.3f)
                curveToRelative(-0.4f, -0.337f, -0.64f, -0.828f, -0.64f, -1.371f)
                curveToRelative(0.0f, -0.99f, 0.796f, -1.785f, 1.785f, -1.785f)
                reflectiveCurveToRelative(1.784f, 0.796f, 1.784f, 1.785f)
                curveToRelative(0.007f, 0.97f, -0.795f, 1.771f, -1.784f, 1.771f)
                close()
            }
        }
        .build()
        return _dgraph!!
    }

private var _dgraph: ImageVector? = null
