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

public val RoundGroup.Hub: ImageVector
    get() {
        if (_hub != null) {
            return _hub!!
        }
        _hub = Builder(name = "Hub", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.4f, 18.2f)
                curveTo(8.78f, 18.7f, 9.0f, 19.32f, 9.0f, 20.0f)
                curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f)
                curveToRelative(0.44f, 0.0f, 0.85f, 0.09f, 1.23f, 0.26f)
                lineToRelative(1.41f, -1.77f)
                curveToRelative(-0.92f, -1.03f, -1.29f, -2.39f, -1.09f, -3.69f)
                lineToRelative(-2.03f, -0.68f)
                curveTo(4.98f, 11.95f, 4.06f, 12.5f, 3.0f, 12.5f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f)
                curveToRelative(0.0f, 0.07f, 0.0f, 0.14f, -0.01f, 0.21f)
                lineToRelative(2.03f, 0.68f)
                curveToRelative(0.64f, -1.21f, 1.82f, -2.09f, 3.22f, -2.32f)
                lineToRelative(0.0f, -2.16f)
                curveTo(9.96f, 5.57f, 9.0f, 4.4f, 9.0f, 3.0f)
                curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f)
                curveToRelative(0.0f, 1.4f, -0.96f, 2.57f, -2.25f, 2.91f)
                verticalLineToRelative(2.16f)
                curveToRelative(1.4f, 0.23f, 2.58f, 1.11f, 3.22f, 2.32f)
                lineToRelative(2.03f, -0.68f)
                curveTo(18.0f, 9.64f, 18.0f, 9.57f, 18.0f, 9.5f)
                curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f)
                curveToRelative(-1.06f, 0.0f, -1.98f, -0.55f, -2.52f, -1.37f)
                lineToRelative(-2.03f, 0.68f)
                curveToRelative(0.2f, 1.29f, -0.16f, 2.65f, -1.09f, 3.69f)
                lineToRelative(1.41f, 1.77f)
                curveTo(17.15f, 17.09f, 17.56f, 17.0f, 18.0f, 17.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f)
                curveToRelative(0.0f, -0.68f, 0.22f, -1.3f, 0.6f, -1.8f)
                lineToRelative(-1.41f, -1.77f)
                curveToRelative(-1.35f, 0.75f, -3.01f, 0.76f, -4.37f, 0.0f)
                lineTo(8.4f, 18.2f)
                close()
            }
        }
        .build()
        return _hub!!
    }

private var _hub: ImageVector? = null
