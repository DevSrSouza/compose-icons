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

public val Octicons.Bell24: ImageVector
    get() {
        if (_bell24 != null) {
            return _bell24!!
        }
        _bell24 = Builder(name = "Bell24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveToRelative(3.681f, 0.0f, 7.0f, 2.565f, 7.0f, 6.0f)
                verticalLineToRelative(4.539f)
                curveToRelative(0.0f, 0.642f, 0.189f, 1.269f, 0.545f, 1.803f)
                lineToRelative(2.2f, 3.298f)
                arcTo(1.517f, 1.517f, 0.0f, false, true, 20.482f, 19.0f)
                horizontalLineTo(15.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f)
                horizontalLineTo(3.519f)
                arcToRelative(1.518f, 1.518f, 0.0f, false, true, -1.265f, -2.359f)
                lineToRelative(2.2f, -3.299f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 5.0f, 11.539f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -3.435f, 3.318f, -6.0f, 7.0f, -6.0f)
                close()
                moveTo(6.5f, 7.0f)
                verticalLineToRelative(4.539f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, -0.797f, 2.635f)
                lineToRelative(-2.2f, 3.298f)
                lineToRelative(-0.003f, 0.01f)
                lineToRelative(0.001f, 0.007f)
                lineToRelative(0.004f, 0.006f)
                lineToRelative(0.006f, 0.004f)
                lineToRelative(0.007f, 0.001f)
                horizontalLineToRelative(16.964f)
                lineToRelative(0.007f, -0.001f)
                lineToRelative(0.006f, -0.004f)
                lineToRelative(0.004f, -0.006f)
                lineToRelative(0.001f, -0.006f)
                arcToRelative(0.017f, 0.017f, 0.0f, false, false, -0.003f, -0.01f)
                lineToRelative(-2.199f, -3.299f)
                arcToRelative(4.753f, 4.753f, 0.0f, false, true, -0.798f, -2.635f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -2.364f, -2.383f, -4.5f, -5.5f, -4.5f)
                reflectiveCurveTo(6.5f, 4.636f, 6.5f, 7.0f)
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
