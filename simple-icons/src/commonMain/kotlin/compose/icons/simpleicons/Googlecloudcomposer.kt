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

public val SimpleIcons.Googlecloudcomposer: ImageVector
    get() {
        if (_googlecloudcomposer != null) {
            return _googlecloudcomposer!!
        }
        _googlecloudcomposer = Builder(name = "Googlecloudcomposer", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.636f, 4.752f)
                horizontalLineToRelative(-6.42f)
                lineTo(3.216f, 0.0f)
                horizontalLineToRelative(17.556f)
                verticalLineToRelative(4.728f)
                horizontalLineToRelative(-6.36f)
                verticalLineToRelative(6.396f)
                lineTo(9.636f, 11.124f)
                lineTo(9.636f, 4.752f)
                close()
                moveTo(3.216f, 6.444f)
                horizontalLineToRelative(4.74f)
                verticalLineToRelative(6.36f)
                horizontalLineToRelative(6.408f)
                lineTo(14.364f, 24.0f)
                lineTo(9.636f, 24.0f)
                verticalLineToRelative(-6.42f)
                horizontalLineToRelative(-6.42f)
                lineTo(3.216f, 6.444f)
                close()
                moveTo(16.056f, 6.432f)
                horizontalLineToRelative(4.728f)
                lineTo(20.784f, 24.0f)
                horizontalLineToRelative(-4.728f)
                lineTo(16.056f, 6.432f)
                close()
                moveTo(7.92f, 24.0f)
                lineTo(3.216f, 24.0f)
                verticalLineToRelative(-4.728f)
                lineTo(7.92f, 19.272f)
                lineTo(7.92f, 24.0f)
                close()
            }
        }
        .build()
        return _googlecloudcomposer!!
    }

private var _googlecloudcomposer: ImageVector? = null
