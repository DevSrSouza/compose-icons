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

public val TablerIcons.BrandDisqus: ImageVector
    get() {
        if (_brandDisqus != null) {
            return _brandDisqus!!
        }
        _brandDisqus = Builder(name = "BrandDisqus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.847f, 21.0f)
                curveToRelative(-2.259f, 0.0f, -4.323f, -0.667f, -5.919f, -2.0f)
                horizontalLineToRelative(-3.928f)
                lineToRelative(1.708f, -3.266f)
                curveToRelative(-0.545f, -1.174f, -0.759f, -2.446f, -0.758f, -3.734f)
                curveToRelative(0.0f, -4.97f, 3.84f, -9.0f, 8.898f, -9.0f)
                curveToRelative(5.052f, 0.0f, 9.152f, 4.03f, 9.152f, 9.0f)
                curveToRelative(0.0f, 4.972f, -4.098f, 9.0f, -9.153f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.485f, 15.0f)
                horizontalLineToRelative(-1.485f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(1.485f)
                curveToRelative(2.112f, 0.0f, 3.515f, 0.823f, 3.515f, 2.981f)
                verticalLineToRelative(0.035f)
                curveToRelative(0.0f, 2.18f, -1.403f, 2.984f, -3.515f, 2.984f)
                close()
            }
        }
        .build()
        return _brandDisqus!!
    }

private var _brandDisqus: ImageVector? = null
