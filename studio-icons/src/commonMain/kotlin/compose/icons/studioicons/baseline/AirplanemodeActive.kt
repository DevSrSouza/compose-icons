package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.AirplanemodeActive: ImageVector
    get() {
        if (_airplanemodeActive != null) {
            return _airplanemodeActive!!
        }
        _airplanemodeActive = Builder(name = "AirplanemodeActive", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-8.5f, -5.0f)
                verticalLineTo(3.5f)
                curveTo(13.5f, 2.67f, 12.83f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineTo(9.0f)
                lineTo(2.0f, 14.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(8.5f, -2.5f)
                verticalLineTo(19.0f)
                lineTo(8.0f, 20.5f)
                lineTo(8.0f, 22.0f)
                lineToRelative(4.0f, -1.0f)
                lineToRelative(4.0f, 1.0f)
                lineToRelative(0.0f, -1.5f)
                lineTo(13.5f, 19.0f)
                verticalLineToRelative(-5.5f)
                lineTo(22.0f, 16.0f)
                close()
            }
        }
        .build()
        return _airplanemodeActive!!
    }

private var _airplanemodeActive: ImageVector? = null
