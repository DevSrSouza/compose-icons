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

public val SolidGroup.WeightHanging: ImageVector
    get() {
        if (_weightHanging != null) {
            return _weightHanging!!
        }
        _weightHanging = Builder(name = "WeightHanging", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 96.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(346.5f, 128.0f)
                curveToRelative(3.5f, -10.0f, 5.5f, -20.8f, 5.5f, -32.0f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                reflectiveCurveToRelative(-96.0f, 43.0f, -96.0f, 96.0f)
                curveToRelative(0.0f, 11.2f, 1.9f, 22.0f, 5.5f, 32.0f)
                lineTo(120.0f, 128.0f)
                curveToRelative(-22.0f, 0.0f, -41.2f, 15.0f, -46.6f, 36.4f)
                lineToRelative(-72.0f, 288.0f)
                curveToRelative(-3.6f, 14.3f, -0.4f, 29.5f, 8.7f, 41.2f)
                reflectiveCurveTo(33.2f, 512.0f, 48.0f, 512.0f)
                lineTo(464.0f, 512.0f)
                curveToRelative(14.8f, 0.0f, 28.7f, -6.8f, 37.8f, -18.5f)
                reflectiveCurveToRelative(12.3f, -26.8f, 8.7f, -41.2f)
                lineToRelative(-72.0f, -288.0f)
                curveTo(433.2f, 143.0f, 414.0f, 128.0f, 392.0f, 128.0f)
                lineTo(346.5f, 128.0f)
                close()
            }
        }
        .build()
        return _weightHanging!!
    }

private var _weightHanging: ImageVector? = null
