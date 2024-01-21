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

public val SolidGroup.TurnUp: ImageVector
    get() {
        if (_turnUp != null) {
            return _turnUp!!
        }
        _turnUp = Builder(name = "TurnUp", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(350.0f, 177.5f)
                curveToRelative(3.8f, -8.8f, 2.0f, -19.0f, -4.6f, -26.0f)
                lineToRelative(-136.0f, -144.0f)
                curveTo(204.9f, 2.7f, 198.6f, 0.0f, 192.0f, 0.0f)
                reflectiveCurveToRelative(-12.9f, 2.7f, -17.4f, 7.5f)
                lineToRelative(-136.0f, 144.0f)
                curveToRelative(-6.6f, 7.0f, -8.4f, 17.2f, -4.6f, 26.0f)
                reflectiveCurveToRelative(12.5f, 14.5f, 22.0f, 14.5f)
                horizontalLineToRelative(88.0f)
                lineToRelative(0.0f, 192.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(80.0f, 0.0f)
                curveToRelative(70.7f, 0.0f, 128.0f, -57.3f, 128.0f, -128.0f)
                lineToRelative(0.0f, -192.0f)
                horizontalLineToRelative(88.0f)
                curveToRelative(9.6f, 0.0f, 18.2f, -5.7f, 22.0f, -14.5f)
                close()
            }
        }
        .build()
        return _turnUp!!
    }

private var _turnUp: ImageVector? = null
