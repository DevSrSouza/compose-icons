package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.ArrowArcLeft: ImageVector
    get() {
        if (_arrowArcLeft != null) {
            return _arrowArcLeft!!
        }
        _arrowArcLeft = Builder(name = "ArrowArcLeft", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 65.8f, 121.8f)
                lineTo(47.4f, 140.1f)
                horizontalLineTo(92.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineToRelative(-64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineToRelative(-64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(44.7f)
                lineToRelative(18.4f, -18.3f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, true, 147.0f, 0.0f)
                arcTo(102.9f, 102.9f, 0.0f, false, true, 232.0f, 184.0f)
                close()
            }
        }
        .build()
        return _arrowArcLeft!!
    }

private var _arrowArcLeft: ImageVector? = null
