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

public val ThinGroup.HandSoap: ImageVector
    get() {
        if (_handSoap != null) {
            return _handSoap!!
        }
        _handSoap = Builder(name = "HandSoap", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 100.2f)
                verticalLineTo(88.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -28.0f, -28.0f)
                horizontalLineTo(132.0f)
                verticalLineTo(28.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                horizontalLineTo(104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(60.0f)
                horizontalLineTo(104.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 76.0f, 88.0f)
                verticalLineToRelative(12.2f)
                arcTo(36.1f, 36.1f, 0.0f, false, false, 44.0f, 136.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(136.0f)
                arcTo(36.1f, 36.1f, 0.0f, false, false, 180.0f, 100.2f)
                close()
                moveTo(104.0f, 68.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, 20.0f)
                verticalLineToRelative(12.0f)
                horizontalLineTo(84.0f)
                verticalLineTo(88.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 104.0f, 68.0f)
                close()
                moveTo(204.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(136.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, 28.0f, -28.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, 28.0f, 28.0f)
                close()
            }
        }
        .build()
        return _handSoap!!
    }

private var _handSoap: ImageVector? = null
