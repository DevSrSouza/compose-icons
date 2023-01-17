package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandTorchain: ImageVector
    get() {
        if (_brandTorchain != null) {
            return _brandTorchain!!
        }
        _brandTorchain = Builder(name = "BrandTorchain", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.588f, 15.537f)
                lineToRelative(-3.553f, -3.537f)
                lineToRelative(-7.742f, 8.18f)
                curveToRelative(-0.791f, 0.85f, 0.153f, 2.18f, 1.238f, 1.73f)
                lineToRelative(9.616f, -4.096f)
                arcToRelative(1.398f, 1.398f, 0.0f, false, false, 0.44f, -2.277f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.412f, 8.464f)
                lineToRelative(3.553f, 3.536f)
                lineToRelative(7.742f, -8.18f)
                curveToRelative(0.791f, -0.85f, -0.153f, -2.18f, -1.238f, -1.73f)
                lineToRelative(-9.616f, 4.098f)
                arcToRelative(1.398f, 1.398f, 0.0f, false, false, -0.44f, 2.277f)
                close()
            }
        }
        .build()
        return _brandTorchain!!
    }

private var _brandTorchain: ImageVector? = null
