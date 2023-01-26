package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.MicExternalOff: ImageVector
    get() {
        if (_micExternalOff != null) {
            return _micExternalOff!!
        }
        _micExternalOff = Builder(name = "MicExternalOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 5.0f)
                curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f)
                curveTo(6.38f, 2.0f, 5.81f, 2.19f, 5.33f, 2.5f)
                lineToRelative(4.15f, 4.15f)
                curveTo(9.8f, 6.18f, 10.0f, 5.61f, 10.0f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 4.0f)
                lineToRelative(4.0f, 0.0f)
                lineToRelative(0.0f, 11.17f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(0.0f, -15.17f)
                lineToRelative(-8.0f, 0.0f)
                lineToRelative(0.0f, 7.17f)
                lineToRelative(2.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.1f, 2.1f)
                lineTo(0.69f, 3.51f)
                lineTo(5.17f, 8.0f)
                horizontalLineTo(4.0f)
                lineToRelative(1.0f, 10.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.21f, 0.0f, 4.0f, 0.0f, 4.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-5.17f)
                lineToRelative(6.49f, 6.49f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.1f, 2.1f)
                close()
                moveTo(12.0f, 20.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(0.56f, -5.61f)
                lineTo(12.0f, 14.83f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _micExternalOff!!
    }

private var _micExternalOff: ImageVector? = null
