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

public val BaselineGroup.Sick: ImageVector
    get() {
        if (_sick != null) {
            return _sick!!
        }
        _sick = Builder(name = "Sick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 9.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                curveToRelative(0.0f, -1.1f, 2.0f, -4.0f, 2.0f, -4.0f)
                reflectiveCurveToRelative(2.0f, 2.9f, 2.0f, 4.0f)
                curveTo(23.0f, 8.1f, 22.1f, 9.0f, 21.0f, 9.0f)
                close()
                moveTo(17.5f, 7.0f)
                curveToRelative(0.0f, -0.73f, 0.41f, -1.71f, 0.92f, -2.66f)
                curveTo(16.68f, 2.88f, 14.44f, 2.0f, 11.99f, 2.0f)
                curveTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.47f, 10.0f, 9.99f, 10.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveToRelative(0.0f, -0.55f, -0.06f, -1.09f, -0.14f, -1.62f)
                curveTo(21.58f, 10.45f, 21.3f, 10.5f, 21.0f, 10.5f)
                curveTo(19.07f, 10.5f, 17.5f, 8.93f, 17.5f, 7.0f)
                close()
                moveTo(15.62f, 7.38f)
                lineToRelative(1.06f, 1.06f)
                lineTo(15.62f, 9.5f)
                lineToRelative(1.06f, 1.06f)
                lineToRelative(-1.06f, 1.06f)
                lineTo(13.5f, 9.5f)
                lineTo(15.62f, 7.38f)
                close()
                moveTo(7.32f, 8.44f)
                lineToRelative(1.06f, -1.06f)
                lineTo(10.5f, 9.5f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-1.06f, -1.06f)
                lineTo(8.38f, 9.5f)
                lineTo(7.32f, 8.44f)
                close()
                moveTo(15.44f, 17.0f)
                curveToRelative(-0.69f, -1.19f, -1.97f, -2.0f, -3.44f, -2.0f)
                reflectiveCurveToRelative(-2.75f, 0.81f, -3.44f, 2.0f)
                horizontalLineTo(6.88f)
                curveToRelative(0.3f, -0.76f, 0.76f, -1.43f, 1.34f, -1.99f)
                lineTo(5.24f, 13.3f)
                curveToRelative(-0.45f, 0.26f, -1.01f, 0.28f, -1.49f, 0.0f)
                curveToRelative(-0.72f, -0.41f, -0.96f, -1.33f, -0.55f, -2.05f)
                curveToRelative(0.41f, -0.72f, 1.33f, -0.96f, 2.05f, -0.55f)
                curveToRelative(0.48f, 0.28f, 0.74f, 0.78f, 0.74f, 1.29f)
                lineToRelative(3.58f, 2.07f)
                curveToRelative(0.73f, -0.36f, 1.55f, -0.56f, 2.43f, -0.56f)
                curveToRelative(2.33f, 0.0f, 4.32f, 1.45f, 5.12f, 3.5f)
                horizontalLineTo(15.44f)
                close()
            }
        }
        .build()
        return _sick!!
    }

private var _sick: ImageVector? = null
