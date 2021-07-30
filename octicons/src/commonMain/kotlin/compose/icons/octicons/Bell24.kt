package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Bell24: ImageVector
    get() {
        if (_bell24 != null) {
            return _bell24!!
        }
        _bell24 = Builder(name = "Bell24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 1.0f)
                curveTo(8.318f, 1.0f, 5.0f, 3.565f, 5.0f, 7.0f)
                verticalLineToRelative(4.539f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -0.546f, 1.803f)
                lineToRelative(-2.2f, 3.299f)
                arcTo(1.518f, 1.518f, 0.0f, false, false, 3.519f, 19.0f)
                horizontalLineTo(8.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 7.0f, 0.0f)
                horizontalLineToRelative(4.982f)
                arcToRelative(1.518f, 1.518f, 0.0f, false, false, 1.263f, -2.36f)
                lineToRelative(-2.2f, -3.298f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 19.0f, 11.539f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -3.435f, -3.319f, -6.0f, -7.0f, -6.0f)
                close()
                moveTo(6.5f, 7.0f)
                curveToRelative(0.0f, -2.364f, 2.383f, -4.5f, 5.5f, -4.5f)
                reflectiveCurveToRelative(5.5f, 2.136f, 5.5f, 4.5f)
                verticalLineToRelative(4.539f)
                curveToRelative(0.0f, 0.938f, 0.278f, 1.854f, 0.798f, 2.635f)
                lineToRelative(2.199f, 3.299f)
                arcToRelative(0.017f, 0.017f, 0.0f, false, true, 0.003f, 0.01f)
                lineToRelative(-0.001f, 0.006f)
                lineToRelative(-0.004f, 0.006f)
                lineToRelative(-0.006f, 0.004f)
                lineToRelative(-0.007f, 0.001f)
                horizontalLineTo(3.518f)
                lineToRelative(-0.007f, -0.001f)
                lineToRelative(-0.006f, -0.004f)
                lineToRelative(-0.004f, -0.006f)
                lineToRelative(-0.001f, -0.007f)
                lineToRelative(0.003f, -0.01f)
                lineToRelative(2.2f, -3.298f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, 0.797f, -2.635f)
                verticalLineTo(7.0f)
                close()
                moveTo(14.0f, 19.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bell24!!
    }

private var _bell24: ImageVector? = null
