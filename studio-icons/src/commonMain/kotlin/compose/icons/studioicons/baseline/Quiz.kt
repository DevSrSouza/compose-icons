package compose.icons.studioicons.baseline

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
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Quiz: ImageVector
    get() {
        if (_quiz != null) {
            return _quiz!!
        }
        _quiz = Builder(name = "Quiz", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
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
                curveToRelative(-0.13f, 0.24f, -0.18f, 0.4f, -0.18f, 1.18f)
                horizontalLineToRelative(-1.52f)
                curveToRelative(0.0f, -0.41f, -0.06f, -1.08f, 0.26f, -1.65f)
                curveToRelative(0.41f, -0.73f, 1.18f, -1.16f, 1.63f, -1.8f)
                curveToRelative(0.48f, -0.68f, 0.21f, -1.94f, -1.14f, -1.94f)
                curveToRelative(-0.88f, 0.0f, -1.32f, 0.67f, -1.5f, 1.23f)
                lineToRelative(-1.37f, -0.57f)
                curveTo(11.51f, 5.96f, 12.52f, 5.0f, 13.99f, 5.0f)
                curveToRelative(1.23f, 0.0f, 2.08f, 0.56f, 2.51f, 1.26f)
                curveTo(16.87f, 6.87f, 17.08f, 7.99f, 16.51f, 8.83f)
                close()
            }
        }
        .build()
        return _quiz!!
    }

private var _quiz: ImageVector? = null
