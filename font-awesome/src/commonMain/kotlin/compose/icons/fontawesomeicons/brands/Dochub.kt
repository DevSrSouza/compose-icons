package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Dochub: ImageVector
    get() {
        if (_dochub != null) {
            return _dochub!!
        }
        _dochub = Builder(name = "Dochub", defaultWidth = 416.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 416.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(397.9f, 160.0f)
                horizontalLineTo(256.0f)
                verticalLineTo(19.6f)
                lineTo(397.9f, 160.0f)
                close()
                moveTo(304.0f, 192.0f)
                verticalLineToRelative(130.0f)
                curveToRelative(0.0f, 66.8f, -36.5f, 100.1f, -113.3f, 100.1f)
                horizontalLineTo(96.0f)
                verticalLineTo(84.8f)
                horizontalLineToRelative(94.7f)
                curveToRelative(12.0f, 0.0f, 23.1f, 0.8f, 33.1f, 2.5f)
                verticalLineToRelative(-84.0f)
                curveTo(212.9f, 1.1f, 201.4f, 0.0f, 189.2f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(512.0f)
                horizontalLineToRelative(189.2f)
                curveTo(329.7f, 512.0f, 400.0f, 447.4f, 400.0f, 318.1f)
                verticalLineTo(192.0f)
                horizontalLineToRelative(-96.0f)
                close()
            }
        }
        .build()
        return _dochub!!
    }

private var _dochub: ImageVector? = null
