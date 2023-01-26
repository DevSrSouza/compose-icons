package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.DirtyLens: ImageVector
    get() {
        if (_dirtyLens != null) {
            return _dirtyLens!!
        }
        _dirtyLens = Builder(name = "DirtyLens", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                horizontalLineToRelative(-3.17f)
                lineToRelative(-1.24f, -1.35f)
                curveTo(15.22f, 3.24f, 14.68f, 3.0f, 14.12f, 3.0f)
                horizontalLineTo(9.88f)
                curveToRelative(-0.56f, 0.0f, -1.1f, 0.24f, -1.48f, 0.65f)
                lineTo(7.17f, 5.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 5.0f, 2.0f, 5.9f, 2.0f, 7.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(7.0f)
                curveTo(22.0f, 5.9f, 21.1f, 5.0f, 20.0f, 5.0f)
                close()
                moveTo(16.66f, 16.58f)
                curveToRelative(-1.14f, 1.86f, -3.0f, -1.03f, -3.81f, 0.09f)
                curveToRelative(-0.39f, 0.57f, -0.09f, 1.49f, 0.13f, 2.33f)
                curveToRelative(0.0f, 0.47f, -0.38f, 0.85f, -0.85f, 0.85f)
                curveToRelative(-0.47f, 0.0f, -0.86f, -0.38f, -0.86f, -0.85f)
                curveToRelative(0.14f, -0.98f, 0.42f, -2.05f, -0.16f, -2.43f)
                curveToRelative(-0.89f, -0.59f, -1.27f, 2.06f, -2.8f, 1.35f)
                curveToRelative(-1.39f, -1.12f, 1.05f, -1.29f, 0.5f, -3.27f)
                curveToRelative(-0.22f, -0.79f, -2.28f, 0.36f, -2.4f, -1.24f)
                curveToRelative(-0.08f, -1.0f, 1.49f, -0.74f, 1.51f, -1.49f)
                curveToRelative(0.03f, -0.75f, -1.03f, -1.05f, -0.25f, -1.91f)
                curveToRelative(0.22f, -0.24f, 0.71f, -0.26f, 0.91f, -0.19f)
                curveToRelative(0.79f, 0.27f, 1.55f, 1.82f, 2.51f, 1.19f)
                curveToRelative(1.03f, -0.66f, -1.88f, -2.35f, 0.0f, -2.86f)
                curveToRelative(1.64f, -0.44f, 1.31f, 2.08f, 2.65f, 2.44f)
                curveToRelative(1.94f, 0.52f, 2.65f, -4.55f, 4.41f, -2.33f)
                curveToRelative(1.85f, 2.33f, -3.43f, 2.27f, -2.85f, 4.01f)
                curveToRelative(0.34f, 1.01f, 2.15f, -1.2f, 2.76f, 0.53f)
                curveToRelative(0.64f, 1.83f, -3.09f, 0.82f, -3.04f, 1.66f)
                curveTo(15.08f, 15.29f, 17.43f, 15.01f, 16.66f, 16.58f)
                close()
                moveTo(18.14f, 18.01f)
                curveToRelative(-0.47f, 0.0f, -0.86f, -0.38f, -0.86f, -0.86f)
                reflectiveCurveToRelative(0.38f, -0.86f, 0.86f, -0.86f)
                curveToRelative(0.47f, 0.0f, 0.86f, 0.38f, 0.86f, 0.86f)
                reflectiveCurveTo(18.62f, 18.01f, 18.14f, 18.01f)
                close()
            }
        }
        .build()
        return _dirtyLens!!
    }

private var _dirtyLens: ImageVector? = null
