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

public val SharpGroup.OnlinePrediction: ImageVector
    get() {
        if (_onlinePrediction != null) {
            return _onlinePrediction!!
        }
        _onlinePrediction = Builder(name = "OnlinePrediction", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 11.5f)
                curveToRelative(0.0f, 2.0f, -2.5f, 3.5f, -2.5f, 5.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.5f, -2.5f, -3.0f, -2.5f, -5.0f)
                curveTo(8.5f, 9.57f, 10.07f, 8.0f, 12.0f, 8.0f)
                reflectiveCurveTo(15.5f, 9.57f, 15.5f, 11.5f)
                close()
                moveTo(13.0f, 17.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(17.5f)
                close()
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, -2.76f, -1.12f, -5.26f, -2.93f, -7.07f)
                lineToRelative(-1.06f, 1.06f)
                curveTo(19.55f, 7.53f, 20.5f, 9.66f, 20.5f, 12.0f)
                curveToRelative(0.0f, 2.34f, -0.95f, 4.47f, -2.49f, 6.01f)
                lineToRelative(1.06f, 1.06f)
                curveTo(20.88f, 17.26f, 22.0f, 14.76f, 22.0f, 12.0f)
                close()
                moveTo(3.5f, 12.0f)
                curveToRelative(0.0f, -2.34f, 0.95f, -4.47f, 2.49f, -6.01f)
                lineTo(4.93f, 4.93f)
                curveTo(3.12f, 6.74f, 2.0f, 9.24f, 2.0f, 12.0f)
                curveToRelative(0.0f, 2.76f, 1.12f, 5.26f, 2.93f, 7.07f)
                lineToRelative(1.06f, -1.06f)
                curveTo(4.45f, 16.47f, 3.5f, 14.34f, 3.5f, 12.0f)
                close()
                moveTo(17.5f, 12.0f)
                curveToRelative(0.0f, 1.52f, -0.62f, 2.89f, -1.61f, 3.89f)
                lineToRelative(1.06f, 1.06f)
                curveTo(18.22f, 15.68f, 19.0f, 13.93f, 19.0f, 12.0f)
                curveToRelative(0.0f, -1.93f, -0.78f, -3.68f, -2.05f, -4.95f)
                lineToRelative(-1.06f, 1.06f)
                curveTo(16.88f, 9.11f, 17.5f, 10.48f, 17.5f, 12.0f)
                close()
                moveTo(7.05f, 16.95f)
                lineToRelative(1.06f, -1.06f)
                curveToRelative(-1.0f, -1.0f, -1.61f, -2.37f, -1.61f, -3.89f)
                curveToRelative(0.0f, -1.52f, 0.62f, -2.89f, 1.61f, -3.89f)
                lineTo(7.05f, 7.05f)
                curveTo(5.78f, 8.32f, 5.0f, 10.07f, 5.0f, 12.0f)
                curveTo(5.0f, 13.93f, 5.78f, 15.68f, 7.05f, 16.95f)
                close()
            }
        }
        .build()
        return _onlinePrediction!!
    }

private var _onlinePrediction: ImageVector? = null
