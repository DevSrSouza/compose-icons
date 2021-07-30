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

public val SimpleIcons.Knowledgebase: ImageVector
    get() {
        if (_knowledgebase != null) {
            return _knowledgebase!!
        }
        _knowledgebase = Builder(name = "Knowledgebase", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.1f, 5.52f)
                lineTo(20.1f, 1.5f)
                horizontalLineToRelative(-0.18f)
                curveToRelative(-3.36f, 0.15f, -6.15f, 2.31f, -7.83f, 4.02f)
                lineToRelative(-0.09f, 0.09f)
                lineToRelative(-0.09f, -0.09f)
                curveTo(10.2f, 3.81f, 7.44f, 1.65f, 4.08f, 1.5f)
                lineTo(3.9f, 1.5f)
                verticalLineToRelative(4.02f)
                lineTo(0.0f, 5.52f)
                verticalLineToRelative(6.93f)
                curveToRelative(0.0f, 1.68f, 0.06f, 3.36f, 0.18f, 4.74f)
                arcToRelative(5.57f, 5.57f, 0.0f, false, false, 5.19f, 5.1f)
                curveToRelative(2.13f, 0.12f, 4.38f, 0.21f, 6.63f, 0.21f)
                reflectiveCurveToRelative(4.5f, -0.09f, 6.63f, -0.24f)
                arcToRelative(5.57f, 5.57f, 0.0f, false, false, 5.19f, -5.1f)
                curveToRelative(0.12f, -1.38f, 0.18f, -3.06f, 0.18f, -4.74f)
                verticalLineToRelative(-6.9f)
                close()
                moveTo(20.1f, 12.45f)
                curveToRelative(0.0f, 1.59f, -0.06f, 3.15f, -0.18f, 4.41f)
                curveToRelative(-0.09f, 0.81f, -0.75f, 1.47f, -1.56f, 1.5f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, true, -12.72f, 0.0f)
                curveToRelative(-0.81f, -0.03f, -1.5f, -0.69f, -1.56f, -1.5f)
                curveToRelative(-0.12f, -1.26f, -0.18f, -2.85f, -0.18f, -4.41f)
                lineTo(3.9f, 5.52f)
                curveToRelative(2.82f, 0.12f, 5.64f, 3.15f, 6.48f, 4.32f)
                lineTo(12.0f, 12.09f)
                lineToRelative(1.62f, -2.25f)
                curveToRelative(0.84f, -1.2f, 3.66f, -4.2f, 6.48f, -4.32f)
                close()
            }
        }
        .build()
        return _knowledgebase!!
    }

private var _knowledgebase: ImageVector? = null
