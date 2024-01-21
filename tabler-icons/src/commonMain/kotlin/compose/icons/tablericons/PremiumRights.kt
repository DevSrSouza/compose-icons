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

public val TablerIcons.PremiumRights: ImageVector
    get() {
        if (_premiumRights != null) {
            return _premiumRights!!
        }
        _premiumRights = Builder(name = "PremiumRights", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-9.0f, 0.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 18.0f, 0.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, -18.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.867f, 9.75f)
                curveToRelative(-0.246f, -0.48f, -0.708f, -0.769f, -1.2f, -0.75f)
                horizontalLineToRelative(-1.334f)
                curveToRelative(-0.736f, 0.0f, -1.333f, 0.67f, -1.333f, 1.5f)
                curveToRelative(0.0f, 0.827f, 0.597f, 1.499f, 1.333f, 1.499f)
                horizontalLineToRelative(1.334f)
                curveToRelative(0.736f, 0.0f, 1.333f, 0.671f, 1.333f, 1.5f)
                curveToRelative(0.0f, 0.828f, -0.597f, 1.499f, -1.333f, 1.499f)
                horizontalLineToRelative(-1.334f)
                curveToRelative(-0.492f, 0.019f, -0.954f, -0.27f, -1.2f, -0.75f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                verticalLineToRelative(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                verticalLineToRelative(2.0f)
            }
        }
        .build()
        return _premiumRights!!
    }

private var _premiumRights: ImageVector? = null
