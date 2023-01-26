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

public val BaselineGroup.Toys: ImageVector
    get() {
        if (_toys != null) {
            return _toys!!
        }
        _toys = Builder(name = "Toys", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 14.0f)
                curveToRelative(0.0f, -1.95f, -1.4f, -3.57f, -3.25f, -3.92f)
                lineTo(17.4f, 6.05f)
                curveTo(17.0f, 4.82f, 15.85f, 4.0f, 14.56f, 4.0f)
                horizontalLineTo(9.44f)
                curveTo(8.15f, 4.0f, 7.0f, 4.82f, 6.6f, 6.05f)
                lineTo(5.81f, 8.4f)
                lineTo(4.41f, 7.0f)
                lineToRelative(0.29f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(-2.0f, 2.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineTo(3.0f, 8.41f)
                lineToRelative(1.79f, 1.79f)
                curveTo(3.18f, 10.72f, 2.0f, 12.22f, 2.0f, 14.0f)
                curveToRelative(0.0f, 1.5f, 0.83f, 2.79f, 2.05f, 3.48f)
                curveTo(4.28f, 18.9f, 5.51f, 20.0f, 7.0f, 20.0f)
                curveToRelative(1.3f, 0.0f, 2.4f, -0.84f, 2.82f, -2.0f)
                horizontalLineToRelative(4.37f)
                curveToRelative(0.41f, 1.16f, 1.51f, 2.0f, 2.82f, 2.0f)
                curveToRelative(1.49f, 0.0f, 2.72f, -1.1f, 2.95f, -2.52f)
                curveTo(21.17f, 16.79f, 22.0f, 15.5f, 22.0f, 14.0f)
                close()
                moveTo(7.0f, 18.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveTo(7.55f, 18.0f, 7.0f, 18.0f)
                close()
                moveTo(11.0f, 10.0f)
                horizontalLineTo(7.41f)
                lineTo(7.39f, 9.98f)
                lineToRelative(1.1f, -3.3f)
                curveTo(8.63f, 6.27f, 9.01f, 6.0f, 9.44f, 6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(13.0f, 6.0f)
                horizontalLineToRelative(1.56f)
                curveToRelative(0.43f, 0.0f, 0.81f, 0.27f, 0.95f, 0.68f)
                lineTo(16.61f, 10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(17.0f, 18.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveTo(17.55f, 18.0f, 17.0f, 18.0f)
                close()
            }
        }
        .build()
        return _toys!!
    }

private var _toys: ImageVector? = null