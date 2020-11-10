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

public val SimpleIcons.Kyocera: VectorAsset
    get() {
        if (_kyocera != null) {
            return _kyocera!!
        }
        _kyocera = VectorAssetBuilder(name = "Kyocera", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.323f, 0.0f)
                lineTo(9.677f, 4.631f)
                horizontalLineToRelative(7.393f)
                lineTo(17.07f, 12.0f)
                lineToRelative(4.647f, -4.631f)
                lineTo(21.717f, 0.0f)
                close()
                moveTo(17.07f, 12.0f)
                verticalLineToRelative(7.369f)
                lineTo(9.677f, 19.369f)
                lineTo(14.323f, 24.0f)
                horizontalLineToRelative(7.394f)
                verticalLineToRelative(-7.369f)
                close()
                moveTo(17.07f, 12.0f)
                lineTo(9.677f, 4.631f)
                lineTo(9.677f, 19.37f)
                close()
                moveTo(9.677f, 19.369f)
                lineTo(2.283f, 12.0f)
                verticalLineToRelative(7.369f)
                close()
                moveTo(2.283f, 12.0f)
                lineToRelative(7.394f, -7.369f)
                lineTo(2.283f, 4.631f)
                close()
            }
        }
        .build()
        return _kyocera!!
    }

private var _kyocera: VectorAsset? = null
