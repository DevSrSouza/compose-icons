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

public val SolidGroup.Fish: ImageVector
    get() {
        if (_fish != null) {
            return _fish!!
        }
        _fish = Builder(name = "Fish", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.5f, 141.5f)
                curveTo(219.7f, 108.5f, 272.6f, 80.0f, 336.0f, 80.0f)
                reflectiveCurveToRelative(116.3f, 28.5f, 155.5f, 61.5f)
                curveToRelative(39.1f, 33.0f, 66.9f, 72.4f, 81.0f, 99.8f)
                curveToRelative(4.7f, 9.2f, 4.7f, 20.1f, 0.0f, 29.3f)
                curveToRelative(-14.1f, 27.4f, -41.9f, 66.8f, -81.0f, 99.8f)
                curveTo(452.3f, 403.5f, 399.4f, 432.0f, 336.0f, 432.0f)
                reflectiveCurveToRelative(-116.3f, -28.5f, -155.5f, -61.5f)
                curveToRelative(-16.2f, -13.7f, -30.5f, -28.5f, -42.7f, -43.1f)
                lineTo(48.1f, 379.6f)
                curveToRelative(-12.5f, 7.3f, -28.4f, 5.3f, -38.7f, -4.9f)
                reflectiveCurveTo(-3.0f, 348.7f, 4.2f, 336.1f)
                lineTo(50.0f, 256.0f)
                lineTo(4.2f, 175.9f)
                curveToRelative(-7.2f, -12.6f, -5.0f, -28.4f, 5.3f, -38.6f)
                reflectiveCurveToRelative(26.1f, -12.2f, 38.7f, -4.9f)
                lineToRelative(89.7f, 52.3f)
                curveToRelative(12.2f, -14.6f, 26.5f, -29.4f, 42.7f, -43.1f)
                close()
                moveTo(448.0f, 256.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
            }
        }
        .build()
        return _fish!!
    }

private var _fish: ImageVector? = null
