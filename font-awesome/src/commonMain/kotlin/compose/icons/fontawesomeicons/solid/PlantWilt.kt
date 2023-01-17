package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.PlantWilt: ImageVector
    get() {
        if (_plantWilt != null) {
            return _plantWilt!!
        }
        _plantWilt = Builder(name = "PlantWilt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 120.0f)
                curveToRelative(0.0f, -30.9f, 25.1f, -56.0f, 56.0f, -56.0f)
                reflectiveCurveToRelative(56.0f, 25.1f, 56.0f, 56.0f)
                verticalLineToRelative(13.0f)
                curveToRelative(-29.3f, 10.0f, -48.0f, 34.5f, -48.0f, 70.1f)
                curveToRelative(0.0f, 27.9f, 25.3f, 74.8f, 66.0f, 111.6f)
                curveToRelative(3.8f, 3.5f, 8.9f, 5.3f, 14.0f, 5.3f)
                reflectiveCurveToRelative(10.2f, -1.8f, 14.0f, -5.3f)
                curveToRelative(40.7f, -36.8f, 66.0f, -83.7f, 66.0f, -111.6f)
                curveToRelative(0.0f, -35.6f, -18.7f, -60.2f, -48.0f, -70.1f)
                verticalLineTo(120.0f)
                curveTo(464.0f, 53.7f, 410.3f, 0.0f, 344.0f, 0.0f)
                reflectiveCurveTo(224.0f, 53.7f, 224.0f, 120.0f)
                verticalLineToRelative(21.8f)
                curveTo(207.3f, 133.0f, 188.2f, 128.0f, 168.0f, 128.0f)
                curveToRelative(-66.3f, 0.0f, -120.0f, 53.7f, -120.0f, 120.0f)
                verticalLineToRelative(13.0f)
                curveToRelative(-29.3f, 10.0f, -48.0f, 34.5f, -48.0f, 70.1f)
                curveTo(0.0f, 359.0f, 25.3f, 405.9f, 66.0f, 442.7f)
                curveToRelative(3.8f, 3.5f, 8.9f, 5.3f, 14.0f, 5.3f)
                reflectiveCurveToRelative(10.2f, -1.8f, 14.0f, -5.3f)
                curveToRelative(40.7f, -36.8f, 66.0f, -83.7f, 66.0f, -111.6f)
                curveToRelative(0.0f, -35.6f, -18.7f, -60.2f, -48.0f, -70.1f)
                verticalLineTo(248.0f)
                curveToRelative(0.0f, -30.9f, 25.1f, -56.0f, 56.0f, -56.0f)
                reflectiveCurveToRelative(56.0f, 25.1f, 56.0f, 56.0f)
                verticalLineToRelative(32.0f)
                verticalLineTo(480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(280.0f)
                verticalLineTo(248.0f)
                verticalLineTo(120.0f)
                close()
            }
        }
        .build()
        return _plantWilt!!
    }

private var _plantWilt: ImageVector? = null
