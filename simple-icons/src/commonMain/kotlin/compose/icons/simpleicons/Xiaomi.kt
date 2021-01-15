package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Xiaomi: ImageVector
    get() {
        if (_xiaomi != null) {
            return _xiaomi!!
        }
        _xiaomi = Builder(name = "Xiaomi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.96f, 20.0f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, true, -0.32f, -0.32f)
                lineTo(19.64f, 4.32f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, true, 0.32f, -0.32f)
                horizontalLineToRelative(3.71f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, true, 0.33f, 0.32f)
                verticalLineToRelative(15.36f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, true, -0.33f, 0.32f)
                close()
                moveTo(13.74f, 20.0f)
                reflectiveCurveToRelative(-0.3f, -0.09f, -0.3f, -0.32f)
                verticalLineToRelative(-9.43f)
                arcTo(2.18f, 2.18f, 0.0f, false, false, 11.24f, 8.0f)
                lineTo(4.3f, 8.0f)
                curveToRelative(-0.4f, 0.0f, -0.3f, 0.3f, -0.3f, 0.3f)
                verticalLineToRelative(11.38f)
                curveToRelative(0.0f, 0.27f, -0.3f, 0.32f, -0.3f, 0.32f)
                lineTo(0.33f, 20.0f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, true, -0.33f, -0.32f)
                lineTo(0.0f, 4.32f)
                arcTo(0.32f, 0.32f, 0.0f, false, true, 0.33f, 4.0f)
                horizontalLineToRelative(12.86f)
                arcToRelative(4.28f, 4.28f, 0.0f, false, true, 4.25f, 4.27f)
                lineToRelative(0.01f, 11.41f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, true, -0.32f, 0.32f)
                close()
                moveTo(6.84f, 20.0f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, true, -0.3f, -0.3f)
                verticalLineToRelative(-9.0f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, true, 0.3f, -0.3f)
                horizontalLineToRelative(3.77f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, true, 0.29f, 0.3f)
                verticalLineToRelative(9.0f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, true, -0.3f, 0.3f)
                close()
            }
        }
        .build()
        return _xiaomi!!
    }

private var _xiaomi: ImageVector? = null
