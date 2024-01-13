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

public val SolidGroup.Soap: ImageVector
    get() {
        if (_soap != null) {
            return _soap!!
        }
        _soap = Builder(name = "Soap", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, -96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, 96.0f)
                close()
                moveTo(320.0f, 256.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 0.0f, -128.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 0.0f, 128.0f)
                close()
                moveTo(416.0f, 32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
                moveTo(416.0f, 192.0f)
                curveToRelative(0.0f, 27.6f, -11.7f, 52.5f, -30.4f, 70.1f)
                curveTo(422.1f, 275.7f, 448.0f, 310.8f, 448.0f, 352.0f)
                curveToRelative(0.0f, 53.0f, -43.0f, 96.0f, -96.0f, 96.0f)
                lineTo(160.0f, 448.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, -43.0f, -96.0f, -96.0f)
                reflectiveCurveToRelative(43.0f, -96.0f, 96.0f, -96.0f)
                horizontalLineToRelative(88.4f)
                curveToRelative(-15.2f, -17.0f, -24.4f, -39.4f, -24.4f, -64.0f)
                lineTo(96.0f, 192.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, 43.0f, -96.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                lineTo(416.0f, 512.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, -43.0f, 96.0f, -96.0f)
                lineTo(512.0f, 288.0f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                close()
                moveTo(160.0f, 288.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                reflectiveCurveToRelative(28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(352.0f, 416.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                reflectiveCurveToRelative(-28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(320.0f, 288.0f)
                lineTo(160.0f, 288.0f)
                close()
            }
        }
        .build()
        return _soap!!
    }

private var _soap: ImageVector? = null
