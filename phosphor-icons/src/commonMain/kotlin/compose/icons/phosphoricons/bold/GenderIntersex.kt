package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.GenderIntersex: ImageVector
    get() {
        if (_genderIntersex != null) {
            return _genderIntersex!!
        }
        _genderIntersex = Builder(name = "GenderIntersex", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 12.0f)
                horizontalLineTo(172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(7.0f)
                lineTo(164.0f, 51.1f)
                arcTo(71.2f, 71.2f, 0.0f, false, false, 120.0f, 36.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, -12.0f, 143.0f)
                verticalLineToRelative(13.0f)
                horizontalLineTo(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(216.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(132.0f)
                verticalLineTo(179.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 180.3f, 68.7f)
                lineTo(196.0f, 53.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 12.0f)
                close()
                moveTo(120.0f, 156.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 48.0f, -48.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 120.0f, 156.0f)
                close()
            }
        }
        .build()
        return _genderIntersex!!
    }

private var _genderIntersex: ImageVector? = null
