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

public val SolidGroup.BookOpen: ImageVector
    get() {
        if (_bookOpen != null) {
            return _bookOpen!!
        }
        _bookOpen = Builder(name = "BookOpen", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(249.6f, 471.5f)
                curveToRelative(10.8f, 3.8f, 22.4f, -4.1f, 22.4f, -15.5f)
                lineTo(272.0f, 78.6f)
                curveToRelative(0.0f, -4.2f, -1.6f, -8.4f, -5.0f, -11.0f)
                curveTo(247.4f, 52.0f, 202.4f, 32.0f, 144.0f, 32.0f)
                curveTo(87.5f, 32.0f, 35.1f, 48.6f, 9.0f, 59.9f)
                curveToRelative(-5.6f, 2.4f, -9.0f, 8.0f, -9.0f, 14.0f)
                lineTo(0.0f, 454.1f)
                curveToRelative(0.0f, 11.9f, 12.8f, 20.2f, 24.1f, 16.5f)
                curveTo(55.6f, 460.1f, 105.5f, 448.0f, 144.0f, 448.0f)
                curveToRelative(33.9f, 0.0f, 79.0f, 14.0f, 105.6f, 23.5f)
                close()
                moveTo(326.4f, 471.5f)
                curveTo(353.0f, 462.0f, 398.1f, 448.0f, 432.0f, 448.0f)
                curveToRelative(38.5f, 0.0f, 88.4f, 12.1f, 119.9f, 22.6f)
                curveToRelative(11.3f, 3.8f, 24.1f, -4.6f, 24.1f, -16.5f)
                lineTo(576.0f, 73.9f)
                curveToRelative(0.0f, -6.1f, -3.4f, -11.6f, -9.0f, -14.0f)
                curveTo(540.9f, 48.6f, 488.5f, 32.0f, 432.0f, 32.0f)
                curveToRelative(-58.4f, 0.0f, -103.4f, 20.0f, -123.0f, 35.6f)
                curveToRelative(-3.3f, 2.6f, -5.0f, 6.8f, -5.0f, 11.0f)
                lineTo(304.0f, 456.0f)
                curveToRelative(0.0f, 11.4f, 11.7f, 19.3f, 22.4f, 15.5f)
                close()
            }
        }
        .build()
        return _bookOpen!!
    }

private var _bookOpen: ImageVector? = null
