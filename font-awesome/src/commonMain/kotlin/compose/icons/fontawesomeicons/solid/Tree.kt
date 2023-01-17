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

public val SolidGroup.Tree: ImageVector
    get() {
        if (_tree != null) {
            return _tree!!
        }
        _tree = Builder(name = "Tree", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.6f, 5.9f)
                lineTo(62.0f, 169.4f)
                curveToRelative(-3.9f, 4.2f, -6.0f, 9.8f, -6.0f, 15.5f)
                curveTo(56.0f, 197.7f, 66.3f, 208.0f, 79.1f, 208.0f)
                horizontalLineTo(104.0f)
                lineTo(30.6f, 281.4f)
                curveToRelative(-4.2f, 4.2f, -6.6f, 10.0f, -6.6f, 16.0f)
                curveTo(24.0f, 309.9f, 34.1f, 320.0f, 46.6f, 320.0f)
                horizontalLineTo(80.0f)
                lineTo(5.4f, 409.5f)
                curveTo(1.9f, 413.7f, 0.0f, 419.0f, 0.0f, 424.5f)
                curveToRelative(0.0f, 13.0f, 10.5f, 23.5f, 23.5f, 23.5f)
                horizontalLineTo(192.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(448.0f)
                horizontalLineTo(424.5f)
                curveToRelative(13.0f, 0.0f, 23.5f, -10.5f, 23.5f, -23.5f)
                curveToRelative(0.0f, -5.5f, -1.9f, -10.8f, -5.4f, -15.0f)
                lineTo(368.0f, 320.0f)
                horizontalLineToRelative(33.4f)
                curveToRelative(12.5f, 0.0f, 22.6f, -10.1f, 22.6f, -22.6f)
                curveToRelative(0.0f, -6.0f, -2.4f, -11.8f, -6.6f, -16.0f)
                lineTo(344.0f, 208.0f)
                horizontalLineToRelative(24.9f)
                curveToRelative(12.7f, 0.0f, 23.1f, -10.3f, 23.1f, -23.1f)
                curveToRelative(0.0f, -5.7f, -2.1f, -11.3f, -6.0f, -15.5f)
                lineTo(237.4f, 5.9f)
                curveTo(234.0f, 2.1f, 229.1f, 0.0f, 224.0f, 0.0f)
                reflectiveCurveToRelative(-10.0f, 2.1f, -13.4f, 5.9f)
                close()
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null
