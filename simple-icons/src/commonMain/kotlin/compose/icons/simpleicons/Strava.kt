package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Strava: VectorAsset
    get() {
        if (_strava != null) {
            return _strava!!
        }
        _strava = VectorAssetBuilder(name = "Strava", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.387f, 17.944f)
                lineToRelative(-2.089f, -4.116f)
                horizontalLineToRelative(-3.065f)
                lineTo(15.387f, 24.0f)
                lineToRelative(5.15f, -10.172f)
                horizontalLineToRelative(-3.066f)
                moveToRelative(-7.008f, -5.599f)
                lineToRelative(2.836f, 5.598f)
                horizontalLineToRelative(4.172f)
                lineTo(10.463f, 0.0f)
                lineToRelative(-7.0f, 13.828f)
                horizontalLineToRelative(4.169f)
            }
        }
        .build()
        return _strava!!
    }

private var _strava: VectorAsset? = null
