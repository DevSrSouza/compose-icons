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

public val TablerIcons.BrandWechat: ImageVector
    get() {
        if (_brandWechat != null) {
            return _brandWechat!!
        }
        _brandWechat = Builder(name = "BrandWechat", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 10.0f)
                curveToRelative(3.038f, 0.0f, 5.5f, 2.015f, 5.5f, 4.5f)
                curveToRelative(0.0f, 1.397f, -0.778f, 2.645f, -2.0f, 3.47f)
                lineToRelative(0.0f, 2.03f)
                lineToRelative(-1.964f, -1.178f)
                arcToRelative(6.649f, 6.649f, 0.0f, false, true, -1.536f, 0.178f)
                curveToRelative(-3.038f, 0.0f, -5.5f, -2.015f, -5.5f, -4.5f)
                reflectiveCurveToRelative(2.462f, -4.5f, 5.5f, -4.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.197f, 15.698f)
                curveToRelative(-0.69f, 0.196f, -1.43f, 0.302f, -2.197f, 0.302f)
                arcToRelative(8.008f, 8.008f, 0.0f, false, true, -2.612f, -0.432f)
                lineToRelative(-2.388f, 1.432f)
                verticalLineToRelative(-2.801f)
                curveToRelative(-1.237f, -1.082f, -2.0f, -2.564f, -2.0f, -4.199f)
                curveToRelative(0.0f, -3.314f, 3.134f, -6.0f, 7.0f, -6.0f)
                curveToRelative(3.782f, 0.0f, 6.863f, 2.57f, 7.0f, 5.785f)
                lineToRelative(0.0f, 0.233f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 8.0f)
                horizontalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 8.0f)
                horizontalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 14.0f)
                horizontalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 14.0f)
                horizontalLineToRelative(0.01f)
            }
        }
        .build()
        return _brandWechat!!
    }

private var _brandWechat: ImageVector? = null
