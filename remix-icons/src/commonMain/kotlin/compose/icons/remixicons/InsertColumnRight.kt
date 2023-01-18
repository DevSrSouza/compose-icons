package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.InsertColumnRight: ImageVector
    get() {
        if (_insertColumnRight != null) {
            return _insertColumnRight!!
        }
        _insertColumnRight = Builder(name = "InsertColumnRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(4.0f, 21.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(3.0f, 4.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(9.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(4.0f)
                lineTo(9.0f, 5.0f)
                close()
                moveTo(18.0f, 7.0f)
                curveToRelative(2.761f, 0.0f, 5.0f, 2.239f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.239f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.239f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.239f, -5.0f, 5.0f, -5.0f)
                close()
                moveTo(19.0f, 9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.999f)
                lineTo(15.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(2.0f, -0.001f)
                lineTo(17.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.001f)
                lineTo(21.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-2.0f, -0.001f)
                lineTo(19.0f, 9.0f)
                close()
            }
        }
        .build()
        return _insertColumnRight!!
    }

private var _insertColumnRight: ImageVector? = null