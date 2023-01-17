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

public val SolidGroup.DrawPolygon: ImageVector
    get() {
        if (_drawPolygon != null) {
            return _drawPolygon!!
        }
        _drawPolygon = Builder(name = "DrawPolygon", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 151.4f)
                verticalLineTo(360.6f)
                curveToRelative(9.7f, 5.6f, 17.8f, 13.7f, 23.4f, 23.4f)
                horizontalLineTo(328.6f)
                curveToRelative(0.0f, -0.1f, 0.1f, -0.2f, 0.1f, -0.3f)
                lineToRelative(-4.5f, -7.9f)
                lineToRelative(-32.0f, -56.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-1.4f, 0.1f, -2.8f, 0.1f, -4.2f, 0.1f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                reflectiveCurveToRelative(28.7f, -64.0f, 64.0f, -64.0f)
                curveToRelative(1.4f, 0.0f, 2.8f, 0.0f, 4.2f, 0.1f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(32.0f, -56.0f)
                lineToRelative(4.5f, -7.9f)
                lineToRelative(-0.1f, -0.3f)
                horizontalLineTo(119.4f)
                curveToRelative(-5.6f, 9.7f, -13.7f, 17.8f, -23.4f, 23.4f)
                close()
                moveTo(384.3f, 352.0f)
                curveToRelative(35.2f, 0.2f, 63.7f, 28.7f, 63.7f, 64.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                curveToRelative(-23.7f, 0.0f, -44.4f, -12.9f, -55.4f, -32.0f)
                horizontalLineTo(119.4f)
                curveToRelative(-11.1f, 19.1f, -31.7f, 32.0f, -55.4f, 32.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                curveToRelative(0.0f, -23.7f, 12.9f, -44.4f, 32.0f, -55.4f)
                verticalLineTo(151.4f)
                curveTo(12.9f, 140.4f, 0.0f, 119.7f, 0.0f, 96.0f)
                curveTo(0.0f, 60.7f, 28.7f, 32.0f, 64.0f, 32.0f)
                curveToRelative(23.7f, 0.0f, 44.4f, 12.9f, 55.4f, 32.0f)
                horizontalLineTo(328.6f)
                curveToRelative(11.1f, -19.1f, 31.7f, -32.0f, 55.4f, -32.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                curveToRelative(0.0f, 35.3f, -28.5f, 63.8f, -63.7f, 64.0f)
                lineToRelative(-4.5f, 7.9f)
                lineToRelative(-32.0f, 56.0f)
                lineToRelative(-2.3f, 4.0f)
                curveToRelative(4.2f, 8.5f, 6.5f, 18.0f, 6.5f, 28.1f)
                reflectiveCurveToRelative(-2.3f, 19.6f, -6.5f, 28.1f)
                lineToRelative(2.3f, 4.0f)
                lineToRelative(32.0f, 56.0f)
                lineToRelative(4.5f, 7.9f)
                close()
            }
        }
        .build()
        return _drawPolygon!!
    }

private var _drawPolygon: ImageVector? = null
