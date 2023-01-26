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

public val RoundGroup.DataExploration: ImageVector
    get() {
        if (_dataExploration != null) {
            return _dataExploration!!
        }
        _dataExploration = Builder(name = "DataExploration", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f)
                reflectiveCurveTo(2.0f, 6.48f, 2.0f, 12.0f)
                curveToRelative(0.0f, 1.33f, 0.26f, 2.61f, 0.74f, 3.77f)
                lineToRelative(4.61f, -4.62f)
                curveToRelative(0.37f, -0.37f, 0.95f, -0.39f, 1.35f, -0.06f)
                lineToRelative(2.6f, 2.19f)
                lineTo(14.58f, 10.0f)
                horizontalLineTo(14.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-0.58f)
                lineToRelative(-3.94f, 3.93f)
                curveToRelative(-0.37f, 0.37f, -0.96f, 0.39f, -1.35f, 0.05f)
                lineToRelative(-2.59f, -2.19f)
                lineToRelative(-4.4f, 4.4f)
                curveTo(5.52f, 20.26f, 8.56f, 22.0f, 12.0f, 22.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(19.5f, 20.5f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveTo(20.05f, 20.5f, 19.5f, 20.5f)
                close()
            }
        }
        .build()
        return _dataExploration!!
    }

private var _dataExploration: ImageVector? = null
