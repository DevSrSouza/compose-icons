package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Sledding: ImageVector
    get() {
        if (_sledding != null) {
            return _sledding!!
        }
        _sledding = Builder(name = "Sledding", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 4.5f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveTo(14.0f, 3.4f, 14.0f, 4.5f)
                close()
                moveTo(22.8f, 20.24f)
                curveToRelative(-0.68f, 2.1f, -2.94f, 3.25f, -5.04f, 2.57f)
                horizontalLineToRelative(0.0f)
                lineTo(1.0f, 17.36f)
                lineToRelative(0.46f, -1.43f)
                lineToRelative(3.93f, 1.28f)
                lineToRelative(0.46f, -1.43f)
                lineTo(1.93f, 14.5f)
                lineToRelative(0.46f, -1.43f)
                lineTo(4.0f, 13.6f)
                verticalLineTo(9.5f)
                lineToRelative(5.47f, -2.35f)
                curveToRelative(0.39f, -0.17f, 0.84f, -0.21f, 1.28f, -0.07f)
                curveToRelative(0.95f, 0.31f, 1.46f, 1.32f, 1.16f, 2.27f)
                lineToRelative(-1.05f, 3.24f)
                lineTo(13.0f, 12.25f)
                curveToRelative(0.89f, -0.15f, 1.76f, 0.32f, 2.14f, 1.14f)
                lineToRelative(2.08f, 4.51f)
                lineToRelative(1.93f, 0.63f)
                lineToRelative(-0.46f, 1.43f)
                lineToRelative(-3.32f, -1.08f)
                lineTo(14.9f, 20.3f)
                lineToRelative(3.32f, 1.08f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(1.31f, 0.43f, 2.72f, -0.29f, 3.15f, -1.61f)
                curveToRelative(0.43f, -1.31f, -0.29f, -2.72f, -1.61f, -3.15f)
                lineToRelative(0.46f, -1.43f)
                curveTo(22.33f, 15.88f, 23.49f, 18.14f, 22.8f, 20.24f)
                close()
                moveTo(6.0f, 14.25f)
                lineToRelative(1.01f, 0.33f)
                curveToRelative(-0.22f, -0.42f, -0.28f, -0.92f, -0.12f, -1.4f)
                lineTo(7.92f, 10.0f)
                lineTo(6.0f, 10.82f)
                verticalLineTo(14.25f)
                close()
                moveTo(13.94f, 18.41f)
                lineToRelative(-6.66f, -2.16f)
                lineToRelative(-0.46f, 1.43f)
                lineToRelative(6.66f, 2.16f)
                lineTo(13.94f, 18.41f)
                close()
                moveTo(14.63f, 17.05f)
                lineToRelative(-1.18f, -2.56f)
                lineToRelative(-3.97f, 0.89f)
                lineTo(14.63f, 17.05f)
                close()
            }
        }
        .build()
        return _sledding!!
    }

private var _sledding: ImageVector? = null
