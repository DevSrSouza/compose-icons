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

public val FillGroup.Image2: ImageVector
    get() {
        if (_image2 != null) {
            return _image2!!
        }
        _image2 = Builder(name = "Image2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                horizontalLineTo(6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.0f, 6.0f)
                verticalLineTo(18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineTo(18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineTo(6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 18.0f, 3.0f)
                close()
                moveTo(8.0f, 7.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 6.5f, 8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 7.0f)
                close()
                moveTo(19.0f, 17.83f)
                arcTo(1.09f, 1.09f, 0.0f, false, true, 18.0f, 19.0f)
                horizontalLineTo(6.0f)
                lineToRelative(7.57f, -6.82f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, true, 0.93f, 0.0f)
                lineTo(19.0f, 16.66f)
                close()
            }
        }
        .build()
        return _image2!!
    }

private var _image2: ImageVector? = null
