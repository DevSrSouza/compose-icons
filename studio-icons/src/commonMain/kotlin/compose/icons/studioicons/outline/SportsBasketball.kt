package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.SportsBasketball: ImageVector
    get() {
        if (_sportsBasketball != null) {
            return _sportsBasketball!!
        }
        _sportsBasketball = Builder(name = "SportsBasketball", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(5.23f, 7.75f)
                curveTo(6.1f, 8.62f, 6.7f, 9.74f, 6.91f, 11.0f)
                horizontalLineTo(4.07f)
                curveTo(4.22f, 9.82f, 4.63f, 8.72f, 5.23f, 7.75f)
                close()
                moveTo(4.07f, 13.0f)
                horizontalLineToRelative(2.84f)
                curveToRelative(-0.21f, 1.26f, -0.81f, 2.38f, -1.68f, 3.25f)
                curveTo(4.63f, 15.28f, 4.22f, 14.18f, 4.07f, 13.0f)
                close()
                moveTo(11.0f, 19.93f)
                curveToRelative(-1.73f, -0.22f, -3.29f, -1.0f, -4.49f, -2.14f)
                curveToRelative(1.3f, -1.24f, 2.19f, -2.91f, 2.42f, -4.79f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.93f)
                close()
                moveTo(11.0f, 11.0f)
                horizontalLineTo(8.93f)
                curveTo(8.69f, 9.12f, 7.81f, 7.44f, 6.5f, 6.2f)
                curveTo(7.71f, 5.06f, 9.27f, 4.29f, 11.0f, 4.07f)
                verticalLineTo(11.0f)
                close()
                moveTo(19.93f, 11.0f)
                horizontalLineToRelative(-2.84f)
                curveToRelative(0.21f, -1.26f, 0.81f, -2.38f, 1.68f, -3.25f)
                curveTo(19.37f, 8.72f, 19.78f, 9.82f, 19.93f, 11.0f)
                close()
                moveTo(13.0f, 4.07f)
                curveToRelative(1.73f, 0.22f, 3.29f, 0.99f, 4.5f, 2.13f)
                curveToRelative(-1.31f, 1.24f, -2.19f, 2.92f, -2.43f, 4.8f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.07f)
                close()
                moveTo(13.0f, 19.93f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(2.07f)
                curveToRelative(0.24f, 1.88f, 1.12f, 3.55f, 2.42f, 4.79f)
                curveTo(16.29f, 18.93f, 14.73f, 19.71f, 13.0f, 19.93f)
                close()
                moveTo(18.77f, 16.25f)
                curveToRelative(-0.87f, -0.86f, -1.46f, -1.99f, -1.68f, -3.25f)
                horizontalLineToRelative(2.84f)
                curveTo(19.78f, 14.18f, 19.37f, 15.28f, 18.77f, 16.25f)
                close()
            }
        }
        .build()
        return _sportsBasketball!!
    }

private var _sportsBasketball: ImageVector? = null
