package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BellXFilled: ImageVector
    get() {
        if (_bellXFilled != null) {
            return _bellXFilled!!
        }
        _bellXFilled = Builder(name = "BellXFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.235f, 19.0f)
                curveToRelative(0.865f, 0.0f, 1.322f, 1.024f, 0.745f, 1.668f)
                arcToRelative(3.992f, 3.992f, 0.0f, false, true, -2.98f, 1.332f)
                arcToRelative(3.992f, 3.992f, 0.0f, false, true, -2.98f, -1.332f)
                curveToRelative(-0.552f, -0.616f, -0.158f, -1.579f, 0.634f, -1.661f)
                lineToRelative(0.11f, -0.006f)
                horizontalLineToRelative(4.471f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(1.358f, 0.0f, 2.506f, 0.903f, 2.875f, 2.141f)
                lineToRelative(0.046f, 0.171f)
                lineToRelative(0.008f, 0.043f)
                arcToRelative(8.013f, 8.013f, 0.0f, false, true, 4.024f, 6.069f)
                lineToRelative(0.028f, 0.287f)
                lineToRelative(0.019f, 0.289f)
                verticalLineToRelative(2.931f)
                lineToRelative(0.021f, 0.136f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 1.143f, 1.847f)
                lineToRelative(0.167f, 0.117f)
                lineToRelative(0.162f, 0.099f)
                curveToRelative(0.86f, 0.487f, 0.56f, 1.766f, -0.377f, 1.864f)
                lineToRelative(-0.116f, 0.006f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(-1.028f, 0.0f, -1.387f, -1.364f, -0.493f, -1.87f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 1.472f, -2.063f)
                lineToRelative(0.021f, -0.143f)
                lineToRelative(0.001f, -2.97f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.821f, -6.454f)
                lineToRelative(0.248f, -0.146f)
                lineToRelative(0.01f, -0.043f)
                arcToRelative(3.003f, 3.003f, 0.0f, false, true, 2.562f, -2.29f)
                lineToRelative(0.182f, -0.017f)
                lineToRelative(0.176f, -0.004f)
                close()
                moveTo(10.511f, 8.14f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.218f, 1.567f)
                lineToRelative(1.292f, 1.293f)
                lineToRelative(-1.292f, 1.293f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.497f, 1.32f)
                lineToRelative(1.293f, -1.292f)
                lineToRelative(1.293f, 1.292f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.32f, -1.497f)
                lineToRelative(-1.292f, -1.293f)
                lineToRelative(1.292f, -1.293f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.497f, -1.32f)
                lineToRelative(-1.293f, 1.292f)
                lineToRelative(-1.293f, -1.292f)
                lineToRelative(-0.094f, -0.083f)
                close()
            }
        }
        .build()
        return _bellXFilled!!
    }

private var _bellXFilled: ImageVector? = null
