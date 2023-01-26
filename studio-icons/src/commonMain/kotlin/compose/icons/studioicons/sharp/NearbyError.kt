package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.NearbyError: ImageVector
    get() {
        if (_nearbyError != null) {
            return _nearbyError!!
        }
        _nearbyError = Builder(name = "NearbyError", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.58f)
                lineTo(16.42f, 12.0f)
                lineTo(12.0f, 16.42f)
                lineTo(7.58f, 12.0f)
                lineTo(12.0f, 7.58f)
                close()
                moveTo(12.0f, 19.2f)
                lineTo(4.8f, 12.0f)
                lineTo(12.0f, 4.8f)
                lineToRelative(6.0f, 6.0f)
                verticalLineTo(7.17f)
                lineToRelative(-5.99f, -5.99f)
                lineTo(1.18f, 12.01f)
                lineToRelative(10.83f, 10.83f)
                lineTo(18.0f, 16.83f)
                verticalLineTo(13.2f)
                lineTo(12.0f, 19.2f)
                close()
                moveTo(20.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(22.0f, 10.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(10.0f)
            }
        }
        .build()
        return _nearbyError!!
    }

private var _nearbyError: ImageVector? = null
