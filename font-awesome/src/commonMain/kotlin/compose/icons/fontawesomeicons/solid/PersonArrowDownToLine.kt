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

public val SolidGroup.PersonArrowDownToLine: ImageVector
    get() {
        if (_personArrowDownToLine != null) {
            return _personArrowDownToLine!!
        }
        _personArrowDownToLine = Builder(name = "PersonArrowDownToLine", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, -96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, 96.0f)
                close()
                moveTo(184.0f, 448.0f)
                lineTo(184.0f, 352.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(96.0f)
                lineTo(184.0f, 448.0f)
                close()
                moveTo(120.0f, 448.0f)
                lineTo(32.0f, 448.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(152.0f, 512.0f)
                horizontalLineToRelative(80.0f)
                lineTo(608.0f, 512.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(264.0f, 448.0f)
                lineTo(264.0f, 256.9f)
                lineToRelative(28.6f, 47.5f)
                curveToRelative(9.1f, 15.1f, 28.8f, 20.0f, 43.9f, 10.9f)
                reflectiveCurveToRelative(20.0f, -28.8f, 10.9f, -43.9f)
                lineToRelative(-58.3f, -97.0f)
                curveToRelative(-17.4f, -28.9f, -48.6f, -46.6f, -82.3f, -46.6f)
                lineTo(177.1f, 127.8f)
                curveToRelative(-33.7f, 0.0f, -64.9f, 17.7f, -82.3f, 46.6f)
                lineToRelative(-58.3f, 97.0f)
                curveToRelative(-9.1f, 15.1f, -4.2f, 34.8f, 10.9f, 43.9f)
                reflectiveCurveToRelative(34.8f, 4.2f, 43.9f, -10.9f)
                lineTo(120.0f, 256.9f)
                lineTo(120.0f, 448.0f)
                close()
                moveTo(464.0f, 64.0f)
                lineTo(464.0f, 306.7f)
                lineToRelative(-25.4f, -25.4f)
                curveToRelative(-12.5f, -12.5f, -32.8f, -12.5f, -45.3f, 0.0f)
                reflectiveCurveToRelative(-12.5f, 32.8f, 0.0f, 45.3f)
                lineToRelative(80.0f, 80.0f)
                curveToRelative(12.5f, 12.5f, 32.8f, 12.5f, 45.3f, 0.0f)
                lineToRelative(80.0f, -80.0f)
                curveToRelative(12.5f, -12.5f, 12.5f, -32.8f, 0.0f, -45.3f)
                reflectiveCurveToRelative(-32.8f, -12.5f, -45.3f, 0.0f)
                lineTo(528.0f, 306.7f)
                lineTo(528.0f, 64.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _personArrowDownToLine!!
    }

private var _personArrowDownToLine: ImageVector? = null
