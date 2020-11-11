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

public val TablerIcons.ShieldOff: VectorAsset
    get() {
        if (_shieldOff != null) {
            return _shieldOff!!
        }
        _shieldOff = VectorAssetBuilder(name = "ShieldOff", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(17.669f, 17.669f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -5.669f, 3.331f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.5f, -15.0f)
                curveToRelative(0.797f, 0.036f, 1.589f, 0.0f, 2.366f, -0.126f)
                moveToRelative(3.092f, -0.912f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 3.042f, -1.962f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.5f, 3.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -1.117f, 9.379f)
            }
        }
        .build()
        return _shieldOff!!
    }

private var _shieldOff: VectorAsset? = null
