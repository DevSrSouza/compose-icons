package compose.icons.evaicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.Layout: ImageVector
    get() {
        if (_layout != null) {
            return _layout!!
        }
        _layout = Builder(name = "Layout", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 3.0f)
                lineTo(6.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.0f, 6.0f)
                lineTo(3.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(18.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                lineTo(21.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 18.0f, 3.0f)
                close()
                moveTo(6.0f, 5.0f)
                lineTo(18.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                lineTo(19.0f, 8.0f)
                lineTo(5.0f, 8.0f)
                lineTo(5.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 5.0f)
                close()
                moveTo(5.0f, 18.0f)
                lineTo(5.0f, 10.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(9.0f)
                lineTo(6.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 18.0f)
                close()
                moveTo(18.0f, 19.0f)
                lineTo(13.0f, 19.0f)
                lineTo(13.0f, 10.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 19.0f)
                close()
            }
        }
        .build()
        return _layout!!
    }

private var _layout: ImageVector? = null
