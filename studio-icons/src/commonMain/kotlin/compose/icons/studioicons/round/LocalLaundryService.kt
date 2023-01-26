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

public val RoundGroup.LocalLaundryService: ImageVector
    get() {
        if (_localLaundryService != null) {
            return _localLaundryService!!
        }
        _localLaundryService = Builder(name = "LocalLaundryService", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.64f, 16.36f)
                curveToRelative(1.3f, 1.3f, 3.42f, 1.3f, 4.72f, 0.0f)
                curveToRelative(1.3f, -1.3f, 1.3f, -3.42f, 0.0f, -4.72f)
                lineTo(9.64f, 16.36f)
                close()
                moveTo(18.0f, 2.01f)
                lineTo(6.0f, 2.0f)
                curveTo(4.89f, 2.0f, 4.0f, 2.89f, 4.0f, 4.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                curveTo(20.0f, 2.89f, 19.11f, 2.01f, 18.0f, 2.01f)
                close()
                moveTo(11.0f, 5.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveTo(10.45f, 5.0f, 11.0f, 5.0f)
                close()
                moveTo(8.0f, 5.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveTo(8.55f, 7.0f, 8.0f, 7.0f)
                reflectiveCurveTo(7.0f, 6.55f, 7.0f, 6.0f)
                reflectiveCurveTo(7.45f, 5.0f, 8.0f, 5.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f)
                curveTo(17.0f, 16.76f, 14.76f, 19.0f, 12.0f, 19.0f)
                close()
            }
        }
        .build()
        return _localLaundryService!!
    }

private var _localLaundryService: ImageVector? = null
