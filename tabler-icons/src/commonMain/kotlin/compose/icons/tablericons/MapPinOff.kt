package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.MapPinOff: VectorAsset
    get() {
        if (_mapPinOff != null) {
            return _mapPinOff!!
        }
        _mapPinOff = VectorAssetBuilder(name = "MapPinOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineTo(21.0f, 21.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.44f, 9.435f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.126f, 4.124f)
                moveToRelative(1.434f, -2.559f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.048f, 4.042f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.912f, 10.908f)
                moveToRelative(-1.8f, 2.206f)
                lineToRelative(-3.745f, 3.744f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.827f, 0.0f)
                lineToRelative(-4.244f, -4.243f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.48f, -10.79f)
            }
        }
        .build()
        return _mapPinOff!!
    }

private var _mapPinOff: VectorAsset? = null
