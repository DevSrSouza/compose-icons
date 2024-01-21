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

public val SimpleIcons.Storyblok: ImageVector
    get() {
        if (_storyblok != null) {
            return _storyblok!!
        }
        _storyblok = Builder(name = "Storyblok", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.953f, 11.462f)
                lineTo(9.088f, 11.462f)
                verticalLineToRelative(2.34f)
                horizontalLineToRelative(4.748f)
                curveToRelative(0.281f, 0.0f, 0.538f, -0.118f, 0.749f, -0.305f)
                curveToRelative(0.187f, -0.187f, 0.304f, -0.468f, 0.304f, -0.819f)
                arcToRelative(1.404f, 1.404f, 0.0f, false, false, -0.257f, -0.842f)
                curveToRelative(-0.188f, -0.234f, -0.398f, -0.374f, -0.679f, -0.374f)
                close()
                moveTo(14.117f, 8.632f)
                curveToRelative(0.21f, -0.14f, 0.304f, -0.445f, 0.304f, -0.843f)
                curveToRelative(0.0f, -0.35f, -0.094f, -0.608f, -0.257f, -0.771f)
                arcToRelative(0.935f, 0.935f, 0.0f, false, false, -0.608f, -0.234f)
                lineTo(9.088f, 6.784f)
                verticalLineToRelative(2.105f)
                horizontalLineToRelative(4.374f)
                curveToRelative(0.234f, 0.0f, 0.468f, -0.117f, 0.655f, -0.257f)
                close()
                moveTo(21.251f, 0.0f)
                lineTo(2.89f, 0.0f)
                curveToRelative(-0.585f, 0.0f, -1.053f, 0.468f, -1.053f, 1.03f)
                verticalLineToRelative(18.385f)
                curveToRelative(0.0f, 0.562f, 0.468f, 0.912f, 1.03f, 0.912f)
                lineTo(5.58f, 20.327f)
                lineTo(5.58f, 24.0f)
                lineToRelative(3.368f, -3.65f)
                horizontalLineToRelative(12.304f)
                curveToRelative(0.562f, 0.0f, 0.913f, -0.35f, 0.913f, -0.935f)
                lineTo(22.165f, 1.053f)
                curveToRelative(0.0f, -0.562f, -0.351f, -1.03f, -0.936f, -1.03f)
                close()
                moveTo(18.164f, 14.9f)
                arcToRelative(2.827f, 2.827f, 0.0f, false, true, -1.006f, 1.03f)
                curveToRelative(-0.445f, 0.28f, -0.936f, 0.538f, -1.497f, 0.655f)
                curveToRelative(-0.562f, 0.14f, -1.17f, 0.257f, -1.801f, 0.257f)
                lineTo(5.579f, 16.842f)
                verticalLineToRelative(-13.1f)
                horizontalLineToRelative(9.403f)
                curveToRelative(0.468f, 0.0f, 0.866f, 0.094f, 1.24f, 0.305f)
                curveToRelative(0.351f, 0.187f, 0.679f, 0.444f, 0.936f, 0.748f)
                curveToRelative(0.524f, 0.64f, 0.806f, 1.443f, 0.795f, 2.27f)
                curveToRelative(0.0f, 0.608f, -0.164f, 1.192f, -0.468f, 1.754f)
                arcToRelative(2.924f, 2.924f, 0.0f, false, true, -1.403f, 1.263f)
                curveToRelative(0.748f, 0.21f, 1.333f, 0.585f, 1.778f, 1.123f)
                curveToRelative(0.42f, 0.561f, 0.631f, 1.286f, 0.631f, 2.199f)
                curveToRelative(0.0f, 0.584f, -0.117f, 1.076f, -0.35f, 1.497f)
                close()
            }
        }
        .build()
        return _storyblok!!
    }

private var _storyblok: ImageVector? = null
