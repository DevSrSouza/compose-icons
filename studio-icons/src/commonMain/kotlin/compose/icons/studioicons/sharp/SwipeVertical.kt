package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.SwipeVertical: ImageVector
    get() {
        if (_swipeVertical != null) {
            return _swipeVertical!!
        }
        _swipeVertical = Builder(name = "SwipeVertical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 3.5f)
                horizontalLineToRelative(2.02f)
                curveTo(1.13f, 5.82f, 0.0f, 8.78f, 0.0f, 12.0f)
                reflectiveCurveToRelative(1.13f, 6.18f, 3.02f, 8.5f)
                horizontalLineTo(1.0f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineTo(4.5f)
                verticalLineToRelative(2.91f)
                curveToRelative(-1.86f, -2.11f, -3.0f, -4.88f, -3.0f, -7.91f)
                reflectiveCurveToRelative(1.14f, -5.79f, 3.0f, -7.91f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(3.5f)
                close()
                moveTo(21.71f, 11.18f)
                lineToRelative(2.09f, 7.39f)
                lineToRelative(-8.23f, 3.65f)
                lineToRelative(-6.84f, -2.85f)
                lineToRelative(0.61f, -1.62f)
                lineToRelative(3.8f, -0.75f)
                lineTo(8.79f, 7.17f)
                curveToRelative(-0.34f, -0.76f, 0.0f, -1.64f, 0.76f, -1.98f)
                curveToRelative(0.76f, -0.34f, 1.64f, 0.0f, 1.98f, 0.76f)
                lineToRelative(2.43f, 5.49f)
                lineToRelative(1.26f, -0.56f)
                lineTo(21.71f, 11.18f)
                close()
            }
        }
        .build()
        return _swipeVertical!!
    }

private var _swipeVertical: ImageVector? = null
