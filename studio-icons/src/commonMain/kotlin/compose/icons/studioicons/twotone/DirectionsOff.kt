package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.DirectionsOff: ImageVector
    get() {
        if (_directionsOff != null) {
            return _directionsOff!!
        }
        _directionsOff = Builder(name = "DirectionsOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.71f, 11.29f)
                lineToRelative(-9.0f, -9.0f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineTo(8.21f, 5.38f)
                lineToRelative(1.41f, 1.41f)
                lineTo(12.0f, 4.42f)
                lineTo(19.58f, 12.0f)
                lineToRelative(-2.38f, 2.38f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.09f, -3.09f)
                curveTo(22.1f, 12.33f, 22.1f, 11.7f, 21.71f, 11.29f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 7.5f)
                lineToRelative(0.0f, 2.67f)
                lineToRelative(2.17f, 2.17f)
                lineToRelative(1.33f, -1.34f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.39f, 4.22f)
                lineToRelative(3.99f, 3.99f)
                lineToRelative(-3.09f, 3.09f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(9.0f, 9.0f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(3.09f, -3.09f)
                lineToRelative(3.99f, 3.99f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                close()
                moveTo(8.03f, 10.85f)
                curveTo(8.02f, 10.9f, 7.99f, 10.95f, 7.99f, 11.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.18f)
                lineToRelative(4.38f, 4.38f)
                lineTo(12.0f, 19.58f)
                lineTo(4.42f, 12.0f)
                lineToRelative(2.38f, -2.38f)
                lineTo(8.03f, 10.85f)
                close()
            }
        }
        .build()
        return _directionsOff!!
    }

private var _directionsOff: ImageVector? = null
