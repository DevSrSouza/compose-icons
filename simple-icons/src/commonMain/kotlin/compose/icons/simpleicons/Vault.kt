package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Vault: ImageVector
    get() {
        if (_vault != null) {
            return _vault!!
        }
        _vault = Builder(name = "Vault", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                lineToRelative(11.955f, 24.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(13.366f, 4.827f)
                horizontalLineToRelative(1.393f)
                verticalLineToRelative(1.38f)
                horizontalLineToRelative(-1.393f)
                close()
                moveTo(10.596f, 10.396f)
                lineTo(9.22f, 10.396f)
                lineTo(9.22f, 8.993f)
                horizontalLineToRelative(1.389f)
                close()
                moveTo(10.596f, 8.309f)
                lineTo(9.22f, 8.309f)
                lineTo(9.22f, 6.906f)
                horizontalLineToRelative(1.389f)
                close()
                moveTo(10.596f, 6.223f)
                lineTo(9.22f, 6.223f)
                lineTo(9.22f, 4.819f)
                horizontalLineToRelative(1.389f)
                close()
                moveTo(12.683f, 12.486f)
                horizontalLineToRelative(-1.377f)
                lineTo(11.306f, 11.08f)
                horizontalLineToRelative(1.388f)
                close()
                moveTo(12.683f, 10.396f)
                horizontalLineToRelative(-1.377f)
                lineTo(11.306f, 8.993f)
                horizontalLineToRelative(1.388f)
                close()
                moveTo(12.683f, 8.309f)
                horizontalLineToRelative(-1.377f)
                lineTo(11.306f, 6.906f)
                horizontalLineToRelative(1.388f)
                close()
                moveTo(12.683f, 6.223f)
                horizontalLineToRelative(-1.377f)
                lineTo(11.306f, 4.819f)
                horizontalLineToRelative(1.388f)
                close()
                moveTo(13.366f, 6.906f)
                horizontalLineToRelative(1.393f)
                verticalLineToRelative(1.389f)
                horizontalLineToRelative(-1.393f)
                close()
                moveTo(13.366f, 10.381f)
                lineTo(13.366f, 8.993f)
                horizontalLineToRelative(1.389f)
                verticalLineToRelative(1.388f)
                close()
            }
        }
        .build()
        return _vault!!
    }

private var _vault: ImageVector? = null
