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

public val BrandsGroup.Google: ImageVector
    get() {
        if (_google != null) {
            return _google!!
        }
        _google = Builder(name = "Google", defaultWidth = 488.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 488.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(488.0f, 261.8f)
                curveTo(488.0f, 403.3f, 391.1f, 504.0f, 248.0f, 504.0f)
                curveTo(110.8f, 504.0f, 0.0f, 393.2f, 0.0f, 256.0f)
                reflectiveCurveTo(110.8f, 8.0f, 248.0f, 8.0f)
                curveToRelative(66.8f, 0.0f, 123.0f, 24.5f, 166.3f, 64.9f)
                lineToRelative(-67.5f, 64.9f)
                curveTo(258.5f, 52.6f, 94.3f, 116.6f, 94.3f, 256.0f)
                curveToRelative(0.0f, 86.5f, 69.1f, 156.6f, 153.7f, 156.6f)
                curveToRelative(98.2f, 0.0f, 135.0f, -70.4f, 140.8f, -106.9f)
                horizontalLineTo(248.0f)
                verticalLineToRelative(-85.3f)
                horizontalLineToRelative(236.1f)
                curveToRelative(2.3f, 12.7f, 3.9f, 24.9f, 3.9f, 41.4f)
                close()
            }
        }
        .build()
        return _google!!
    }

private var _google: ImageVector? = null
