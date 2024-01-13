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

public val SimpleIcons.Autocad: ImageVector
    get() {
        if (_autocad != null) {
            return _autocad!!
        }
        _autocad = Builder(name = "Autocad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.8672f, 1.0527f)
                verticalLineToRelative(0.0157f)
                lineTo(0.0f, 3.3848f)
                verticalLineToRelative(17.914f)
                lineToRelative(3.8965f, -2.332f)
                horizontalLineToRelative(18.3398f)
                lineTo(22.2363f, 2.3301f)
                curveToRelative(0.0f, -0.702f, -0.5773f, -1.2774f, -1.2793f, -1.2774f)
                lineTo(3.8672f, 1.0527f)
                close()
                moveTo(11.373f, 5.0625f)
                horizontalLineToRelative(3.3008f)
                lineToRelative(2.9844f, 9.9512f)
                horizontalLineToRelative(-2.5879f)
                lineToRelative(-0.5683f, -2.1895f)
                horizontalLineToRelative(-2.9844f)
                lineToRelative(-0.5703f, 2.1621f)
                horizontalLineToRelative(-2.416f)
                lineToRelative(2.8417f, -9.9238f)
                close()
                moveTo(23.2363f, 5.0898f)
                verticalLineToRelative(14.877f)
                lineTo(4.172f, 19.9668f)
                lineToRelative(-2.0684f, 1.2383f)
                verticalLineToRelative(0.4648f)
                curveToRelative(0.0f, 0.702f, 0.5793f, 1.2774f, 1.2813f, 1.2774f)
                lineTo(24.0f, 22.9473f)
                lineTo(24.0f, 5.0898f)
                horizontalLineToRelative(-0.7637f)
                close()
                moveTo(12.9668f, 6.6816f)
                lineToRelative(-0.9941f, 4.3243f)
                horizontalLineToRelative(2.0468f)
                lineToRelative(-1.0527f, -4.3243f)
                close()
            }
        }
        .build()
        return _autocad!!
    }

private var _autocad: ImageVector? = null
