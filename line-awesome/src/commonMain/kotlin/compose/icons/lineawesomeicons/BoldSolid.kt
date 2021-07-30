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

public val LineAwesomeIcons.BoldSolid: ImageVector
    get() {
        if (_boldSolid != null) {
            return _boldSolid!!
        }
        _boldSolid = Builder(name = "BoldSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 7.0f)
                curveTo(18.8008f, 7.0f, 21.0f, 9.1992f, 21.0f, 12.0f)
                curveTo(21.0f, 13.3008f, 20.5f, 14.3984f, 19.6992f, 15.3008f)
                curveTo(21.6016f, 16.0f, 23.0f, 17.8008f, 23.0f, 20.0f)
                curveTo(23.0f, 22.8008f, 20.8008f, 25.0f, 18.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                lineTo(16.0f, 7.0f)
                moveTo(9.0f, 15.0f)
                lineTo(16.0f, 15.0f)
                curveTo(17.6992f, 15.0f, 19.0f, 13.6992f, 19.0f, 12.0f)
                curveTo(19.0f, 10.3008f, 17.6992f, 9.0f, 16.0f, 9.0f)
                lineTo(9.0f, 9.0f)
                lineTo(9.0f, 15.0f)
                moveTo(9.0f, 23.0f)
                lineTo(18.0f, 23.0f)
                curveTo(19.6992f, 23.0f, 21.0f, 21.6992f, 21.0f, 20.0f)
                curveTo(21.0f, 18.3008f, 19.6992f, 17.0f, 18.0f, 17.0f)
                lineTo(9.0f, 17.0f)
                lineTo(9.0f, 23.0f)
                moveTo(16.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(18.0f, 27.0f)
                curveTo(21.8984f, 27.0f, 25.0f, 23.8984f, 25.0f, 20.0f)
                curveTo(25.0f, 17.8984f, 24.0f, 15.8984f, 22.5f, 14.6016f)
                curveTo(22.8008f, 13.8008f, 23.0f, 12.8984f, 23.0f, 12.0f)
                curveTo(23.0f, 8.1016f, 19.8984f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(11.0f, 11.0f)
                lineTo(16.0f, 11.0f)
                curveTo(16.6016f, 11.0f, 17.0f, 11.3984f, 17.0f, 12.0f)
                curveTo(17.0f, 12.6016f, 16.6016f, 13.0f, 16.0f, 13.0f)
                lineTo(11.0f, 13.0f)
                close()
                moveTo(11.0f, 19.0f)
                lineTo(18.0f, 19.0f)
                curveTo(18.6016f, 19.0f, 19.0f, 19.3984f, 19.0f, 20.0f)
                curveTo(19.0f, 20.6016f, 18.6016f, 21.0f, 18.0f, 21.0f)
                lineTo(11.0f, 21.0f)
                close()
            }
        }
        .build()
        return _boldSolid!!
    }

private var _boldSolid: ImageVector? = null
