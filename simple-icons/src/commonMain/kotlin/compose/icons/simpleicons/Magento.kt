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

public val SimpleIcons.Magento: ImageVector
    get() {
        if (_magento != null) {
            return _magento!!
        }
        _magento = Builder(name = "Magento", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                lineToRelative(-4.455f, -2.572f)
                verticalLineToRelative(-12.0f)
                lineToRelative(2.97f, -1.715f)
                verticalLineToRelative(12.001f)
                lineToRelative(1.485f, 0.902f)
                lineToRelative(1.485f, -0.902f)
                verticalLineTo(7.713f)
                lineToRelative(2.971f, 1.715f)
                verticalLineToRelative(12.0f)
                lineTo(12.0f, 24.0f)
                close()
                moveTo(22.391f, 6.0f)
                verticalLineToRelative(12.0f)
                lineToRelative(-2.969f, 1.714f)
                verticalLineTo(7.713f)
                lineTo(12.0f, 3.43f)
                lineTo(4.574f, 7.713f)
                verticalLineToRelative(12.001f)
                lineTo(1.609f, 18.0f)
                verticalLineTo(6.0f)
                lineTo(12.0f, 0.0f)
                lineToRelative(10.391f, 6.0f)
                close()
            }
        }
        .build()
        return _magento!!
    }

private var _magento: ImageVector? = null
