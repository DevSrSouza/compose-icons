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

public val OutlineGroup.Attach2: ImageVector
    get() {
        if (_attach2 != null) {
            return _attach2!!
        }
        _attach2 = Builder(name = "Attach2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(12.0f, 22.0f)
                arcToRelative(5.86f, 5.86f, 0.0f, false, true, -6.0f, -5.7f)
                verticalLineTo(6.13f)
                arcTo(4.24f, 4.24f, 0.0f, false, true, 10.33f, 2.0f)
                arcToRelative(4.24f, 4.24f, 0.0f, false, true, 4.34f, 4.13f)
                verticalLineTo(16.31f)
                arcToRelative(2.67f, 2.67f, 0.0f, false, true, -5.33f, 0.0f)
                verticalLineTo(6.92f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(9.39f)
                arcToRelative(0.67f, 0.67f, 0.0f, false, false, 1.33f, 0.0f)
                verticalLineTo(6.13f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 10.33f, 4.0f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 8.0f, 6.13f)
                verticalLineTo(16.3f)
                arcTo(3.86f, 3.86f, 0.0f, false, false, 12.0f, 20.0f)
                arcToRelative(3.86f, 3.86f, 0.0f, false, false, 4.0f, -3.7f)
                verticalLineTo(6.13f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineTo(16.3f)
                arcTo(5.86f, 5.86f, 0.0f, false, true, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _attach2!!
    }

private var _attach2: ImageVector? = null
