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

public val SolidGroup.PersonHalfDress: ImageVector
    get() {
        if (_personHalfDress != null) {
            return _personHalfDress!!
        }
        _personHalfDress = Builder(name = "PersonHalfDress", defaultWidth = 320.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, 96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, -96.0f)
                close()
                moveTo(168.0f, 352.0f)
                lineTo(168.0f, 128.0f)
                horizontalLineToRelative(6.9f)
                curveToRelative(33.7f, 0.0f, 64.9f, 17.7f, 82.3f, 46.6f)
                lineToRelative(58.3f, 97.0f)
                curveToRelative(9.1f, 15.1f, 4.2f, 34.8f, -10.9f, 43.9f)
                reflectiveCurveToRelative(-34.8f, 4.2f, -43.9f, -10.9f)
                lineTo(232.0f, 256.9f)
                lineTo(232.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(168.0f, 352.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(58.2f, 182.3f)
                curveToRelative(19.9f, -33.1f, 55.3f, -53.5f, 93.8f, -54.3f)
                lineTo(152.0f, 384.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(88.0f, 384.0f)
                lineTo(70.2f, 384.0f)
                curveToRelative(-10.9f, 0.0f, -18.6f, -10.7f, -15.2f, -21.1f)
                lineTo(93.3f, 248.1f)
                lineTo(59.4f, 304.5f)
                curveToRelative(-9.1f, 15.1f, -28.8f, 20.0f, -43.9f, 10.9f)
                reflectiveCurveToRelative(-20.0f, -28.8f, -10.9f, -43.9f)
                lineToRelative(53.6f, -89.2f)
                close()
            }
        }
        .build()
        return _personHalfDress!!
    }

private var _personHalfDress: ImageVector? = null
