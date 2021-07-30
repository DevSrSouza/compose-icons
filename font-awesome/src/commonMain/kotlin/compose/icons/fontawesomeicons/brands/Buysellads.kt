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

public val BrandsGroup.Buysellads: ImageVector
    get() {
        if (_buysellads != null) {
            return _buysellads!!
        }
        _buysellads = Builder(name = "Buysellads", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 150.7f)
                lineToRelative(42.9f, 160.7f)
                horizontalLineToRelative(-85.8f)
                lineTo(224.0f, 150.7f)
                close()
                moveTo(448.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineTo(48.0f, 480.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineTo(0.0f, 80.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                close()
                moveTo(382.7f, 405.3f)
                lineToRelative(-94.5f, -298.7f)
                lineTo(159.8f, 106.6f)
                lineTo(65.3f, 405.3f)
                lineTo(156.0f, 405.3f)
                lineToRelative(111.7f, -91.6f)
                lineToRelative(24.2f, 91.6f)
                horizontalLineToRelative(90.8f)
                close()
            }
        }
        .build()
        return _buysellads!!
    }

private var _buysellads: ImageVector? = null
