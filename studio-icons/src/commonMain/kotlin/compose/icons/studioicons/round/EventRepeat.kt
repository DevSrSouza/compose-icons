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

public val RoundGroup.EventRepeat: ImageVector
    get() {
        if (_eventRepeat != null) {
            return _eventRepeat!!
        }
        _eventRepeat = Builder(name = "EventRepeat", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 12.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveTo(6.0f, 2.45f, 6.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 4.0f, 3.0f, 4.9f, 3.0f, 6.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(15.13f, 20.0f)
                curveToRelative(-0.55f, 0.0f, -0.91f, 0.56f, -0.68f, 1.06f)
                curveTo(15.23f, 22.79f, 16.97f, 24.0f, 19.0f, 24.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                reflectiveCurveToRelative(-2.24f, -5.0f, -5.0f, -5.0f)
                curveToRelative(-1.36f, 0.0f, -2.6f, 0.55f, -3.5f, 1.43f)
                lineToRelative(0.0f, -0.68f)
                curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                horizontalLineToRelative(0.0f)
                curveTo(14.34f, 14.0f, 14.0f, 14.34f, 14.0f, 14.75f)
                verticalLineTo(17.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.25f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                lineToRelative(-0.7f, 0.0f)
                curveToRelative(0.63f, -0.62f, 1.5f, -1.0f, 2.45f, -1.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                curveToRelative(-1.42f, 0.0f, -2.64f, -0.85f, -3.19f, -2.06f)
                curveTo(15.69f, 20.17f, 15.42f, 20.0f, 15.13f, 20.0f)
                close()
            }
        }
        .build()
        return _eventRepeat!!
    }

private var _eventRepeat: ImageVector? = null
