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

public val TablerIcons.BrandBumble: ImageVector
    get() {
        if (_brandBumble != null) {
            return _brandBumble!!
        }
        _brandBumble = Builder(name = "BrandBumble", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 12.0f)
                horizontalLineToRelative(10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 8.0f)
                horizontalLineToRelative(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 16.0f)
                horizontalLineToRelative(4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.268f, 3.0f)
                horizontalLineToRelative(-8.536f)
                arcToRelative(1.46f, 1.46f, 0.0f, false, false, -1.268f, 0.748f)
                lineToRelative(-4.268f, 7.509f)
                arcToRelative(1.507f, 1.507f, 0.0f, false, false, 0.0f, 1.486f)
                lineToRelative(4.268f, 7.509f)
                curveToRelative(0.26f, 0.462f, 0.744f, 0.747f, 1.268f, 0.748f)
                horizontalLineToRelative(8.536f)
                arcToRelative(1.46f, 1.46f, 0.0f, false, false, 1.268f, -0.748f)
                lineToRelative(4.268f, -7.509f)
                arcToRelative(1.507f, 1.507f, 0.0f, false, false, 0.0f, -1.486f)
                lineToRelative(-4.268f, -7.509f)
                arcToRelative(1.46f, 1.46f, 0.0f, false, false, -1.268f, -0.748f)
                close()
            }
        }
        .build()
        return _brandBumble!!
    }

private var _brandBumble: ImageVector? = null
