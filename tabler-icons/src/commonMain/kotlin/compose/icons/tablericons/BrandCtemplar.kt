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

public val TablerIcons.BrandCtemplar: ImageVector
    get() {
        if (_brandCtemplar != null) {
            return _brandCtemplar!!
        }
        _brandCtemplar = Builder(name = "BrandCtemplar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.04f, 14.831f)
                lineToRelative(4.46f, -4.331f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.555f, 20.82f)
                curveToRelative(4.55f, -3.456f, 7.582f, -8.639f, 8.426f, -14.405f)
                arcToRelative(1.668f, 1.668f, 0.0f, false, false, -0.934f, -1.767f)
                arcToRelative(19.647f, 19.647f, 0.0f, false, false, -8.047f, -1.648f)
                arcToRelative(19.647f, 19.647f, 0.0f, false, false, -8.047f, 1.647f)
                arcToRelative(1.668f, 1.668f, 0.0f, false, false, -0.934f, 1.767f)
                curveToRelative(0.844f, 5.766f, 3.875f, 10.95f, 8.426f, 14.406f)
                arcToRelative(0.948f, 0.948f, 0.0f, false, false, 1.11f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                curveToRelative(-2.0f, 0.0f, -4.37f, 3.304f, -8.0f, 6.644f)
                curveToRelative(-3.63f, -3.34f, -6.0f, -6.644f, -8.0f, -6.644f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.738f, 15.0f)
                lineToRelative(-4.238f, -4.5f)
            }
        }
        .build()
        return _brandCtemplar!!
    }

private var _brandCtemplar: ImageVector? = null
