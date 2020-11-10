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

public val SimpleIcons.Nextdoor: VectorAsset
    get() {
        if (_nextdoor != null) {
            return _nextdoor!!
        }
        _nextdoor = VectorAssetBuilder(name = "Nextdoor", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.993f, 9.816f)
                lineTo(12.0f, 2.473f)
                lineToRelative(-4.12f, 2.524f)
                verticalLineTo(2.473f)
                horizontalLineTo(4.124f)
                verticalLineToRelative(4.819f)
                lineTo(0.004f, 9.816f)
                lineToRelative(1.961f, 3.202f)
                lineToRelative(2.16f, -1.315f)
                verticalLineToRelative(9.826f)
                horizontalLineToRelative(15.749f)
                verticalLineToRelative(-9.826f)
                lineToRelative(2.159f, 1.315f)
                lineToRelative(1.96f, -3.202f)
            }
        }
        .build()
        return _nextdoor!!
    }

private var _nextdoor: VectorAsset? = null
