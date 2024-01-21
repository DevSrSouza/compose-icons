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

public val TablerIcons.BrandAmd: ImageVector
    get() {
        if (_brandAmd != null) {
            return _brandAmd!!
        }
        _brandAmd = Builder(name = "BrandAmd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 16.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.566f, -0.434f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-7.0f)
                lineToRelative(-5.0f, -5.0f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.566f, 0.0f, 1.0f, 0.434f, 1.0f, 1.0f)
                verticalLineToRelative(17.0f)
                lineToRelative(-5.0f, -5.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.293f, 20.707f)
                lineToRelative(4.707f, -4.707f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                lineToRelative(-4.707f, 4.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.293f, 0.707f)
                verticalLineToRelative(6.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(6.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.707f, -0.293f)
                close()
            }
        }
        .build()
        return _brandAmd!!
    }

private var _brandAmd: ImageVector? = null
