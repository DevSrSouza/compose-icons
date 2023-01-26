package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Snowmobile: ImageVector
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
                curveTo(20.58f, 15.37f, 22.0f, 14.4f, 22.0f, 13.0f)
                curveToRelative(0.0f, -1.0f, -8.0f, -8.0f, -8.0f, -8.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.25f)
                lineToRelative(0.8f, 0.72f)
                lineTo(11.0f, 10.0f)
                lineTo(2.0f, 9.0f)
                lineToRelative(-2.0f, 4.0f)
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
                moveTo(17.0f, 14.0f)
                horizontalLineToRelative(-6.7f)
                lineToRelative(-7.45f, -2.23f)
                lineToRelative(0.31f, -0.62f)
                lineTo(11.6f, 12.0f)
                lineToRelative(3.93f, -2.94f)
                curveToRelative(0.0f, 0.0f, 3.77f, 3.44f, 4.27f, 4.14f)
                curveTo(19.8f, 13.2f, 18.7f, 14.0f, 17.0f, 14.0f)
                close()
            }
        }
        .build()
        return _snowmobile!!
    }

private var _snowmobile: ImageVector? = null
