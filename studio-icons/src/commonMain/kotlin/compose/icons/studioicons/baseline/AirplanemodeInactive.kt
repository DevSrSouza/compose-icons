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

public val BaselineGroup.AirplanemodeInactive: ImageVector
    get() {
        if (_airplanemodeInactive != null) {
            return _airplanemodeInactive!!
        }
        _airplanemodeInactive = Builder(name = "AirplanemodeInactive", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 7.67f)
                verticalLineTo(3.5f)
                curveTo(10.5f, 2.67f, 11.17f, 2.0f, 12.0f, 2.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineTo(9.0f)
                lineToRelative(8.5f, 5.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(-4.49f, -1.32f)
                lineTo(10.5f, 7.67f)
                close()
                moveTo(19.78f, 22.61f)
                lineToRelative(1.41f, -1.41f)
                lineTo(13.5f, 13.5f)
                lineTo(9.56f, 9.56f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineToRelative(6.38f, 6.38f)
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
                verticalLineToRelative(-2.67f)
                lineTo(19.78f, 22.61f)
                close()
            }
        }
        .build()
        return _airplanemodeInactive!!
    }

private var _airplanemodeInactive: ImageVector? = null
