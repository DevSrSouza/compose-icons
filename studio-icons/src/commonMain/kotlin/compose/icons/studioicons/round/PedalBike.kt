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

public val RoundGroup.PedalBike: ImageVector
    get() {
        if (_pedalBike != null) {
            return _pedalBike!!
        }
        _pedalBike = Builder(name = "PedalBike", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.18f, 10.0f)
                lineToRelative(-1.7f, -4.68f)
                curveTo(16.19f, 4.53f, 15.44f, 4.0f, 14.6f, 4.0f)
                horizontalLineTo(13.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.6f)
                lineToRelative(1.46f, 4.0f)
                horizontalLineToRelative(-4.81f)
                lineToRelative(-0.36f, -1.0f)
                horizontalLineToRelative(0.09f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(8.0f)
                curveTo(7.45f, 7.0f, 7.0f, 7.45f, 7.0f, 8.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.75f)
                lineToRelative(1.82f, 5.0f)
                horizontalLineTo(9.9f)
                curveToRelative(-0.44f, -2.23f, -2.31f, -3.88f, -4.65f, -3.99f)
                curveTo(2.45f, 9.87f, 0.0f, 12.2f, 0.0f, 15.0f)
                curveToRelative(0.0f, 2.8f, 2.2f, 5.0f, 5.0f, 5.0f)
                curveToRelative(2.46f, 0.0f, 4.45f, -1.69f, 4.9f, -4.0f)
                horizontalLineToRelative(4.2f)
                curveToRelative(0.44f, 2.23f, 2.31f, 3.88f, 4.65f, 3.99f)
                curveToRelative(2.8f, 0.13f, 5.25f, -2.19f, 5.25f, -5.0f)
                curveToRelative(0.0f, -2.8f, -2.2f, -5.0f, -5.0f, -5.0f)
                horizontalLineTo(18.18f)
                close()
                moveTo(7.82f, 16.0f)
                curveToRelative(-0.42f, 1.23f, -1.6f, 2.08f, -3.02f, 1.99f)
                curveTo(3.31f, 17.9f, 2.07f, 16.64f, 2.0f, 15.14f)
                curveTo(1.93f, 13.39f, 3.27f, 12.0f, 5.0f, 12.0f)
                curveToRelative(1.33f, 0.0f, 2.42f, 0.83f, 2.82f, 2.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineTo(7.82f)
                close()
                moveTo(14.1f, 14.0f)
                horizontalLineToRelative(-1.4f)
                lineToRelative(-0.73f, -2.0f)
                horizontalLineTo(15.0f)
                curveTo(14.56f, 12.58f, 14.24f, 13.25f, 14.1f, 14.0f)
                close()
                moveTo(18.88f, 18.0f)
                curveToRelative(-1.54f, -0.06f, -2.84f, -1.37f, -2.88f, -2.92f)
                curveToRelative(-0.02f, -0.96f, 0.39f, -1.8f, 1.05f, -2.36f)
                lineToRelative(0.62f, 1.7f)
                curveToRelative(0.19f, 0.52f, 0.76f, 0.79f, 1.28f, 0.6f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.52f, -0.19f, 0.79f, -0.76f, 0.6f, -1.28f)
                lineToRelative(-0.63f, -1.73f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.01f, -0.01f)
                curveToRelative(1.72f, -0.04f, 3.08f, 1.29f, 3.08f, 3.0f)
                curveTo(22.0f, 16.72f, 20.62f, 18.06f, 18.88f, 18.0f)
                close()
            }
        }
        .build()
        return _pedalBike!!
    }

private var _pedalBike: ImageVector? = null
