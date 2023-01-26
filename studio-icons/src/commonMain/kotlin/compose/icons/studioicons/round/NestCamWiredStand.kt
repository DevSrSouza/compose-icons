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

public val RoundGroup.NestCamWiredStand: ImageVector
    get() {
        if (_nestCamWiredStand != null) {
            return _nestCamWiredStand!!
        }
        _nestCamWiredStand = Builder(name = "NestCamWiredStand", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.83f, 1.01f)
                lineToRelative(-4.11f, 0.42f)
                curveTo(8.47f, 1.75f, 6.0f, 4.48f, 6.0f, 7.75f)
                reflectiveCurveToRelative(2.47f, 6.0f, 5.72f, 6.33f)
                lineToRelative(1.9f, 0.19f)
                lineToRelative(-0.56f, 0.85f)
                curveTo(12.71f, 15.04f, 12.36f, 15.0f, 12.0f, 15.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.67f, -0.83f, -3.15f, -2.09f, -4.06f)
                lineToRelative(0.97f, -1.45f)
                curveTo(17.02f, 14.56f, 18.0f, 13.66f, 18.0f, 12.5f)
                verticalLineTo(3.0f)
                curveTo(18.0f, 1.83f, 17.0f, 0.91f, 15.83f, 1.01f)
                close()
            }
        }
        .build()
        return _nestCamWiredStand!!
    }

private var _nestCamWiredStand: ImageVector? = null
