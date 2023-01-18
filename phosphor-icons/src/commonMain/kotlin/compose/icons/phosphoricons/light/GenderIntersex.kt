package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.GenderIntersex: ImageVector
    get() {
        if (_genderIntersex != null) {
            return _genderIntersex!!
        }
        _genderIntersex = Builder(name = "GenderIntersex", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 18.0f)
                horizontalLineTo(168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(25.5f)
                lineTo(164.4f, 59.2f)
                arcTo(66.0f, 66.0f, 0.0f, true, false, 114.0f, 173.7f)
                verticalLineTo(198.0f)
                horizontalLineTo(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(26.0f)
                verticalLineToRelative(22.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(210.0f)
                horizontalLineToRelative(26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineTo(126.0f)
                verticalLineTo(173.7f)
                arcTo(66.0f, 66.0f, 0.0f, false, false, 172.5f, 68.0f)
                lineTo(202.0f, 38.5f)
                verticalLineTo(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(24.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 208.0f, 18.0f)
                close()
                moveTo(120.0f, 162.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, true, true, 54.0f, -54.0f)
                arcTo(54.0f, 54.0f, 0.0f, false, true, 120.0f, 162.0f)
                close()
            }
        }
        .build()
        return _genderIntersex!!
    }

private var _genderIntersex: ImageVector? = null
