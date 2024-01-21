package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandBunpo: ImageVector
    get() {
        if (_brandBunpo != null) {
            return _brandBunpo!!
        }
        _brandBunpo = Builder(name = "BrandBunpo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.9f, 7.205f)
                arcToRelative(17.764f, 17.764f, 0.0f, false, false, 4.008f, 2.753f)
                arcToRelative(7.917f, 7.917f, 0.0f, false, false, 4.57f, 0.567f)
                curveToRelative(1.5f, -0.33f, 2.907f, -1.0f, 4.121f, -1.956f)
                arcToRelative(12.107f, 12.107f, 0.0f, false, false, 2.892f, -2.903f)
                curveToRelative(0.603f, -0.94f, 0.745f, -1.766f, 0.484f, -2.231f)
                curveToRelative(-0.261f, -0.465f, -0.927f, -0.568f, -1.72f, -0.257f)
                arcToRelative(7.564f, 7.564f, 0.0f, false, false, -2.608f, 2.034f)
                arcToRelative(18.425f, 18.425f, 0.0f, false, false, -2.588f, 3.884f)
                arcToRelative(34.927f, 34.927f, 0.0f, false, false, -2.093f, 5.073f)
                arcToRelative(12.908f, 12.908f, 0.0f, false, false, -0.677f, 3.515f)
                curveToRelative(-0.07f, 0.752f, 0.07f, 1.51f, 0.405f, 2.184f)
                curveToRelative(0.323f, 0.562f, 1.06f, 1.132f, 2.343f, 1.132f)
                curveToRelative(3.474f, 0.0f, 5.093f, -3.53f, 5.463f, -5.62f)
                curveToRelative(0.24f, -1.365f, -0.085f, -3.197f, -1.182f, -4.01f)
            }
        }
        .build()
        return _brandBunpo!!
    }

private var _brandBunpo: ImageVector? = null
