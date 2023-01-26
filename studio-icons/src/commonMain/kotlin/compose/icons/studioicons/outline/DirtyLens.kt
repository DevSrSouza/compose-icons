package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.DirtyLens: ImageVector
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
                lineTo(15.0f, 3.0f)
                horizontalLineTo(9.0f)
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
                moveTo(20.0f, 19.0f)
                horizontalLineToRelative(-7.02f)
                curveToRelative(-0.22f, -0.84f, -0.52f, -1.76f, -0.13f, -2.33f)
                curveToRelative(0.81f, -1.12f, 2.67f, 1.77f, 3.81f, -0.09f)
                curveToRelative(0.77f, -1.57f, -1.58f, -1.29f, -1.64f, -2.12f)
                curveToRelative(-0.05f, -0.84f, 3.68f, 0.17f, 3.04f, -1.66f)
                curveToRelative(-0.61f, -1.73f, -2.42f, 0.48f, -2.76f, -0.53f)
                curveToRelative(-0.58f, -1.74f, 4.7f, -1.68f, 2.85f, -4.01f)
                curveToRelative(-1.76f, -2.22f, -2.47f, 2.85f, -4.41f, 2.33f)
                curveToRelative(-1.34f, -0.36f, -1.01f, -2.88f, -2.65f, -2.44f)
                curveToRelative(-1.88f, 0.51f, 1.03f, 2.2f, 0.0f, 2.86f)
                curveToRelative(-0.96f, 0.63f, -1.72f, -0.92f, -2.51f, -1.19f)
                curveToRelative(-0.2f, -0.07f, -0.69f, -0.05f, -0.91f, 0.19f)
                curveToRelative(-0.78f, 0.86f, 0.28f, 1.16f, 0.25f, 1.91f)
                curveToRelative(-0.02f, 0.75f, -1.59f, 0.49f, -1.51f, 1.49f)
                curveToRelative(0.12f, 1.6f, 2.18f, 0.45f, 2.4f, 1.24f)
                curveToRelative(0.55f, 1.98f, -1.89f, 2.15f, -0.5f, 3.27f)
                curveToRelative(1.53f, 0.71f, 1.91f, -1.94f, 2.8f, -1.35f)
                curveToRelative(0.58f, 0.38f, 0.3f, 1.45f, 0.16f, 2.43f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(4.05f)
                lineToRelative(1.83f, -2.0f)
                horizontalLineToRelative(4.24f)
                lineToRelative(1.83f, 2.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.28f, 17.15f)
                curveToRelative(0.0f, 0.48f, 0.39f, 0.86f, 0.86f, 0.86f)
                curveToRelative(0.48f, 0.0f, 0.86f, -0.38f, 0.86f, -0.86f)
                reflectiveCurveToRelative(-0.39f, -0.86f, -0.86f, -0.86f)
                curveTo(17.66f, 16.29f, 17.28f, 16.67f, 17.28f, 17.15f)
                close()
            }
        }
        .build()
        return _dirtyLens!!
    }

private var _dirtyLens: ImageVector? = null
