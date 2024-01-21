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

public val SimpleIcons.Miraheze: ImageVector
    get() {
        if (_miraheze != null) {
            return _miraheze!!
        }
        _miraheze = Builder(name = "Miraheze", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.677f, 12.923f)
                lineToRelative(3.768f, 0.011f)
                lineToRelative(1.949f, 3.369f)
                lineToRelative(-1.926f, 3.323f)
                lineTo(2.666f, 19.626f)
                lineTo(0.727f, 16.292f)
                lineToRelative(1.95f, -3.369f)
                close()
                moveTo(2.673f, 4.323f)
                lineTo(6.434f, 4.334f)
                lineTo(8.378f, 7.701f)
                lineTo(6.456f, 11.027f)
                lineTo(2.662f, 11.027f)
                lineTo(0.727f, 7.69f)
                lineToRelative(1.946f, -3.367f)
                close()
                moveTo(17.555f, 4.323f)
                lineTo(21.323f, 4.334f)
                lineTo(23.273f, 7.701f)
                lineTo(21.345f, 11.027f)
                horizontalLineToRelative(-3.801f)
                lineTo(15.606f, 7.69f)
                lineToRelative(1.949f, -3.367f)
                close()
                moveTo(17.555f, 12.923f)
                lineTo(21.323f, 12.934f)
                lineTo(23.273f, 16.303f)
                lineTo(21.345f, 19.626f)
                horizontalLineToRelative(-3.802f)
                lineToRelative(-1.937f, -3.334f)
                lineToRelative(1.949f, -3.369f)
                close()
                moveTo(10.099f, 17.296f)
                lineTo(13.866f, 17.307f)
                lineTo(15.817f, 20.675f)
                lineTo(13.889f, 24.0f)
                horizontalLineToRelative(-3.801f)
                lineToRelative(-1.939f, -3.336f)
                lineToRelative(1.95f, -3.368f)
                close()
                moveTo(10.099f, 0.0f)
                lineTo(13.866f, 0.011f)
                lineTo(15.817f, 3.38f)
                lineTo(13.889f, 6.704f)
                horizontalLineToRelative(-3.801f)
                lineTo(8.149f, 3.368f)
                lineTo(10.099f, 0.0f)
                close()
                moveTo(10.099f, 8.628f)
                lineTo(13.866f, 8.639f)
                lineTo(15.817f, 12.007f)
                lineTo(13.889f, 15.332f)
                horizontalLineToRelative(-3.801f)
                lineToRelative(-1.939f, -3.336f)
                lineToRelative(1.95f, -3.368f)
                close()
            }
        }
        .build()
        return _miraheze!!
    }

private var _miraheze: ImageVector? = null
