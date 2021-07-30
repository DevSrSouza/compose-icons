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

public val OutlineGroup.Headphones: ImageVector
    get() {
        if (_headphones != null) {
            return _headphones!!
        }
        _headphones = Builder(name = "Headphones", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(12.0f, 2.0f)
                arcTo(10.2f, 10.2f, 0.0f, false, false, 2.0f, 12.37f)
                lineTo(2.0f, 17.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.0f, -4.0f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, false, -2.0f, 0.56f)
                lineTo(4.0f, 12.37f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 12.0f, 4.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 8.0f, 8.37f)
                verticalLineToRelative(1.19f)
                arcTo(3.91f, 3.91f, 0.0f, false, false, 18.0f, 13.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.0f, 4.0f)
                lineTo(22.0f, 12.37f)
                arcTo(10.2f, 10.2f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(6.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 15.0f)
                close()
                moveTo(18.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 19.0f)
                close()
            }
        }
        .build()
        return _headphones!!
    }

private var _headphones: ImageVector? = null
