package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Houseboat: ImageVector
    get() {
        if (_houseboat != null) {
            return _houseboat!!
        }
        _houseboat = Builder(name = "Houseboat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 17.83f)
                curveToRelative(0.0f, -0.42f, -0.27f, -0.8f, -0.67f, -0.94f)
                curveTo(20.62f, 16.62f, 20.21f, 16.0f, 18.67f, 16.0f)
                curveToRelative(-1.91f, 0.0f, -2.14f, 1.0f, -3.33f, 1.0f)
                curveToRelative(-1.24f, 0.0f, -1.39f, -1.0f, -3.34f, -1.0f)
                reflectiveCurveToRelative(-2.1f, 1.0f, -3.34f, 1.0f)
                curveToRelative(-1.19f, 0.0f, -1.42f, -1.0f, -3.33f, -1.0f)
                curveToRelative(-1.54f, 0.0f, -1.95f, 0.62f, -2.66f, 0.88f)
                curveTo(2.27f, 17.03f, 2.0f, 17.4f, 2.0f, 17.83f)
                curveToRelative(0.0f, 0.7f, 0.69f, 1.19f, 1.35f, 0.95f)
                curveToRelative(0.8f, -0.29f, 1.18f, -0.78f, 2.0f, -0.78f)
                curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f)
                curveToRelative(1.95f, 0.0f, 2.08f, -1.0f, 3.32f, -1.0f)
                reflectiveCurveToRelative(1.37f, 1.0f, 3.32f, 1.0f)
                curveToRelative(1.91f, 0.0f, 2.14f, -1.0f, 3.33f, -1.0f)
                curveToRelative(0.83f, 0.0f, 1.21f, 0.49f, 2.0f, 0.78f)
                curveTo(21.31f, 19.02f, 22.0f, 18.52f, 22.0f, 17.83f)
                close()
                moveTo(18.91f, 9.81f)
                curveToRelative(0.33f, -0.45f, 0.23f, -1.07f, -0.22f, -1.4f)
                lineToRelative(-6.1f, -4.47f)
                curveToRelative(-0.35f, -0.26f, -0.83f, -0.26f, -1.18f, 0.0f)
                lineToRelative(-6.1f, 4.47f)
                curveToRelative(-0.45f, 0.33f, -0.54f, 0.95f, -0.22f, 1.4f)
                curveToRelative(0.33f, 0.45f, 0.95f, 0.54f, 1.4f, 0.22f)
                lineTo(7.0f, 9.65f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.74f)
                curveToRelative(-0.27f, 0.0f, -0.52f, -0.11f, -0.71f, -0.29f)
                lineToRelative(-0.66f, -0.66f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(0.66f, 0.66f)
                curveTo(4.18f, 14.68f, 4.95f, 15.0f, 5.74f, 15.0f)
                horizontalLineToRelative(12.51f)
                curveToRelative(0.8f, 0.0f, 1.56f, -0.32f, 2.12f, -0.88f)
                lineToRelative(0.66f, -0.66f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(-0.66f, 0.66f)
                curveTo(18.78f, 12.89f, 18.52f, 13.0f, 18.26f, 13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.65f)
                lineToRelative(0.51f, 0.37f)
                curveTo(17.96f, 10.35f, 18.58f, 10.25f, 18.91f, 9.81f)
                close()
                moveTo(13.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _houseboat!!
    }

private var _houseboat: ImageVector? = null
