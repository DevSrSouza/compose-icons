package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.HeatPump: ImageVector
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
                moveTo(19.0f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                curveToRelative(3.31f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.69f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveToRelative(-6.0f, 2.69f, -6.0f, 6.0f)
                reflectiveCurveTo(8.69f, 18.0f, 12.0f, 18.0f)
                close()
                moveTo(11.25f, 15.92f)
                curveToRelative(-0.55f, -0.1f, -1.05f, -0.32f, -1.5f, -0.62f)
                lineToRelative(1.5f, -1.5f)
                verticalLineTo(15.92f)
                close()
                moveTo(12.75f, 15.92f)
                verticalLineToRelative(-2.11f)
                lineToRelative(1.5f, 1.5f)
                curveTo(13.8f, 15.61f, 13.3f, 15.82f, 12.75f, 15.92f)
                close()
                moveTo(15.31f, 14.25f)
                lineToRelative(-1.5f, -1.5f)
                horizontalLineToRelative(2.11f)
                curveTo(15.82f, 13.3f, 15.61f, 13.8f, 15.31f, 14.25f)
                close()
                moveTo(15.92f, 11.25f)
                horizontalLineToRelative(-2.11f)
                lineToRelative(1.5f, -1.5f)
                curveTo(15.61f, 10.2f, 15.82f, 10.7f, 15.92f, 11.25f)
                close()
                moveTo(12.75f, 8.08f)
                curveToRelative(0.55f, 0.1f, 1.05f, 0.32f, 1.5f, 0.62f)
                lineToRelative(-1.5f, 1.5f)
                verticalLineTo(8.08f)
                close()
                moveTo(12.0f, 11.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                curveTo(11.0f, 11.45f, 11.45f, 11.0f, 12.0f, 11.0f)
                close()
                moveTo(11.25f, 8.08f)
                verticalLineToRelative(2.11f)
                lineToRelative(-1.5f, -1.5f)
                curveTo(10.2f, 8.39f, 10.7f, 8.18f, 11.25f, 8.08f)
                close()
                moveTo(8.69f, 9.75f)
                lineToRelative(1.5f, 1.5f)
                horizontalLineTo(8.08f)
                curveTo(8.18f, 10.7f, 8.39f, 10.2f, 8.69f, 9.75f)
                close()
                moveTo(10.19f, 12.75f)
                lineToRelative(-1.5f, 1.5f)
                curveToRelative(-0.3f, -0.44f, -0.51f, -0.95f, -0.62f, -1.5f)
                horizontalLineTo(10.19f)
                close()
            }
        }
        .build()
        return _heatPump!!
    }

private var _heatPump: ImageVector? = null
