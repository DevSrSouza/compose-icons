package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.GenderIntersex: ImageVector
    get() {
        if (_genderIntersex != null) {
            return _genderIntersex!!
        }
        _genderIntersex = Builder(name = "GenderIntersex", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 20.0f)
                horizontalLineTo(168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(30.3f)
                lineTo(164.4f, 62.0f)
                arcTo(64.0f, 64.0f, 0.0f, true, false, 116.0f, 171.9f)
                verticalLineTo(200.0f)
                horizontalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(208.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(124.0f)
                verticalLineTo(171.9f)
                arcTo(64.2f, 64.2f, 0.0f, false, false, 184.0f, 108.0f)
                arcToRelative(63.2f, 63.2f, 0.0f, false, false, -14.2f, -40.1f)
                lineTo(204.0f, 33.7f)
                verticalLineTo(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(24.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 208.0f, 20.0f)
                close()
                moveTo(120.0f, 164.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 56.0f, -56.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 120.0f, 164.0f)
                close()
            }
        }
        .build()
        return _genderIntersex!!
    }

private var _genderIntersex: ImageVector? = null
