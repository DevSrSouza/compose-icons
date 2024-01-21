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

public val SimpleIcons.Budibase: ImageVector
    get() {
        if (_budibase != null) {
            return _budibase!!
        }
        _budibase = Builder(name = "Budibase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(24.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(4.0f, 6.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(5.22f)
                curveToRelative(0.59f, -0.634f, 1.326f, -0.95f, 2.21f, -0.95f)
                arcToRelative(3.372f, 3.372f, 0.0f, false, true, 2.565f, 1.13f)
                curveToRelative(0.178f, 0.199f, 0.327f, 0.422f, 0.46f, 0.66f)
                lineTo(11.735f, 6.0f)
                horizontalLineToRelative(2.505f)
                verticalLineToRelative(5.22f)
                curveToRelative(0.59f, -0.634f, 1.324f, -0.95f, 2.21f, -0.95f)
                arcToRelative(3.372f, 3.372f, 0.0f, false, true, 2.566f, 1.13f)
                curveToRelative(0.31f, 0.345f, 0.55f, 0.75f, 0.724f, 1.22f)
                curveToRelative(0.175f, 0.47f, 0.26f, 0.965f, 0.26f, 1.495f)
                curveToRelative(0.0f, 0.54f, -0.09f, 1.045f, -0.27f, 1.52f)
                arcToRelative(3.73f, 3.73f, 0.0f, false, true, -0.755f, 1.234f)
                curveToRelative(-0.32f, 0.35f, -0.7f, 0.625f, -1.14f, 0.83f)
                curveToRelative(-0.434f, 0.2f, -0.905f, 0.301f, -1.415f, 0.301f)
                curveToRelative(-0.92f, 0.0f, -1.65f, -0.345f, -2.186f, -1.035f)
                verticalLineToRelative(0.81f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-1.601f)
                arcToRelative(3.595f, 3.595f, 0.0f, false, true, -1.638f, 1.525f)
                curveToRelative(-0.435f, 0.2f, -0.905f, 0.301f, -1.41f, 0.301f)
                curveToRelative(-0.92f, 0.0f, -1.651f, -0.345f, -2.186f, -1.035f)
                verticalLineToRelative(0.81f)
                lineTo(4.0f, 17.775f)
                close()
                moveTo(8.035f, 12.484f)
                arcToRelative(1.566f, 1.566f, 0.0f, false, false, -1.125f, 0.487f)
                arcToRelative(1.733f, 1.733f, 0.0f, false, false, -0.474f, 1.174f)
                arcToRelative(1.623f, 1.623f, 0.0f, false, false, 0.468f, 1.16f)
                curveToRelative(0.145f, 0.145f, 0.322f, 0.265f, 0.522f, 0.355f)
                curveToRelative(0.2f, 0.09f, 0.409f, 0.135f, 0.629f, 0.135f)
                arcToRelative(1.566f, 1.566f, 0.0f, false, false, 1.125f, -0.484f)
                curveToRelative(0.145f, -0.15f, 0.26f, -0.326f, 0.345f, -0.526f)
                curveToRelative(0.08f, -0.205f, 0.125f, -0.41f, 0.125f, -0.63f)
                arcToRelative(1.675f, 1.675f, 0.0f, false, false, -0.47f, -1.175f)
                curveToRelative(-0.15f, -0.15f, -0.32f, -0.27f, -0.51f, -0.36f)
                arcToRelative(1.491f, 1.491f, 0.0f, false, false, -0.635f, -0.136f)
                close()
                moveTo(15.775f, 12.484f)
                arcToRelative(1.566f, 1.566f, 0.0f, false, false, -1.125f, 0.487f)
                arcToRelative(1.733f, 1.733f, 0.0f, false, false, -0.474f, 1.174f)
                arcToRelative(1.623f, 1.623f, 0.0f, false, false, 0.469f, 1.16f)
                curveToRelative(0.145f, 0.145f, 0.32f, 0.265f, 0.52f, 0.355f)
                curveToRelative(0.2f, 0.09f, 0.41f, 0.135f, 0.63f, 0.135f)
                arcToRelative(1.566f, 1.566f, 0.0f, false, false, 1.125f, -0.484f)
                curveToRelative(0.145f, -0.15f, 0.26f, -0.326f, 0.346f, -0.526f)
                curveToRelative(0.08f, -0.205f, 0.125f, -0.41f, 0.125f, -0.63f)
                arcToRelative(1.675f, 1.675f, 0.0f, false, false, -0.471f, -1.175f)
                curveToRelative(-0.15f, -0.15f, -0.32f, -0.27f, -0.51f, -0.36f)
                arcToRelative(1.491f, 1.491f, 0.0f, false, false, -0.635f, -0.136f)
                close()
            }
        }
        .build()
        return _budibase!!
    }

private var _budibase: ImageVector? = null
