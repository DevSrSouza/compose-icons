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

public val TablerIcons.BrandOauth: ImageVector
    get() {
        if (_brandOauth != null) {
            return _brandOauth!!
        }
        _brandOauth = Builder(name = "BrandOauth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-10.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -20.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.556f, 6.0f)
                curveToRelative(0.65f, 0.0f, 1.235f, 0.373f, 1.508f, 0.947f)
                lineToRelative(2.839f, 7.848f)
                arcToRelative(1.646f, 1.646f, 0.0f, false, true, -1.01f, 2.108f)
                arcToRelative(1.673f, 1.673f, 0.0f, false, true, -2.068f, -0.851f)
                lineToRelative(-0.46f, -1.052f)
                horizontalLineToRelative(-2.73f)
                lineToRelative(-0.398f, 0.905f)
                arcToRelative(1.67f, 1.67f, 0.0f, false, true, -1.977f, 1.045f)
                lineToRelative(-0.153f, -0.047f)
                arcToRelative(1.647f, 1.647f, 0.0f, false, true, -1.056f, -1.956f)
                lineToRelative(2.824f, -7.852f)
                arcToRelative(1.664f, 1.664f, 0.0f, false, true, 1.409f, -1.087f)
                lineToRelative(1.272f, -0.008f)
                close()
            }
        }
        .build()
        return _brandOauth!!
    }

private var _brandOauth: ImageVector? = null
