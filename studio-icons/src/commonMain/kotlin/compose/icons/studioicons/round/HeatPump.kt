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

public val RoundGroup.HeatPump: ImageVector
    get() {
        if (_heatPump != null) {
            return _heatPump!!
        }
        _heatPump = Builder(name = "HeatPump", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                close()
                moveTo(12.75f, 7.08f)
                curveToRelative(0.82f, 0.12f, 1.57f, 0.44f, 2.2f, 0.91f)
                lineToRelative(-2.2f, 2.2f)
                verticalLineTo(7.08f)
                close()
                moveTo(11.25f, 7.08f)
                verticalLineToRelative(3.11f)
                lineToRelative(-2.2f, -2.2f)
                curveTo(9.68f, 7.52f, 10.43f, 7.2f, 11.25f, 7.08f)
                close()
                moveTo(7.99f, 9.05f)
                lineToRelative(2.2f, 2.2f)
                horizontalLineTo(7.08f)
                curveTo(7.2f, 10.43f, 7.52f, 9.68f, 7.99f, 9.05f)
                close()
                moveTo(7.08f, 12.75f)
                horizontalLineToRelative(3.11f)
                lineToRelative(-2.2f, 2.2f)
                curveTo(7.52f, 14.32f, 7.2f, 13.57f, 7.08f, 12.75f)
                close()
                moveTo(11.25f, 16.92f)
                curveToRelative(-0.82f, -0.12f, -1.57f, -0.44f, -2.2f, -0.91f)
                lineToRelative(2.2f, -2.2f)
                verticalLineTo(16.92f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                curveTo(13.0f, 12.55f, 12.55f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(12.75f, 16.92f)
                verticalLineToRelative(-3.11f)
                lineToRelative(2.2f, 2.2f)
                curveTo(14.32f, 16.48f, 13.57f, 16.8f, 12.75f, 16.92f)
                close()
                moveTo(16.01f, 14.95f)
                lineToRelative(-2.2f, -2.2f)
                horizontalLineToRelative(3.11f)
                curveTo(16.8f, 13.57f, 16.48f, 14.32f, 16.01f, 14.95f)
                close()
                moveTo(13.81f, 11.25f)
                lineToRelative(2.2f, -2.2f)
                curveToRelative(0.47f, 0.64f, 0.79f, 1.39f, 0.91f, 2.2f)
                horizontalLineTo(13.81f)
                close()
            }
        }
        .build()
        return _heatPump!!
    }

private var _heatPump: ImageVector? = null
