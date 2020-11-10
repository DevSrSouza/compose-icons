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

public val SimpleIcons.Trello: VectorAsset
    get() {
        if (_trello != null) {
            return _trello!!
        }
        _trello = VectorAssetBuilder(name = "Trello", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.343f, 0.0f, 0.0f, 1.343f, 0.0f, 3.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 1.656f, 1.343f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.656f, 0.0f, 3.0f, -1.344f, 3.0f, -3.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.657f, -1.344f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(10.44f, 18.18f)
                curveToRelative(0.0f, 0.795f, -0.645f, 1.44f, -1.44f, 1.44f)
                lineTo(4.56f, 19.62f)
                curveToRelative(-0.795f, 0.0f, -1.44f, -0.646f, -1.44f, -1.44f)
                lineTo(3.12f, 4.56f)
                curveToRelative(0.0f, -0.795f, 0.645f, -1.44f, 1.44f, -1.44f)
                lineTo(9.0f, 3.12f)
                curveToRelative(0.795f, 0.0f, 1.44f, 0.645f, 1.44f, 1.44f)
                verticalLineToRelative(13.62f)
                close()
                moveTo(20.88f, 12.18f)
                curveToRelative(0.0f, 0.794f, -0.645f, 1.44f, -1.44f, 1.44f)
                lineTo(15.0f, 13.62f)
                curveToRelative(-0.795f, 0.0f, -1.44f, -0.646f, -1.44f, -1.44f)
                lineTo(13.56f, 4.56f)
                curveToRelative(0.0f, -0.795f, 0.646f, -1.44f, 1.44f, -1.44f)
                horizontalLineToRelative(4.44f)
                curveToRelative(0.795f, 0.0f, 1.44f, 0.645f, 1.44f, 1.44f)
                verticalLineToRelative(7.62f)
                close()
            }
        }
        .build()
        return _trello!!
    }

private var _trello: VectorAsset? = null
