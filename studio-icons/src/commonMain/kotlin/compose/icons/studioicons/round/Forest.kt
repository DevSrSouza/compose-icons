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

public val RoundGroup.Forest: ImageVector
    get() {
        if (_forest != null) {
            return _forest!!
        }
        _forest = Builder(name = "Forest", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.14f, 12.0f)
                horizontalLineToRelative(-0.06f)
                curveToRelative(0.81f, 0.0f, 1.28f, -0.91f, 0.82f, -1.57f)
                lineTo(9.82f, 3.17f)
                curveToRelative(-0.4f, -0.57f, -1.24f, -0.57f, -1.64f, 0.0f)
                lineTo(3.1f, 10.43f)
                curveTo(2.64f, 11.09f, 3.11f, 12.0f, 3.92f, 12.0f)
                horizontalLineTo(3.86f)
                lineToRelative(-2.87f, 4.46f)
                curveTo(0.56f, 17.12f, 1.04f, 18.0f, 1.83f, 18.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.17f)
                curveToRelative(0.79f, 0.0f, 1.27f, -0.88f, 0.84f, -1.54f)
                lineTo(14.14f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.01f, 16.46f)
                lineTo(20.14f, 12.0f)
                horizontalLineToRelative(-0.06f)
                curveToRelative(0.81f, 0.0f, 1.28f, -0.91f, 0.82f, -1.57f)
                lineToRelative(-5.08f, -7.26f)
                curveToRelative(-0.4f, -0.57f, -1.24f, -0.57f, -1.64f, 0.0f)
                lineToRelative(-1.57f, 2.24f)
                lineToRelative(3.11f, 4.44f)
                curveToRelative(0.43f, 0.61f, 0.48f, 1.41f, 0.14f, 2.07f)
                curveToRelative(-0.08f, 0.16f, -0.18f, 0.3f, -0.3f, 0.43f)
                lineToRelative(2.29f, 3.57f)
                curveToRelative(0.4f, 0.62f, 0.42f, 1.4f, 0.07f, 2.04f)
                curveToRelative(-0.01f, 0.02f, -0.02f, 0.03f, -0.03f, 0.04f)
                horizontalLineToRelative(4.28f)
                curveTo(22.96f, 18.0f, 23.44f, 17.12f, 23.01f, 16.46f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 20.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _forest!!
    }

private var _forest: ImageVector? = null
