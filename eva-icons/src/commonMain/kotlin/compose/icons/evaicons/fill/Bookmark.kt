package compose.icons.evaicons.fill

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
import compose.icons.evaicons.FillGroup

public val FillGroup.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(name = "Bookmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(6.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.49f, -0.13f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 20.0f)
                verticalLineTo(5.33f)
                arcTo(2.28f, 2.28f, 0.0f, false, true, 7.2f, 3.0f)
                horizontalLineToRelative(9.6f)
                arcTo(2.28f, 2.28f, 0.0f, false, true, 19.0f, 5.33f)
                verticalLineTo(20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.5f, 0.86f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 0.0f)
                lineToRelative(-5.67f, -3.21f)
                lineToRelative(-5.33f, 3.2f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 21.0f)
                close()
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
