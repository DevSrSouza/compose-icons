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

public val SolidGroup._7: ImageVector
    get() {
        if (__7 != null) {
            return __7!!
        }
        __7 = Builder(name = "_7", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 64.0f)
                curveTo(0.0f, 46.3f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(288.0f)
                curveToRelative(11.5f, 0.0f, 22.0f, 6.1f, 27.7f, 16.1f)
                reflectiveCurveToRelative(5.7f, 22.2f, -0.1f, 32.1f)
                lineToRelative(-224.0f, 384.0f)
                curveToRelative(-8.9f, 15.3f, -28.5f, 20.4f, -43.8f, 11.5f)
                reflectiveCurveToRelative(-20.4f, -28.5f, -11.5f, -43.8f)
                lineTo(232.3f, 96.0f)
                horizontalLineTo(32.0f)
                curveTo(14.3f, 96.0f, 0.0f, 81.7f, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return __7!!
    }

private var __7: ImageVector? = null
