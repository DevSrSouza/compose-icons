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

public val SolidGroup.PersonCircleXmark: ImageVector
    get() {
        if (_personCircleXmark != null) {
            return _personCircleXmark!!
        }
        _personCircleXmark = Builder(name = "PersonCircleXmark", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 48.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
                close()
                moveTo(152.0f, 352.0f)
                lineTo(152.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(88.0f, 256.9f)
                lineTo(59.4f, 304.5f)
                curveToRelative(-9.1f, 15.1f, -28.8f, 20.0f, -43.9f, 10.9f)
                reflectiveCurveToRelative(-20.0f, -28.8f, -10.9f, -43.9f)
                lineToRelative(58.3f, -97.0f)
                curveToRelative(17.4f, -28.9f, 48.6f, -46.6f, 82.3f, -46.6f)
                horizontalLineToRelative(29.7f)
                curveToRelative(33.7f, 0.0f, 64.9f, 17.7f, 82.3f, 46.6f)
                lineToRelative(44.9f, 74.7f)
                curveToRelative(-16.1f, 17.6f, -28.6f, 38.5f, -36.6f, 61.5f)
                curveToRelative(-1.9f, -1.8f, -3.5f, -3.9f, -4.9f, -6.3f)
                lineTo(232.0f, 256.9f)
                lineTo(232.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(168.0f, 352.0f)
                lineTo(152.0f, 352.0f)
                close()
                moveTo(432.0f, 224.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, 0.0f, 288.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, 0.0f, -288.0f)
                close()
                moveTo(491.3f, 331.3f)
                curveToRelative(6.2f, -6.2f, 6.2f, -16.4f, 0.0f, -22.6f)
                reflectiveCurveToRelative(-16.4f, -6.2f, -22.6f, 0.0f)
                lineTo(432.0f, 345.4f)
                lineToRelative(-36.7f, -36.7f)
                curveToRelative(-6.2f, -6.2f, -16.4f, -6.2f, -22.6f, 0.0f)
                reflectiveCurveToRelative(-6.2f, 16.4f, 0.0f, 22.6f)
                lineTo(409.4f, 368.0f)
                lineToRelative(-36.7f, 36.7f)
                curveToRelative(-6.2f, 6.2f, -6.2f, 16.4f, 0.0f, 22.6f)
                reflectiveCurveToRelative(16.4f, 6.2f, 22.6f, 0.0f)
                lineTo(432.0f, 390.6f)
                lineToRelative(36.7f, 36.7f)
                curveToRelative(6.2f, 6.2f, 16.4f, 6.2f, 22.6f, 0.0f)
                reflectiveCurveToRelative(6.2f, -16.4f, 0.0f, -22.6f)
                lineTo(454.6f, 368.0f)
                lineToRelative(36.7f, -36.7f)
                close()
            }
        }
        .build()
        return _personCircleXmark!!
    }

private var _personCircleXmark: ImageVector? = null
