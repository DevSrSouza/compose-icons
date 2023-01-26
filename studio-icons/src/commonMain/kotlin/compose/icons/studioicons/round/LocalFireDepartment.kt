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

public val RoundGroup.LocalFireDepartment: ImageVector
    get() {
        if (_localFireDepartment != null) {
            return _localFireDepartment!!
        }
        _localFireDepartment = Builder(name = "LocalFireDepartment", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.9f)
                lineToRelative(-2.03f, 2.0f)
                curveToRelative(-0.46f, 0.46f, -0.82f, 1.03f, -0.93f, 1.67f)
                curveTo(8.74f, 18.41f, 10.18f, 20.0f, 12.0f, 20.0f)
                reflectiveCurveToRelative(3.26f, -1.59f, 2.96f, -3.42f)
                curveToRelative(-0.11f, -0.64f, -0.46f, -1.22f, -0.93f, -1.67f)
                lineTo(12.0f, 12.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.56f, 6.55f)
                lineTo(15.56f, 6.55f)
                curveTo(14.38f, 8.02f, 12.0f, 7.19f, 12.0f, 5.3f)
                verticalLineTo(3.77f)
                curveToRelative(0.0f, -0.8f, -0.89f, -1.28f, -1.55f, -0.84f)
                curveTo(8.12f, 4.49f, 4.0f, 7.97f, 4.0f, 13.0f)
                curveToRelative(0.0f, 2.92f, 1.56f, 5.47f, 3.89f, 6.86f)
                curveToRelative(-0.71f, -1.02f, -1.06f, -2.31f, -0.81f, -3.68f)
                curveToRelative(0.19f, -1.04f, 0.75f, -1.98f, 1.51f, -2.72f)
                lineToRelative(2.71f, -2.67f)
                curveToRelative(0.39f, -0.38f, 1.01f, -0.38f, 1.4f, 0.0f)
                lineToRelative(2.73f, 2.69f)
                curveToRelative(0.74f, 0.73f, 1.3f, 1.65f, 1.48f, 2.68f)
                curveToRelative(0.25f, 1.36f, -0.07f, 2.64f, -0.77f, 3.66f)
                curveToRelative(1.89f, -1.15f, 3.29f, -3.06f, 3.71f, -5.3f)
                curveToRelative(0.61f, -3.27f, -0.81f, -6.37f, -3.22f, -8.1f)
                curveTo(16.3f, 6.17f, 15.83f, 6.22f, 15.56f, 6.55f)
                close()
            }
        }
        .build()
        return _localFireDepartment!!
    }

private var _localFireDepartment: ImageVector? = null
