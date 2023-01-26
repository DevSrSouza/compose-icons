package compose.icons.studioicons.round

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
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Quiz: ImageVector
    get() {
        if (_quiz != null) {
            return _quiz!!
        }
        _quiz = Builder(name = "Quiz", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveTo(2.0f, 6.45f, 2.0f, 7.0f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveTo(17.55f, 20.0f, 17.0f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineTo(8.0f)
                curveTo(6.9f, 2.0f, 6.0f, 2.9f, 6.0f, 4.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f)
                close()
                moveTo(14.01f, 15.0f)
                curveToRelative(-0.59f, 0.0f, -1.05f, -0.47f, -1.05f, -1.05f)
                curveToRelative(0.0f, -0.59f, 0.47f, -1.04f, 1.05f, -1.04f)
                curveToRelative(0.59f, 0.0f, 1.04f, 0.45f, 1.04f, 1.04f)
                curveTo(15.04f, 14.53f, 14.6f, 15.0f, 14.01f, 15.0f)
                close()
                moveTo(16.51f, 8.83f)
                curveToRelative(-0.63f, 0.93f, -1.23f, 1.21f, -1.56f, 1.81f)
                curveToRelative(-0.08f, 0.14f, -0.13f, 0.26f, -0.16f, 0.49f)
                curveToRelative(-0.05f, 0.39f, -0.36f, 0.68f, -0.75f, 0.68f)
                horizontalLineToRelative(-0.03f)
                curveToRelative(-0.44f, 0.0f, -0.79f, -0.38f, -0.75f, -0.82f)
                curveToRelative(0.03f, -0.28f, 0.09f, -0.57f, 0.25f, -0.84f)
                curveToRelative(0.41f, -0.73f, 1.18f, -1.16f, 1.63f, -1.8f)
                curveToRelative(0.48f, -0.68f, 0.21f, -1.94f, -1.14f, -1.94f)
                curveToRelative(-0.61f, 0.0f, -1.01f, 0.32f, -1.26f, 0.7f)
                curveToRelative(-0.19f, 0.29f, -0.57f, 0.39f, -0.89f, 0.25f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.42f, -0.18f, -0.6f, -0.7f, -0.34f, -1.07f)
                curveTo(12.02f, 5.55f, 12.87f, 5.0f, 13.99f, 5.0f)
                curveToRelative(1.23f, 0.0f, 2.08f, 0.56f, 2.51f, 1.26f)
                curveTo(16.87f, 6.87f, 17.08f, 7.99f, 16.51f, 8.83f)
                close()
            }
        }
        .build()
        return _quiz!!
    }

private var _quiz: ImageVector? = null
