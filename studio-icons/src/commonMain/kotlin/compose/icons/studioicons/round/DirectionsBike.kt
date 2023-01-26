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

public val RoundGroup.DirectionsBike: ImageVector
    get() {
        if (_directionsBike != null) {
            return _directionsBike!!
        }
        _directionsBike = Builder(name = "DirectionsBike", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 5.5f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(5.0f, 12.0f)
                curveToRelative(-2.8f, 0.0f, -5.0f, 2.2f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.2f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.2f, 5.0f, -5.0f)
                reflectiveCurveToRelative(-2.2f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(5.0f, 20.5f)
                curveToRelative(-1.9f, 0.0f, -3.5f, -1.6f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.6f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.6f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.6f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(10.8f, 10.5f)
                lineToRelative(2.4f, -2.4f)
                lineToRelative(0.8f, 0.8f)
                curveToRelative(1.06f, 1.06f, 2.38f, 1.78f, 3.96f, 2.02f)
                curveToRelative(0.6f, 0.09f, 1.14f, -0.39f, 1.14f, -1.0f)
                curveToRelative(0.0f, -0.49f, -0.37f, -0.91f, -0.85f, -0.99f)
                curveToRelative(-1.11f, -0.18f, -2.02f, -0.71f, -2.75f, -1.43f)
                lineToRelative(-1.9f, -1.9f)
                curveToRelative(-0.5f, -0.4f, -1.0f, -0.6f, -1.6f, -0.6f)
                reflectiveCurveToRelative(-1.1f, 0.2f, -1.4f, 0.6f)
                lineTo(7.8f, 8.4f)
                curveToRelative(-0.4f, 0.4f, -0.6f, 0.9f, -0.6f, 1.4f)
                curveToRelative(0.0f, 0.6f, 0.2f, 1.1f, 0.6f, 1.4f)
                lineTo(11.0f, 14.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-4.4f)
                curveToRelative(0.0f, -0.52f, -0.2f, -1.01f, -0.55f, -1.38f)
                lineTo(10.8f, 10.5f)
                close()
                moveTo(19.0f, 12.0f)
                curveToRelative(-2.8f, 0.0f, -5.0f, 2.2f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.2f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.2f, 5.0f, -5.0f)
                reflectiveCurveToRelative(-2.2f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(19.0f, 20.5f)
                curveToRelative(-1.9f, 0.0f, -3.5f, -1.6f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.6f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.6f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.6f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }
        .build()
        return _directionsBike!!
    }

private var _directionsBike: ImageVector? = null
