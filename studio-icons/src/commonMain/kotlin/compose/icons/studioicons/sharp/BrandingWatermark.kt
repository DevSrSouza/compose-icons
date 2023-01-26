package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.BrandingWatermark: ImageVector
    get() {
        if (_brandingWatermark != null) {
            return _brandingWatermark!!
        }
        _brandingWatermark = Builder(name = "BrandingWatermark", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 3.0f)
                lineTo(1.0f, 3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(22.0f)
                lineTo(23.0f, 3.0f)
                close()
                moveTo(21.0f, 19.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _brandingWatermark!!
    }

private var _brandingWatermark: ImageVector? = null
