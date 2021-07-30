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

public val FillGroup.Crop: ImageVector
    get() {
        if (_crop != null) {
            return _crop!!
        }
        _crop = Builder(name = "Crop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(21.0f, 16.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.56f)
                arcTo(2.56f, 2.56f, 0.0f, false, false, 15.44f, 6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 8.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(7.44f)
                arcTo(2.56f, 2.56f, 0.0f, false, false, 8.56f, 18.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(8.56f, 16.0f)
                arcTo(0.56f, 0.56f, 0.0f, false, true, 8.0f, 15.44f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(7.44f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, 0.56f, 0.56f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _crop!!
    }

private var _crop: ImageVector? = null
