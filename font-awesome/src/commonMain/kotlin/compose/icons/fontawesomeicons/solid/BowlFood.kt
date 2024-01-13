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

public val SolidGroup.BowlFood: ImageVector
    get() {
        if (_bowlFood != null) {
            return _bowlFood!!
        }
        _bowlFood = Builder(name = "BowlFood", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 192.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                curveToRelative(0.5f, 0.0f, 1.1f, 0.0f, 1.6f, 0.0f)
                curveTo(73.0f, 91.5f, 105.3f, 64.0f, 144.0f, 64.0f)
                curveToRelative(15.0f, 0.0f, 29.0f, 4.1f, 40.9f, 11.2f)
                curveTo(198.2f, 49.6f, 225.1f, 32.0f, 256.0f, 32.0f)
                reflectiveCurveToRelative(57.8f, 17.6f, 71.1f, 43.2f)
                curveTo(339.0f, 68.1f, 353.0f, 64.0f, 368.0f, 64.0f)
                curveToRelative(38.7f, 0.0f, 71.0f, 27.5f, 78.4f, 64.0f)
                curveToRelative(0.5f, 0.0f, 1.1f, 0.0f, 1.6f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                curveToRelative(0.0f, 11.7f, -3.1f, 22.6f, -8.6f, 32.0f)
                lineTo(8.6f, 224.0f)
                curveTo(3.1f, 214.6f, 0.0f, 203.7f, 0.0f, 192.0f)
                close()
                moveTo(0.0f, 283.4f)
                curveTo(0.0f, 268.3f, 12.3f, 256.0f, 27.4f, 256.0f)
                lineTo(484.6f, 256.0f)
                curveToRelative(15.1f, 0.0f, 27.4f, 12.3f, 27.4f, 27.4f)
                curveToRelative(0.0f, 70.5f, -44.4f, 130.7f, -106.7f, 154.1f)
                lineTo(403.5f, 452.0f)
                curveToRelative(-2.0f, 16.0f, -15.6f, 28.0f, -31.8f, 28.0f)
                lineTo(140.2f, 480.0f)
                curveToRelative(-16.1f, 0.0f, -29.8f, -12.0f, -31.8f, -28.0f)
                lineToRelative(-1.8f, -14.4f)
                curveTo(44.4f, 414.1f, 0.0f, 353.9f, 0.0f, 283.4f)
                close()
            }
        }
        .build()
        return _bowlFood!!
    }

private var _bowlFood: ImageVector? = null
