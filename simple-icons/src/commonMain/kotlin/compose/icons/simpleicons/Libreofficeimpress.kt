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

public val SimpleIcons.Libreofficeimpress: ImageVector
    get() {
        if (_libreofficeimpress != null) {
            return _libreofficeimpress!!
        }
        _libreofficeimpress = Builder(name = "Libreofficeimpress", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 0.0f)
                verticalLineToRelative(7.0f)
                lineToRelative(-7.0f, -7.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(13.0f, 0.0f)
                lineTo(22.0f, 9.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.662f, -1.338f, 3.0f, -3.0f, 3.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-1.662f, 0.0f, -3.0f, -1.338f, -3.0f, -3.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -1.662f, 1.338f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(7.0f, 17.0f)
                lineTo(6.0f, 17.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(7.0f, 15.0f)
                lineTo(6.0f, 15.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(7.0f, 13.0f)
                lineTo(6.0f, 13.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(10.0f, 17.0f)
                lineTo(8.0f, 17.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(10.0f, 15.0f)
                lineTo(8.0f, 15.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(10.0f, 13.0f)
                lineTo(8.0f, 13.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(16.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                lineTo(8.0f, 11.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(18.0f, 13.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(18.0f, 9.0f)
                lineTo(6.0f, 9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 9.0f)
                close()
                moveTo(14.0f, 15.707f)
                lineTo(15.0f, 16.707f)
                lineTo(17.207f, 14.5f)
                lineTo(16.5f, 13.793f)
                lineTo(15.0f, 15.293f)
                lineTo(14.0f, 14.293f)
                lineTo(11.793f, 16.5f)
                lineTo(12.5f, 17.207f)
                lineTo(14.0f, 15.707f)
                close()
            }
        }
        .build()
        return _libreofficeimpress!!
    }

private var _libreofficeimpress: ImageVector? = null
