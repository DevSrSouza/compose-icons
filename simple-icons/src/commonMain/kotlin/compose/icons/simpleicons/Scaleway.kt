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

public val SimpleIcons.Scaleway: ImageVector
    get() {
        if (_scaleway != null) {
            return _scaleway!!
        }
        _scaleway = Builder(name = "Scaleway", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.605f, 11.11f)
                verticalLineToRelative(5.72f)
                arcToRelative(1.77f, 1.77f, 0.0f, false, true, -1.54f, 1.69f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(1.43f, 1.43f, 0.0f, false, true, -1.31f, -1.22f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, true, 0.0f, -0.18f)
                arcToRelative(1.37f, 1.37f, 0.0f, false, true, 1.37f, -1.36f)
                horizontalLineToRelative(1.74f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-3.62f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, 1.18f, -1.39f)
                horizontalLineToRelative(0.17f)
                arcToRelative(1.37f, 1.37f, 0.0f, false, true, 1.39f, 1.36f)
                close()
                moveTo(10.145f, 12.85f)
                lineTo(10.145f, 9.26f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(1.85f)
                arcToRelative(1.37f, 1.37f, 0.0f, false, false, 1.37f, -1.37f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -0.17f)
                arcToRelative(1.45f, 1.45f, 0.0f, false, false, -1.41f, -1.2f)
                horizontalLineToRelative(-3.96f)
                arcToRelative(1.81f, 1.81f, 0.0f, false, false, -1.58f, 1.66f)
                verticalLineToRelative(5.7f)
                arcToRelative(1.37f, 1.37f, 0.0f, false, false, 1.37f, 1.37f)
                horizontalLineToRelative(0.21f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, false, 1.15f, -1.4f)
                close()
                moveTo(22.145f, 8.56f)
                lineTo(22.145f, 20.0f)
                arcToRelative(4.53f, 4.53f, 0.0f, false, true, -4.15f, 4.0f)
                horizontalLineToRelative(-7.58f)
                arcToRelative(8.57f, 8.57f, 0.0f, false, true, -8.56f, -8.57f)
                lineTo(1.855f, 4.54f)
                arcTo(4.54f, 4.54f, 0.0f, false, true, 6.395f, 0.0f)
                horizontalLineToRelative(7.18f)
                arcToRelative(8.56f, 8.56f, 0.0f, false, true, 8.56f, 8.56f)
                close()
                moveTo(19.405f, 8.56f)
                arcToRelative(5.83f, 5.83f, 0.0f, false, false, -5.82f, -5.82f)
                horizontalLineToRelative(-7.19f)
                arcToRelative(1.79f, 1.79f, 0.0f, false, false, -1.8f, 1.8f)
                verticalLineToRelative(10.89f)
                arcToRelative(5.83f, 5.83f, 0.0f, false, false, 5.82f, 5.8f)
                horizontalLineToRelative(7.44f)
                arcToRelative(1.79f, 1.79f, 0.0f, false, false, 1.54f, -1.48f)
                close()
            }
        }
        .build()
        return _scaleway!!
    }

private var _scaleway: ImageVector? = null
