package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Document: ImageVector
    get() {
        if (_document != null) {
            return _document!!
        }
        _document = Builder(name = "Document", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 20.0f)
                curveTo(18.5f, 20.275f, 18.276f, 20.5f, 18.0f, 20.5f)
                horizontalLineTo(6.0f)
                curveTo(5.724f, 20.5f, 5.5f, 20.275f, 5.5f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(5.5f, 3.725f, 5.724f, 3.5f, 6.0f, 3.5f)
                horizontalLineTo(12.0f)
                verticalLineTo(8.0f)
                curveTo(12.0f, 9.104f, 12.896f, 10.0f, 14.0f, 10.0f)
                horizontalLineTo(18.5f)
                verticalLineTo(20.0f)
                close()
                moveTo(13.5f, 4.621f)
                lineTo(17.378f, 8.5f)
                horizontalLineTo(14.0f)
                curveTo(13.724f, 8.5f, 13.5f, 8.275f, 13.5f, 8.0f)
                verticalLineTo(4.621f)
                close()
                moveTo(19.414f, 8.414f)
                lineTo(13.585f, 2.586f)
                curveTo(13.559f, 2.56f, 13.527f, 2.54f, 13.5f, 2.516f)
                curveTo(13.429f, 2.452f, 13.359f, 2.389f, 13.281f, 2.336f)
                curveTo(13.241f, 2.309f, 13.195f, 2.291f, 13.153f, 2.268f)
                curveTo(13.082f, 2.228f, 13.012f, 2.184f, 12.937f, 2.152f)
                curveTo(12.74f, 2.07f, 12.528f, 2.029f, 12.313f, 2.014f)
                curveTo(12.266f, 2.011f, 12.22f, 2.0f, 12.172f, 2.0f)
                horizontalLineTo(12.171f)
                horizontalLineTo(12.0f)
                horizontalLineTo(6.0f)
                curveTo(4.896f, 2.0f, 4.0f, 2.896f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.104f, 4.896f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(19.104f, 22.0f, 20.0f, 21.104f, 20.0f, 20.0f)
                verticalLineTo(10.0f)
                verticalLineTo(9.828f)
                curveTo(20.0f, 9.298f, 19.789f, 8.789f, 19.414f, 8.414f)
                close()
            }
        }
        .build()
        return _document!!
    }

private var _document: ImageVector? = null
