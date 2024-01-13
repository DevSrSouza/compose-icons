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

public val TablerIcons.BrandGoogleBigQuery: ImageVector
    get() {
        if (_brandGoogleBigQuery != null) {
            return _brandGoogleBigQuery!!
        }
        _brandGoogleBigQuery = Builder(name = "BrandGoogleBigQuery", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.73f, 19.875f)
                arcToRelative(2.225f, 2.225f, 0.0f, false, true, -1.948f, 1.125f)
                horizontalLineToRelative(-7.283f)
                arcToRelative(2.222f, 2.222f, 0.0f, false, true, -1.947f, -1.158f)
                lineToRelative(-4.272f, -6.75f)
                arcToRelative(2.269f, 2.269f, 0.0f, false, true, 0.0f, -2.184f)
                lineToRelative(4.272f, -6.75f)
                arcToRelative(2.225f, 2.225f, 0.0f, false, true, 1.946f, -1.158f)
                horizontalLineToRelative(7.285f)
                curveToRelative(0.809f, 0.0f, 1.554f, 0.443f, 1.947f, 1.158f)
                lineToRelative(3.98f, 6.75f)
                arcToRelative(2.33f, 2.33f, 0.0f, false, true, 0.0f, 2.25f)
                lineToRelative(-3.98f, 6.75f)
                verticalLineToRelative(-0.033f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.5f, 11.5f)
                moveToRelative(-3.5f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 7.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -7.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 14.0f)
                lineToRelative(2.0f, 2.0f)
            }
        }
        .build()
        return _brandGoogleBigQuery!!
    }

private var _brandGoogleBigQuery: ImageVector? = null
