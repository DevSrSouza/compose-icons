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
                moveTo(9.677f, 4.645f)
                lineTo(2.323f, 12.0f)
                lineTo(2.323f, 4.645f)
                horizontalLineToRelative(7.354f)
                close()
                moveTo(2.323f, 19.355f)
                horizontalLineToRelative(7.355f)
                lineTo(2.323f, 12.0f)
                verticalLineToRelative(7.355f)
                close()
                moveTo(9.677f, 19.355f)
                lineTo(17.032f, 12.0f)
                lineTo(9.677f, 4.645f)
                verticalLineToRelative(14.71f)
                close()
                moveTo(21.677f, 0.0f)
                horizontalLineToRelative(-7.355f)
                lineTo(9.677f, 4.645f)
                horizontalLineToRelative(7.355f)
                lineTo(17.032f, 12.0f)
                lineToRelative(4.645f, -4.645f)
                lineTo(21.677f, 0.0f)
                close()
                moveTo(9.677f, 19.355f)
                lineTo(14.323f, 24.0f)
                horizontalLineToRelative(7.355f)
                verticalLineToRelative(-7.355f)
                lineTo(17.032f, 12.0f)
                verticalLineToRelative(7.355f)
                lineTo(9.677f, 19.355f)
                close()
            }
        }
        .build()
        return _kyocera!!
    }

private var _kyocera: VectorAsset? = null
