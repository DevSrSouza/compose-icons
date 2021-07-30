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

public val BrandsGroup.FacebookF: ImageVector
    get() {
        if (_facebookF != null) {
            return _facebookF!!
        }
        _facebookF = Builder(name = "FacebookF", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(279.14f, 288.0f)
                lineToRelative(14.22f, -92.66f)
                horizontalLineToRelative(-88.91f)
                verticalLineToRelative(-60.13f)
                curveToRelative(0.0f, -25.35f, 12.42f, -50.06f, 52.24f, -50.06f)
                horizontalLineToRelative(40.42f)
                verticalLineTo(6.26f)
                reflectiveCurveTo(260.43f, 0.0f, 225.36f, 0.0f)
                curveToRelative(-73.22f, 0.0f, -121.08f, 44.38f, -121.08f, 124.72f)
                verticalLineToRelative(70.62f)
                horizontalLineTo(22.89f)
                verticalLineTo(288.0f)
                horizontalLineToRelative(81.39f)
                verticalLineToRelative(224.0f)
                horizontalLineToRelative(100.17f)
                verticalLineTo(288.0f)
                close()
            }
        }
        .build()
        return _facebookF!!
    }

private var _facebookF: ImageVector? = null
