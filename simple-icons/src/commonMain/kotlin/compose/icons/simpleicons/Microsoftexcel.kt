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

public val SimpleIcons.Microsoftexcel: ImageVector
    get() {
        if (_microsoftexcel != null) {
            return _microsoftexcel!!
        }
        _microsoftexcel = Builder(name = "Microsoftexcel", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 1.5f)
                quadToRelative(0.41f, 0.0f, 0.7f, 0.3f)
                quadToRelative(0.3f, 0.29f, 0.3f, 0.7f)
                verticalLineToRelative(19.0f)
                quadToRelative(0.0f, 0.41f, -0.3f, 0.7f)
                quadToRelative(-0.29f, 0.3f, -0.7f, 0.3f)
                lineTo(7.0f, 22.5f)
                quadToRelative(-0.41f, 0.0f, -0.7f, -0.3f)
                quadToRelative(-0.3f, -0.29f, -0.3f, -0.7f)
                lineTo(6.0f, 18.0f)
                lineTo(1.0f, 18.0f)
                quadToRelative(-0.41f, 0.0f, -0.7f, -0.3f)
                quadToRelative(-0.3f, -0.29f, -0.3f, -0.7f)
                lineTo(0.0f, 7.0f)
                quadToRelative(0.0f, -0.41f, 0.3f, -0.7f)
                quadTo(0.58f, 6.0f, 1.0f, 6.0f)
                horizontalLineToRelative(5.0f)
                lineTo(6.0f, 2.5f)
                quadToRelative(0.0f, -0.41f, 0.3f, -0.7f)
                quadToRelative(0.29f, -0.3f, 0.7f, -0.3f)
                close()
                moveTo(6.0f, 13.28f)
                lineToRelative(1.42f, 2.66f)
                horizontalLineToRelative(2.14f)
                lineToRelative(-2.38f, -3.87f)
                lineToRelative(2.34f, -3.8f)
                lineTo(7.46f, 8.27f)
                lineToRelative(-1.3f, 2.4f)
                lineToRelative(-0.05f, 0.08f)
                lineToRelative(-0.04f, 0.09f)
                lineToRelative(-0.64f, -1.28f)
                lineToRelative(-0.66f, -1.29f)
                lineTo(2.59f, 8.27f)
                lineToRelative(2.27f, 3.82f)
                lineToRelative(-2.48f, 3.85f)
                horizontalLineToRelative(2.16f)
                close()
                moveTo(14.25f, 21.0f)
                verticalLineToRelative(-3.0f)
                lineTo(7.5f, 18.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(14.25f, 16.5f)
                verticalLineToRelative(-3.75f)
                lineTo(12.0f, 12.75f)
                verticalLineToRelative(3.75f)
                close()
                moveTo(14.25f, 11.25f)
                lineTo(14.25f, 7.5f)
                lineTo(12.0f, 7.5f)
                verticalLineToRelative(3.75f)
                close()
                moveTo(14.25f, 6.0f)
                lineTo(14.25f, 3.0f)
                lineTo(7.5f, 3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(22.5f, 21.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-6.75f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(22.5f, 16.5f)
                verticalLineToRelative(-3.75f)
                horizontalLineToRelative(-6.75f)
                verticalLineToRelative(3.75f)
                close()
                moveTo(22.5f, 11.25f)
                lineTo(22.5f, 7.5f)
                horizontalLineToRelative(-6.75f)
                verticalLineToRelative(3.75f)
                close()
                moveTo(22.5f, 6.0f)
                lineTo(22.5f, 3.0f)
                horizontalLineToRelative(-6.75f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _microsoftexcel!!
    }

private var _microsoftexcel: ImageVector? = null
