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

public val SolidGroup.ExpandAlt: ImageVector
    get() {
        if (_expandAlt != null) {
            return _expandAlt!!
        }
        _expandAlt = Builder(name = "ExpandAlt", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.69f, 315.31f)
                lineTo(120.0f, 408.0f)
                lineToRelative(32.92f, 31.03f)
                curveToRelative(15.12f, 15.12f, 4.41f, 40.97f, -16.97f, 40.97f)
                horizontalLineToRelative(-112.0f)
                curveTo(10.7f, 480.0f, 0.0f, 469.26f, 0.0f, 456.0f)
                lineTo(0.0f, 344.0f)
                curveToRelative(0.0f, -21.38f, 25.8f, -32.09f, 40.92f, -16.97f)
                lineTo(72.0f, 360.0f)
                lineToRelative(92.69f, -92.69f)
                curveToRelative(6.25f, -6.25f, 16.38f, -6.25f, 22.63f, 0.0f)
                lineToRelative(25.37f, 25.37f)
                curveToRelative(6.25f, 6.25f, 6.25f, 16.38f, 0.0f, 22.63f)
                close()
                moveTo(235.31f, 196.69f)
                lineTo(328.0f, 104.0f)
                lineToRelative(-32.92f, -31.03f)
                curveTo(279.96f, 57.85f, 290.67f, 32.0f, 312.05f, 32.0f)
                horizontalLineToRelative(112.0f)
                curveTo(437.3f, 32.0f, 448.0f, 42.74f, 448.0f, 56.0f)
                verticalLineToRelative(112.0f)
                curveToRelative(0.0f, 21.38f, -25.8f, 32.09f, -40.92f, 16.97f)
                lineTo(376.0f, 152.0f)
                lineToRelative(-92.69f, 92.69f)
                curveToRelative(-6.25f, 6.25f, -16.38f, 6.25f, -22.63f, 0.0f)
                lineToRelative(-25.37f, -25.37f)
                curveToRelative(-6.25f, -6.25f, -6.25f, -16.38f, 0.0f, -22.63f)
                close()
            }
        }
        .build()
        return _expandAlt!!
    }

private var _expandAlt: ImageVector? = null
