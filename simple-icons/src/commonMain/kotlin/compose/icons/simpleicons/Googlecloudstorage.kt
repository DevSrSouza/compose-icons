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

public val SimpleIcons.Googlecloudstorage: ImageVector
    get() {
        if (_googlecloudstorage != null) {
            return _googlecloudstorage!!
        }
        _googlecloudstorage = Builder(name = "Googlecloudstorage", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 2.4f)
                verticalLineToRelative(8.4f)
                horizontalLineToRelative(-2.4f)
                lineTo(21.6f, 2.4f)
                lineTo(24.0f, 2.4f)
                close()
                moveTo(0.0f, 10.8f)
                horizontalLineToRelative(2.4f)
                lineTo(2.4f, 2.4f)
                lineTo(0.0f, 2.4f)
                verticalLineToRelative(8.4f)
                close()
                moveTo(3.0f, 2.4f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(8.4f)
                lineTo(3.0f, 10.8f)
                lineTo(3.0f, 2.4f)
                close()
                moveTo(15.6f, 6.6f)
                arcToRelative(1.8f, 1.8f, 0.0f, true, false, 3.6f, 0.0f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -3.6f, 0.0f)
                close()
                moveTo(4.8f, 7.2f)
                lineTo(12.0f, 7.2f)
                lineTo(12.0f, 6.0f)
                lineTo(4.8f, 6.0f)
                verticalLineToRelative(1.2f)
                close()
                moveTo(21.6f, 21.6f)
                lineTo(24.0f, 21.6f)
                verticalLineToRelative(-8.4f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(8.4f)
                close()
                moveTo(0.0f, 21.6f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(-8.4f)
                lineTo(0.0f, 13.2f)
                verticalLineToRelative(8.4f)
                close()
                moveTo(3.0f, 13.2f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(8.4f)
                lineTo(3.0f, 21.6f)
                verticalLineToRelative(-8.4f)
                close()
                moveTo(15.6f, 17.4f)
                arcToRelative(1.8f, 1.8f, 0.0f, true, false, 3.6f, 0.0f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -3.6f, 0.0f)
                close()
                moveTo(4.8f, 18.0f)
                lineTo(12.0f, 18.0f)
                verticalLineToRelative(-1.2f)
                lineTo(4.8f, 16.8f)
                lineTo(4.8f, 18.0f)
                close()
            }
        }
        .build()
        return _googlecloudstorage!!
    }

private var _googlecloudstorage: ImageVector? = null
