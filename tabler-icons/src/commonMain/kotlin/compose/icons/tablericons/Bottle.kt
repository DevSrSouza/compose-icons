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

public val TablerIcons.Bottle: ImageVector
    get() {
        if (_bottle != null) {
            return _bottle!!
        }
        _bottle = Builder(name = "Bottle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 3.5f)
                curveToRelative(0.0f, 1.626f, 0.507f, 3.212f, 1.45f, 4.537f)
                lineToRelative(0.05f, 0.07f)
                arcToRelative(8.093f, 8.093f, 0.0f, false, true, 1.5f, 4.694f)
                verticalLineToRelative(6.199f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-6.2f)
                curveToRelative(0.0f, -1.682f, 0.524f, -3.322f, 1.5f, -4.693f)
                lineToRelative(0.05f, -0.07f)
                arcToRelative(7.823f, 7.823f, 0.0f, false, false, 1.45f, -4.537f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 14.803f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 1.0f, -0.803f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 2.0f, -1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 2.0f, 1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.0f, 1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.0f, -1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 1.0f, -0.805f)
            }
        }
        .build()
        return _bottle!!
    }

private var _bottle: ImageVector? = null
