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

public val SimpleIcons.Netlify: ImageVector
    get() {
        if (_netlify != null) {
            return _netlify!!
        }
        _netlify = Builder(name = "Netlify", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.49f, 19.04f)
                horizontalLineToRelative(-0.23f)
                lineTo(5.13f, 17.9f)
                verticalLineToRelative(-0.23f)
                lineToRelative(1.73f, -1.71f)
                horizontalLineToRelative(1.2f)
                lineToRelative(0.15f, 0.15f)
                verticalLineToRelative(1.2f)
                lineTo(6.5f, 19.04f)
                close()
                moveTo(5.13f, 6.31f)
                lineTo(5.13f, 6.1f)
                lineToRelative(1.13f, -1.13f)
                horizontalLineToRelative(0.23f)
                lineTo(8.2f, 6.68f)
                verticalLineToRelative(1.2f)
                lineToRelative(-0.15f, 0.15f)
                horizontalLineToRelative(-1.2f)
                lineTo(5.13f, 6.31f)
                close()
                moveTo(15.09f, 15.4f)
                horizontalLineToRelative(-1.65f)
                lineToRelative(-0.14f, -0.13f)
                verticalLineToRelative(-3.83f)
                curveToRelative(0.0f, -0.68f, -0.27f, -1.2f, -1.1f, -1.23f)
                curveToRelative(-0.42f, 0.0f, -0.9f, 0.0f, -1.43f, 0.02f)
                lineToRelative(-0.07f, 0.08f)
                verticalLineToRelative(4.96f)
                lineToRelative(-0.14f, 0.14f)
                lineTo(8.9f, 15.41f)
                lineToRelative(-0.13f, -0.14f)
                lineTo(8.77f, 8.73f)
                lineToRelative(0.13f, -0.14f)
                horizontalLineToRelative(3.7f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, 2.61f, 2.6f)
                verticalLineToRelative(4.08f)
                lineToRelative(-0.13f, 0.14f)
                close()
                moveTo(6.72f, 12.96f)
                lineTo(0.14f, 12.96f)
                lineTo(0.0f, 12.82f)
                verticalLineToRelative(-1.64f)
                lineToRelative(0.14f, -0.14f)
                horizontalLineToRelative(6.58f)
                lineToRelative(0.14f, 0.14f)
                verticalLineToRelative(1.64f)
                lineToRelative(-0.14f, 0.14f)
                close()
                moveTo(23.86f, 12.96f)
                horizontalLineToRelative(-6.58f)
                lineToRelative(-0.14f, -0.14f)
                verticalLineToRelative(-1.64f)
                lineToRelative(0.14f, -0.14f)
                horizontalLineToRelative(6.58f)
                lineToRelative(0.14f, 0.14f)
                verticalLineToRelative(1.64f)
                lineToRelative(-0.14f, 0.14f)
                close()
                moveTo(11.05f, 6.55f)
                lineTo(11.05f, 1.64f)
                lineToRelative(0.14f, -0.14f)
                horizontalLineToRelative(1.65f)
                lineToRelative(0.14f, 0.14f)
                verticalLineToRelative(4.9f)
                lineToRelative(-0.14f, 0.14f)
                horizontalLineToRelative(-1.65f)
                lineToRelative(-0.14f, -0.13f)
                close()
                moveTo(11.05f, 22.36f)
                verticalLineToRelative(-4.9f)
                lineToRelative(0.14f, -0.14f)
                horizontalLineToRelative(1.65f)
                lineToRelative(0.14f, 0.13f)
                verticalLineToRelative(4.91f)
                lineToRelative(-0.14f, 0.14f)
                horizontalLineToRelative(-1.65f)
                lineToRelative(-0.14f, -0.14f)
                close()
            }
        }
        .build()
        return _netlify!!
    }

private var _netlify: ImageVector? = null
