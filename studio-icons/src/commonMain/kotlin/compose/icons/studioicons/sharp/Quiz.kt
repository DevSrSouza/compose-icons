package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Quiz: ImageVector
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
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 16.0f)
                lineToRelative(16.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-14.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(13.51f, 10.16f)
                curveToRelative(0.41f, -0.73f, 1.18f, -1.16f, 1.63f, -1.8f)
                curveToRelative(0.48f, -0.68f, 0.21f, -1.94f, -1.14f, -1.94f)
                curveToRelative(-0.88f, 0.0f, -1.32f, 0.67f, -1.5f, 1.23f)
                lineToRelative(-1.37f, -0.57f)
                curveTo(11.51f, 5.96f, 12.52f, 5.0f, 13.99f, 5.0f)
                curveToRelative(1.23f, 0.0f, 2.08f, 0.56f, 2.51f, 1.26f)
                curveToRelative(0.37f, 0.6f, 0.58f, 1.73f, 0.01f, 2.57f)
                curveToRelative(-0.63f, 0.93f, -1.23f, 1.21f, -1.56f, 1.81f)
                curveToRelative(-0.13f, 0.24f, -0.18f, 0.4f, -0.18f, 1.18f)
                horizontalLineToRelative(-1.52f)
                curveTo(13.26f, 11.41f, 13.19f, 10.74f, 13.51f, 10.16f)
                close()
                moveTo(12.95f, 13.95f)
                curveToRelative(0.0f, -0.59f, 0.47f, -1.04f, 1.05f, -1.04f)
                curveToRelative(0.59f, 0.0f, 1.04f, 0.45f, 1.04f, 1.04f)
                curveToRelative(0.0f, 0.58f, -0.44f, 1.05f, -1.04f, 1.05f)
                curveTo(13.42f, 15.0f, 12.95f, 14.53f, 12.95f, 13.95f)
                close()
            }
        }
        .build()
        return _quiz!!
    }

private var _quiz: ImageVector? = null
