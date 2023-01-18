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

public val ThinGroup.SuitcaseSimple: ImageVector
    get() {
        if (_suitcaseSimple != null) {
            return _suitcaseSimple!!
        }
        _suitcaseSimple = Builder(name = "SuitcaseSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 68.0f)
                horizontalLineTo(172.0f)
                verticalLineTo(56.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                horizontalLineTo(104.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 84.0f, 56.0f)
                verticalLineTo(68.0f)
                horizontalLineTo(40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 80.0f)
                verticalLineToRelative(79.9f)
                horizontalLineToRelative(0.0f)
                verticalLineTo(208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 68.0f)
                close()
                moveTo(92.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineTo(68.0f)
                horizontalLineTo(92.0f)
                close()
                moveTo(40.0f, 76.0f)
                horizontalLineTo(216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(76.0f)
                horizontalLineTo(36.0f)
                verticalLineTo(80.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 40.0f, 76.0f)
                close()
                moveTo(216.0f, 212.0f)
                horizontalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(164.0f)
                horizontalLineTo(220.0f)
                verticalLineToRelative(44.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 216.0f, 212.0f)
                close()
            }
        }
        .build()
        return _suitcaseSimple!!
    }

private var _suitcaseSimple: ImageVector? = null
