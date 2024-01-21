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

public val SolidGroup.PersonDotsFromLine: ImageVector
    get() {
        if (_personDotsFromLine != null) {
            return _personDotsFromLine!!
        }
        _personDotsFromLine = Builder(name = "PersonDotsFromLine", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 176.0f)
                arcTo(88.0f, 88.0f, 0.0f, true, false, 288.0f, 0.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, false, 0.0f, 176.0f)
                close()
                moveTo(78.7f, 372.9f)
                curveToRelative(15.0f, -12.5f, 50.0f, -34.4f, 97.3f, -50.1f)
                lineTo(176.0f, 432.0f)
                lineTo(400.0f, 432.0f)
                lineTo(400.0f, 322.7f)
                curveToRelative(47.3f, 15.8f, 82.3f, 37.7f, 97.3f, 50.1f)
                curveToRelative(20.4f, 17.0f, 50.6f, 14.2f, 67.6f, -6.1f)
                reflectiveCurveToRelative(14.2f, -50.6f, -6.1f, -67.6f)
                curveToRelative(-12.0f, -10.0f, -30.1f, -22.5f, -53.2f, -35.0f)
                curveTo(497.2f, 278.4f, 481.7f, 288.0f, 464.0f, 288.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                curveToRelative(0.0f, -4.3f, 0.6f, -8.4f, 1.6f, -12.4f)
                curveTo(379.1f, 215.9f, 335.3f, 208.0f, 288.0f, 208.0f)
                curveToRelative(-60.2f, 0.0f, -114.9f, 12.9f, -160.0f, 29.9f)
                curveToRelative(0.0f, 0.7f, 0.0f, 1.4f, 0.0f, 2.1f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                curveToRelative(-11.8f, 0.0f, -22.7f, -4.3f, -31.0f, -11.4f)
                curveToRelative(-13.1f, 8.1f, -23.7f, 15.9f, -31.7f, 22.5f)
                curveToRelative(-20.4f, 17.0f, -23.1f, 47.2f, -6.1f, 67.6f)
                reflectiveCurveToRelative(47.2f, 23.1f, 67.6f, 6.1f)
                close()
                moveTo(24.0f, 464.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineTo(552.0f, 512.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineTo(24.0f, 464.0f)
                close()
                moveTo(224.0f, 280.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -48.0f, 0.0f)
                close()
                moveTo(328.0f, 336.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -48.0f)
                close()
                moveTo(96.0f, 240.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -32.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 32.0f, 0.0f)
                close()
                moveTo(464.0f, 256.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 0.0f, -32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 0.0f, 32.0f)
                close()
            }
        }
        .build()
        return _personDotsFromLine!!
    }

private var _personDotsFromLine: ImageVector? = null
