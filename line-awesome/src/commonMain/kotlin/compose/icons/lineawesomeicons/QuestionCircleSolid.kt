package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.QuestionCircleSolid: ImageVector
    get() {
        if (_questionCircleSolid != null) {
            return _questionCircleSolid!!
        }
        _questionCircleSolid = Builder(name = "QuestionCircleSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.3828f, 4.0f, 4.0f, 9.3828f, 4.0f, 16.0f)
                curveTo(4.0f, 22.6172f, 9.3828f, 28.0f, 16.0f, 28.0f)
                curveTo(22.6172f, 28.0f, 28.0f, 22.6172f, 28.0f, 16.0f)
                curveTo(28.0f, 9.3828f, 22.6172f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(21.5352f, 6.0f, 26.0f, 10.4648f, 26.0f, 16.0f)
                curveTo(26.0f, 21.5352f, 21.5352f, 26.0f, 16.0f, 26.0f)
                curveTo(10.4648f, 26.0f, 6.0f, 21.5352f, 6.0f, 16.0f)
                curveTo(6.0f, 10.4648f, 10.4648f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(13.8008f, 10.0f, 12.0f, 11.8008f, 12.0f, 14.0f)
                lineTo(14.0f, 14.0f)
                curveTo(14.0f, 12.8828f, 14.8828f, 12.0f, 16.0f, 12.0f)
                curveTo(17.1172f, 12.0f, 18.0f, 12.8828f, 18.0f, 14.0f)
                curveTo(18.0f, 14.7656f, 17.5078f, 15.4453f, 16.7813f, 15.6875f)
                lineTo(16.375f, 15.8125f)
                curveTo(15.5586f, 16.082f, 15.0f, 16.8633f, 15.0f, 17.7188f)
                lineTo(15.0f, 19.0f)
                lineTo(17.0f, 19.0f)
                lineTo(17.0f, 17.7188f)
                lineTo(17.4063f, 17.5938f)
                curveTo(18.9453f, 17.082f, 20.0f, 15.6211f, 20.0f, 14.0f)
                curveTo(20.0f, 11.8008f, 18.1992f, 10.0f, 16.0f, 10.0f)
                close()
                moveTo(15.0f, 20.0f)
                lineTo(15.0f, 22.0f)
                lineTo(17.0f, 22.0f)
                lineTo(17.0f, 20.0f)
                close()
            }
        }
        .build()
        return _questionCircleSolid!!
    }

private var _questionCircleSolid: ImageVector? = null
