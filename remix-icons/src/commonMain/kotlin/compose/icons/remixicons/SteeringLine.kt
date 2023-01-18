package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.SteeringLine: ImageVector
    get() {
        if (_steeringLine != null) {
            return _steeringLine!!
        }
        _steeringLine = Builder(name = "SteeringLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.8f, 14.001f)
                arcToRelative(10.009f, 10.009f, 0.0f, false, true, -8.4f, 7.902f)
                verticalLineToRelative(-2.025f)
                arcTo(8.01f, 8.01f, 0.0f, false, false, 19.748f, 14.0f)
                lineToRelative(2.052f, 0.001f)
                close()
                moveTo(4.252f, 14.001f)
                arcToRelative(8.01f, 8.01f, 0.0f, false, false, 6.247f, 5.858f)
                verticalLineToRelative(2.03f)
                arcTo(10.01f, 10.01f, 0.0f, false, true, 2.2f, 14.0f)
                horizontalLineToRelative(2.052f)
                close()
                moveTo(18.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.995f, 1.85f)
                lineTo(13.0f, 15.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.85f, -1.995f)
                lineTo(9.0f, 13.0f)
                lineTo(6.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(5.185f, 0.0f, 9.449f, 3.947f, 9.95f, 9.0f)
                horizontalLineToRelative(-2.012f)
                arcToRelative(8.001f, 8.001f, 0.0f, false, false, -15.876f, 0.0f)
                lineTo(2.049f, 11.0f)
                curveTo(2.551f, 5.947f, 6.815f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _steeringLine!!
    }

private var _steeringLine: ImageVector? = null
