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

public val FillGroup.Copy: ImageVector
    get() {
        if (_copy != null) {
            return _copy!!
        }
        _copy = Builder(name = "Copy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(18.0f, 9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.67f)
                arcTo(2.68f, 2.68f, 0.0f, false, false, 12.33f, 3.0f)
                horizontalLineTo(5.67f)
                arcTo(2.68f, 2.68f, 0.0f, false, false, 3.0f, 5.67f)
                verticalLineToRelative(6.66f)
                arcTo(2.68f, 2.68f, 0.0f, false, false, 5.67f, 15.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineTo(12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 18.0f, 9.0f)
                close()
                moveTo(9.0f, 12.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(5.67f)
                arcTo(0.67f, 0.67f, 0.0f, false, true, 5.0f, 12.33f)
                verticalLineTo(5.67f)
                arcTo(0.67f, 0.67f, 0.0f, false, true, 5.67f, 5.0f)
                horizontalLineToRelative(6.66f)
                arcToRelative(0.67f, 0.67f, 0.0f, false, true, 0.67f, 0.67f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 12.0f)
                close()
            }
        }
        .build()
        return _copy!!
    }

private var _copy: ImageVector? = null
