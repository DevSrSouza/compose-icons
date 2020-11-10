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

public val SimpleIcons.Platzi: VectorAsset
    get() {
        if (_platzi != null) {
            return _platzi!!
        }
        _platzi = VectorAssetBuilder(name = "Platzi", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.64f, 1.127f)
                lineTo(2.487f, 9.282f)
                arcToRelative(3.842f, 3.842f, 0.0f, false, false, 0.0f, 5.436f)
                lineToRelative(8.155f, 8.155f)
                arcToRelative(3.842f, 3.842f, 0.0f, false, false, 5.436f, 0.0f)
                lineToRelative(2.719f, -2.718f)
                lineToRelative(-2.719f, -2.718f)
                lineToRelative(-2.718f, 2.718f)
                lineTo(5.204f, 12.0f)
                lineToRelative(8.155f, -8.155f)
                lineToRelative(5.437f, 5.437f)
                lineToRelative(-5.437f, 5.436f)
                lineToRelative(2.718f, 2.719f)
                lineTo(21.514f, 12.0f)
                arcToRelative(3.842f, 3.842f, 0.0f, false, false, 0.0f, -5.437f)
                lineToRelative(-5.448f, -5.436f)
                arcToRelative(3.828f, 3.828f, 0.0f, false, false, -5.425f, 0.0f)
                close()
            }
        }
        .build()
        return _platzi!!
    }

private var _platzi: VectorAsset? = null
