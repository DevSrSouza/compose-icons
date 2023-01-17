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

public val SolidGroup.Pencil: ImageVector
    get() {
        if (_pencil != null) {
            return _pencil!!
        }
        _pencil = Builder(name = "Pencil", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(410.3f, 231.0f)
                lineToRelative(11.3f, -11.3f)
                lineToRelative(-33.9f, -33.9f)
                lineToRelative(-62.1f, -62.1f)
                lineTo(291.7f, 89.8f)
                lineToRelative(-11.3f, 11.3f)
                lineToRelative(-22.6f, 22.6f)
                lineTo(58.6f, 322.9f)
                curveToRelative(-10.4f, 10.4f, -18.0f, 23.3f, -22.2f, 37.4f)
                lineTo(1.0f, 480.7f)
                curveToRelative(-2.5f, 8.4f, -0.2f, 17.5f, 6.1f, 23.7f)
                reflectiveCurveToRelative(15.3f, 8.5f, 23.7f, 6.1f)
                lineToRelative(120.3f, -35.4f)
                curveToRelative(14.1f, -4.2f, 27.0f, -11.8f, 37.4f, -22.2f)
                lineTo(387.7f, 253.7f)
                lineTo(410.3f, 231.0f)
                close()
                moveTo(160.0f, 399.4f)
                lineToRelative(-9.1f, 22.7f)
                curveToRelative(-4.0f, 3.1f, -8.5f, 5.4f, -13.3f, 6.9f)
                lineTo(59.4f, 452.0f)
                lineToRelative(23.0f, -78.1f)
                curveToRelative(1.4f, -4.9f, 3.8f, -9.4f, 6.9f, -13.3f)
                lineToRelative(22.7f, -9.1f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                close()
                moveTo(362.7f, 18.7f)
                lineTo(348.3f, 33.2f)
                lineTo(325.7f, 55.8f)
                lineTo(314.3f, 67.1f)
                lineToRelative(33.9f, 33.9f)
                lineToRelative(62.1f, 62.1f)
                lineToRelative(33.9f, 33.9f)
                lineToRelative(11.3f, -11.3f)
                lineToRelative(22.6f, -22.6f)
                lineToRelative(14.5f, -14.5f)
                curveToRelative(25.0f, -25.0f, 25.0f, -65.5f, 0.0f, -90.5f)
                lineTo(453.3f, 18.7f)
                curveToRelative(-25.0f, -25.0f, -65.5f, -25.0f, -90.5f, 0.0f)
                close()
                moveTo(315.3f, 186.7f)
                lineToRelative(-144.0f, 144.0f)
                curveToRelative(-6.2f, 6.2f, -16.4f, 6.2f, -22.6f, 0.0f)
                reflectiveCurveToRelative(-6.2f, -16.4f, 0.0f, -22.6f)
                lineToRelative(144.0f, -144.0f)
                curveToRelative(6.2f, -6.2f, 16.4f, -6.2f, 22.6f, 0.0f)
                reflectiveCurveToRelative(6.2f, 16.4f, 0.0f, 22.6f)
                close()
            }
        }
        .build()
        return _pencil!!
    }

private var _pencil: ImageVector? = null
