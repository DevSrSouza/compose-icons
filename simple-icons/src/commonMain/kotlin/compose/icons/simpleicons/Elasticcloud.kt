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

public val SimpleIcons.Elasticcloud: ImageVector
    get() {
        if (_elasticcloud != null) {
            return _elasticcloud!!
        }
        _elasticcloud = Builder(name = "Elasticcloud", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.318f, 0.0f)
                curveToRelative(-6.628f, 0.0f, -12.0f, 5.372f, -12.0f, 12.0f)
                curveToRelative(0.0f, 2.008f, 0.495f, 3.9f, 1.368f, 5.563f)
                arcToRelative(14.299f, 14.299f, 0.0f, false, true, 5.09f, -3.664f)
                curveToRelative(0.307f, -0.13f, 0.624f, -0.22f, 0.948f, -0.28f)
                arcTo(4.842f, 4.842f, 0.0f, false, true, 8.443f, 12.0f)
                arcToRelative(4.875f, 4.875f, 0.0f, false, true, 7.494f, -4.11f)
                arcToRelative(2.218f, 2.218f, 0.0f, false, false, 2.055f, 0.164f)
                arcToRelative(12.047f, 12.047f, 0.0f, false, false, 4.69f, -3.554f)
                arcTo(11.975f, 11.975f, 0.0f, false, false, 13.318f, 0.0f)
                close()
                moveTo(9.426f, 15.77f)
                curveToRelative(-0.266f, 0.01f, -0.531f, 0.069f, -0.783f, 0.175f)
                arcToRelative(12.044f, 12.044f, 0.0f, false, false, -4.69f, 3.555f)
                curveToRelative(2.2f, 2.742f, 5.576f, 4.5f, 9.365f, 4.5f)
                curveToRelative(3.789f, 0.0f, 7.165f, -1.758f, 9.364f, -4.5f)
                arcToRelative(12.048f, 12.048f, 0.0f, false, false, -4.69f, -3.555f)
                arcToRelative(2.217f, 2.217f, 0.0f, false, false, -2.055f, 0.165f)
                arcToRelative(4.845f, 4.845f, 0.0f, false, true, -2.62f, 0.765f)
                arcToRelative(4.846f, 4.846f, 0.0f, false, true, -2.618f, -0.765f)
                arcToRelative(2.193f, 2.193f, 0.0f, false, false, -1.273f, -0.34f)
                close()
            }
        }
        .build()
        return _elasticcloud!!
    }

private var _elasticcloud: ImageVector? = null
