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

public val TablerIcons.BrandGooglePlay: ImageVector
    get() {
        if (_brandGooglePlay != null) {
            return _brandGooglePlay!!
        }
        _brandGooglePlay = Builder(name = "BrandGooglePlay", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 3.71f)
                verticalLineToRelative(16.58f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, 1.05f, 0.606f)
                lineToRelative(14.622f, -8.42f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, false, 0.0f, -0.953f)
                lineToRelative(-14.622f, -8.419f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, -1.05f, 0.607f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 9.0f)
                lineToRelative(-10.5f, 11.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 3.5f)
                lineToRelative(10.5f, 11.5f)
            }
        }
        .build()
        return _brandGooglePlay!!
    }

private var _brandGooglePlay: ImageVector? = null
