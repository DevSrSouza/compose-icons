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

public val SharpGroup.Snowmobile: ImageVector
    get() {
        if (_snowmobile != null) {
            return _snowmobile!!
        }
        _snowmobile = Builder(name = "Snowmobile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 17.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-0.17f)
                lineToRelative(-2.2f, -2.2f)
                curveTo(21.6f, 15.18f, 23.0f, 13.0f, 23.0f, 13.0f)
                lineToRelative(-9.0f, -8.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.25f)
                lineToRelative(1.45f, 1.3f)
                lineTo(11.0f, 11.0f)
                lineToRelative(-9.5f, -1.0f)
                lineTo(0.0f, 13.0f)
                lineToRelative(4.54f, 1.36f)
                lineToRelative(-3.49f, 1.88f)
                curveTo(-0.77f, 17.22f, -0.07f, 20.0f, 2.0f, 20.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(8.0f, 18.0f)
                horizontalLineTo(2.0f)
                lineToRelative(5.25f, -2.83f)
                lineTo(10.0f, 16.0f)
                curveTo(10.0f, 17.1f, 9.11f, 18.0f, 8.0f, 18.0f)
                close()
            }
        }
        .build()
        return _snowmobile!!
    }

private var _snowmobile: ImageVector? = null
