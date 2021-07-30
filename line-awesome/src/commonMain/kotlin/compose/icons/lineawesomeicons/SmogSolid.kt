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

public val LineAwesomeIcons.SmogSolid: ImageVector
    get() {
        if (_smogSolid != null) {
            return _smogSolid!!
        }
        _smogSolid = Builder(name = "SmogSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                curveTo(4.686f, 5.0f, 2.0f, 7.686f, 2.0f, 11.0f)
                curveTo(2.0f, 14.314f, 4.686f, 17.0f, 8.0f, 17.0f)
                lineTo(15.0234f, 17.0f)
                curveTo(15.9364f, 18.208f, 17.37f, 19.0f, 19.0f, 19.0f)
                curveTo(20.63f, 19.0f, 22.0646f, 18.208f, 22.9766f, 17.0f)
                lineTo(25.5f, 17.0f)
                curveTo(27.985f, 17.0f, 30.0f, 14.985f, 30.0f, 12.5f)
                curveTo(30.0f, 10.015f, 27.985f, 8.0f, 25.5f, 8.0f)
                curveTo(24.596f, 8.0f, 23.7577f, 8.2715f, 23.0527f, 8.7305f)
                curveTo(22.1577f, 6.5425f, 20.01f, 5.0f, 17.5f, 5.0f)
                curveTo(15.564f, 5.0f, 13.847f, 5.9208f, 12.75f, 7.3438f)
                curveTo(11.653f, 5.9208f, 9.936f, 5.0f, 8.0f, 5.0f)
                close()
                moveTo(5.0f, 21.0f)
                lineTo(5.0f, 23.0f)
                lineTo(30.0f, 23.0f)
                lineTo(30.0f, 21.0f)
                lineTo(5.0f, 21.0f)
                close()
                moveTo(2.0f, 25.0f)
                lineTo(2.0f, 27.0f)
                lineTo(9.0f, 27.0f)
                lineTo(9.0f, 25.0f)
                lineTo(2.0f, 25.0f)
                close()
                moveTo(11.0f, 25.0f)
                lineTo(11.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 25.0f)
                lineTo(11.0f, 25.0f)
                close()
            }
        }
        .build()
        return _smogSolid!!
    }

private var _smogSolid: ImageVector? = null
