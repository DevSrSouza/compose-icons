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

public val SolidGroup.PersonDigging: ImageVector
    get() {
        if (_personDigging != null) {
            return _personDigging!!
        }
        _personDigging = Builder(name = "PersonDigging", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 64.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
                close()
                moveTo(9.8f, 214.8f)
                curveToRelative(5.1f, -12.2f, 19.1f, -18.0f, 31.4f, -12.9f)
                lineTo(60.7f, 210.0f)
                lineToRelative(22.9f, -38.1f)
                curveTo(99.9f, 144.6f, 129.3f, 128.0f, 161.0f, 128.0f)
                curveToRelative(51.4f, 0.0f, 97.0f, 32.9f, 113.3f, 81.7f)
                lineToRelative(34.6f, 103.7f)
                lineToRelative(79.3f, 33.1f)
                lineToRelative(34.2f, -45.6f)
                curveToRelative(6.4f, -8.5f, 16.6f, -13.3f, 27.2f, -12.8f)
                reflectiveCurveToRelative(20.3f, 6.4f, 25.8f, 15.5f)
                lineToRelative(96.0f, 160.0f)
                curveToRelative(5.9f, 9.9f, 6.1f, 22.2f, 0.4f, 32.2f)
                reflectiveCurveToRelative(-16.3f, 16.2f, -27.8f, 16.2f)
                lineTo(288.0f, 512.0f)
                curveToRelative(-11.1f, 0.0f, -21.4f, -5.7f, -27.2f, -15.2f)
                reflectiveCurveToRelative(-6.4f, -21.2f, -1.4f, -31.1f)
                lineToRelative(16.0f, -32.0f)
                curveToRelative(5.4f, -10.8f, 16.5f, -17.7f, 28.6f, -17.7f)
                horizontalLineToRelative(32.0f)
                lineToRelative(22.5f, -30.0f)
                lineTo(22.8f, 246.2f)
                curveToRelative(-12.2f, -5.1f, -18.0f, -19.1f, -12.9f, -31.4f)
                close()
                moveTo(92.6f, 306.6f)
                lineToRelative(112.0f, 48.0f)
                curveToRelative(11.8f, 5.0f, 19.4f, 16.6f, 19.4f, 29.4f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(160.0f, 405.1f)
                lineToRelative(-60.6f, -26.0f)
                lineToRelative(-37.0f, 111.0f)
                curveToRelative(-5.6f, 16.8f, -23.7f, 25.8f, -40.5f, 20.2f)
                reflectiveCurveTo(-3.9f, 486.6f, 1.6f, 469.9f)
                lineToRelative(48.0f, -144.0f)
                lineToRelative(11.0f, -33.0f)
                lineToRelative(32.0f, 13.7f)
                close()
            }
        }
        .build()
        return _personDigging!!
    }

private var _personDigging: ImageVector? = null
