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

public val TablerIcons.Layout: VectorAsset
    get() {
        if (_layout != null) {
            return _layout!!
        }
        _layout = VectorAssetBuilder(name = "Layout", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                lineTo(8.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 6.0f)
                lineTo(10.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 9.0f)
                lineTo(6.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 7.0f)
                lineTo(4.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 13.0f)
                lineTo(8.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 15.0f)
                lineTo(10.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 20.0f)
                lineTo(6.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 18.0f)
                lineTo(4.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                lineTo(18.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 6.0f)
                lineTo(20.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 20.0f)
                lineTo(16.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 18.0f)
                lineTo(14.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 4.0f)
                close()
            }
        }
        .build()
        return _layout!!
    }

private var _layout: VectorAsset? = null
