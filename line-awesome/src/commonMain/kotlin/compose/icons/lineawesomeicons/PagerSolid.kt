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

public val LineAwesomeIcons.PagerSolid: ImageVector
    get() {
        if (_pagerSolid != null) {
            return _pagerSolid!!
        }
        _pagerSolid = Builder(name = "PagerSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 7.0f)
                curveTo(5.355f, 7.0f, 4.0f, 8.355f, 4.0f, 10.0f)
                lineTo(4.0f, 22.0f)
                curveTo(4.0f, 23.645f, 5.355f, 25.0f, 7.0f, 25.0f)
                lineTo(25.0f, 25.0f)
                curveTo(26.645f, 25.0f, 28.0f, 23.645f, 28.0f, 22.0f)
                lineTo(28.0f, 10.0f)
                curveTo(28.0f, 8.355f, 26.645f, 7.0f, 25.0f, 7.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(7.0f, 9.0f)
                lineTo(25.0f, 9.0f)
                curveTo(25.565f, 9.0f, 26.0f, 9.435f, 26.0f, 10.0f)
                lineTo(26.0f, 22.0f)
                curveTo(26.0f, 22.565f, 25.565f, 23.0f, 25.0f, 23.0f)
                lineTo(7.0f, 23.0f)
                curveTo(6.435f, 23.0f, 6.0f, 22.565f, 6.0f, 22.0f)
                lineTo(6.0f, 10.0f)
                curveTo(6.0f, 9.435f, 6.435f, 9.0f, 7.0f, 9.0f)
                close()
                moveTo(8.0f, 11.0f)
                lineTo(8.0f, 17.0f)
                lineTo(20.0f, 17.0f)
                lineTo(20.0f, 11.0f)
                lineTo(8.0f, 11.0f)
                close()
                moveTo(22.0f, 11.0f)
                lineTo(22.0f, 13.0f)
                lineTo(24.0f, 13.0f)
                lineTo(24.0f, 11.0f)
                lineTo(22.0f, 11.0f)
                close()
                moveTo(22.0f, 15.0f)
                lineTo(22.0f, 17.0f)
                lineTo(24.0f, 17.0f)
                lineTo(24.0f, 15.0f)
                lineTo(22.0f, 15.0f)
                close()
                moveTo(8.0f, 19.0f)
                lineTo(8.0f, 21.0f)
                lineTo(20.0f, 21.0f)
                lineTo(20.0f, 19.0f)
                lineTo(8.0f, 19.0f)
                close()
                moveTo(22.0f, 19.0f)
                lineTo(22.0f, 21.0f)
                lineTo(24.0f, 21.0f)
                lineTo(24.0f, 19.0f)
                lineTo(22.0f, 19.0f)
                close()
            }
        }
        .build()
        return _pagerSolid!!
    }

private var _pagerSolid: ImageVector? = null
