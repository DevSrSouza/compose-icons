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

public val SimpleIcons.Googlecloudspanner: ImageVector
    get() {
        if (_googlecloudspanner != null) {
            return _googlecloudspanner!!
        }
        _googlecloudspanner = Builder(name = "Googlecloudspanner", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.06f)
                lineTo(7.944f, 6.864f)
                lineTo(7.944f, 2.388f)
                lineTo(10.38f, 0.924f)
                verticalLineToRelative(3.66f)
                lineToRelative(1.62f, 0.744f)
                lineToRelative(1.62f, -0.744f)
                lineTo(13.62f, 0.924f)
                lineToRelative(2.436f, 1.464f)
                verticalLineToRelative(4.476f)
                lineTo(12.0f, 9.06f)
                close()
                moveTo(3.876f, 13.812f)
                lineTo(0.0f, 16.056f)
                verticalLineToRelative(2.988f)
                lineToRelative(3.228f, -1.86f)
                lineToRelative(1.404f, 0.912f)
                lineToRelative(0.096f, 1.632f)
                lineToRelative(-3.24f, 1.872f)
                lineToRelative(2.616f, 1.476f)
                lineToRelative(3.828f, -2.268f)
                lineToRelative(-0.132f, -4.596f)
                lineToRelative(-3.924f, -2.4f)
                close()
                moveTo(13.608f, 12.912f)
                lineTo(13.608f, 8.758f)
                lineToRelative(-1.37f, 0.742f)
                lineToRelative(-0.238f, 0.129f)
                lineToRelative(-0.238f, -0.13f)
                lineToRelative(-1.37f, -0.741f)
                verticalLineToRelative(4.154f)
                lineToRelative(-3.613f, 2.09f)
                lineToRelative(1.282f, 0.783f)
                lineToRelative(0.231f, 0.142f)
                lineToRelative(0.008f, 0.27f)
                lineToRelative(0.046f, 1.612f)
                lineTo(12.0f, 15.696f)
                lineToRelative(3.595f, 2.079f)
                lineToRelative(0.045f, -1.59f)
                lineToRelative(0.008f, -0.27f)
                lineToRelative(0.231f, -0.142f)
                lineToRelative(1.301f, -0.795f)
                lineToRelative(-3.572f, -2.066f)
                close()
                moveTo(20.772f, 17.184f)
                lineTo(24.0f, 19.044f)
                verticalLineToRelative(-2.988f)
                lineTo(20.064f, 13.8f)
                lineToRelative(-3.924f, 2.4f)
                lineToRelative(-0.132f, 4.596f)
                lineToRelative(3.888f, 2.244f)
                lineToRelative(2.616f, -1.44f)
                lineToRelative(-3.24f, -1.836f)
                lineToRelative(0.096f, -1.668f)
                lineToRelative(1.404f, -0.912f)
                close()
            }
        }
        .build()
        return _googlecloudspanner!!
    }

private var _googlecloudspanner: ImageVector? = null
