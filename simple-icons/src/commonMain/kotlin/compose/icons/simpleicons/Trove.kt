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

public val SimpleIcons.Trove: ImageVector
    get() {
        if (_trove != null) {
            return _trove!!
        }
        _trove = Builder(name = "Trove", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.699f, 12.775f)
                verticalLineToRelative(8.529f)
                curveToRelative(0.0f, 0.55f, -0.54f, 0.945f, -1.058f, 0.735f)
                lineToRelative(-4.911f, -1.946f)
                arcToRelative(0.786f, 0.786f, 0.0f, false, true, -0.488f, -0.735f)
                verticalLineTo(7.882f)
                curveToRelative(0.0f, -0.435f, 0.352f, -0.79f, 0.786f, -0.79f)
                horizontalLineToRelative(4.722f)
                verticalLineToRelative(-2.75f)
                horizontalLineTo(5.277f)
                verticalLineToRelative(2.75f)
                horizontalLineToRelative(4.72f)
                arcToRelative(0.79f, 0.79f, 0.0f, false, true, 0.788f, 0.79f)
                verticalLineToRelative(11.476f)
                arcToRelative(0.786f, 0.786f, 0.0f, false, true, -0.489f, 0.735f)
                lineToRelative(-4.91f, 1.946f)
                arcToRelative(0.778f, 0.778f, 0.0f, false, true, -1.059f, -0.735f)
                verticalLineToRelative(-8.522f)
                horizontalLineTo(0.042f)
                verticalLineToRelative(8.999f)
                reflectiveCurveTo(0.042f, 24.0f, 2.117f, 24.0f)
                horizontalLineToRelative(19.765f)
                curveToRelative(2.076f, 0.0f, 2.076f, -2.219f, 2.076f, -2.219f)
                verticalLineToRelative(-8.992f)
                close()
                moveTo(21.815f, 0.0f)
                horizontalLineTo(2.226f)
                curveTo(0.153f, 0.0f, 0.042f, 2.087f, 0.042f, 2.087f)
                verticalLineToRelative(9.117f)
                horizontalLineTo(4.98f)
                curveToRelative(0.434f, 0.0f, 0.787f, 0.353f, 0.787f, 0.789f)
                verticalLineToRelative(8.214f)
                lineToRelative(3.486f, -1.394f)
                verticalLineTo(8.658f)
                horizontalLineTo(4.56f)
                arcToRelative(0.789f, 0.789f, 0.0f, false, true, -0.787f, -0.79f)
                verticalLineTo(3.566f)
                arcToRelative(0.79f, 0.79f, 0.0f, false, true, 0.787f, -0.79f)
                horizontalLineToRelative(14.882f)
                curveToRelative(0.434f, 0.0f, 0.786f, 0.354f, 0.786f, 0.79f)
                verticalLineToRelative(4.316f)
                arcToRelative(0.777f, 0.777f, 0.0f, false, true, -0.786f, 0.776f)
                horizontalLineToRelative(-4.668f)
                verticalLineToRelative(10.155f)
                lineToRelative(3.487f, 1.394f)
                verticalLineToRelative(-8.214f)
                curveToRelative(0.0f, -0.436f, 0.353f, -0.789f, 0.787f, -0.789f)
                horizontalLineToRelative(4.91f)
                verticalLineTo(2.087f)
                reflectiveCurveTo(23.892f, 0.0f, 21.815f, 0.0f)
                close()
            }
        }
        .build()
        return _trove!!
    }

private var _trove: ImageVector? = null
