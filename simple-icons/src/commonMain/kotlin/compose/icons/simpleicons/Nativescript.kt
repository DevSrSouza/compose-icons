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

public val SimpleIcons.Nativescript: ImageVector
    get() {
        if (_nativescript != null) {
            return _nativescript!!
        }
        _nativescript = Builder(name = "Nativescript", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.77f, 1.76f)
                arcTo(5.68f, 5.68f, 0.0f, false, true, 5.8f, 0.0f)
                horizontalLineToRelative(12.6f)
                curveToRelative(1.37f, 0.0f, 2.65f, 0.6f, 3.83f, 1.76f)
                arcTo(5.43f, 5.43f, 0.0f, false, true, 24.0f, 5.7f)
                verticalLineToRelative(12.77f)
                curveToRelative(0.0f, 1.34f, -0.56f, 2.58f, -1.68f, 3.73f)
                arcTo(5.77f, 5.77f, 0.0f, false, true, 18.25f, 24.0f)
                lineTo(5.87f, 24.0f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, true, -4.1f, -1.57f)
                curveTo(0.69f, 21.45f, 0.1f, 20.03f, 0.0f, 18.13f)
                lineTo(0.0f, 5.73f)
                arcToRelative(5.21f, 5.21f, 0.0f, false, true, 1.77f, -3.97f)
                close()
                moveTo(8.02f, 10.06f)
                lineToRelative(7.93f, 10.06f)
                horizontalLineToRelative(2.12f)
                curveToRelative(0.49f, -0.06f, 0.88f, -0.2f, 1.17f, -0.43f)
                curveToRelative(0.3f, -0.23f, 0.5f, -0.56f, 0.64f, -1.0f)
                verticalLineToRelative(-4.94f)
                curveToRelative(0.08f, -0.95f, 0.67f, -1.54f, 1.77f, -1.75f)
                curveToRelative(-1.1f, -0.4f, -1.69f, -1.02f, -1.77f, -1.86f)
                lineTo(19.88f, 5.42f)
                curveToRelative(-0.12f, -0.44f, -0.33f, -0.8f, -0.64f, -1.07f)
                arcToRelative(1.83f, 1.83f, 0.0f, false, false, -1.09f, -0.47f)
                lineTo(16.0f, 3.88f)
                verticalLineToRelative(10.2f)
                lineTo(8.02f, 3.87f)
                lineTo(5.79f, 3.87f)
                curveToRelative(-0.56f, 0.1f, -0.97f, 0.3f, -1.25f, 0.6f)
                reflectiveCurveTo(4.08f, 5.25f, 4.0f, 5.9f)
                verticalLineToRelative(4.85f)
                curveToRelative(-0.35f, 0.69f, -0.9f, 1.1f, -1.65f, 1.25f)
                curveToRelative(0.85f, 0.16f, 1.4f, 0.61f, 1.65f, 1.36f)
                verticalLineToRelative(4.77f)
                curveToRelative(0.02f, 0.55f, 0.2f, 1.0f, 0.54f, 1.37f)
                curveToRelative(0.33f, 0.36f, 0.7f, 0.53f, 1.1f, 0.5f)
                lineTo(8.0f, 20.0f)
                lineToRelative(0.02f, -9.94f)
                close()
            }
        }
        .build()
        return _nativescript!!
    }

private var _nativescript: ImageVector? = null
