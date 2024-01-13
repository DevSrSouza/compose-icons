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

public val SolidGroup.Medal: ImageVector
    get() {
        if (_medal != null) {
            return _medal!!
        }
        _medal = Builder(name = "Medal", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.1f, 38.2f)
                curveTo(1.4f, 34.2f, 0.0f, 29.4f, 0.0f, 24.6f)
                curveTo(0.0f, 11.0f, 11.0f, 0.0f, 24.6f, 0.0f)
                lineTo(133.9f, 0.0f)
                curveToRelative(11.2f, 0.0f, 21.7f, 5.9f, 27.4f, 15.5f)
                lineToRelative(68.5f, 114.1f)
                curveToRelative(-48.2f, 6.1f, -91.3f, 28.6f, -123.4f, 61.9f)
                lineTo(4.1f, 38.2f)
                close()
                moveTo(507.8f, 38.2f)
                lineTo(405.6f, 191.5f)
                curveToRelative(-32.1f, -33.3f, -75.2f, -55.8f, -123.4f, -61.9f)
                lineTo(350.7f, 15.5f)
                curveTo(356.5f, 5.9f, 366.9f, 0.0f, 378.1f, 0.0f)
                lineTo(487.4f, 0.0f)
                curveTo(501.0f, 0.0f, 512.0f, 11.0f, 512.0f, 24.6f)
                curveToRelative(0.0f, 4.8f, -1.4f, 9.6f, -4.1f, 13.6f)
                close()
                moveTo(80.0f, 336.0f)
                arcToRelative(176.0f, 176.0f, 0.0f, true, true, 352.0f, 0.0f)
                arcTo(176.0f, 176.0f, 0.0f, true, true, 80.0f, 336.0f)
                close()
                moveTo(264.4f, 241.1f)
                curveToRelative(-3.4f, -7.0f, -13.3f, -7.0f, -16.8f, 0.0f)
                lineToRelative(-22.4f, 45.4f)
                curveToRelative(-1.4f, 2.8f, -4.0f, 4.7f, -7.0f, 5.1f)
                lineTo(168.0f, 298.9f)
                curveToRelative(-7.7f, 1.1f, -10.7f, 10.5f, -5.2f, 16.0f)
                lineToRelative(36.3f, 35.4f)
                curveToRelative(2.2f, 2.2f, 3.2f, 5.2f, 2.7f, 8.3f)
                lineToRelative(-8.6f, 49.9f)
                curveToRelative(-1.3f, 7.6f, 6.7f, 13.5f, 13.6f, 9.9f)
                lineToRelative(44.8f, -23.6f)
                curveToRelative(2.7f, -1.4f, 6.0f, -1.4f, 8.7f, 0.0f)
                lineToRelative(44.8f, 23.6f)
                curveToRelative(6.9f, 3.6f, 14.9f, -2.2f, 13.6f, -9.9f)
                lineToRelative(-8.6f, -49.9f)
                curveToRelative(-0.5f, -3.0f, 0.5f, -6.1f, 2.7f, -8.3f)
                lineToRelative(36.3f, -35.4f)
                curveToRelative(5.6f, -5.4f, 2.5f, -14.8f, -5.2f, -16.0f)
                lineToRelative(-50.1f, -7.3f)
                curveToRelative(-3.0f, -0.4f, -5.7f, -2.4f, -7.0f, -5.1f)
                lineToRelative(-22.4f, -45.4f)
                close()
            }
        }
        .build()
        return _medal!!
    }

private var _medal: ImageVector? = null
