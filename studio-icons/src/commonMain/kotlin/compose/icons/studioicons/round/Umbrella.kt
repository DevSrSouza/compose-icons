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

public val RoundGroup.Umbrella: ImageVector
    get() {
        if (_umbrella != null) {
            return _umbrella!!
        }
        _umbrella = Builder(name = "Umbrella", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.12f, 6.28f)
                lineTo(14.5f, 6.92f)
                lineTo(13.0f, 5.77f)
                verticalLineTo(3.88f)
                verticalLineTo(3.4f)
                curveToRelative(0.0f, -0.26f, 0.22f, -0.48f, 0.5f, -0.48f)
                curveToRelative(0.23f, 0.0f, 0.43f, 0.16f, 0.49f, 0.36f)
                curveTo(14.1f, 3.7f, 14.49f, 4.0f, 14.94f, 4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.1f, -0.02f, -0.2f, -0.05f, -0.3f)
                curveTo(15.59f, 1.72f, 14.63f, 1.0f, 13.5f, 1.0f)
                curveTo(12.12f, 1.0f, 11.0f, 2.07f, 11.0f, 3.4f)
                verticalLineToRelative(0.48f)
                verticalLineToRelative(1.89f)
                lineTo(9.5f, 6.92f)
                lineTo(6.88f, 6.28f)
                curveTo(6.5f, 6.19f, 6.16f, 6.55f, 6.28f, 6.92f)
                lineToRelative(4.77f, 14.39f)
                curveTo(11.2f, 21.77f, 11.6f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveToRelative(0.8f, -0.23f, 0.95f, -0.69f)
                lineToRelative(4.77f, -14.39f)
                curveTo(17.84f, 6.55f, 17.5f, 6.19f, 17.12f, 6.28f)
                close()
                moveTo(11.0f, 14.8f)
                lineTo(9.03f, 8.86f)
                lineToRelative(0.92f, 0.23f)
                lineToRelative(0.76f, -0.58f)
                lineTo(11.0f, 8.29f)
                verticalLineTo(14.8f)
                close()
                moveTo(13.0f, 14.8f)
                verticalLineTo(8.29f)
                lineToRelative(0.28f, 0.22f)
                lineToRelative(0.76f, 0.58f)
                lineToRelative(0.92f, -0.23f)
                lineTo(13.0f, 14.8f)
                close()
            }
        }
        .build()
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
