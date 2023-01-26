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

public val RoundGroup.FilterListOff: ImageVector
    get() {
        if (_filterListOff != null) {
            return _filterListOff!!
        }
        _filterListOff = Builder(name = "FilterListOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(8.83f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(20.55f, 8.0f, 21.0f, 7.55f, 21.0f, 7.0f)
                close()
                moveTo(18.0f, 12.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.17f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineTo(17.0f)
                curveTo(17.55f, 13.0f, 18.0f, 12.55f, 18.0f, 12.0f)
                close()
                moveTo(13.98f, 16.81f)
                curveTo(13.99f, 16.87f, 14.0f, 16.94f, 14.0f, 17.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.06f, 0.0f, 0.13f, 0.01f, 0.19f, 0.02f)
                lineTo(10.17f, 13.0f)
                horizontalLineTo(7.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.17f)
                lineToRelative(-3.0f, -3.0f)
                horizontalLineTo(4.0f)
                curveTo(3.45f, 8.0f, 3.0f, 7.55f, 3.0f, 7.0f)
                curveToRelative(0.0f, -0.32f, 0.15f, -0.6f, 0.38f, -0.79f)
                lineTo(2.1f, 4.93f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(16.97f, 16.97f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                reflectiveCurveToRelative(-1.02f, 0.39f, -1.41f, 0.0f)
                lineTo(13.98f, 16.81f)
                close()
            }
        }
        .build()
        return _filterListOff!!
    }

private var _filterListOff: ImageVector? = null
