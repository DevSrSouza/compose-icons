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

public val SimpleIcons.Microstrategy: VectorAsset
    get() {
        if (_microstrategy != null) {
            return _microstrategy!!
        }
        _microstrategy = VectorAssetBuilder(name = "Microstrategy", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.103f, 2.596f)
                horizontalLineToRelative(5.811f)
                verticalLineToRelative(18.808f)
                horizontalLineToRelative(-5.81f)
                close()
                moveTo(0.031f, 2.596f)
                horizontalLineToRelative(5.81f)
                verticalLineToRelative(18.808f)
                lineTo(0.032f, 21.404f)
                close()
                moveTo(18.158f, 2.596f)
                verticalLineToRelative(18.806f)
                horizontalLineToRelative(5.811f)
                lineTo(23.969f, 8.339f)
                close()
            }
        }
        .build()
        return _microstrategy!!
    }

private var _microstrategy: VectorAsset? = null
